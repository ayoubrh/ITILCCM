

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
	<title>Profil utilisateur - ITIL-CCM</title>
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
												&nbsp;&nbsp;路&nbsp;&nbsp;
												2h ago
											</div>
										</div> <!-- / .message -->

										<div class="message">
											<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/3.jpg" alt="" class="message-avatar">
											<a href="#" class="message-subject">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</a>
											<div class="message-description">
												from <a href="#">Michelle Bortz</a>
												&nbsp;&nbsp;路&nbsp;&nbsp;
												2h ago
											</div>
										</div> <!-- / .message -->

										<div class="message">
											<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/4.jpg" alt="" class="message-avatar">
											<a href="#" class="message-subject">Lorem ipsum dolor sit amet.</a>
											<div class="message-description">
												from <a href="#">Timothy Owens</a>
												&nbsp;&nbsp;路&nbsp;&nbsp;
												2h ago
											</div>
										</div> <!-- / .message -->

										<div class="message">
											<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/5.jpg" alt="" class="message-avatar">
											<a href="#" class="message-subject">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</a>
											<div class="message-description">
												from <a href="#">Denise Steiner</a>
												&nbsp;&nbsp;路&nbsp;&nbsp;
												2h ago
											</div>
										</div> <!-- / .message -->

										<div class="message">
											<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/2.jpg" alt="" class="message-avatar">
											<a href="#" class="message-subject">Lorem ipsum dolor sit amet.</a>
											<div class="message-description">
												from <a href="#">Robert Jang</a>
												&nbsp;&nbsp;路&nbsp;&nbsp;
												2h ago
											</div>
										</div> <!-- / .message -->

										<div class="message">
											<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/2.jpg" alt="" class="message-avatar">
											<a href="#" class="message-subject">Lorem ipsum dolor sit amet, consectetur adipisicing elit.</a>
											<div class="message-description">
												from <a href="#">Robert Jang</a>
												&nbsp;&nbsp;路&nbsp;&nbsp;
												2h ago
											</div>
										</div> <!-- / .message -->

										<div class="message">
											<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/3.jpg" alt="" class="message-avatar">
											<a href="#" class="message-subject">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</a>
											<div class="message-description">
												from <a href="#">Michelle Bortz</a>
												&nbsp;&nbsp;路&nbsp;&nbsp;
												2h ago
											</div>
										</div> <!-- / .message -->

										<div class="message">
											<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/4.jpg" alt="" class="message-avatar">
											<a href="#" class="message-subject">Lorem ipsum dolor sit amet.</a>
											<div class="message-description">
												from <a href="#">Timothy Owens</a>
												&nbsp;&nbsp;路&nbsp;&nbsp;
												2h ago
											</div>
										</div> <!-- / .message -->

										<div class="message">
											<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/5.jpg" alt="" class="message-avatar">
											<a href="#" class="message-subject">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</a>
											<div class="message-description">
												from <a href="#">Denise Steiner</a>
												&nbsp;&nbsp;路&nbsp;&nbsp;
												2h ago
											</div>
										</div> <!-- / .message -->

										<div class="message">
											<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/2.jpg" alt="" class="message-avatar">
											<a href="#" class="message-subject">Lorem ipsum dolor sit amet.</a>
											<div class="message-description">
												from <a href="#">Robert Jang</a>
												&nbsp;&nbsp;路&nbsp;&nbsp;
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
										<img src="photo?id=${logged.id }" alt="" class=""/>
									</c:if>
									<span>${logged.prenom } ${logged.nom }</span>
								</a>
								<ul class="dropdown-menu">
									<li><a href="<c:url value="/users/profil?id=${logged.id }" />">Profile</a></li>
									<li class="divider"></li>
									<li><a href="<c:url value="/j_spring_security_logout"/>"><i class="dropdown-icon fa fa-power-off"></i>&nbsp;&nbsp;Dconnexion</a></li>
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
						<img src="photo?id=${logged.id }" alt="" class=""/>
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
							<a tabindex="-1" href="#"><span class="mm-text">Incidents ferm閑s</span></a>
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
					<a href="#"><i class="menu-icon fa fa-upload"></i><span class="mm-text">Gestion des donn閑s</span></a>
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


			<div class="profile-full-name">
					<span class="text-semibold"> ${user.prenom } ${user.nom } </span>
				</div>
			 	<div class="profile-row">
					<div class="left-col">
						<div class="profile-block">
							<div class="panel profile-photo">
								<c:if test="${user.bphoto == null }">
									<img src="<%=request.getContextPath()%>/resources/assets/images/pixel-admin/logo_profil.png">
								</c:if>
								<c:if test="${user.bphoto != null }">
									<img src="photo?id=${user.id }"/>
								</c:if>
							</div><br>
							
							<div class="list-group-item"><strong>${user.matricule }</strong></div><br>
							<a href="edit?id=${user.id }" class="btn btn-success"><i class="fa fa-edit"></i>&nbsp;Modifier</a>&nbsp;&nbsp;
							<s:authorize ifAnyGranted="ROLE_ADMIN">
								<a href="admin/delete?ids=${user.id }" class="btn btn-danger"><i class="fa  fa-trash-o"></i>&nbsp;Supprimer</a>
							</s:authorize>
						</div>
						
						<div class="panel panel-transparent">
							<div class="panel-heading">
								<span class="panel-title">Informations personnels</span>
							</div>
							<div class="list-group-item"><strong>CIN :</strong> ${user.cin }</div>
							<div class="list-group-item"><strong>Sexe :</strong> 
								<c:if test="${user.sexe == 'M' }">
									Homme
								</c:if>
								<c:if test="${user.sexe == 'F' }">
									Femme
								</c:if>
							</div>
							<div class="list-group-item"><strong>Age :</strong> ${user.age } ans</div>
							<div class="list-group-item"><strong>Pays :</strong> ${user.pays }</div>
							<div class="list-group-item"><strong>Ville :</strong> ${user.ville }</div>
							<div class="list-group-item"><strong>Code Postale :</strong> ${user.codepostale }</div>
							<div class="list-group-item"><strong>Adresse :</strong> ${user.adresse }</div>
						</div>
		
						<div class="panel panel-transparent">
							<div class="panel-heading">
								<span class="panel-title">Informations professionnels</span>
							</div>
							<div class="list-group">
								<div class="list-group-item"><strong>Fonction : </strong> ${user.fonction }</div>
								<div class="list-group-item"><strong>Dpartement : </strong> ${user.departement.libelle }</div>
								<div class="list-group-item"><strong>Role : </strong> ${user.role.libelle }</div>
							</div>
						</div>
		
						<div class="panel panel-transparent">
							<div class="panel-heading">
								<span class="panel-title">Contacts</span>
							</div>
							<div class="list-group">
								<div class="list-group-item"><i class="profile-list-icon fa fa-mobile" ></i> ${user.tele }</div>
								<div class="list-group-item"><i class="profile-list-icon fa fa-phone" style="color: #1a7ab9"></i> ${user.fixe }</div>
								<div class="list-group-item"><i class="profile-list-icon fa fa-envelope" style="color: #888"></i> ${user.email }</div>
							</div>
						</div>
		
					</div>
					<div class="right-col">
		
						<hr class="profile-content-hr no-grid-gutter-h">
						
						<div class="profile-content">
		
							<ul id="profile-tabs" class="nav nav-tabs">
								<li class="active">
									<a href="#profile-tabs-materiels" data-toggle="tab">Mat閞iels</a>
								</li>
								<li>
									<a href="#profile-tabs-incidents" data-toggle="tab">Tickets Incidents</a>
								</li>
								<li>
									<a href="#profile-tabs-changements" data-toggle="tab">Tickets Chanegements</a>
								</li>
								<li>
									<a href="#profile-tabs-following" data-toggle="tab">Following</a>
								</li>
							</ul>
		
							<div class="tab-content tab-content-bordered panel-padding">
								<div class="widget-article-comments tab-pane panel no-padding no-border fade in active" id="profile-tabs-materiels">
		
											<!-- Primary table -->
								<div class="table-primary">
									<div class="table-header">
										<div class="table-caption">
											<img src="<%=request.getContextPath()%>/resources/assets/images/png/laptop.png" alt="" class="">&nbsp; Ordinateurs
										</div>
									</div>
									<table class="table table-bordered">
										<thead>
											<tr>
												<th>#</th>
												<th>Nom</th>
												<th>Type</th>
												<th>Marque</th>
												<th>Mod鑜e</th>
												<th>Num閞o de s閞ie</th>
											</tr>
										</thead>
										<tbody>
											<c:set var="id" value="1" />
											<c:forEach items="${pc }" var="ordi">
												<tr>
													<td>${id }</td>
													<td><a href="<c:url value="/config/view/pc?id=${ordi.id }" />">${ordi.nom }</a></td>
													<td>${ordi.type }</td>
													<td>${ordi.marque }</td>
													<td>${ordi.modele }</td>
													<td>${ordi.numeroDeSerie }</td>
												</tr>
												<c:set var="id" value="${id + 1}"/>
											</c:forEach>
										</tbody>
									</table>
									
								</div>
								<!-- / Primary table -->
								
								<!-- Warning table -->
								<div class="table-warning">
									<div class="table-header">
										<div class="table-caption">
											<img src="<%=request.getContextPath()%>/resources/assets/images/png/printer.png" alt="" class="">&nbsp; Imprimante
										</div>
									</div>
									<table class="table table-bordered">
										<thead>
											<tr>
												<th>#</th>
												<th>Nom</th>
												<th>Marque</th>
												<th>Mod鑜e</th>
												<th>Num閞o de s閞ie</th>
											</tr>
										</thead>
										<tbody>
											<c:set var="id" value="1" />
											<c:forEach items="${imp }" var="im">
												<tr>
													<td>${id }</td>
													<td><a href="<c:url value="/config/view/imp?id=${im.id }" />">${im.nom }</a></td>
													<td>${im.marque }</td>
													<td>${im.modele }</td>
													<td>${im.numeroDeSerie }</td>
												</tr>
												<c:set var="id" value="${id + 1}"/>
											</c:forEach>
											
										</tbody>
									</table>
									
								</div>
								<!-- / Warning table -->
								
								<!-- Success table -->
								<div class="table-success">
									<div class="table-header">
										<div class="table-caption">
											<img src="<%=request.getContextPath()%>/resources/assets/images/png/ipphone.png" alt="" class="">&nbsp; T閘閜hone Fixe
										</div>
									</div>
									<table class="table table-bordered">
										<thead>
											<tr>
												<th>#</th>
												<th>Nom</th>
												<th>Num閞o</th>
												<th>Marque</th>
												<th>Mod鑜e</th>
												<th>Num閞o de s閞ie</th>
											</tr>
										</thead>
										<tbody>
											<c:set var="id" value="1" />
											<c:forEach items="${telefixe }" var="fixe">
												<tr>
													<td>${id }</td>
													<td><a href="<c:url value="/config/view/telefixe?id=${fixe.id }" />">${fixe.nom }</a></td>
													<td>${fixe.numero }</td>
													<td>${fixe.marque }</td>
													<td>${fixe.modele }</td>
													<td>${fixe.numeroDeSerie }</td>
												</tr>
												<c:set var="id" value="${id + 1}"/>
											</c:forEach>
											
										</tbody>
									</table>
									
								</div>
								<!-- / Success table -->
								
								<!-- Light table -->
								<div class="table-danger">
									<div class="table-header">
										<div class="table-caption">
											<img src="<%=request.getContextPath()%>/resources/assets/images/png/mobile-phone.png" alt="" class="">&nbsp; T閘閜hone Mobile
										</div>
									</div>
									<table class="table table-bordered">
										<thead>
											<tr>
												<th>#</th>
												<th>Nom</th>
												<th>IMEI</th>
												<th>Marque</th>
												<th>Mod鑜e</th>
												<th>Num閞o de s閞ie</th>
											</tr>
										</thead>
										<tbody>
											<c:set var="id" value="1" />
											<c:forEach items="${telemobile }" var="mobile">
												<tr>
													<td>${id }</td>
													<td><a href="<c:url value="/config/view/telefixe?id=${mobile.id }" />">${mobile.nom }</a></td>
													<td>${mobile.imei }</td>
													<td>${mobile.marque }</td>
													<td>${mobile.modele }</td>
													<td>${mobile.numeroDeSerie }</td>
												</tr>
												<c:set var="id" value="${id + 1}"/>
											</c:forEach>
											
										</tbody>
									</table>
									
								</div>
								<!-- / Light table -->
		
		
								<!-- Danger table -->
								<div class="table-light">
									<div class="table-header">
										<div class="table-caption">
											<img src="<%=request.getContextPath()%>/resources/assets/images/png/sim.png" alt="" class="">&nbsp; Carte SIM
										</div>
									</div>
									<table class="table table-bordered">
										<thead>
											<tr>
												<th>#</th>
												<th>Num閞o</th>
												<th>PIN</th>
												<th>PUK</th>
												<th>Op閞ateur</th>
											</tr>
										</thead>
										<tbody>
											<c:set var="id" value="1" />
											<c:forEach items="${sim }" var="s">
												<tr>
													<td>${id }</td>
													<td><a href="<c:url value="/config/view/sim?id=${s.id }" />">${s.numero }</a></td>
													<td>${s.pin }</td>
													<td>${s.puk }</td>
													<td>${s.operateur }</td>
												</tr>
												<c:set var="id" value="${id + 1}"/>
											</c:forEach>
											
										</tbody>
									</table>
									
								</div>
								<!-- / Danger table -->
								<!-- Info table -->
								<div class="table-info">
									<div class="table-header">
										<div class="table-caption">
											<img src="<%=request.getContextPath()%>/resources/assets/images/png/tablet.png" alt="" class="">&nbsp; Tablette
										</div>
									</div>
									<table class="table table-bordered">
										<thead>
											<tr>
												<th>#</th>
												<th>Nom</th>
												<th>Marque</th>
												<th>Mod鑜e</th>
												<th>Num閞o de s閞ie</th>
											</tr>
										</thead>
										<tbody>
											<c:set var="id" value="1" />
											<c:forEach items="${tab }" var="t">
												<tr>
													<td>${id }</td>
													<td><a href="<c:url value="/config/view/tablette?id=${t.id }" />">${t.nom }</a></td>
													<td>${t.marque }</td>
													<td>${t.modele }</td>
													<td>${t.numeroDeSerie }</td>
												</tr>
												<c:set var="id" value="${id + 1}"/>
											</c:forEach>
											
										</tbody>
									</table>
									
								</div>
								<!-- / Info table -->
								</div> <!-- / .tab-pane -->
								<div class="tab-pane fade" id="profile-tabs-incidents">
									
											Incidents
									
								</div> <!-- / .tab-pane -->
								<div class="tab-pane fade widget-followers" id="profile-tabs-changements">
									
											Changements
		
								</div> <!-- / .tab-pane -->
								<div class="tab-pane fade widget-followers" id="profile-tabs-following">
									<div class="follower">
										<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/1.jpg" alt="" class="follower-avatar">
										<div class="body">
											<div class="follower-controls">
												<a href="#" class="btn btn-sm btn-success"><i class="fa fa-check"></i><span>&nbsp;&nbsp;Following</span></a>
											</div>
											<a href="#" class="follower-name">John Doe</a><br>
											<a href="#" class="follower-username">@jdoe</a>
										</div>
									</div>
		
									<div class="follower">
										<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/3.jpg" alt="" class="follower-avatar">
										<div class="body">
											<div class="follower-controls">
												<a href="#" class="btn btn-sm btn-outline">Follow</a>
											</div>
											<a href="#" class="follower-name">Michelle Bortz</a><br>
											<a href="#" class="follower-username">@mbortz</a>
										</div>
									</div>
		
									<div class="follower">
										<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/4.jpg" alt="" class="follower-avatar">
										<div class="body">
											<div class="follower-controls">
												<a href="#" class="btn btn-sm btn-outline">Follow</a>
											</div>
											<a href="#" class="follower-name">Timothy Owens</a><br>
											<a href="#" class="follower-username">@towens</a>
										</div>
									</div>
		
									<div class="follower">
										<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/5.jpg" alt="" class="follower-avatar">
										<div class="body">
											<div class="follower-controls">
												<a href="#" class="btn btn-sm btn-outline">Follow</a>
											</div>
											<a href="#" class="follower-name">Denise Steiner</a><br>
											<a href="#" class="follower-username">@dsteiner</a>
										</div>
									</div>
		
									<div class="follower">
										<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/1.jpg" alt="" class="follower-avatar">
										<div class="body">
											<div class="follower-controls">
												<a href="#" class="btn btn-sm btn-success"><i class="fa fa-check"></i><span>&nbsp;&nbsp;Following</span></a>
											</div>
											<a href="#" class="follower-name">John Doe</a><br>
											<a href="#" class="follower-username">@jdoe</a>
										</div>
									</div>
		
									<div class="follower">
										<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/3.jpg" alt="" class="follower-avatar">
										<div class="body">
											<div class="follower-controls">
												<a href="#" class="btn btn-sm btn-outline">Follow</a>
											</div>
											<a href="#" class="follower-name">Michelle Bortz</a><br>
											<a href="#" class="follower-username">@mbortz</a>
										</div>
									</div>
		
									<div class="follower">
										<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/4.jpg" alt="" class="follower-avatar">
										<div class="body">
											<div class="follower-controls">
												<a href="#" class="btn btn-sm btn-outline">Follow</a>
											</div>
											<a href="#" class="follower-name">Timothy Owens</a><br>
											<a href="#" class="follower-username">@towens</a>
										</div>
									</div>
		
									<div class="follower">
										<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/5.jpg" alt="" class="follower-avatar">
										<div class="body">
											<div class="follower-controls">
												<a href="#" class="btn btn-sm btn-outline">Follow</a>
											</div>
											<a href="#" class="follower-name">Denise Steiner</a><br>
											<a href="#" class="follower-username">@dsteiner</a>
										</div>
									</div>
		
									<div class="follower">
										<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/1.jpg" alt="" class="follower-avatar">
										<div class="body">
											<div class="follower-controls">
												<a href="#" class="btn btn-sm btn-success"><i class="fa fa-check"></i><span>&nbsp;&nbsp;Following</span></a>
											</div>
											<a href="#" class="follower-name">John Doe</a><br>
											<a href="#" class="follower-username">@jdoe</a>
										</div>
									</div>
		
									<div class="follower">
										<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/3.jpg" alt="" class="follower-avatar">
										<div class="body">
											<div class="follower-controls">
												<a href="#" class="btn btn-sm btn-outline">Follow</a>
											</div>
											<a href="#" class="follower-name">Michelle Bortz</a><br>
											<a href="#" class="follower-username">@mbortz</a>
										</div>
									</div>
		
									<div class="follower">
										<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/4.jpg" alt="" class="follower-avatar">
										<div class="body">
											<div class="follower-controls">
												<a href="#" class="btn btn-sm btn-outline">Follow</a>
											</div>
											<a href="#" class="follower-name">Timothy Owens</a><br>
											<a href="#" class="follower-username">@towens</a>
										</div>
									</div>
		
									<div class="follower">
										<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/5.jpg" alt="" class="follower-avatar">
										<div class="body">
											<div class="follower-controls">
												<a href="#" class="btn btn-sm btn-outline">Follow</a>
											</div>
											<a href="#" class="follower-name">Denise Steiner</a><br>
											<a href="#" class="follower-username">@dsteiner</a>
										</div>
									</div>
		
									<div class="follower">
										<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/1.jpg" alt="" class="follower-avatar">
										<div class="body">
											<div class="follower-controls">
												<a href="#" class="btn btn-sm btn-success"><i class="fa fa-check"></i><span>&nbsp;&nbsp;Following</span></a>
											</div>
											<a href="#" class="follower-name">John Doe</a><br>
											<a href="#" class="follower-username">@jdoe</a>
										</div>
									</div>
		
									<div class="follower">
										<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/3.jpg" alt="" class="follower-avatar">
										<div class="body">
											<div class="follower-controls">
												<a href="#" class="btn btn-sm btn-outline">Follow</a>
											</div>
											<a href="#" class="follower-name">Michelle Bortz</a><br>
											<a href="#" class="follower-username">@mbortz</a>
										</div>
									</div>
		
									<div class="follower">
										<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/4.jpg" alt="" class="follower-avatar">
										<div class="body">
											<div class="follower-controls">
												<a href="#" class="btn btn-sm btn-outline">Follow</a>
											</div>
											<a href="#" class="follower-name">Timothy Owens</a><br>
											<a href="#" class="follower-username">@towens</a>
										</div>
									</div>
		
									<div class="follower">
										<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/5.jpg" alt="" class="follower-avatar">
										<div class="body">
											<div class="follower-controls">
												<a href="#" class="btn btn-sm btn-outline">Follow</a>
											</div>
											<a href="#" class="follower-name">Denise Steiner</a><br>
											<a href="#" class="follower-username">@dsteiner</a>
										</div>
									</div>
								</div> <!-- / .tab-pane -->
							</div> <!-- / .tab-content -->
						</div>
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
	});
	window.PixelAdmin.start(init);
</script>

</body>

<!-- Mirrored from infinite-woodland-5276.herokuapp.com/pages-blank.html by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 03 Mar 2016 01:48:30 GMT -->
</html>