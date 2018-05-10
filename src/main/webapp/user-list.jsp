<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<header class="main-header">
            <nav class="navbar navbar-fixed-top bg-primary">
                <div class="navbar-header">
                    <a class="navbar-toggle" href="javascript:;" data-toggle="collapse" data-target=".navbar-collapse"><i class="icon icon-th-large"></i></a>
                    <a class="sidebar-toggle" href="javascript:;" data-toggle="push-menu"><i class="icon icon-bars"></i></a>
                    <a class="navbar-brand" href="#">
                        <span class="logo">ZUIAdmin</span>
                        <span class="logo-mini">ZA</span> 
                    </a>
                </div>
                <div class="collapse navbar-collapse">
                    <div class="container-fluid">
                        <ul class="nav navbar-nav">
                            <li><a href="javascript:;" data-toggle="push-menu"><i class="icon icon-bars"></i></a></li>
                        </ul>
                        <ul class="nav navbar-nav navbar-right">
                            <li>
                                <a href="javascript:;">
                                    <span>
                                        <i class="icon icon-bell-alt"></i>
                                        <span class="label label-danger label-pill up">5</span>
                                    </span>
                                </a>
                            </li>
                            <li>
                                <a href="javascript:;">
                                    <span>
                                        <i class="icon icon-envelope-alt"></i>
                                        <span class="label label-success label-pill up">2</span>
                                    </span>
                                </a>
                            </li>
                            <li class="dropdown">
                                <a href="javascript:;" data-toggle="dropdown"><i class="icon icon-user"></i> 管理员 <span class="caret"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">资料设置</a></li>
                                    <li><a href="#">清除缓存</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#">注销</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
        </header>
        <aside class="main-sidebar">
            <section class="sidebar">
                <ul class="sidebar-menu" data-widget="tree">
                    <li class="header">主要菜单</li>
                    <li>
                        <a href="index.html">
                            <i class="icon icon-dashboard"></i> 
                            <span>仪表盘</span>
                            <span class="pull-right-container">
                            </span>
                        </a>
                    </li>
                    <li class="treeview">
                        <a href="javascript:;">
                            <i class="icon icon-file"></i> 
                            <span>页面演示</span>
                            <span class="pull-right-container">
                                <i class="icon icon-angle-left"></i>
                            </span>
                        </a>
                        <ul class="treeview-menu">
                            <li><a href="layout.html"><i class="icon icon-circle-blank"></i> 空白页</a></li>
                            <li><a href="login.html"><i class="icon icon-circle-blank"></i> 登录</a></li>
                            <li><a href="error-404.html"><i class="icon icon-circle-blank"></i> 404页</a></li>
                            <li><a href="config.html"><i class="icon icon-circle-blank"></i> 系统设置</a></li>
                            <li class="active"><a href="list.html"><i class="icon icon-circle-blank"></i> 用户列表</a></li>
                        </ul>
                    </li>
                    <li class="treeview">
                        <a href="javascript:;">
                            <i class="icon icon-columns"></i> 
                            <span>基础组件</span>
                            <span class="pull-right-container">
                                <i class="icon icon-angle-left"></i>
                            </span>
                        </a>
                        <ul class="treeview-menu">
                            <li><a href="component-checkbox-radio.html"><i class="icon icon-circle-blank"></i> 多选和单选框</a></li>
                            <li><a href="component-step.html"><i class="icon icon-circle-blank"></i> 步骤条</a></li>
                        </ul>
                    </li>
                    <li class="treeview">
                        <a href="javascript:;">
                            <i class="icon icon-sign-blank"></i> 
                            <span>扩展插件</span>
                            <span class="pull-right-container">
                                <i class="icon icon-angle-left"></i>
                            </span>
                        </a>
                        <ul class="treeview-menu">
                            <li><a href="plugin-toastr.html"><i class="icon icon-circle-blank"></i> Toastr</a></li>
                            <li><a href="plugin-notify.html"><i class="icon icon-circle-blank"></i> Notify</a></li>
                        </ul>
                    </li>
                </ul>
            </section>
        </aside>
        <div class="content-wrapper">
            <div class="content-header">
                <ul class="breadcrumb">
                    <li><a href="#"><i class="icon icon-home"></i></a></li>
                    <li><a href="#">页面演示</a></li>
                    <li class="active">用户列表</li>
                </ul>
            </div>
            <div class="content-body">
                <div class="container-fluid">
                    <div class="alert alert-warning alert-dismissable">
                        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>
                        <p>页面演示仅供参考，可自行修改</p>   
                    </div>
                    <div class="panel">
                        <div class="panel-heading">
                            <div class="panel-title">用户列表</div>
                        </div>
                        <div class="panel-body">
						
                            <div class="table-tools" style="margin-bottom: 15px;">
                                <div class="pull-right" style="width: 250px;">
                                    <div class="input-group">
                                        <input type="text" class="form-control" placeholder="关键字">
                                        <span class="input-group-btn">
                                            <button class="btn btn-default" type="button">搜索</button>
                                        </span>
                                    </div>
                                </div>
                                <div class="tools-group">
                                    <a href="#" class="btn btn-primary"><i class="icon icon-plus-sign"></i> 新增</a>
                                    <a href="#" class="btn btn-success"><i class="icon icon-check-circle"></i> 启用</a>
                                    <a href="#" class="btn btn-warning"><i class="icon icon-ban-circle"></i> 禁用</a>
                                    <a href="#" class="btn btn-danger"><i class="icon icon-remove-sign"></i> 删除</a>
                                </div>
                            </div>
							<div id="datagridExample" class="datagrid" ></div>
                        </div>
						
					</div>
                </div>
            </div>
        </div> 
    
		
		
		<link href="dist/lib/datagrid/zui.datagrid.min.css" rel="stylesheet">
		<script src="dist/lib/datagrid/zui.datagrid.min.js"></script>
		<script >
			//$(document).ready(function (){
				$('#datagridExample').datagrid({
					dataSource: {
						cols:[
							{name: 'id', label: '职工编号', width: 132},
							{name: 'name', label: '用户名', width: 134},
                            {name: 'realname', label: '姓名', width: 134},
							{name: 'gender', label: '性别', width: 109},
							{name: 'idNumber', label: '身份证号', width: 109},
							{name: 'phone', label: '联系电话', width: 132},
							{name: 'location', label: '所在地', width: 134},
							{name: 'fulltime', label: '是否专职', width: 109},
							{name: 'education', label: '学习经历（学历、专业）', width: 109},
							{name: 'workExperience', label: '工作经历', width: 132},
							{name: 'photo', label: '照片', width: 134},
							{name: 'hiredate', label: '合同开始日期', width: 109},
							{name: 'leavedate', label: '合同到期日期', width: 109}
						],
						//这里先用静态数据填充。
						/*array:[
							{emnumber: '1', name:'幻影刺客1', sex: '击杀', cardid: '斧王', phone: '幻影刺客击杀了斧王。',location:'location',isfulltime:'isfulltime',learningexperience:'learningexperience',workexperience:'workexperience',photo:
							'photo',startdate:'startdate',enddate:'enddate'},
							{emnumber: '2', name:'幻影刺客2', sex: '击杀', cardid: '斧王', phone: '幻影刺客击杀了斧王。',location:'location',isfulltime:'isfulltime',learningexperience:'learningexperience',workexperience:'workexperience',photo:
							'photo',startdate:'startdate',enddate:'enddate'},
							{emnumber: '3', name:'幻影刺客3', sex: '击杀', cardid: '斧王', phone: '幻影刺客击杀了斧王。',location:'location',isfulltime:'isfulltime',learningexperience:'learningexperience',workexperience:'workexperience',photo:
							'photo',startdate:'startdate',enddate:'enddate'},
							{emnumber: '4', name:'幻影刺客4', sex: '击杀', cardid: '斧王', phone: '幻影刺客击杀了斧王。',location:'location',isfulltime:'isfulltime',learningexperience:'learningexperience',workexperience:'workexperience',photo:
							'photo',startdate:'startdate',enddate:'enddate'},
							{emnumber: '5', name:'幻影刺客5', sex: '击杀', cardid: '斧王', phone: '幻影刺客击杀了斧王。',location:'location',isfulltime:'isfulltime',learningexperience:'learningexperience',workexperience:'workexperience',photo:
							'photo',startdate:'startdate',enddate:'enddate'},
							{emnumber: '6', name:'幻影刺客6', sex: '击杀', cardid: '斧王', phone: '幻影刺客击杀了斧王。',location:'location',isfulltime:'isfulltime',learningexperience:'learningexperience',workexperience:'workexperience',photo:
							'photo',startdate:'startdate',enddate:'enddate'},
							{emnumber: '7', name:'幻影刺客7', sex: '击杀', cardid: '斧王', phone: '幻影刺客击杀了斧王。',location:'location',isfulltime:'isfulltime',learningexperience:'learningexperience',workexperience:'workexperience',photo:
							'photo',startdate:'startdate',enddate:'enddate'}
						]*/

						//远程数据格式参见：http://zui.sexy/#view/datagrid
						remote: function(params) {
							return {
								// 原创请求地址
								url: '/user/userList.do',
								// 请求类型
								type: 'GET',
								// 数据类型
								dataType: 'json'
							};
						}
					},
					sortable: true
						// ... 其他初始化选项
				});
			//});
		</script>

<%@ include file="footer.jsp" %>