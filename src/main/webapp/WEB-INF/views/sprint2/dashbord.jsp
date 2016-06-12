

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
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
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
				<a href="<c:url value="/index" />" class="navbar-brand">
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
												&nbsp;&nbsp;Â·&nbsp;&nbsp;
												2h ago
											</div>
										</div> <!-- / .message -->

										<div class="message">
											<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/3.jpg" alt="" class="message-avatar">
											<a href="#" class="message-subject">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</a>
											<div class="message-description">
												from <a href="#">Michelle Bortz</a>
												&nbsp;&nbsp;Â·&nbsp;&nbsp;
												2h ago
											</div>
										</div> <!-- / .message -->

										<div class="message">
											<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/4.jpg" alt="" class="message-avatar">
											<a href="#" class="message-subject">Lorem ipsum dolor sit amet.</a>
											<div class="message-description">
												from <a href="#">Timothy Owens</a>
												&nbsp;&nbsp;Â·&nbsp;&nbsp;
												2h ago
											</div>
										</div> <!-- / .message -->

										<div class="message">
											<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/5.jpg" alt="" class="message-avatar">
											<a href="#" class="message-subject">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</a>
											<div class="message-description">
												from <a href="#">Denise Steiner</a>
												&nbsp;&nbsp;Â·&nbsp;&nbsp;
												2h ago
											</div>
										</div> <!-- / .message -->

										<div class="message">
											<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/2.jpg" alt="" class="message-avatar">
											<a href="#" class="message-subject">Lorem ipsum dolor sit amet.</a>
											<div class="message-description">
												from <a href="#">Robert Jang</a>
												&nbsp;&nbsp;Â·&nbsp;&nbsp;
												2h ago
											</div>
										</div> <!-- / .message -->

										<div class="message">
											<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/2.jpg" alt="" class="message-avatar">
											<a href="#" class="message-subject">Lorem ipsum dolor sit amet, consectetur adipisicing elit.</a>
											<div class="message-description">
												from <a href="#">Robert Jang</a>
												&nbsp;&nbsp;Â·&nbsp;&nbsp;
												2h ago
											</div>
										</div> <!-- / .message -->

										<div class="message">
											<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/3.jpg" alt="" class="message-avatar">
											<a href="#" class="message-subject">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</a>
											<div class="message-description">
												from <a href="#">Michelle Bortz</a>
												&nbsp;&nbsp;Â·&nbsp;&nbsp;
												2h ago
											</div>
										</div> <!-- / .message -->

										<div class="message">
											<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/4.jpg" alt="" class="message-avatar">
											<a href="#" class="message-subject">Lorem ipsum dolor sit amet.</a>
											<div class="message-description">
												from <a href="#">Timothy Owens</a>
												&nbsp;&nbsp;Â·&nbsp;&nbsp;
												2h ago
											</div>
										</div> <!-- / .message -->

										<div class="message">
											<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/5.jpg" alt="" class="message-avatar">
											<a href="#" class="message-subject">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</a>
											<div class="message-description">
												from <a href="#">Denise Steiner</a>
												&nbsp;&nbsp;Â·&nbsp;&nbsp;
												2h ago
											</div>
										</div> <!-- / .message -->

										<div class="message">
											<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/2.jpg" alt="" class="message-avatar">
											<a href="#" class="message-subject">Lorem ipsum dolor sit amet.</a>
											<div class="message-description">
												from <a href="#">Robert Jang</a>
												&nbsp;&nbsp;Â·&nbsp;&nbsp;
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
										<img src="<c:url value="/users/photo?id=${logged.id }"/>" alt="" class=""/>
									</c:if>
									<span>${logged.prenom } ${logged.nom }</span>
								</a>
								<ul class="dropdown-menu">
									<li><a href="<c:url value="/users/profil?id=${logged.id }" />">Profile</a></li>
									<li class="divider"></li>
									<li><a href="<c:url value="/j_spring_security_logout"/>"><i class="dropdown-icon fa fa-power-off"></i>&nbsp;&nbsp;Déconnexion</a></li>
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
						<img src="<c:url value="/users/photo?id=${logged.id }"/>" alt="" class=""/>
					</c:if>
					<div class="btn-group">
						<a href="<c:url value="/users/profil?id=${logged.id }" />" class="btn btn-xs btn-primary btn-outline dark"><i class="fa fa-user"></i></a>
						<a href="<c:url value="/j_spring_security_logout"/>" class="btn btn-xs btn-danger btn-outline dark"><i class="fa fa-power-off"></i></a>
					</div>
					
				</div>
			</div>
			<ul class="navigation">
				<li>
					<a href="<%=request.getContextPath()%>/index"><i class="menu-icon fa fa-dashboard"></i><span class="mm-text">Tableaux de bord</span></a>
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
						<li>
							<a href="<c:url value="/config/admin/add/neveauCI" />"><span class="mm-text">Nouveau CI</span></a>
						</li>
						<li>
							<a href="<c:url value="/config/search/contact"/>"><span class="mm-text">Contacts</span></a>
						</li>
						<li>
							<a href="<c:url value="/config/search/lieu"/>"><span class="mm-text">Lieux</span></a>
						</li>
						<li>
							<a href="<c:url value="/config/search/document"/>"><span class="mm-text">Documents</span></a>
						</li>
						<li>
							<a href="<c:url value="/config/search/contrat"/>"><span class="mm-text">Contrats</span></a>
						</li>
						<li>
							<a href="<c:url value="/config/search/groupe"/>"><span class="mm-text">Groupe CIs</span></a>
						</li>
					</ul>
				</li>

				<li class="mm-dropdown">
					<a href="#"><i class="menu-icon fa fa-th"></i><span class="mm-text">Gestion des incidents</span></a>
					<ul>
						<li>
							<a tabindex="-1" href="#"><span class="mm-text">Vue d'ensemble</span></a>
						</li>
						<li>
							<a tabindex="-1" href="<c:url value="/incid/add/ticket"/>"><span class="mm-text">Nouveau Ticket</span></a>
						</li>
						<li>
							<a tabindex="-1" href="<c:url value="/incid/search/ticket"/>"><span class="mm-text">Recherche des incidents</span></a>
						</li>
						<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
						<li>
							<a tabindex="-1" href="<c:url value="/incid/view/mesticket"/>"><span class="mm-text">Mes Incidents</span></a>
						</li>
						</s:authorize>
						<li>
							<a tabindex="-1" href="#"><span class="mm-text">Incidents en cours</span></a>
						</li>
						<li>
							<a tabindex="-1" href="#"><span class="mm-text">Incidents ouverts</span></a>
						</li>
						<li>
							<a tabindex="-1" href="#"><span class="mm-text">Incidents fermées</span></a>
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
					<a href="#"><i class="menu-icon fa fa-upload"></i><span class="mm-text">Gestion des données</span></a>
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
				
				
				<c:if test="${save == true }">
					<div class="alert alert-success">
						<button type="button" class="close" data-dismiss="alert">×</button>
						L'élément de configuration est bien enregistrer.
					</div>
				</c:if>
				
				
				

		<!-- Content here -->
		<div class="panel">
					
					<div class="panel-body">
						<div id="ui-accordion">
						<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
							<div class="group">
								<h3><img src="<%=request.getContextPath()%>/resources/assets/images/png/server.png" alt="" class="">&nbsp; <strong>Infrastructures</strong> </h3>
								<div>
									<div class="row">

					
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/rack.png" alt="" class="">&nbsp; Rack : ${Rack }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a href="<c:url value="/config/admin/add/rack" />"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type Rack</span></a>
												</s:authorize>
												<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
													<a href="<c:url value="/config/search/rack"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type Rack</span></a>
												</s:authorize>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/enclosure.png" alt="" class="">&nbsp; Chassis : ${Chassis }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a href="<c:url value="/config/admin/add/chassis" />"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type Chassis</span></a>
												</s:authorize>
												<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
													<a href="<c:url value="/config/search/chassis"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type Chassis</span></a>
												</s:authorize>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/server.png" alt="" class="">&nbsp; Serveur : ${Serveur }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a href="<c:url value="/config/admin/add/serveur" />"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type Serveur</span></a>
												</s:authorize>
												<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
													<a href="<c:url value="/config/search/serveur"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type Serveur</span></a>
												</s:authorize>
												</div>
											</div>
										</div>
										
										
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/switch-san.png" alt="" class="">&nbsp; Switch SAN : ${SwitchSAN }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a href="<c:url value="/config/admin/add/switchsan" />"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type Switch SAN</span></a>
												</s:authorize>
												<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
													<a href="<c:url value="/config/search/switchsan"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type Switch SAN</span></a>
												</s:authorize>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/nas.png" alt="" class="">&nbsp; NAS : ${NAS }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a href="<c:url value="/config/admin/add/nas" />"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type NAS</span></a>
												</s:authorize>
												<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
													<a href="<c:url value="/config/search/nas"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type NAS</span></a>
												</s:authorize>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/tapelibrary.png" alt="" class="">&nbsp; Bandothèque : ${Bandotheque }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a href="<c:url value="/config/admin/add/bandotheque" />"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type Bandothèque</span></a>
												</s:authorize>
												<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
													<a href="<c:url value="/config/search/bandotheque"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type Bandothèque</span></a>
												</s:authorize>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/power-connection.png" alt="" class="">&nbsp; Connection Electrique : ${ConnectionElectrique }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a href="<c:url value="/config/admin/add/typeConnexionElectrique" />"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type Connection Electrique</span></a>
												</s:authorize>
												<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
													<a href="<c:url value="/config/search/connexionElectrique"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type Connection Electrique</span></a>
												</s:authorize>

												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/dvr.png" alt="" class="">&nbsp; DVR : ${DVR }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a href="<c:url value="/config/admin/add/dvr" />"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type DVR</span></a><br>
												</s:authorize>
												<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
													<a href="<c:url value="/config/search/dvr"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type DVR</span></a>
												</s:authorize>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/switch.png" alt="" class="">&nbsp; Equipement réseau : ${Equipementreseau }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a href="<c:url value="/config/admin/add/equipementreseau" />"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type Equipement réseau</span></a>
												</s:authorize>
												<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
													<a href="<c:url value="/config/search/equipementreseau"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type Equipement réseau</span></a>
												</s:authorize>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-12">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/storageArea.png" alt="" class="">&nbsp; Système de stockage : ${Systemedestockage }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a href="<c:url value="/config/admin/add/systemedestockage" />"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type Système de stockage</span></a><br>
												</s:authorize>
												<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
													<a href="<c:url value="/config/search/systemedestockage"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type Système de stockage</span></a>
												</s:authorize>
												</div>
											</div>
										</div>
										
										
										
									</div>
								</div>
							</div> <!-- / .group -->
							
							</s:authorize>
												
							<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
							<div class="group">
								<h3><img src="<%=request.getContextPath()%>/resources/assets/images/png/hypervisor-sw.png" alt="" class="">&nbsp; <strong>Virtualisation</strong> </h3>
								<div>
									
									<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/cluster.png" alt="" class="">&nbsp; vCluster : ${vCluster }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a tabindex="-1" href="<c:url value="/config/admin/add/vCluster" />"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type vCluster</span></a>
												</s:authorize>
												<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
													<a href="<c:url value="/config/search/vcluster"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type vCluster</span></a>
												</s:authorize>

												</div>
											</div>
										</div>
										
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/hypervisor.png" alt="" class="">&nbsp; Hyperviseur : ${Hyperviseur }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a tabindex="-1" href="<c:url value="/config/admin/add/hyperviseur" />"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type Hyperviseur</span></a>
												</s:authorize>
												<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
													<a href="<c:url value="/config/search/hyperviseur"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type Hyperviseur</span></a>
												</s:authorize>

												</div>
											</div>
										</div>
										
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/virtualmachine.png" alt="" class="">&nbsp; Machine virtuelle : ${Machinevirtuelle }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a tabindex="-1" href="<c:url value="/config/admin/add/machineVirtuelle" />"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type Machine virtuelle</span></a>
												</s:authorize>
												<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
													<a href="<c:url value="/config/search/machineVirtuelle"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type Machine virtuelle</span></a>
												</s:authorize>

												</div>
											</div>
										</div>
									
								</div>
							</div> <!-- / .group -->
							</s:authorize>
							<div class="group">
								<h3><img src="<%=request.getContextPath()%>/resources/assets/images/png/team.png" alt="" class="">&nbsp; <strong>Périphériques utilisateurs</strong> </h3>
								<div>
									
									<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/laptop.png" alt="" class="">&nbsp; Ordinateur : ${Ordinateur }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a href="<c:url value="/config/admin/add/pc"/>"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type Ordinateur</span></a>
												</s:authorize>
													<a href="<c:url value="/config/search/pc"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type Ordinateur</span></a>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/ipphone.png" alt="" class="">&nbsp; Téléphone fixe : ${Telephonefixe }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a href="<c:url value="/config/admin/add/telefixe"/>"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type Téléphone fixe</span></a>
												</s:authorize>
													<a href="<c:url value="/config/search/telefixe"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type Téléphone fixe</span></a>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/mobile-phone.png" alt="" class="">&nbsp; Téléphone mobile : ${Telephonemobile }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a href="<c:url value="/config/admin/add/telemobile"/>"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type Téléphone mobile</span></a>
												</s:authorize>
													<a href="<c:url value="/config/search/telemobile"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type Téléphone mobile</span></a>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/sim.png" alt="" class="">&nbsp; Carte SIM : ${sim }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a href="<c:url value="/config/admin/add/sim"/>"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type Carte SIM</span></a>
												</s:authorize>
													<a href="<c:url value="/config/search/sim"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type Carte SIM</span></a>
												</div>
											</div>
										</div>
										
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/tablet.png" alt="" class="">&nbsp; Tablette : ${Tablette }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a href="<c:url value="/config/admin/add/tablette"/>"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type Tablette</span></a>
												</s:authorize>
													<a href="<c:url value="/config/search/tablette"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type Tablette</span></a>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/printer.png" alt="" class="">&nbsp; Imprimante : ${Imprimante }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a href="<c:url value="/config/admin/add/imp"/>"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type Imprimante</span></a>
												</s:authorize>
													<a href="<c:url value="/config/search/imp"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type Imprimante</span></a>
												</div>
											</div>
										</div>
										<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/peripherals.png" alt="" class="">&nbsp; Périphérique : ${Peripherique }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a href="<c:url value="/config/admin/add/per"/>"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type Périphérique</span></a>
												</s:authorize>
													<a href="<c:url value="/config/search/per"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type Périphérique</span></a>
												</div>
											</div>
										</div>
									</s:authorize>
								</div>
							</div> <!-- / .group -->
							<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
							<div class="group">
								<h3><img src="<%=request.getContextPath()%>/resources/assets/images/png/application.png" alt="" class="">&nbsp; <strong>Logiciels et applications</strong> </h3>
								<div>
									
									<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/middleware.png" alt="" class="">&nbsp; Middleware : ${Middleware }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a tabindex="-1" href="<c:url value="/config/admin/add/middleware" />"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type Middleware</span></a>
												</s:authorize>
												<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
													<a href="<c:url value="/config/search/middleware"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type Middleware</span></a>
												</s:authorize>

												</div>
											</div>
										</div>
										
										
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/webserver.png" alt="" class="">&nbsp; Serveur Web : ${ServeurWeb }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a tabindex="-1" href="<c:url value="/config/admin/add/serveurWeb" />"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type Serveur Web</span></a>
												</s:authorize>
												<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
													<a href="<c:url value="/config/search/serveurWeb"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type Serveur Web</span></a>
												</s:authorize>

												</div>
											</div>
										</div>
										
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/database.png" alt="" class="">&nbsp; Serveur de base de données : ${Serveurdebasededonnees }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a tabindex="-1" href="<c:url value="/config/admin/add/serveurBD" />"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type Serveur de base de données</span></a>
												</s:authorize>
												<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
													<a href="<c:url value="/config/search/serveurBD"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type Serveur de base de données</span></a>
												</s:authorize>

												</div>
											</div>
										</div>
										
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/application.png" alt="" class="">&nbsp; Logiciel PC : ${LogicielPC }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a tabindex="-1" href="<c:url value="/config/admin/add/logicielPc" />"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type Logiciel PC</span></a>
												</s:authorize>
												<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
													<a href="<c:url value="/config/search/logicielPc"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type Logiciel PC</span></a>
												</s:authorize>

												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/application.png" alt="" class="">&nbsp; Autre logiciel : ${Autrelogiciel }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a tabindex="-1" href="<c:url value="/config/admin/add/autreLogiciel" />"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type Autre logiciel</span></a>
												</s:authorize>
												<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
													<a href="<c:url value="/config/search/autreLogiciel"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type Autre logiciel</span></a>
												</s:authorize>

												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/middleware.png" alt="" class="">&nbsp; Instance Middleware : ${InstanceMiddleware }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a tabindex="-1" href="<c:url value="/config/admin/add/instanceMiddleware" />"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type Instance Middleware</span></a>
												</s:authorize>
												<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
													<a href="<c:url value="/config/search/instanceMiddleware"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type Instance Middleware</span></a>
												</s:authorize>

												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/database-schema.png" alt="" class="">&nbsp; Instance de base de données : ${Instancedebasededonnees }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a tabindex="-1" href="<c:url value="/config/admin/add/instanceBD" />"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type Instance de base de données</span></a>
												</s:authorize>
												<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
													<a href="<c:url value="/config/search/instanceBD"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type Instance de base de données</span></a>
												</s:authorize>

												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/webapp.png" alt="" class="">&nbsp; Application Web : ${ApplicationWeb }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a tabindex="-1" href="<c:url value="/config/admin/add/applicationWeb" />"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type Application Web</span></a>
												</s:authorize>
												<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
													<a href="<c:url value="/config/search/applicationWeb"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type Application Web</span></a>
												</s:authorize>

												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/licence.png" alt="" class="">&nbsp; License : ${License }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a tabindex="-1" href="<c:url value="/config/admin/add/typeLicense" />"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type License</span></a>
												</s:authorize>
												<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
													<a href="<c:url value="/config/search/typeLicense"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type License</span></a>
												</s:authorize>

												</div>
											</div>
										</div>
										
										
									
								</div>
							</div> <!-- / .group -->
							</s:authorize>
							<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
													
							<div class="group">
								<h3><img src="<%=request.getContextPath()%>/resources/assets/images/png/subnet.png" alt="" class="">&nbsp; <strong>Divers</strong> </h3>
								<div>
									
									<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/interface.png" alt="" class="">&nbsp; Interface Réseau : ${InterfaceReseau }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a href="<c:url value="/config/admin/add/interfacereseau" />"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type Interface Réseau</span></a>
												</s:authorize>
												<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
													<a href="<c:url value="/config/search/interfacereseau" />"><span class="fa fa-angle-double-right"> Rechercher des objets de type Interface Réseau</span></a>
												</s:authorize>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/subnet.png" alt="" class="">&nbsp; Subnet : ${Subnet }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a href="<c:url value="/config/admin/add/subnet" />"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type Subnet</span></a>
												</s:authorize>
												<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
													<a href="<c:url value="/config/search/subnet"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type Subnet</span></a>
												</s:authorize>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/vlan.png" alt="" class="">&nbsp; VLAN : ${VLAN }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a href="<c:url value="/config/admin/add/vlan" />"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type VLAN</span></a>
												</s:authorize>
												<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
													<a href="<c:url value="/config/search/vlan"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type VLAN</span></a>
												</s:authorize>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/volume.png" alt="" class="">&nbsp; Volume logique : ${Volumelogique }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a href="<c:url value="/config/admin/add/volumeLogique" />"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type Volume logique</span></a>
												</s:authorize>
												<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
													<a href="<c:url value="/config/search/volumelogique"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type Volume logique</span></a>
												</s:authorize>
												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/business-process.png" alt="" class="">&nbsp; Processus métier : ${Processusmetier }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a tabindex="-1" href="<c:url value="/config/admin/add/processusMetier" />"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type Processus métier</span></a>
												</s:authorize>
												<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
													<a href="<c:url value="/config/search/processusMetier"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type Processus métier</span></a>
												</s:authorize>

												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/solution.png" alt="" class="">&nbsp; Solution applicative : ${Solutionapplicative }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a tabindex="-1" href="<c:url value="/config/admin/add/solutionApplicative" />"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type Solution applicative</span></a>
												</s:authorize>
												<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
													<a href="<c:url value="/config/search/solutionApplicative"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type Solution applicative</span></a>
												</s:authorize>

												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/group.png" alt="" class="">&nbsp; Groupe : ${Groupe }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a tabindex="-1" href="<c:url value="/config/admin/add/groupe" />"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type Groupe</span></a>
												</s:authorize>
												<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
													<a href="<c:url value="/config/search/groupe"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type Groupe</span></a>
												</s:authorize>

												</div>
											</div>
										</div>
										
										<div class="col-sm-4 col-md-4">
											<div class="stat-panel">
												<div class="col-md-12">
													<a href="#" style="color:black;">
														<img src="<%=request.getContextPath()%>/resources/assets/images/png/camera.png" alt="" class="">&nbsp; Camera : ${Camera }
													</a>
												</div>
												<div class="col-md-12">
												<s:authorize ifAnyGranted="ROLE_ADMIN">
													<a href="<c:url value="/config/admin/add/camera" />"><span class="fa fa-angle-double-right"> Créer un nouvel objet de type Camera</span></a>
												</s:authorize>
												<s:authorize ifAnyGranted="ROLE_ADMIN,ROLE_IT_TEAM">
													<a href="<c:url value="/config/search/camera"/>"><span class="fa fa-angle-double-right"> Rechercher des objets de type Camera</span></a>
												</s:authorize>
												</div>
											</div>
										</div>
									
								</div>
							
							</div>
							</s:authorize>
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