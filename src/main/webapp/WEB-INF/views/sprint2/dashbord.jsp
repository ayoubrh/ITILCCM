

<!DOCTYPE html>


<!--

TABLE OF CONTENTS.

Use search to find needed section.

=====================================================

|  1. $BODY                 |  Body                 |
|  2. $MAIN_NAVIGATION      |  Main navigation      |
|  3. $NAVBAR_ICON_BUTTONS  |  Navbar Icon Buttons  |
|  4. $MAIN_MENU            |  Main menu            |
|  5. $CONTENT              |  Content              |

=====================================================

-->


<!--[if IE 8]>         <html class="ie8"> <![endif]-->
<!--[if IE 9]>         <html class="ie9 gt-ie8"> <![endif]-->
<!--[if gt IE 9]><!--> <html class="gt-ie8 gt-ie9 not-ie"> <!--<![endif]-->

<!-- Mirrored from infinite-woodland-5276.herokuapp.com/pages-blank.html by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 03 Mar 2016 01:48:29 GMT -->
<head>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@taglib uri="http://www.springframework.org/security/tags" prefix="s" %>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<title>Dashbord CMDB - ITIL-CCM</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0">

	<link rel="icon" type="image/png" href="<%=request.getContextPath()%>/resources/assets/images/pixel-admin/logo3.png" />
	
	<!-- Open Sans font from Google CDN -->
	<link href="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,400,600,700,300&amp;subset=latin" rel="stylesheet" type="text/css">

	<!-- Pixel Admin's stylesheets -->
	<link href="<%=request.getContextPath()%>/resources/assets/stylesheets/bootstrap.min.css" rel="stylesheet" type="text/css">
	<link href="<%=request.getContextPath()%>/resources/assets/stylesheets/pixel-admin.min.css" rel="stylesheet" type="text/css">
	<link href="<%=request.getContextPath()%>/resources/assets/stylesheets/widgets.min.css" rel="stylesheet" type="text/css">
	<link href="<%=request.getContextPath()%>/resources/assets/stylesheets/pages.min.css" rel="stylesheet" type="text/css">
	<link href="<%=request.getContextPath()%>/resources/assets/stylesheets/rtl.min.css" rel="stylesheet" type="text/css">
	<link href="<%=request.getContextPath()%>/resources/assets/stylesheets/themes.min.css" rel="stylesheet" type="text/css">

	<!--[if lt IE 9]>
		<script src="<%=request.getContextPath()%>/resources/assets/javascripts/ie.min.js"></script>
	<![endif]-->
	

</head>


<!-- 1. $BODY ======================================================================================
	
	Body

	Classes:
	* 'theme-{THEME NAME}'
	* 'right-to-left'      - Sets text direction to right-to-left
	* 'main-menu-right'    - Places the main menu on the right side
	* 'no-main-menu'       - Hides the main menu
	* 'main-navbar-fixed'  - Fixes the main navigation
	* 'main-menu-fixed'    - Fixes the main menu
	* 'main-menu-animated' - Animate main menu
-->
<body class="theme-default main-menu-animated">

<script>var init = [];</script>
<!-- Demo script --> <script src="<%=request.getContextPath()%>/resources/assets/demo/demo.js"></script> <!-- / Demo script -->

<div id="main-wrapper">


<!-- 2. $MAIN_NAVIGATION ===========================================================================

	Main navigation
-->
	<div id="main-navbar" class="navbar navbar-inverse" role="navigation">
		<!-- Main menu toggle -->
		<button type="button" id="main-menu-toggle"><i class="navbar-icon fa fa-bars icon"></i><span class="hide-menu-text">HIDE MENU</span></button>
		
		<div class="navbar-inner">
			<!-- Main navbar header -->
			<div class="navbar-header">

				<!-- Logo -->
				<a href="index.html" class="navbar-brand">
					<div><img alt="Pixel Admin" src="<%=request.getContextPath()%>/resources/assets/images/pixel-admin/logo.png"></div>
				</a>

				<!-- Main navbar toggle -->
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#main-navbar-collapse"><i class="navbar-icon fa fa-bars"></i></button>

			</div> <!-- / .navbar-header -->

			<div id="main-navbar-collapse" class="collapse navbar-collapse main-navbar-collapse">
				<div>
					<ul class="nav navbar-nav">
						
					</ul> <!-- / .navbar-nav -->

					<div class="right clearfix">
						<ul class="nav navbar-nav pull-right right-navbar-nav">

