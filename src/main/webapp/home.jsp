<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="com.ocd.ecocert.entity.User" %>
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
 
  
  </head>
  
 <body style="margin:0px;">  
<div class="easyui-layout" data-options="fit:true">  
    <div data-options="region:'north'" style="height:60px;background-color:#98FB98;">  
        <div class="top">  
            <div class="top_left" style="float:left;"><img src="${pageContext.request.contextPath}/images/logo.png"/></div>  
            <div class="top_right" style="float:right;margin-right:80px;">  
                <p>欢迎您：<% User user= (User)session.getAttribute("loginUser"); %><%= user.getName() %>  <a href="${pageContext.request.contextPath}/user/logout.do">退出</a></p>  
            </div>  
        </div>      
    </div>  
    <div data-options="region:'west',split:'true',title:'导航'" style="width:220px">  
        <div class="easyui-accordion" data-options="fit:true,border:false">  
          
          
            <div title="系统管理">  
              
                <a href="javascript:run('${pageContext.request.contextPath}/edit.jsp', '员工管理')" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-blank'" style="width:100%;text-align:left;">员工管理</a>  
              	<a href="javascript:run('${pageContext.request.contextPath}/edit.jsp', '客户管理')" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-blank'" style="width:100%;text-align:left;">客户管理</a>  
            </div>  
          
        </div>  
    </div>  
    <div data-options="region:'center'" style="width:100%;height:100%;">  
        <div id="tb" class="easyui-tabs" data-options="fit:true,border:false">  
        <!--  
            <div title="首页"></div> 
         -->  
        </div>  
    </div>  
    <div class="easyui-panel" title="欧希蒂管理平台欢迎您" data-options="region:'south',collapsible:false"></div>  
</div>  
  
<script type="text/javascript">  
function run(url, title) {  
    if (url.substring(0, 4) != 'http') {  
        url = 'http://localhost:8080' + url;  
    }  
  	console.log(url);
    if ($("#tb").tabs("getTab", title)) {  
    	console.log(1);
        $("#tb").tabs("select", title);  
    } else {  
    	
        if (url.substring(0, 4) != 'http') {  
            //第一种打开页面方式  
            $('#tb').tabs('add', {  
                   title: title,  
                   href: url,  
                   closable: true  
               });  
            
        }else{  
            //第二种打开页面方式  
            
            $("#tb").tabs('add',{  
                title:title,  
                content:"<iframe id='" + title + "' frameborder=0 style='width:100%;height:100%'></iframe>",  
                closable:true  
            });  
            $("#" + title)[0].src = url;  
            
        }  
    }  
}  
</script>  
</body>  
</html>  