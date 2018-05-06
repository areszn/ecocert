<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="com.ocd.ecocert.entity.User" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>欧希蒂</title>
		
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />

		<!-- basic styles -->

		<link href="assets/css/bootstrap.min.css" rel="stylesheet" />
		<link rel="stylesheet" href="assets/css/font-awesome.min.css" />

		<!--[if IE 7]>
		  <link rel="stylesheet" href="assets/css/font-awesome-ie7.min.css" />
		<![endif]-->

		<!-- page specific plugin styles -->

		<!-- fonts -->

	

		<!-- ace styles -->

		<link rel="stylesheet" href="assets/css/ace.min.css" />
		<link rel="stylesheet" href="assets/css/ace-rtl.min.css" />
		<link rel="stylesheet" href="assets/css/ace-skins.min.css" />

		<!--[if lte IE 8]>
		  <link rel="stylesheet" href="assets/css/ace-ie.min.css" />
		<![endif]-->

		<!-- inline styles related to this page -->

		<!-- ace settings handler -->

		<script src="assets/js/ace-extra.min.js"></script>

		<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

		<!--[if lt IE 9]>
		<script src="assets/js/html5shiv.js"></script>
		<script src="assets/js/respond.min.js"></script>
		<![endif]-->
	</head>

	<body>
	
		<div class="navbar navbar-default" id="navbar">
			<script type="text/javascript">
				try{ace.settings.check('navbar' , 'fixed')}catch(e){}
			</script>
			
			<div class="navbar-container" id="navbar-container">
				<div class="navbar-header pull-left">
					
						
							<img src="${pageContext.request.contextPath}/images/logo.png"/> 
							
						
				</div><!-- /.navbar-header -->

				<div class="navbar-header pull-right" role="navigation">
					<ul class="nav ace-nav">
						
						<li class="light-blue">
							<a data-toggle="dropdown" href="#" class="dropdown-toggle">
								<img class="nav-user-photo" src="assets/avatars/user.jpg" alt="Jason's Photo" />
								<span class="user-info">
									<small>欢迎您,</small>
									<% User user= (User)session.getAttribute("loginUser"); %> <%= user.getName() %>
								</span>

								<i class="icon-caret-down"></i>
							</a>

							<ul class="user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
								

								

								<li>
									<a href="#">
										<i class="icon-off"></i>
										<a href="${pageContext.request.contextPath}/user/logout.do">退出</a>
									</a>
								</li>
							</ul>
						</li>
					</ul><!-- /.ace-nav -->
				</div><!-- /.navbar-header -->
			</div><!-- /.container -->
		</div>

		<div class="main-container" id="main-container">
			<script type="text/javascript">
				try{ace.settings.check('main-container' , 'fixed')}catch(e){}
			</script>

			<div class="main-container-inner">
				<a class="menu-toggler" id="menu-toggler" href="#">
					<span class="menu-text"></span>
				</a>

				<div class="sidebar" id="sidebar">
					<script type="text/javascript">
						try{ace.settings.check('sidebar' , 'fixed')}catch(e){}
					</script>

					

					<ul class="nav nav-list">	
					<!-- 查询 -->
					<li>
							<a href="#" class="dropdown-toggle">
								<i class="icon-desktop"></i>
								<span class="menu-text">查询 </span>

								<b class="arrow icon-angle-down"></b>
							</a>

							<ul class="submenu">
								<li>
									<a href="search_travel.jsp">
										<i class="icon-double-angle-right"></i>
										人员行程查询
									</a>
								</li>

								<li>
									<a href="search_progress.jsp">
										<i class="icon-double-angle-right"></i>
										认证进度查询
									</a>
								</li>

								<li>
									<a href="search_company.jsp">
										<i class="icon-double-angle-right"></i>
										获证客户查询
									</a>
								</li>

								
							</ul>
						</li>
						
						<!-- 人力资源管理 -->
					<li>
							<a href="#" class="dropdown-toggle">
								<i class="icon-desktop"></i>
								<span class="menu-text">人力资源管理 </span>

								<b class="arrow icon-angle-down"></b>
							</a>

							<ul class="submenu">
								<li>
									<a href="#" class="dropdown-toggle">
										<i class="icon-double-angle-right"></i>

										员工信息登记
										<b class="arrow icon-angle-down"></b>
									</a>

									<ul class="submenu">
										<li>
											<a href="user-regist.jsp">
												<i class="icon-leaf"></i>
												员工基本信息登记
											</a>
										</li>
										<li>
											<a href="qualification-regist.jsp">
												<i class="icon-leaf"></i>
												注册资质信息登记
											</a>
										</li>
										
										<li>
											<a href="ability-regist.jsp">
												<i class="icon-leaf"></i>
												人员能力信息登记
											</a>
										</li>
									</ul>
								</li>

								<li>
									<a href="userinfomationserch.jsp">
										<i class="icon-double-angle-right"></i>
										人员信息查询
									</a>
								</li>

								

								
							</ul>
						</li>
						<!-- 合作单位管理 -->
					<li>
							<a href="#" class="dropdown-toggle">
								<i class="icon-desktop"></i>
								<span class="menu-text">合作单位管理 </span>

								<b class="arrow icon-angle-down"></b>
							</a>

							<ul class="submenu">
								<li>
									<a href="cooperation_regist.jsp">
										<i class="icon-double-angle-right"></i>
										合作单位登记
									</a>
								</li>

								<li>
									<a href="cooperation_verify.jsp">
										<i class="icon-double-angle-right"></i>
										审核确认
									</a>
								</li>

								
							</ul>
						</li>
						<!-- 检测管理 -->
					<li>
							<a href="#" class="dropdown-toggle">
								<i class="icon-desktop"></i>
								<span class="menu-text">检测管理 </span>

								<b class="arrow icon-angle-down"></b>
							</a>

							<ul class="submenu">
								<li>
									<a href="feeler_mechanism_regist.jsp">
										<i class="icon-double-angle-right"></i>
										检测机构登记
									</a>
								</li>

								<li>
									<a href=company_regist.jsp">
										<i class="icon-double-angle-right"></i>
										企业登记
									</a>
								</li>

								<li>
									<a href="report_regist.jsp">
										<i class="icon-double-angle-right"></i>
										检测报告登记
									</a>
								</li>

								
							</ul>
						</li>
						<!-- 财务管理  -->
					<li>
							<a href="finance.jsp">
								<i class="icon-desktop"></i>
								<span class="menu-text"> 财务管理 </span>
							</a>
						</li>
							<!-- 认证过程管理 -->
					<li>
							<a href="#" class="dropdown-toggle">
								<i class="icon-desktop"></i>
								<span class="menu-text">认证过程管理 </span>

								<b class="arrow icon-angle-down"></b>
							</a>

							<ul class="submenu">
								<li>
									<a href="accept.jsp">
										<i class="icon-double-angle-right"></i>
										受理申请
									</a>
								</li>

								<li>
									<a href="audit_program.jsp">
										<i class="icon-double-angle-right"></i>
										申请评审及审核方案管理
									</a>
								</li>

								<li>
									<a href="contract_management.jsp">
										<i class="icon-double-angle-right"></i>
										合同管理
									</a>
								</li>
								<li>
									<a href="audit_plan.jsp">
										<i class="icon-double-angle-right"></i>
										检查/审核计划
									</a>
								</li>
							<li>
									<a href="outcome_feedback.jsp">
										<i class="icon-double-angle-right"></i>
										现场检查结果反馈
									</a>
								</li>
								<li>
									<a href="check.jsp">
										<i class="icon-double-angle-right"></i>
										复核及认证决定
									</a>
								</li>
								<li>
									<a href="custom_service_confirm.jsp">
										<i class="icon-double-angle-right"></i>
										客服确认
									</a>
								</li>
								<li>
									<a href="charge_confirm.jsp">
										<i class="icon-double-angle-right"></i>
										收费确认
									</a>
								</li>
								<li>
									<a href="certificate_manufacturing.jsp">
										<i class="icon-double-angle-right"></i>
										制作证书
									</a>
								</li>
								<li>
									<a href="certificate_receive.jsp">
										<i class="icon-double-angle-right"></i>
										领取证书
									</a>
								</li>
								<li>
									<a href="issue_certificate.jsp">
										<i class="icon-double-angle-right"></i>
										颁发证书
									</a>
								</li>
					</ul><!-- /.nav-list -->

					<div class="sidebar-collapse" id="sidebar-collapse">
						<i class="icon-double-angle-left" data-icon1="icon-double-angle-left" data-icon2="icon-double-angle-right"></i>
					</div>

					<script type="text/javascript">
						try{ace.settings.check('sidebar' , 'collapsed')}catch(e){}
					</script>
				</div>

				<div class="main-content">
					

					<div class="page-content">
						<div class="row">
							<div class="col-xs-12">
								<!-- PAGE CONTENT BEGINS -->

								<!-- PAGE CONTENT ENDS -->
							</div><!-- /.col -->
						</div><!-- /.row -->
					</div><!-- /.page-content -->
				</div><!-- /.main-content -->

			</div><!-- /.main-container-inner -->

			<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
				<i class="icon-double-angle-up icon-only bigger-110"></i>
			</a>
		</div><!-- /.main-container -->

		<!-- basic scripts -->

		

		<!--[if !IE]> -->

		<script type="text/javascript">
			window.jQuery || document.write("<script src='assets/js/jquery-2.0.3.min.js'>"+"<"+"/script>");
		</script>

		<!-- <![endif]-->

		<!--[if IE]>
<script type="text/javascript">
 window.jQuery || document.write("<script src='assets/js/jquery-1.10.2.min.js'>"+"<"+"/script>");
</script>
<![endif]-->

		<script type="text/javascript">
			if("ontouchend" in document) document.write("<script src='assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
		</script>
		<script src="assets/js/bootstrap.min.js"></script>
		<script src="assets/js/typeahead-bs2.min.js"></script>

		<!-- page specific plugin scripts -->

		<!-- ace scripts -->

		<script src="assets/js/ace-elements.min.js"></script>
		<script src="assets/js/ace.min.js"></script>

		<!-- inline scripts related to this page -->
	
</body>
</html>