<!-- 3. $NAVBAR_ICON_BUTTONS =======================================================================

							Navbar Icon Buttons

							NOTE: .nav-icon-btn triggers a dropdown menu on desktop screens only. On small screens .nav-icon-btn acts like a hyperlink.

							Classes:
							* 'nav-icon-btn-info'
							* 'nav-icon-btn-success'
							* 'nav-icon-btn-warning'
							* 'nav-icon-btn-danger' 
-->
							<li class="nav-icon-btn nav-icon-btn-danger dropdown">
								<a href="#notifications" class="dropdown-toggle" data-toggle="dropdown">
									<span class="label">5</span>
									<i class="nav-icon fa fa-bullhorn"></i>
									<span class="small-screen-text">Notifications</span>
								</a>

								<!-- NOTIFICATIONS -->
								
								<!-- Javascript -->
								<script>
									init.push(function () {
										$('#main-navbar-notifications').slimScroll({ height: 250 });
									});
								</script>
								<!-- / Javascript -->

								<div class="dropdown-menu widget-notifications no-padding" style="width: 300px">
									<div class="notifications-list" id="main-navbar-notifications">

										<div class="notification">
											<div class="notification-title text-danger">SYSTEM</div>
											<div class="notification-description"><strong>Error 500</strong>: Syntax error in index.php at line <strong>461</strong>.</div>
											<div class="notification-ago">12h ago</div>
											<div class="notification-icon fa fa-hdd-o bg-danger"></div>
										</div> <!-- / .notification -->

										<div class="notification">
											<div class="notification-title text-info">STORE</div>
											<div class="notification-description">You have <strong>9</strong> new orders.</div>
											<div class="notification-ago">12h ago</div>
											<div class="notification-icon fa fa-truck bg-info"></div>
										</div> <!-- / .notification -->

										<div class="notification">
											<div class="notification-title text-default">CRON DAEMON</div>
											<div class="notification-description">Job <strong>"Clean DB"</strong> has been completed.</div>
											<div class="notification-ago">12h ago</div>
											<div class="notification-icon fa fa-clock-o bg-default"></div>
										</div> <!-- / .notification -->

										<div class="notification">
											<div class="notification-title text-success">SYSTEM</div>
											<div class="notification-description">Server <strong>up</strong>.</div>
											<div class="notification-ago">12h ago</div>
											<div class="notification-icon fa fa-hdd-o bg-success"></div>
										</div> <!-- / .notification -->

										<div class="notification">
											<div class="notification-title text-warning">SYSTEM</div>
											<div class="notification-description"><strong>Warning</strong>: Processor load <strong>92%</strong>.</div>
											<div class="notification-ago">12h ago</div>
											<div class="notification-icon fa fa-hdd-o bg-warning"></div>
										</div> <!-- / .notification -->

									</div> <!-- / .notifications-list -->
									<a href="#" class="notifications-link">MORE NOTIFICATIONS</a>
								</div> <!-- / .dropdown-menu -->
							</li>
							<li class="nav-icon-btn nav-icon-btn-success dropdown">
								<a href="mail.ru" class="dropdown-toggle" data-toggle="dropdown">
									<span class="label">10</span>
									<i class="nav-icon fa fa-envelope"></i>
									<span class="small-screen-text">Income messages</span>
								</a>

								<!-- MESSAGES -->
								
								<!-- Javascript -->
								<script>
									init.push(function () {
										$('#main-navbar-messages').slimScroll({ height: 250 });
									});
								</script>
								<!-- / Javascript -->

								<div class="dropdown-menu widget-messages-alt no-padding" style="width: 300px;">
									<div class="messages-list" id="main-navbar-messages">

										<div class="message">
											<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/2.jpg" alt="" class="message-avatar">
											<a href="#" class="message-subject">Lorem ipsum dolor sit amet, consectetur adipisicing elit.</a>
											<div class="message-description">
												from <a href="#">Robert Jang</a>
												&nbsp;&nbsp;·&nbsp;&nbsp;
												2h ago
											</div>
										</div> <!-- / .message -->

										<div class="message">
											<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/3.jpg" alt="" class="message-avatar">
											<a href="#" class="message-subject">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</a>
											<div class="message-description">
												from <a href="#">Michelle Bortz</a>
												&nbsp;&nbsp;·&nbsp;&nbsp;
												2h ago
											</div>
										</div> <!-- / .message -->

										<div class="message">
											<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/4.jpg" alt="" class="message-avatar">
											<a href="#" class="message-subject">Lorem ipsum dolor sit amet.</a>
											<div class="message-description">
												from <a href="#">Timothy Owens</a>
												&nbsp;&nbsp;·&nbsp;&nbsp;
												2h ago
											</div>
										</div> <!-- / .message -->

										<div class="message">
											<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/5.jpg" alt="" class="message-avatar">
											<a href="#" class="message-subject">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</a>
											<div class="message-description">
												from <a href="#">Denise Steiner</a>
												&nbsp;&nbsp;·&nbsp;&nbsp;
												2h ago
											</div>
										</div> <!-- / .message -->

										<div class="message">
											<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/2.jpg" alt="" class="message-avatar">
											<a href="#" class="message-subject">Lorem ipsum dolor sit amet.</a>
											<div class="message-description">
												from <a href="#">Robert Jang</a>
												&nbsp;&nbsp;·&nbsp;&nbsp;
												2h ago
											</div>
										</div> <!-- / .message -->

										<div class="message">
											<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/2.jpg" alt="" class="message-avatar">
											<a href="#" class="message-subject">Lorem ipsum dolor sit amet, consectetur adipisicing elit.</a>
											<div class="message-description">
												from <a href="#">Robert Jang</a>
												&nbsp;&nbsp;·&nbsp;&nbsp;
												2h ago
											</div>
										</div> <!-- / .message -->

										<div class="message">
											<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/3.jpg" alt="" class="message-avatar">
											<a href="#" class="message-subject">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</a>
											<div class="message-description">
												from <a href="#">Michelle Bortz</a>
												&nbsp;&nbsp;·&nbsp;&nbsp;
												2h ago
											</div>
										</div> <!-- / .message -->

										<div class="message">
											<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/4.jpg" alt="" class="message-avatar">
											<a href="#" class="message-subject">Lorem ipsum dolor sit amet.</a>
											<div class="message-description">
												from <a href="#">Timothy Owens</a>
												&nbsp;&nbsp;·&nbsp;&nbsp;
												2h ago
											</div>
										</div> <!-- / .message -->

										<div class="message">
											<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/5.jpg" alt="" class="message-avatar">
											<a href="#" class="message-subject">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</a>
											<div class="message-description">
												from <a href="#">Denise Steiner</a>
												&nbsp;&nbsp;·&nbsp;&nbsp;
												2h ago
											</div>
										</div> <!-- / .message -->

										<div class="message">
											<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/2.jpg" alt="" class="message-avatar">
											<a href="#" class="message-subject">Lorem ipsum dolor sit amet.</a>
											<div class="message-description">
												from <a href="#">Robert Jang</a>
												&nbsp;&nbsp;·&nbsp;&nbsp;
												2h ago
											</div>
										</div> <!-- / .message -->

									</div> <!-- / .messages-list -->
									<a href="#" class="messages-link">MORE MESSAGES</a>
								</div> <!-- / .dropdown-menu -->
							</li>
