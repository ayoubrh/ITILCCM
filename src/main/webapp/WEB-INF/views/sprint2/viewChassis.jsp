

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
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
	<%@taglib uri="http://www.springframework.org/security/tags" prefix="s" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<title>Détail Chassis - ITIL-CCM</title>
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
							<a tabindex="-1" href="<c:url value="/config/admin/add/neveauCI" />"><span class="mm-text">Nouveau CI</span></a>
						</li>
						<li>
							<a tabindex="-1" href="#"><span class="mm-text">Rechercher CIs</span></a>
						</li>
						<li>
							<a tabindex="-1" href="#"><span class="mm-text">Contacts</span></a>
						</li>
						<li>
							<a tabindex="-1" href="#"><span class="mm-text">Lieux</span></a>
						</li>
						<li>
							<a tabindex="-1" href="#"><span class="mm-text">Documents</span></a>
						</li>
						<li>
							<a tabindex="-1" href="#"><span class="mm-text">Contrats</span></a>
						</li>
						<li>
							<a tabindex="-1" href="#"><span class="mm-text">Groupe CIs</span></a>
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
				
				
				
				<c:if test="${save == true }">
					<div class="alert alert-success">
						<button type="button" class="close" data-dismiss="alert">×</button>
						L'élément de configuration est bien modifier.
					</div>
				</c:if>
				
				
				
				
				
		<div class="panel">
					<div class="panel-heading">
						<span class="panel-title col-md-9">Détail d'un Chassis</span>
						<a href="<c:url value="/config/admin/edit/chassis?id=${chassis.id }"/>" class="btn btn-success"><i class="fa"></i>&nbsp;Modifier</a>
						<a href="<c:url value="/config/admin/delete/chassis?id=${chassis.id }"/>" class="btn btn-danger"><i class="fa"></i>&nbsp;Supprimer</a>
						
					</div>
					<div class="panel-body">
					
					
		
						<hr class="profile-content-hr no-grid-gutter-h">
						
						<div class="profile-content">
		
							<ul id="profile-tabs" class="nav nav-tabs">
								<li class="active">
									<a href="#profile-tabs-proprietes" data-toggle="tab">Propriétés</a>
								</li>
								
								
								<li>
									<a href="#profile-tabs-materiels" data-toggle="tab">Matériels</a>
								</li>
								
								<li>
									<a href="#profile-tabs-contacts" data-toggle="tab">Contacts</a>
								</li>
								
								<li>
									<a href="#profile-tabs-documents" data-toggle="tab">Documents</a>
								</li>
								
								<li>
									<a href="#profile-tabs-contrats" data-toggle="tab">Contrats</a>
								</li>
								<li>
									<a href="#profile-tabs-tickets" data-toggle="tab">Tickets</a>
								</li>
								
							</ul>
		
							<div class="tab-content tab-content-bordered panel-padding">
								<div class="widget-article-comments tab-pane panel no-padding no-border fade in active" id="profile-tabs-proprietes">
		
									<div class="form-group">
										<label for="jq-validation-nom" class="col-sm-3 control-label">Nom : </label>
										${chassis.nom }
									</div>
									
									<div class="form-group">
										<label for="jq-validation-select2" class="col-sm-3 control-label">Statut : </label>
										${chassis.statut }
									</div>
									
									<div class="form-group">
										<label for="jq-validation-select2" class="col-sm-3 control-label">Criticité : </label>
										${chassis.criticite }
									</div>
									
									
									
									
									<div class="form-group">
										<label for="jq-validation-select2" class="col-sm-3 control-label">Lieu : </label>
										<a href="<c:url value="/config/view/lieu?id=${chassis.lieu.id }" />">${chassis.lieu.nom }</a>
										
									</div>
									
									
									<div class="form-group">
										<label for="jq-validation-select2" class="col-sm-3 control-label">Rack : </label>
										<a href="<c:url value="/config/view/rack?id=${chassis.rack.id }" />">${chassis.rack.nom }</a>
										
									</div>
									
									
									<div class="form-group">
										<label for="jq-validation-marque" class="col-sm-3 control-label">Marque : </label>
										${chassis.marque }
									</div>
									
									<div class="form-group">
										<label for="jq-validation-modele" class="col-sm-3 control-label">Modèle : </label>
										${chassis.modele }
									</div>
									
									<div class="form-group">
										<label for="jq-validation-numeroDeSerie" class="col-sm-3 control-label">Numéro de série : </label>
										${chassis.numeroDeSerie }
									</div>
									
									<div class="form-group">
										<label for="jq-validation-numeroAsset" class="col-sm-3 control-label">Numéro Asset : </label>
										${chassis.numeroAsset }
									</div>
									
									
									<div class="form-group">
										<label for="jq-validation-dateDeMiseEnProduction" class="col-sm-3 control-label">Date d'achat : </label>
										<fmt:formatDate type="date" dateStyle="long" value="${chassis.dateD_achat}" />
									</div>
									
									<div class="form-group">
										<label for="jq-validation-dateDeMiseEnProduction" class="col-sm-3 control-label">Date de mise en production : </label>
										<fmt:formatDate type="date" dateStyle="long" value="${chassis.dateDeMiseEnProduction}" />
									</div>
									
									<div class="form-group">
										<label for="jq-validation-dateDeMiseEnProduction" class="col-sm-3 control-label">Date de fin de garantie : </label>
										<fmt:formatDate type="date" dateStyle="long" value="${chassis.dateDeFinDeGarantie}" />
									</div>
									
									
									
									<div class="form-group">
										<label for="jq-validation-description" class="col-sm-3 control-label">Description : </label>
										${chassis.description }
									</div>
									
									
									
		
								</div> <!-- / .tab-pane -->
							
								
								
								<div class="tab-pane fade widget-materiels" id="profile-tabs-materiels">
									
		

									
									<div class="table-primary">
									<table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered jq-datatables-example">
										<thead>
											<tr>
												<th>Nom</th>
												<th>Statut</th>
												<th>Criticité</th>
												<th>Numèro de Série</th>
												<th>Numèro Asset</th>
												<th>Date de mise en production</th>	
											</tr>
										</thead>
										<tbody id="tableMatriel">
											<c:forEach items="${chassis.infrastructure}" var="mat">
												<tr class="gradeA" id="tr_mat_Mat_${mat.id }">
													<td>${mat.nom }</td>
													<td>${mat.statut }</td>
													<td>${mat.criticite }</td>
													<td>${mat.numeroDeSerie }</td>
													<td>${mat.numeroAsset }</td>
													<td>${mat.dateDeMiseEnProduction }</td>
												</tr>
											</c:forEach>
											
										</tbody>
									</table>
									</div>
									<br>
									<br>

		
									
								</div> <!-- / .tab-pane -->
								
								
								<div class="tab-pane fade widget-contacts" id="profile-tabs-contacts">
									
		
									<div class="table-primary">
										<table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered jq-datatables-example">
											<thead>
												<tr>
													<th>Nom complet</th>
													<th>Statut</th>
													<th>Organisation</th>
													<th>Email</th>
													<th>Téléphone</th>
													<th>Fonction</th>	
													
												</tr>
											</thead>
											<tbody id="tablecontact">
												<c:forEach items="${chassis.contact}" var="contact">
													<tr class="gradeA" id="tr_contact_${contact.id }">
														<td><a href="<c:url value="/config/view/contact?id=${contact.id }" />">${contact.nom } ${contact.prenom }</a></td>
														<td>${contact.statut }</td>
														<td>${contact.organisme }</td>
														<td>${contact.email }</td>
														<td>${contact.telephoneFixe }/${contact.telephoneMobile }</td>
														<td>${contact.fonction }</td>
													</tr>
												</c:forEach>
												
												
											</tbody>
										</table>
									</div>
									<br>
									<br>

									
								</div> <!-- / .tab-pane -->
								
								<div class="tab-pane fade widget-documents" id="profile-tabs-documents">
									
		
									<div class="table-primary">
										<table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered jq-datatables-example">
											<thead>
												<tr>
													<th>Nom</th>
													<th>Statut</th>
													<th>Type de document</th>
													<th>Description</th>
													
												</tr>
											</thead>
											<tbody id="tabledocument">
												<c:forEach items="${chassis.document}" var="doc">
													<tr class="gradeA" id="tr_doc_${doc.id }">
														<td><a href="<c:url value="/config/view/document?id=${doc.id }" />">${doc.nom }</a></td>
														<td>${doc.statut }</td>
														<td> </td>
														<td>${doc.description }</td>
													</tr>
												</c:forEach>
												
											</tbody>
										</table>
									</div>
									<br>
									<br>

		
		
									
								</div> <!-- / .tab-pane -->
								
								<div class="tab-pane fade widget-contrats" id="profile-tabs-contrats">
									
		
									<div class="table-primary">
										<table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered jq-datatables-example">
											<thead>
												<tr>
													<th>Nom</th>
													<th>Type</th>
													<th>Client</th>
													<th>Description</th>
													<th>Date de début</th>
													<th>Date de fin</th>
													<th>Fournisseur</th>
													
												</tr>
											</thead>
											<tbody id="tablecontrat">
												<c:forEach items="${chassis.contrat}" var="contrat">
													<tr class="gradeA" id="tr_contrat_${contrat.id }">
														<td><a href="<c:url value="/config/view/contrat?id=${contrat.id }" />">${contrat.nom }</a></td>
														<td>${contrat.typeDeContrat }</td>
														<td>${contrat.client }</td>
														<td>${contrat.description }</td>
														<td><fmt:formatDate type="date" dateStyle="long" value="${contrat.dateDeDebut}" /></td>
														<td><fmt:formatDate type="date" dateStyle="long" value="${contrat.dateDeFin}" /></td>
														<td>${contrat.fournisseur }</td>
													</tr>
												</c:forEach>
												
												
											</tbody>
										</table>
									</div>
									<br>
									<br>

		
		
									
								</div> <!-- / .tab-pane -->
								<div class="tab-pane fade widget-tickets" id="profile-tabs-tickets">
								
										Tickets
								
								</div>
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
		
		var options = {
				todayBtn: "linked",
				orientation: $('body').hasClass('right-to-left') ? "auto right" : 'auto auto'
			}
		
			$('#bs-datepicker-dateDeMiseEnProduction').datepicker({
			    format: 'dd/mm/yyyy'
			  });
			$('#bs-datepicker-dateD_achat').datepicker({
			    format: 'dd/mm/yyyy'
			  });
			$('#bs-datepicker-dateDeFinDeGarantie').datepicker({
			    format: 'dd/mm/yyyy'
			  });
			
			$('.jq-datatables-example').dataTable();
			$('.jq-datatables-example_wrapper .table-caption').text('');
			$('.jq-datatables-example_wrapper .dataTables_filter input').attr('placeholder', 'Search...');
			
			
		    



	});
	window.PixelAdmin.start(init);
</script>

</body>

<!-- Mirrored from infinite-woodland-5276.herokuapp.com/pages-blank.html by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 03 Mar 2016 01:48:30 GMT -->
</html>