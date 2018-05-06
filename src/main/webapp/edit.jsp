<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
  <head>
    <title>欧希蒂管理平台</title>
  <!-- 引入JQuery -->
  <script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.min.js"></script>
  <!-- 引入EasyUI -->
  <script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.easyui.min.js"></script>
  <!-- 引入EasyUI的中文国际化js，让EasyUI支持中文 -->
  <script type="text/javascript" src="${pageContext.request.contextPath}/easyui/locale/easyui-lang-zh_CN.js"></script>
  <!-- 引入EasyUI的样式文件-->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/easyui/themes/default/easyui.css" type="text/css"/>
  <!-- 引入EasyUI的图标样式文件-->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/easyui/themes/icon.css" type="text/css"/>
	<!-- 引入EasyUI过滤文件-->
	<script type="text/javascript" src="datagrid-filter.js"></script>
 <script type="text/javascript">
 var dg = $('#dg');
 
 dg('enableFilter')
 function newUser(){
		$('#dlg').dialog('open').dialog('setTitle','新建用户');
		$('#fm').form('clear');
		url = 'save_user.php';
	}
 function editUser(){
 var row = $('#dg').datagrid('getSelected');
 if (row){
 	$('#dlg').dialog('open').dialog('setTitle','编辑用户');
 	$('#fm').form('load',row);
 	url = 'update_user.php?id='+row.id;
 }
 }
 function saveUser(){
		$('#fm').form('submit',{
			url: url,
			onSubmit: function(){
				return $(this).form('validate');
			},
			success: function(result){
				var result = eval('('+result+')');
				if (result.errorMsg){
					$.messager.show({
						title: 'Error',
						msg: result.errorMsg
					});
				} else {
					$('#dlg').dialog('close');		// close the dialog
					$('#dg').datagrid('reload');	// reload the user data
				}
			}
		});
	}
 function destroyUser(){
		var row = $('#dg').datagrid('getSelected');
		if (row){
			$.messager.confirm('Confirm','确定删除该用户吗?',function(r){
				if (r){
					$.post('destroy_user.php',{id:row.id},function(result){
						if (result.success){
							$('#dg').datagrid('reload');	// reload the user data
						} else {
							$.messager.show({	// show error message
								title: 'Error',
								msg: result.errorMsg
							});
						}
					},'json');
				}
			});
		}
	}
 </script>
  
</head>
<body class="easyui-layout">
<div data-options="region:'north',title:'搜索选项'" style="height:20%;"></div>

    <div data-options="region:'south'" style="height:80%;">
    <table id="dg" class="easyui-datagrid" style="width:100%;height:100%"
		url="${pageContext.request.contextPath}/user/userList.do"
		toolbar="#toolbar"
		rownumbers="true" fitColumns="true" singleSelect="true" pagination="true">
	<thead>
		<tr>
			<th field="id" width="50">序号</th>
			<th field="name" width="50">账号</th>
			<th field="realname" width="50">姓名</th>
			<th field="age" width="50">年龄</th>
			<th field="gender" width="50">性别</th>
		</tr>
	</thead>
</table>
<div id="toolbar">
	<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">新增</a>
	<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUser()">编辑</a>
	<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyUser()">删除</a>
</div>
    </div> 



<!-- 用户信息对话框 -->
<div id="dlg" class="easyui-dialog" style="width:400px;height:280px;padding:10px 20px"
		closed="true" buttons="#dlg-buttons">
	<div class="ftitle">用户信息</div>
	<form id="fm" method="post">
		<div class="fitem">
			<label>账号</label>
			<input name="name" class="easyui-validatebox" required="true">
		</div>
		<div class="fitem">
			<label>姓名</label>
			<input name="realname" class="easyui-validatebox" required="true">
		</div>
		<div class="fitem">
			<label>年龄</label>
			<input name="age">
		</div>
		<div class="fitem">
			<label>性别</label>
			<input name="gender" >
		</div>
	</form>
</div>
<div id="dlg-buttons">
	<a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveUser()">保存</a>
	<a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')">Cancel</a>
</div>
</body>
</html>