<!-- /3. $END_NAVBAR_ICON_BUTTONS -->

							<li>
								<form class="navbar-form pull-left">
									<input type="text" class="form-control" placeholder="Search">
								</form>
							</li>

							<li class="dropdown">
								<a href="#" class="dropdown-toggle user-menu" data-toggle="dropdown">
									<c:if test="${logged.bphoto == null }">
										<img src="<%=request.getContextPath()%>/resources/assets/images/pixel-admin/logo_profil.png" alt="" class="">
									</c:if>
									<c:if test="${logged.bphoto != null }">
										<img src="/users/photo?id=${logged.id }" alt="" class=""/>
									</c:if>
									<span>${logged.prenom } ${logged.nom }</span>
								</a>
								<ul class="dropdown-menu">
									<li><a href="<c:url value="/users/profil?id=${logged.id }" />">Profile</a></li>
									<li class="divider"></li>
									<li><a href="<c:url value="/j_spring_security_logout"/>"><i class="dropdown-icon fa fa-power-off"></i>&nbsp;&nbsp;D�connexion</a></li>
								</ul>
							</li>
						</ul> <!-- / .navbar-nav -->
					</div> <!-- / .right -->
				</div>
			</div> <!-- / #main-navbar-collapse -->
		</div> <!-- / .navbar-inner -->
	</div> <!-- / #main-navbar -->
