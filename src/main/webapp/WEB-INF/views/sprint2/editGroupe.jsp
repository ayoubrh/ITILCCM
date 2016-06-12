

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
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@taglib uri="http://www.springframework.org/security/tags" prefix="s" %>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<title>Modification Groupe - ITIL-CCM</title>
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
<body class="theme-default main-menu-animated page-profile">

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
							<a tabindex="-1" href="#"><span class="mm-text">Mes Incidents</span></a>
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
<!-- Modal CIs -->
				<div id="myModalCIs" class="modal fade" tabindex="-1" role="dialog" style="display: none;">
					<div class="modal-dialog modal-lg">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
								<h4 class="modal-title" id="myModalLabel">Ajout CIs</h4>
							</div>
							<div class="modal-body">
								<div class="table-warning">
									<table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered jq-datatables-example">
										<thead>
											<tr>
												<th id="supchek"> </th>
												<th>CI fonctionnel</th>
												<th>type de CI</th>
												<th>Criticité</th>
												<th>Date de mise en production</th>	
											</tr>
										</thead>
										<tbody id="tableCIspopup">
											<c:forEach items="${ApplicationWeb}" var="aw" >
												<tr class="gradeA" id="cis_App_${aw.id }" >
													<td class="supchekbox"><input type="checkbox" class="ckcis" name="ckCIs" value="App_${aw.id }"></td>
													<td>${aw.nom }</td>
													<td>Application Web</td>
													<td>${aw.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${aw.dateDeMiseEnProduction}" /></td>
													
												</tr>
											</c:forEach>
											<c:forEach items="${ConnexionElectrique}" var="ce" >
												<c:set var="string1" value="${ce['class'].name }"/>
												<c:set var="string2" value="${fn:substring(string1, 29,50)}" />
												<tr class="gradeA" id="cis_Con_${ce.id }" >
													<td class="supchekbox"><input type="checkbox" class="ckcis" name="ckCIs" value="Con_${ce.id }"></td>
													<td>${ce.nom }</td>
													<td>
													<c:if test="${string2 == 'ArriveeElectrique'}">
														Arrivée électrique
													</c:if>
													<c:if test="${string2 == 'PduElectrique'}">
														PDU 
													</c:if>
													</td>
													<td>${ce.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${ce.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
											<c:forEach items="${Logiciel}" var="l" >
												<c:set var="string1" value="${l['class'].name }"/>
												<c:set var="string2" value="${fn:substring(string1, 29,60)}" />
												<tr class="gradeA" id="cis_Log_${l.id }" >
													<td class="supchekbox"><input type="checkbox" class="ckcis" name="ckCIs" value="Log_${l.id }"></td>
													<td>${l.nom }</td>
													<td>
													<c:if test="${string2 == 'AutreLogiciel'}">
														Autre Logiciel
													</c:if>
													<c:if test="${string2 == 'LogicielPc'}">
														Logiciel PC
													</c:if>
													<c:if test="${string2 == 'ServeurWeb'}">
														Serveur Web
													</c:if>
													<c:if test="${string2 == 'Middleware'}">
														Middleware
													</c:if>
													<c:if test="${string2 == 'ServeurDeBasseDeDonnees'}">
														Serveur De Basse De Données
													</c:if>
													</td>
													<td>${l.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${l.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
											<c:forEach items="${Infrastructure}" var="in" >
												<c:set var="string1" value="${in['class'].name }"/>
												<c:set var="string2" value="${fn:substring(string1, 29,50)}" />
												<tr class="gradeA" id="cis_Inf_${in.id }" >
													<td class="supchekbox"><input type="checkbox" class="ckcis" name="ckCIs" value="Inf_${in.id }"></td>
													<td>${in.nom }</td>
													<td>
													<c:if test="${string2 == 'Bandotheque'}">
														Bandothèque
													</c:if>
													<c:if test="${string2 == 'Dvr'}">
														DVR
													</c:if>
													<c:if test="${string2 == 'Nas'}">
														NAS
													</c:if>
													<c:if test="${string2 == 'Serveur'}">
														Serveur
													</c:if>
													<c:if test="${string2 == 'SwitchSan'}">
														Switch SAN
													</c:if>
													<c:if test="${string2 == 'SystemeDeStockage'}">
														Système De Stockage
													</c:if>
													</td>
													<td>${in.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${in.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
											<c:forEach items="${Camera}" var="ca" >
												<tr class="gradeA" id="cis_Cam_${ca.id }" >
													<td class="supchekbox"><input type="checkbox" class="ckcis" name="ckCIs" value="Cam_${ca.id }"></td>
													<td>${ca.nom }</td>
													<td>Camera</td>
													<td>${ca.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${ca.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
                                            <c:forEach items="${Chassis}" var="ch" >
												<tr class="gradeA" id="cis_Cha_${ca.id }" >
													<td class="supchekbox"><input type="checkbox" class="ckcis" name="ckCIs" value="Cha_${ch.id }"></td>
													<td>${ch.nom }</td>
													<td>Chassis</td>
													<td>${ch.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${ch.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
											<c:forEach items="${Equipementreseau}" var="er" >
												<tr class="gradeA" id="cis_Equ_${er.id }" >
													<td class="supchekbox"><input type="checkbox" class="ckcis" name="ckCIs" value="Equ_${er.id }"></td>
													<td>${er.nom }</td>
													<td>Equipement réseau</td>
													<td>${er.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${er.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
											<c:forEach items="${Virtualisation}" var="v" >
												<c:set var="string1" value="${v['class'].name }"/>
												<c:set var="string2" value="${fn:substring(string1, 29,50)}" />
												<tr class="gradeA" id="cis_Vir_${v.id }" >
													<td class="supchekbox"><input type="checkbox" class="ckcis" name="ckCIs" value="Vir_${v.id }"></td>
													<td>${v.nom }</td>
													<td>
													<c:if test="${string2 == 'Hyperviseur'}">
														Hyperviseur
													</c:if>
													<c:if test="${string2 == 'Vcluster'}">
														vCluster
													</c:if>
													</td>
													<td>${v.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${v.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
											<c:forEach items="${Imprimante}" var="i" >
												<tr class="gradeA" id="cis_Imp_${i.id }" >
													<td class="supchekbox"><input type="checkbox" class="ckcis" name="ckCIs" value="Imp_${i.id }"></td>
													<td>${i.nom }</td>
													<td>Imprimante</td>
													<td>${i.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${i.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
											<c:forEach items="${InstanceMiddleware}" var="im" >
												<tr class="gradeA" id="cis_InM_${im.id }" >
													<td class="supchekbox"><input type="checkbox" class="ckcis" name="ckCIs" value="InM_${im.id }"></td>
													<td>${im.nom }</td>
													<td>Instance Middleware</td>
													<td>${im.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${im.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
											<c:forEach items="${Instancedebasededonnees}" var="ibd" >
												<tr class="gradeA" id="cis_Ibd_${ibd.id }" >
													<td class="supchekbox"><input type="checkbox" class="ckcis" name="ckCIs" value="Ibd_${ibd.id }"></td>
													<td>${ibd.nom }</td>
													<td>Instance de base de données</td>
													<td>${ibd.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${ibd.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
											<c:forEach items="${Machinevirtuelle}" var="mv" >
												<tr class="gradeA" id="cis_Mac_${mv.id }" >
													<td class="supchekbox"><input type="checkbox" class="ckcis" name="ckCIs" value="Mac_${mv.id }"></td>
													<td>${mv.nom }</td>
													<td>Machine virtuelle</td>
													<td>${mv.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${mv.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
											<c:forEach items="${Ordinateur}" var="pc" >
												<tr class="gradeA" id="cis_Ord_${pc.id }" >
													<td class="supchekbox"><input type="checkbox" class="ckcis" name="ckCIs" value="Ord_${pc.id }"></td>
													<td>${pc.nom }</td>
													<td>Ordinateur</td>
													<td>${pc.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${pc.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
											<c:forEach items="${Processusmetier}" var="pm" >
												<tr class="gradeA" id="cis_Pro_${pm.id }" >
													<td class="supchekbox"><input type="checkbox" class="ckcis" name="ckCIs" value="Pro_${pm.id }"></td>
													<td>${pm.nom }</td>
													<td>Processus métier</td>
													<td>${pm.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${pm.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
											<c:forEach items="${Peripherique}" var="p" >
												<tr class="gradeA" id="cis_Per_${p.id }" >
													<td class="supchekbox"><input type="checkbox" class="ckcis" name="ckCIs" value="Per_${p.id }"></td>
													<td>${p.nom }</td>
													<td>Périphérique</td>
													<td>${p.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${p.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
											<c:forEach items="${Rack}" var="r" >
												<tr class="gradeA" id="cis_Rac_${r.id }" >
													<td class="supchekbox"><input type="checkbox" class="ckcis" name="ckCIs" value="Rac_${r.id }"></td>
													<td>${r.nom }</td>
													<td>Rack</td>
													<td>${r.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${r.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
											<c:forEach items="${Solutionapplicative}" var="sa" >
												<tr class="gradeA" id="cis_Sol_${sa.id }" >
													<td class="supchekbox"><input type="checkbox" class="ckcis" name="ckCIs" value="Sol_${sa.id }"></td>
													<td>${sa.nom }</td>
													<td>Solution applicative</td>
													<td>${sa.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${sa.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
											<c:forEach items="${Tablette}" var="t" >
												<tr class="gradeA" id="cis_Tab_${t.id }" >
													<td class="supchekbox"><input type="checkbox" class="ckcis" name="ckCIs" value="Tab_${t.id }"></td>
													<td>${t.nom }</td>
													<td>Tablette</td>
													<td>${t.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${t.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
											<c:forEach items="${Telephonefixe}" var="tf" >
												<tr class="gradeA" id="cis_Tef_${tf.id }" >
													<td class="supchekbox"><input type="checkbox" class="ckcis" name="ckCIs" value="Tef_${tf.id }"></td>
													<td>${tf.nom }</td>
													<td>Téléphone fixe</td>
													<td>${tf.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${tf.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
											<c:forEach items="${Telephonemobile}" var="tm" >
												<tr class="gradeA" id="cis_Tem_${tm.id }" >
													<td class="supchekbox"><input type="checkbox" class="ckcis" name="ckCIs" value="Tem_${tm.id }"></td>
													<td>${tm.nom }</td>
													<td>Téléphone mobile</td>
													<td>${tm.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${tm.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
							</div> <!-- / .modal-body -->
							<div class="modal-footer">
								<button type="button" class="btn btn-default" data-dismiss="modal">Retour</button>
								<button type="button" class="btn btn-primary" id="addcis">Ajouter</button>
							</div>
						</div> <!-- / .modal-content -->
					</div> <!-- / .modal-dialog -->
				</div> <!-- /.modal -->
				<!-- / Modal -->
		<div class="panel">
					<div class="panel-heading">
						<span class="panel-title">Modification du Groupe</span>
					</div>
					<div class="panel-body">
						<f:form modelAttribute="groupe" action="/config/admin/add/saveGroupe" methode="post" enctype="multipart/form-data" class="form-horizontal" id="jq-validation-form">
					
					
		
						<hr class="profile-content-hr no-grid-gutter-h">
						
						<div class="profile-content">
		
							<ul id="profile-tabs" class="nav nav-tabs">
								<li class="active">
									<a href="#profile-tabs-proprietes" data-toggle="tab">Propriétés</a>
								</li>
								
								
								<li>
									<a href="#profile-tabs-cis" data-toggle="tab">CIs Liés</a>
								</li>
								
							</ul>
		
							<div class="tab-content tab-content-bordered panel-padding">
								<div class="widget-article-comments tab-pane panel no-padding no-border fade in active" id="profile-tabs-proprietes">
		
									
		
									<div class="panel-body">
						
						
							<f:input path="id" type="hidden" readonly="true" class="form-control" id="inputError-4" name="jq-validation-id"  />
							<div class="form-group required">
								<label for="jq-validation-email" class="col-sm-3 control-label">Nom</label>
								<div class="col-sm-9">
									<f:input path="nom" type="text" class="form-control" id="inputError-4" name="jq-validation-nom" />
									<f:errors path="nom" cssClass="help-block"></f:errors>
								</div>
							</div>
							
							<div class="form-group required">
								<label for="jq-validation-email" class="col-sm-3 control-label">Statut</label>
								<div class="col-sm-9">
									<f:select  path="statut" class="form-control" name="jq-validation-select2" id="jq-validation-select2">
							             <f:option value=""></f:option>
										 <f:option value="implémentation">implémentation</f:option>
										 <f:option value="obsolète"> obsolète</f:option>
										 <f:option value="production"> production</f:option>
									</f:select>
									<f:errors path="statut" cssClass="help-block"></f:errors>
							</div>
							</div>
							<div class="form-group">
								<label for="jq-validation-email" class="col-sm-3 control-label">Type</label>
								<div class="col-sm-9">
									<f:input path="type" type="text" class="form-control" id="inputError-4" name="jq-validation-type" />
									<f:errors path="type" cssClass="help-block"></f:errors>
								</div>
							</div>
							<div class="form-group">
								<label for="jq-validation-text" class="col-sm-3 control-label">Description</label>
								<div class="col-sm-9">
									<f:textarea path="description" class="form-control" name="jq-validation-description" id="jq-validation-description" />
									<f:errors path="description" cssClass="help-block"></f:errors>
								</div>
							</div>
							<div class="form-group">
								<label for="jq-validation-select2" class="col-sm-3 control-label">Groupe parent</label>
								<div class="col-sm-9">
									<f:select  path="groupe_parent.id" class="form-control" name="jq-validation-select2" id="jq-validation-select2">
										<f:option value=""> </f:option>
										<f:options items="${g }" itemValue="id" itemLabel="nom" />
									</f:select>
									<f:errors path="groupe_parent.id" cssClass="help-block"></f:errors>
								</div>
							</div>
					
							</div>
		
								</div> <!-- / .tab-pane -->
								<div class="tab-pane fade widget-cis" id="profile-tabs-cis">
									<div class="table-primary">
									<table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered jq-datatables-example">
										<thead>
										<tr>
												<th id="supchek"> </th>
												<th>CI fonctionnel</th>
												<th>type de CI</th>
												<th>Criticité</th>
												<th>Date de mise en production</th>	
											</tr>
										</thead>
										<tbody id="tableCIs">
											<c:forEach items="${groupe.applicationWeb}" var="aw" >
												<tr class="gradeA" id="cis_App_${aw.id }" >
													<td class="supchekbox"><input type="checkbox" checked="checked" class="ckcis" name="ckCIs" value="App_${aw.id }"></td>
													<td>${aw.nom }</td>
													<td>Application Web</td>
													<td>${aw.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${aw.dateDeMiseEnProduction}" /></td>
													
												</tr>
											</c:forEach>
											<c:forEach items="${groupe.connexionElectrique}" var="ce" >
												<c:set var="string1" value="${ce['class'].name }"/>
												<c:set var="string2" value="${fn:substring(string1, 29,50)}" />
												<tr class="gradeA" id="cis_Con_${ce.id }" >
													<td class="supchekbox"><input type="checkbox" checked="checked" class="ckcis" name="ckCIs" value="Con_${ce.id }"></td>
													<td>${ce.nom }</td>
													<td>
													<c:if test="${string2 == 'ArriveeElectrique'}">
														Arrivée électrique
													</c:if>
													<c:if test="${string2 == 'PduElectrique'}">
														PDU 
													</c:if>
													</td>
													<td>${ce.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${ce.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
											<c:forEach items="${groupe.logicielEtApplication}" var="l" >
												<c:set var="string1" value="${l['class'].name }"/>
												<c:set var="string2" value="${fn:substring(string1, 29,60)}" />
												<tr class="gradeA" id="cis_Log_${l.id }" >
													<td class="supchekbox"><input type="checkbox" checked="checked" class="ckcis" name="ckCIs" value="Log_${l.id }"></td>
													<td>${l.nom }</td>
													<td>
													<c:if test="${string2 == 'AutreLogiciel'}">
														Autre Logiciel
													</c:if>
													<c:if test="${string2 == 'LogicielPc'}">
														Logiciel PC
													</c:if>
													<c:if test="${string2 == 'ServeurWeb'}">
														Serveur Web
													</c:if>
													<c:if test="${string2 == 'Middleware'}">
														Middleware
													</c:if>
													<c:if test="${string2 == 'ServeurDeBasseDeDonnees'}">
														Serveur De Basse De Données
													</c:if>
													</td>
													<td>${l.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${l.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
											<c:forEach items="${groupe.infrastructure}" var="in" >
												<c:set var="string1" value="${in['class'].name }"/>
												<c:set var="string2" value="${fn:substring(string1, 29,50)}" />
												<tr class="gradeA" id="cis_Inf_${in.id }" >
													<td class="supchekbox"><input type="checkbox" checked="checked" class="ckcis" name="ckCIs" value="Inf_${in.id }"></td>
													<td>${in.nom }</td>
													<td>
													<c:if test="${string2 == 'Bandotheque'}">
														Bandothèque
													</c:if>
													<c:if test="${string2 == 'Dvr'}">
														DVR
													</c:if>
													<c:if test="${string2 == 'Nas'}">
														NAS
													</c:if>
													<c:if test="${string2 == 'Serveur'}">
														Serveur
													</c:if>
													<c:if test="${string2 == 'SwitchSan'}">
														Switch SAN
													</c:if>
													<c:if test="${string2 == 'SystemeDeStockage'}">
														Système De Stockage
													</c:if>
													</td>
													<td>${in.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${in.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
											<c:forEach items="${groupe.camera}" var="ca" >
												<tr class="gradeA" id="cis_Cam_${ca.id }" >
													<td class="supchekbox"><input type="checkbox" checked="checked" class="ckcis" name="ckCIs" value="Cam_${ca.id }"></td>
													<td>${ca.nom }</td>
													<td>Camera</td>
													<td>${ca.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${ca.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
                                            <c:forEach items="${groupe.chassis}" var="ch" >
												<tr class="gradeA" id="cis_Cha_${ca.id }" >
													<td class="supchekbox"><input type="checkbox" checked="checked" class="ckcis" name="ckCIs" value="Cha_${ch.id }"></td>
													<td>${ch.nom }</td>
													<td>Chassis</td>
													<td>${ch.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${ch.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
											<c:forEach items="${groupe.equipementReseau}" var="er" >
												<tr class="gradeA" id="cis_Equ_${er.id }" >
													<td class="supchekbox"><input type="checkbox" checked="checked" class="ckcis" name="ckCIs" value="Equ_${er.id }"></td>
													<td>${er.nom }</td>
													<td>Equipement réseau</td>
													<td>${er.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${er.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
											<c:forEach items="${groupe.virtualisation}" var="v" >
												<c:set var="string1" value="${v['class'].name }"/>
												<c:set var="string2" value="${fn:substring(string1, 29,50)}" />
												<tr class="gradeA" id="cis_Vir_${v.id }" >
													<td class="supchekbox"><input type="checkbox" checked="checked" class="ckcis" name="ckCIs" value="Vir_${v.id }"></td>
													<td>${v.nom }</td>
													<td>
													<c:if test="${string2 == 'Hyperviseur'}">
														Hyperviseur
													</c:if>
													<c:if test="${string2 == 'Vcluster'}">
														vCluster
													</c:if>
													</td>
													<td>${v.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${v.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
											<c:forEach items="${groupe.imprimante}" var="i" >
												<tr class="gradeA" id="cis_Imp_${i.id }" >
													<td class="supchekbox"><input type="checkbox" checked="checked" class="ckcis" name="ckCIs" value="Imp_${i.id }"></td>
													<td>${i.nom }</td>
													<td>Imprimante</td>
													<td>${i.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${i.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
											<c:forEach items="${groupe.instanceMiddleware}" var="im" >
												<tr class="gradeA" id="cis_InM_${im.id }" >
													<td class="supchekbox"><input type="checkbox" checked="checked" class="ckcis" name="ckCIs" value="InM_${im.id }"></td>
													<td>${im.nom }</td>
													<td>Instance Middleware</td>
													<td>${im.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${im.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
											<c:forEach items="${groupe.instanceDeBasseDeDonnes}" var="ibd" >
												<tr class="gradeA" id="cis_Ibd_${ibd.id }" >
													<td class="supchekbox"><input type="checkbox" checked="checked" class="ckcis" name="ckCIs" value="Ibd_${ibd.id }"></td>
													<td>${ibd.nom }</td>
													<td>Instance de base de données</td>
													<td>${ibd.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${ibd.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
											<c:forEach items="${groupe.machineVirtuelle}" var="mv" >
												<tr class="gradeA" id="cis_Mac_${mv.id }" >
													<td class="supchekbox"><input type="checkbox" checked="checked" class="ckcis" name="ckCIs" value="Mac_${mv.id }"></td>
													<td>${mv.nom }</td>
													<td>Machine virtuelle</td>
													<td>${mv.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${mv.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
											<c:forEach items="${groupe.ordinateur}" var="pc" >
												<tr class="gradeA" id="cis_Ord_${pc.id }" >
													<td class="supchekbox"><input type="checkbox" checked="checked" class="ckcis" name="ckCIs" value="Ord_${pc.id }"></td>
													<td>${pc.nom }</td>
													<td>Ordinateur</td>
													<td>${pc.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${pc.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
											<c:forEach items="${groupe.processusMetier}" var="pm" >
												<tr class="gradeA" id="cis_Pro_${pm.id }" >
													<td class="supchekbox"><input type="checkbox" checked="checked" class="ckcis" name="ckCIs" value="Pro_${pm.id }"></td>
													<td>${pm.nom }</td>
													<td>Processus métier</td>
													<td>${pm.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${pm.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
											<c:forEach items="${groupe.peripherique}" var="p" >
												<tr class="gradeA" id="cis_Per_${p.id }" >
													<td class="supchekbox"><input type="checkbox" checked="checked" class="ckcis" name="ckCIs" value="Per_${p.id }"></td>
													<td>${p.nom }</td>
													<td>Périphérique</td>
													<td>${p.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${p.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
											<c:forEach items="${groupe.rack}" var="r" >
												<tr class="gradeA" id="cis_Rac_${r.id }" >
													<td class="supchekbox"><input type="checkbox" checked="checked" class="ckcis" name="ckCIs" value="Rac_${r.id }"></td>
													<td>${r.nom }</td>
													<td>Rack</td>
													<td>${r.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${r.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
											<c:forEach items="${groupe.solutionApplicative}" var="sa" >
												<tr class="gradeA" id="cis_Sol_${sa.id }" >
													<td class="supchekbox"><input type="checkbox" checked="checked" class="ckcis" name="ckCIs" value="Sol_${sa.id }"></td>
													<td>${sa.nom }</td>
													<td>Solution applicative</td>
													<td>${sa.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${sa.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
											<c:forEach items="${groupe.tablette}" var="t" >
												<tr class="gradeA" id="cis_Tab_${t.id }" >
													<td class="supchekbox"><input type="checkbox" checked="checked" class="ckcis" name="ckCIs" value="Tab_${t.id }"></td>
													<td>${t.nom }</td>
													<td>Tablette</td>
													<td>${t.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${t.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
											<c:forEach items="${groupe.telephoneFixe}" var="tf" >
												<tr class="gradeA" id="cis_Tef_${tf.id }" >
													<td class="supchekbox"><input type="checkbox" checked="checked" class="ckcis" name="ckCIs" value="Tef_${tf.id }"></td>
													<td>${tf.nom }</td>
													<td>Téléphone fixe</td>
													<td>${tf.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${tf.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
											<c:forEach items="${groupe.telephneMobile}" var="tm" >
												<tr class="gradeA" id="cis_Tem_${tm.id }" >
													<td class="supchekbox"><input type="checkbox" checked="checked" class="ckcis" name="ckCIs" value="Tem_${tm.id }"></td>
													<td>${tm.nom }</td>
													<td>Téléphone mobile</td>
													<td>${tm.criticite }</td>
													<td><fmt:formatDate type="date" dateStyle="long" value="${tm.dateDeMiseEnProduction}" /></td>
												</tr>
											</c:forEach>
											
										</tbody>
									</table>
									</div>
									<br>
									<br>

									<div class="form-group">
										<div class="col-sm-offset-3 col-sm-1">
											<button type="button" class="btn btn-warning btn-flat" id="suppcis">Retirer !</button>
										</div>
										
										<div class="col-sm-offset-1 col-sm-7">
											<button type="button" class="btn btn-success btn-flat" data-toggle="modal" data-target="#myModalCIs">Ajouter des CIs</button>
										</div>
										
									</div>
								</div> <!-- / .tab-pane -->
								
								
							</div> <!-- / .tab-content -->
						</div>
				
					
					
					
					
					
							<hr class="panel-wide">
							
							<div class="form-group">
								<div class="col-sm-offset-3 col-sm-1">
									<button type="reset" class="btn btn-lg btn-danger btn-flat" onclick="location.href='<c:url value="/config/admin/dashboard" />'">Annuler</button>
								</div>
								
								<div class="col-sm-offset-1 col-sm-7">
									<button type="submit" class="btn btn-lg btn-primary btn-flat">Enregistrer</button>
								</div>
								
							</div>
						</f:form>
					</div>
					
					
		</div>

		


		<!-- Content here -->
		
		
		

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
		$('#profile-tabs').tabdrop();

		$("#leave-comment-form").expandingInput({
			target: 'textarea',
			hidden_content: '> div',
			placeholder: 'Write message',
			onAfterExpand: function () {
				$('#leave-comment-form textarea').attr('rows', '3').autosize();
			}
		});
		
		$('.jq-datatables-example').dataTable();
		$('.jq-datatables-example_wrapper .table-caption').text('');
		$('.jq-datatables-example_wrapper .dataTables_filter input').attr('placeholder', 'Search...');
		
		//<!-- Modal Materiels -->
			document.getElementById("addcis").onclick = function () {
	    	var chkArray = [];
	    	
	    	$(".ckcis:checked").each(function() {
	    		chkArray.push($(this).val());
	    		var tr = document.getElementById("cis_".concat($(this).val()));
		    	$( "#tableCIs" ).append(tr);
	    	});
	    	
	    };
	    
	    document.getElementById("suppcis").onclick = function () {
			var chkArray = [];
	    	
	    	$(".ckcis:checked").each(function() {
	    		chkArray.push($(this).val());
	    		//alert($(this).val());
	    		var tr = document.getElementById("cis_".concat($(this).val()));
		    	$( "#tableCIspopup" ).append(tr);
                this.checked = false;
	    	});
	    };
	});
	window.PixelAdmin.start(init);
</script>

</body>

<!-- Mirrored from infinite-woodland-5276.herokuapp.com/pages-blank.html by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 03 Mar 2016 01:48:30 GMT -->
</html>