<!-- /2. $END_MAIN_NAVIGATION -->


<!-- 4. $MAIN_MENU =================================================================================

		Main menu
		
		Notes:
		* to make the menu item active, add a class 'active' to the <li>
		  example: <li class="active">...</li>
		* multilevel submenu example:
			<li class="mm-dropdown">
			  <a href="#"><span class="mm-text">Submenu item text 1</span></a>
			  <ul>
				<li>...</li>
				<li class="mm-dropdown">
				  <a href="#"><span class="mm-text">Submenu item text 2</span></a>
				  <ul>
					<li>...</li>
					...
				  </ul>
				</li>
				...
			  </ul>
			</li>
-->
	<div id="main-menu" role="navigation">
		<div id="main-menu-inner">
			<div class="menu-content top" id="menu-content-demo">
				<!-- Menu custom content demo
					 CSS:        styles/pixel-admin-less/demo.less or styles/pixel-admin-scss/_demo.scss
					 Javascript: html/<%=request.getContextPath()%>/resources/assets/demo/demo.js
				 -->
				<div>
					<div class="text-bg"><span class="text-slim">Bonjour,</span> <span class="text-semibold">${logged.prenom }</span></div>

					<c:if test="${logged.bphoto == null }">
						<img src="<%=request.getContextPath()%>/resources/assets/images/pixel-admin/logo_profil.png" alt="" class="">
					</c:if>
					<c:if test="${logged.bphoto != null }">
						<img src="/users/photo?id=${logged.id }" alt="" class=""/>
					</c:if>
					<div class="btn-group">
						<a href="<c:url value="/users/profil?id=${logged.id }" />" class="btn btn-xs btn-primary btn-outline dark"><i class="fa fa-user"></i></a>
						<a href="<c:url value="/j_spring_security_logout"/>" class="btn btn-xs btn-danger btn-outline dark"><i class="fa fa-power-off"></i></a>
					</div>
					
				</div>
			</div>
			<ul class="navigation">
				<li>
					<a href="<%=request.getContextPath()%>/index"><i class="menu-icon fa fa-dashboard"></i><span class="mm-text">Tableau de bord</span></a>
				</li>
				<s:authorize ifAnyGranted="ROLE_ADMIN">
				<li class="mm-dropdown">
					<a href="#"><i class="menu-icon fa fa-users"></i><span class="mm-text">Gestion des utilisateurs</span></a>
					<ul>
						<li>
							<a tabindex="-1" href="<c:url value="/users/profil?id=${logged.id }" />"><span class="mm-text">Profil</span></a>
						</li>
						<li>
							<a tabindex="-1" href="<c:url value="/users/admin/add" />"><span class="mm-text">Nouveau utilisateur</span></a>
						</li>
						<li>
							<a tabindex="-1" href="<c:url value="/users/admin/all" />"><span class="mm-text">Comptes utilisateurs</span></a>
						</li>
					</ul>
				</li>
				</s:authorize>
				<li class="mm-dropdown">
					<a href="#"><i class="menu-icon fa fa-cogs"></i><span class="mm-text">Gestion des configurations</span></a>
					<ul>
						<li>
							<a tabindex="-1" href="<c:url value="/config/admin/dashboard" />"><span class="mm-text">Tableaux de bord</span></a>
						</li>
					</ul>
				</li>

				<li class="mm-dropdown">
					<a href="#"><i class="menu-icon fa fa-th"></i><span class="mm-text">Gestion des incidents</span></a>
					<ul>
						<li>
							<a tabindex="-1" href="#"><span class="mm-text">Grid</span></a>
						</li>
					</ul>
				</li>

				<li class="mm-dropdown">
					<a href="#"><i class="menu-icon fa fa-retweet"></i><span class="mm-text">Gestion des changements</span></a>
					<ul>
						<li>
							<a tabindex="-1" href="#"><span class="mm-text">Grid</span></a>
						</li>
					</ul>
				</li>

				<li class="mm-dropdown">
					<a href="#"><i class="menu-icon fa fa-upload"></i><span class="mm-text">Gestion des donn�es</span></a>
					<ul>
						<li>
							<a tabindex="-1" href="#"><span class="mm-text">Grid</span></a>
						</li>
					</ul>
				</li>
				
			</ul>
			 <!-- / .navigation -->
			
		</div> <!-- / #main-menu-inner -->
	</div> <!-- / #main-menu -->
<!-- /4. $MAIN_MENU -->


	<div id="content-wrapper">
<!-- 5. $CONTENT ===================================================================================

		Content
-->

		<!-- Javascript -->
				<script>
					init.push(function () {
						$( "#ui-accordion" ).accordion({
							heightStyle: "content",
							header: "> div > h3"
						}).sortable({
							axis: "y",
							handle: "h3",
							stop: function( event, ui ) {
								// IE doesn't register the blur when sorting
								// so trigger focusout handlers to remove .ui-state-focus
								ui.item.children( "h3" ).triggerHandler( "focusout" );
							}
						});
					});
				</script>
				<!-- / Javascript -->

		<!-- Content here -->
		<div class="panel">
					
					<div class="panel-body">
						<div id="ui-accordion">
							<div class="group">
								<h3><img src="<%=request.getContextPath()%>/resources/assets/images/png/server.png" alt="" class="">&nbsp; <strong>Infrastructures</strong> </h3>
								<div>
									<div class="row">

					
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/rack.png" alt="" class="">&nbsp; Rack : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type Rack</span></a>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type Rack</span></a>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/enclosure.png" alt="" class="">&nbsp; Chassis : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type Chassis</span></a>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type Chassis</span></a>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/server.png" alt="" class="">&nbsp; Serveur : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type Serveur</span></a>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type Serveur</span></a>
												</div>
											</div>
										</div>
										
										
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/switch-san.png" alt="" class="">&nbsp; Switch SAN : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type Switch SAN</span></a>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type Switch SAN</span></a>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/nas.png" alt="" class="">&nbsp; NAS : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type NAS</span></a>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type NAS</span></a>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/tapelibrary.png" alt="" class="">&nbsp; Bandoth�que : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type Bandoth�que</span></a>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type Bandoth�que</span></a>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/power-connection.png" alt="" class="">&nbsp; Connection Electrique : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type Connection Electrique</span></a>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type Connection Electrique</span></a>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/dvr.png" alt="" class="">&nbsp; DVR : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type DVR</span></a><br>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type DVR</span></a>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/switch.png" alt="" class="">&nbsp; Equipement r�seau : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type Equipement r�seau</span></a>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type Equipement r�seau</span></a>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-12">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/storageArea.png" alt="" class="">&nbsp; Syst�me de stockage : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type Syst�me de stockage</span></a><br>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type Syst�me de stockage</span></a>
												</div>
											</div>
										</div>
										
										
										
									</div>
								</div>
							</div> <!-- / .group -->
							
							
							
							<div class="group">
								<h3><img src="<%=request.getContextPath()%>/resources/assets/images/png/hypervisor-sw.png" alt="" class="">&nbsp; <strong>Virtualisation</strong> </h3>
								<div>
									
									<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/cluster.png" alt="" class="">&nbsp; vCluster : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type vCluster</span></a>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type vCluster</span></a>
												</div>
											</div>
										</div>
										
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/hypervisor.png" alt="" class="">&nbsp; Hyperviseur : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type Hyperviseur</span></a>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type Hyperviseur</span></a>
												</div>
											</div>
										</div>
										
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/virtualmachine.png" alt="" class="">&nbsp; Machine virtuelle : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type Machine virtuelle</span></a>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type Machine virtuelle</span></a>
												</div>
											</div>
										</div>
									
								</div>
							</div> <!-- / .group -->
							<div class="group">
								<h3><img src="<%=request.getContextPath()%>/resources/assets/images/png/team.png" alt="" class="">&nbsp; <strong>P�riph�riques utilisateurs</strong> </h3>
								<div>
									
									<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/laptop.png" alt="" class="">&nbsp; Ordinateur : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type Ordinateur</span></a>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type Ordinateur</span></a>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/ipphone.png" alt="" class="">&nbsp; T�l�phone fixe : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type T�l�phone fixe</span></a>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type T�l�phone fixe</span></a>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/mobile-phone.png" alt="" class="">&nbsp; T�l�phone mobile : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type T�l�phone mobile</span></a>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type T�l�phone mobile</span></a>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/tablet.png" alt="" class="">&nbsp; Tablette : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type Tablette</span></a>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type Tablette</span></a>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/printer.png" alt="" class="">&nbsp; Imprimante : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type Imprimante</span></a>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type Imprimante</span></a>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/peripherals.png" alt="" class="">&nbsp; P�riph�rique : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type P�riph�rique</span></a>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type P�riph�rique</span></a>
												</div>
											</div>
										</div>
									
								</div>
							</div> <!-- / .group -->
							<div class="group">
								<h3><img src="<%=request.getContextPath()%>/resources/assets/images/png/application.png" alt="" class="">&nbsp; <strong>Logiciels et applications</strong> </h3>
								<div>
									
									<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/middleware.png" alt="" class="">&nbsp; Middleware : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type Middleware</span></a>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type Middleware</span></a>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/database.png" alt="" class="">&nbsp; Serveur de base de donn�es : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type Serveur de base de donn�es</span></a>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type Serveur de base de donn�es</span></a>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/webserver.png" alt="" class="">&nbsp; Serveur Web : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type Serveur Web</span></a>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type Serveur Web</span></a>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/application.png" alt="" class="">&nbsp; Logiciel PC : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type Logiciel PC</span></a>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type Logiciel PC</span></a>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/application.png" alt="" class="">&nbsp; Autre logiciel : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type Autre logiciel</span></a>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type Autre logiciel</span></a>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/middleware.png" alt="" class="">&nbsp; Instance Middleware : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type Instance Middleware</span></a>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type Instance Middleware</span></a>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/database-schema.png" alt="" class="">&nbsp; Instance de base de donn�es : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type Instance de base de donn�es</span></a>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type Instance de base de donn�es</span></a>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/webapp.png" alt="" class="">&nbsp; Application Web : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type Application Web</span></a>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type Application Web</span></a>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/licence.png" alt="" class="">&nbsp; License : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type License</span></a>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type License</span></a>
												</div>
											</div>
										</div>
										
										
									
								</div>
							</div> <!-- / .group -->
							<div class="group">
								<h3><img src="<%=request.getContextPath()%>/resources/assets/images/png/subnet.png" alt="" class="">&nbsp; <strong>Divers</strong> </h3>
								<div>
									
									<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/interface.png" alt="" class="">&nbsp; Interface R�seau : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type Interface R�seau</span></a>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type Interface R�seau</span></a>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/subnet.png" alt="" class="">&nbsp; Subnet : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type Subnet</span></a>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type Subnet</span></a>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/vlan.png" alt="" class="">&nbsp; VLAN : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type VLAN</span></a>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type VLAN</span></a>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/volume.png" alt="" class="">&nbsp; Volume logique : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type Volume logique</span></a>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type Volume logique</span></a>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/business-process.png" alt="" class="">&nbsp; Processus m�tier : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type Processus m�tier</span></a>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type Processus m�tier</span></a>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/solution.png" alt="" class="">&nbsp; Solution applicative : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type Solution applicative</span></a>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type Solution applicative</span></a>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/group.png" alt="" class="">&nbsp; Groupe : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type Groupe</span></a>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type Groupe</span></a>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/camera.png" alt="" class="">&nbsp; Camera : 0
													</a>
												</div>
												<div class="col-md-12">
													<a href="#"><span class="fa fa-angle-double-right"> Cr�er un nouvel objet de type Camera</span></a>
													<a href="#"><span class="fa fa-angle-double-right"> Rechercher des objets de type Camera</span></a>
												</div>
											</div>
										</div>
									
								</div>
							</div>
						</div> <!-- / #ui-accordion -->
					</div>
				</div>

	</div> <!-- / #content-wrapper -->
	<div id="main-menu-bg"></div>
</div> <!-- / #main-wrapper -->

<!-- Get jQuery from Google CDN -->
<!--[if !IE]> -->
	<script type="text/javascript"> window.jQuery || document.write('<script src="<%=request.getContextPath()%>/resources/assets/ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js">'+"<"+"/script>"); </script>
<!-- <![endif]-->
<!--[if lte IE 9]>
	<script type="text/javascript"> window.jQuery || document.write('<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js">'+"<"+"/script>"); </script>
<![endif]-->

<script src="jquery.transit.js"></script>

<!-- Pixel Admin's javascripts -->
<script src="<%=request.getContextPath()%>/resources/assets/javascripts/bootstrap.min.js"></script>
<script src="<%=request.getContextPath()%>/resources/assets/javascripts/pixel-admin.min.js"></script>

<script type="text/javascript">
	init.push(function () {
		// Javascript code here
	});
	window.PixelAdmin.start(init);
</script>

</body>

<!-- Mirrored from infinite-woodland-5276.herokuapp.com/pages-blank.html by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 03 Mar 2016 01:48:30 GMT -->
</html>