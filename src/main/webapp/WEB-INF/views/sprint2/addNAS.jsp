

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
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<title>Nouveau NAS - ITIL-CCM</title>
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
							<a tabindex="-1" href="#"><span class="mm-text">Recherche des incidents</span></a>
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
				
				
				
				<!-- Modal Solutions Applicatives -->
				<div id="myModalSolutionApplicative" class="modal fade" tabindex="-1" role="dialog" style="display: none;">
					<div class="modal-dialog modal-lg">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
								<h4 class="modal-title" id="myModalLabel">Ajout Solutions Applicatives </h4>
							</div>
							<div class="modal-body">
								<div class="table-warning">
									<table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered jq-datatables-example">
										<thead>
											<tr>
												<th id="supchek"> </th>
												<th>Solution Applicative</th>
												<th>Statut</th>
												<th>Criticité</th>
												<th>Date de mise en production</th>
											</tr>
										</thead>
										<tbody id="tablesolutionapplicativepopup">
											<c:forEach items="${solutionsApplicatives}" var="sa">
												<tr class="gradeA" id="tr_SolutionApplicative_${sa.id }">
													<td class="supchekbox"><input type="checkbox" class="ckSol" name="chSolutionApplicative" value="${sa.id }"></td>
													<td>${sa.nom }</td>
													<td>${sa.statut }</td>
													<td>${sa.criticite}</td>
													<td>${sa.dateDeMiseEnProduction }</td>
												</tr>
											</c:forEach>
											
										</tbody>
									</table>
								</div>
							</div> <!-- / .modal-body -->
							<div class="modal-footer">
								<button type="button" class="btn btn-default" data-dismiss="modal">Retour</button>
								<button type="button" class="btn btn-primary" id="addSol">Ajouter</button>
							</div>
						</div> <!-- / .modal-content -->
					</div> <!-- / .modal-dialog -->
				</div> <!-- /.modal -->
				<!-- / Modal Solutions Applicatives -->	
                
				
				
				
				
				
				<!-- Modal Interface reseaux -->
				<div id="myModalinterfacereseaux" class="modal fade" tabindex="-1" role="dialog" style="display: none;">
					<div class="modal-dialog modal-lg">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
								<h4 class="modal-title" id="myModalLabel">Ajout interface reseau</h4>
							</div>
							<div class="modal-body">
								<div class="table-warning">
									<table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered jq-datatables-example">
										<thead>
											<tr>
												<th id="supchek"> </th> 	 	 	 	 		
												<th>Nom</th>
												<th>Adresse IP</th>
												<th>Adresse MAC</th>
												<th>Commentaire</th>
												<th>Passerelle</th>
												<th>Masque de sous réseau </th>
												<th>Vitesse</th>	
											</tr>
										</thead>
										<tbody id="tableinterfacereseaupopup">
											<c:forEach items="${interfacereseaux}" var="ir">
												<tr class="gradeA" id="tr_ir_${ir.id }">
													<td class="supchekbox"><input type="checkbox" class="ckir" name="chinterfacereseau" value="${ir.id }"></td>
													<td>${ir.nom }</td>
													<td>${ir.adresseIp }</td>
													<td>${ir.adresseMac }</td>
													<td>${ir.commentaire }</td>
													<td>${ir.passerelle }</td>
													<td>${ir.masqueDeSousReseau }</td>
													<td>${ir.vitesse }</td>
												</tr>
											</c:forEach>
											
										</tbody>
									</table>
								</div>
							</div> <!-- / .modal-body -->
							<div class="modal-footer">
								<button type="button" class="btn btn-default" data-dismiss="modal">Retour</button>
								<button type="button" class="btn btn-primary" id="addir">Ajouter</button>
							</div>
						</div> <!-- / .modal-content -->
					</div> <!-- / .modal-dialog -->
				</div> <!-- /.modal -->
				<!-- / Modal -->
				
				
				<!-- Modal Equipement reseaux -->
				<div id="myModalEquipementreseaux" class="modal fade" tabindex="-1" role="dialog" style="display: none;">
					<div class="modal-dialog modal-lg">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
								<h4 class="modal-title" id="myModalLabel">Ajout Equipement réseaux</h4>
							</div>
							<div class="modal-body">
								<div class="table-warning">
									<table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered jq-datatables-example">
										<thead>
											<tr>
												<th id="supcheker"> </th>
												<th>Nom</th>
												<th>Statut</th>
												<th>Criticité</th>
												<th>Lieu</th>
												<th>Marque</th>
												<th>Modèle</th>
												<th>Numéro de série</th>
											</tr>
										</thead>
										<tbody id="tableEquipementreseauxpopup">
											<c:forEach items="${equipementreseaux}" var="er">
												<tr class="gradeA" id="tr_er_${er.id }">
													<td class="supchekboxer"><input type="checkbox" class="cker" name="chequipementreseaux" value="${er.id }"></td>
													<td>${er.nom }</td>
													<td>${er.statut }</td>
													<td>${er.criticite }</td>
													<td>${er.lieu.nom }</td>
													<td>${er.marque }</td>
													<td>${er.modele }</td>
													<td>${er.numeroDeSerie }</td>
												</tr>
											</c:forEach>
											
										</tbody>
									</table>
								</div>
							</div> <!-- / .modal-body -->
							<div class="modal-footer">
								<button type="button" class="btn btn-default" data-dismiss="modal">Retour</button>
								<button type="button" class="btn btn-primary" id="adder">Ajouter</button>
							</div>
						</div> <!-- / .modal-content -->
					</div> <!-- / .modal-dialog -->
				</div> <!-- /.modal -->
				<!-- / Modal -->
				
				
				<!-- Modal Système de fichiers NAS -->
				<div id="myModalfichiernas" class="modal fade" tabindex="-1" role="dialog" style="display: none;">
					<div class="modal-dialog modal-lg">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
								<h4 class="modal-title" id="myModalLabel">Ajout Système de fichier NAS</h4>
							</div>
							<div class="modal-body">
								<form action="fichiernas" class="form-horizontal" id="FichierNASForm" method="POST">
									<div class="form-group required">
										<label for="jq-validation-nom" class="col-sm-3 control-label">Nom</label>
										<div class="col-sm-9">
											<input type="text" class="form-control" id="id_fichier_nas_nom" name="nom" />
										</div>
									</div>
									
									<div class="form-group">
										<label for="jq-validation-nom" class="col-sm-3 control-label">Niveau RAID</label>
										<div class="col-sm-9">
											<input type="text" class="form-control" id="id_fichier_nas_niveauRaid" name="niveauRaid" />
										</div>
									</div>
									
									<div class="form-group">
										<label for="jq-validation-nom" class="col-sm-3 control-label">Taille</label>
										<div class="col-sm-9">
											<input type="text" class="form-control" id="id_fichier_nas_taille" name="taille" />
										</div>
									</div>
									<div class="form-group">
										<label for="jq-validation-description" class="col-sm-3 control-label">Description</label>
										<div class="col-sm-9">
											<textarea class="form-control" id="id_fichier_nas_description" name="description" ></textarea>
										</div>
									</div>
								</form>
							</div> <!-- / .modal-body -->
							<div class="modal-footer">
								<button type="button" class="btn btn-default" data-dismiss="modal">Retour</button>
								<button type="button" class="btn btn-primary" data-dismiss="modal" id="addfichiernas">Créer</button>
							</div>
						</div> <!-- / .modal-content -->
					</div> <!-- / .modal-dialog -->
				</div> <!-- /.modal -->
				<!-- / Modal -->
				
				
				
				<!-- Modal document -->
				<div id="myModaldocument" class="modal fade" tabindex="-1" role="dialog" style="display: none;">
					<div class="modal-dialog modal-lg">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
								<h4 class="modal-title" id="myModalLabel">Ajout Documents</h4>
							</div>
							<div class="modal-body">
								<div class="table-warning">
									<table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered jq-datatables-example">
										<thead>
											<tr>
												<th id="supchek"> </th>
												<th>Nom</th>
												<th>Statut</th>
												<th>Type de document</th>
												<th>Description</th>
											</tr>
										</thead>
										<tbody id="tabledocpopup">
											<c:forEach items="${documents}" var="doc">
												<tr class="gradeA" id="tr_doc_${doc.id }">
													<td class="supchekbox"><input type="checkbox" class="ckdoc" name="chdocument" value="${doc.id }"></td>
													<td>${doc.nom }</td>
													<td>${doc.statut }</td>
													<td>
														<c:set var="string1" value="${doc['class'].name }"/>
														<c:set var="string2" value="${fn:substring(string1, 29,50)}" />
														${string2 }
													</td>
													<td>${doc.description }</td>
												</tr>
											</c:forEach>
											
										</tbody>
									</table>
								</div>
							</div> <!-- / .modal-body -->
							<div class="modal-footer">
								<button type="button" class="btn btn-default" data-dismiss="modal">Retour</button>
								<button type="button" class="btn btn-primary" id="addDoc">Ajouter</button>
							</div>
						</div> <!-- / .modal-content -->
					</div> <!-- / .modal-dialog -->
				</div> <!-- /.modal -->
				<!-- / Modal -->
				
				
				<!-- Modal contrat -->
				<div id="myModalcontrat" class="modal fade" tabindex="-1" role="dialog" style="display: none;">
					<div class="modal-dialog modal-lg">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
								<h4 class="modal-title" id="myModalLabel">Ajout Contrats</h4>
							</div>
							<div class="modal-body">
								<div class="table-warning">
									<table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered jq-datatables-example">
										<thead>
											<tr>
												<th id="supchek"> </th>
												<th>Nom</th>
												<th>Type</th>
												<th>Client</th>
												<th>Description</th>
												<th>Date de début</th>
												<th>Date de fin</th>
												<th>Fournisseur</th>
											</tr>
										</thead>
										<tbody id="tablecontratpopup">
											<c:forEach items="${contrats}" var="contrat">
												<tr class="gradeA" id="tr_contrat_${contrat.id }">
													<td class="supchekbox"><input type="checkbox" class="ckContrat" name="chContrat" value="${contrat.id }"></td>
													<td>${contrat.nom }</td>
													<td>${contrat.typeDeContrat }</td>
													<td>${contrat.client }</td>
													<td>${contrat.description }</td>
													<td>${contrat.dateDeDebut }</td>
													<td>${contrat.dateDeFin }</td>
													<td>${contrat.fournisseur }</td>
												</tr>
											</c:forEach>
											
										</tbody>
									</table>
								</div>
							</div> <!-- / .modal-body -->
							<div class="modal-footer">
								<button type="button" class="btn btn-default" data-dismiss="modal">Retour</button>
								<button type="button" class="btn btn-primary" id="addContrat">Ajouter</button>
							</div>
						</div> <!-- / .modal-content -->
					</div> <!-- / .modal-dialog -->
				</div> <!-- /.modal -->
				<!-- / Modal -->
				
				
				<!-- Modal contact -->
				<div id="myModalcontact" class="modal fade" tabindex="-1" role="dialog" style="display: none;">
					<div class="modal-dialog modal-lg">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
								<h4 class="modal-title" id="myModalLabel">Ajout contacts</h4>
							</div>
							<div class="modal-body">
								<div class="table-warning">
									<table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered jq-datatables-example">
										<thead>
											<tr>
												<th id="supchek"> </th>
												<th>Nom complet</th>
												<th>Statut</th>
												<th>Organisation</th>
												<th>Email</th>
												<th>Téléphone</th>
												<th>Fonction</th>	
											</tr>
										</thead>
										<tbody id="tablecontactpopup">
											<c:forEach items="${contacts}" var="contact">
												<tr class="gradeA" id="tr_contact_${contact.id }">
													<td class="supchekbox"><input type="checkbox" class="ckContact" name="chContact" value="${contact.id }"></td>
													<td>${contact.nom } ${contact.prenom }</td>
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
							</div> <!-- / .modal-body -->
							<div class="modal-footer">
								<button type="button" class="btn btn-default" data-dismiss="modal">Retour</button>
								<button type="button" class="btn btn-primary" id="addContact">Ajouter</button>
							</div>
						</div> <!-- / .modal-content -->
					</div> <!-- / .modal-dialog -->
				</div> <!-- /.modal -->
				<!-- / Modal -->
				
				
				
				
				
				
				
				
		<div class="panel">
					<div class="panel-heading">
						<span class="panel-title">Nouveau NAS</span>
					</div>
					<div class="panel-body">
						<f:form modelAttribute="nas" action="saveNAS" methode="post" class="form-horizontal" id="jq-validation-form">
					
					
		
						<hr class="profile-content-hr no-grid-gutter-h">
						
						<div class="profile-content">
		
							<ul id="profile-tabs" class="nav nav-tabs">
								<li class="active">
									<a href="#profile-tabs-proprietes" data-toggle="tab">Propriétés</a>
								</li>
								<li>
									<a href="#profile-tabs-fichier_nas" data-toggle="tab">Système de fichier NAS</a>
								</li>
								
								<li>
									<a href="#profile-tabs-solutions_applicatives" data-toggle="tab">Solutions Applicatives</a>
								</li>
								<li>
									<a href="#profile-tabs-intarfaces_reseaux" data-toggle="tab">Intarfaces réseaux</a>
								</li>
								<li>
									<a href="#profile-tabs-equipementreseaux" data-toggle="tab">Equipement réseaux</a>
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
								
								
							</ul>
		
							<div class="tab-content tab-content-bordered panel-padding">
								<div class="widget-article-comments tab-pane panel no-padding no-border fade in active" id="profile-tabs-proprietes">
		
									<div class="form-group required">
										<label for="jq-validation-nom" class="col-sm-3 control-label">Nom</label>
										<div class="col-sm-9">
											<f:input path="nom" type="text" class="form-control" id="inputError-4" name="jq-validation-nom" />
											<f:errors path="nom" cssClass="help-block"></f:errors>
										</div>
									</div>
									
									<div class="form-group">
										<label for="jq-validation-select2" class="col-sm-3 control-label">Statut</label>
										<div class="col-sm-9">
											<f:select  path="statut" class="form-control" name="jq-validation-select2" id="jq-validation-select2">
												<f:option value="" label=""/>
												<f:option value="implementation" label="implementation"/>
												<f:option value="obsolète" label="obsolète"/>
												<f:option value="production" label="production"/>
												<f:option value="stock" label="stock"/>
											</f:select>
											<f:errors path="statut" cssClass="help-block"></f:errors>
										</div>
									</div>
									
									<div class="form-group">
										<label for="jq-validation-select2" class="col-sm-3 control-label">Criticité</label>
										<div class="col-sm-9">
											<f:select  path="criticite" class="form-control" name="jq-validation-select2" id="jq-validation-select2">
												<f:option value="" label=""/>
												<f:option value="haute" label="haute"/>
												<f:option value="basse" label="basse"/>
												<f:option value="moyenne" label="moyenne"/>
											</f:select>
											<f:errors path="criticite" cssClass="help-block"></f:errors>
										</div>
									</div>
									
									
									<div class="form-group">
										<label for="jq-validation-select2" class="col-sm-3 control-label">Lieu</label>
										<div class="col-sm-9">
											<f:select  path="lieu.id" class="form-control" name="jq-validation-select2" id="jq-validation-select2">
												<f:option value="" label=""/>
												<c:forEach items="${lieus }" var="lie">
													<f:option value="${lie.id }" label="${lie.nom } - ${lie.organisme }"/>
												</c:forEach>
											</f:select>
											<f:errors path="lieu.id" cssClass="help-block"></f:errors>
										</div>
										
									</div>
									
									<div class="form-group">
										<label for="jq-validation-select2" class="col-sm-3 control-label">Rack</label>
										<div class="col-sm-9">
											<f:select  path="rack.id" class="form-control" name="jq-validation-select2" id="jq-validation-select2">
												<f:option value="" label=""/>
												<f:options items="${racks }" itemValue="id" itemLabel="nom" />	
											</f:select>
											<f:errors path="rack.id" cssClass="help-block"></f:errors>
										</div>
										
									</div>
									
									<div class="form-group">
										<label for="jq-validation-select2" class="col-sm-3 control-label">Chassis</label>
										<div class="col-sm-9">
											<f:select  path="chassis.id" class="form-control" name="jq-validation-select2" id="jq-validation-select2">
												<f:option value="" label=""/>
												<f:options items="${chassiss }" itemValue="id" itemLabel="nom" />	
											</f:select>
											<f:errors path="chassis.id" cssClass="help-block"></f:errors>
										</div>
										
									</div>
									
									<div class="form-group">
										<label for="jq-validation-marque" class="col-sm-3 control-label">Marque</label>
										<div class="col-sm-9">
											<f:input path="marque" type="text" class="form-control" id="inputError-4" name="jq-validation-marque" />
											<f:errors path="marque" cssClass="help-block"></f:errors>
										</div>
									</div>
									
									<div class="form-group">
										<label for="jq-validation-modele" class="col-sm-3 control-label">Modèle</label>
										<div class="col-sm-9">
											<f:input path="modele" type="text" class="form-control" id="inputError-4" name="jq-validation-modele" />
											<f:errors path="modele" cssClass="help-block"></f:errors>
										</div>
									</div>
									
									
									
									
									<div class="form-group">
										<label for="jq-validation-cpu" class="col-sm-3 control-label">IP</label>
										<div class="col-sm-9">
											<f:input path="ip" type="text" class="form-control" id="inputError-4" name="jq-validation-cpu" />
											<f:errors path="ip" cssClass="help-block"></f:errors>
										</div>
									</div>
									
									<div class="form-group">
										<label for="jq-validation-numeroDeSerie" class="col-sm-3 control-label">Numéro de série</label>
										<div class="col-sm-9">
											<f:input path="numeroDeSerie" type="text" class="form-control" id="inputError-4" name="jq-validation-numeroDeSerie" />
											<f:errors path="numeroDeSerie" cssClass="help-block"></f:errors>
										</div>
									</div>
									
									<div class="form-group">
										<label for="jq-validation-numeroAsset" class="col-sm-3 control-label">Numéro Asset</label>
										<div class="col-sm-9">
											<f:input path="numeroAsset" type="text" class="form-control" id="inputError-4" name="jq-validation-numeroAsset" />
											<f:errors path="numeroAsset" cssClass="help-block"></f:errors>
										</div>
									</div>
									
									
									<div class="form-group">
										<label for="jq-validation-dateDeMiseEnProduction" class="col-sm-3 control-label">Date d'achat</label>
										<div class="col-sm-9" >
											<div class="input-group date" id="bs-datepicker-dateD_achat">
												<f:input path="dateD_achat" type="text" class="form-control" />
												<span class="input-group-addon"><i class="fa fa-calendar" ></i></span>
												<f:errors path="dateD_achat" cssClass="help-block"></f:errors>
											</div>
										</div>
									</div>
									
									<div class="form-group">
										<label for="jq-validation-dateDeMiseEnProduction" class="col-sm-3 control-label">Date de mise en production</label>
										<div class="col-sm-9" >
											<div class="input-group date" id="bs-datepicker-dateDeMiseEnProduction">
												<f:input path="dateDeMiseEnProduction" type="text" class="form-control" />
												<span class="input-group-addon"><i class="fa fa-calendar" ></i></span>
												<f:errors path="dateDeMiseEnProduction" cssClass="help-block"></f:errors>
											</div>
										</div>
									</div>
									
									<div class="form-group">
										<label for="jq-validation-dateDeMiseEnProduction" class="col-sm-3 control-label">Date de fin de garantie</label>
										<div class="col-sm-9" >
											<div class="input-group date" id="bs-datepicker-dateDeFinDeGarantie">
												<f:input path="dateDeFinDeGarantie" type="text" class="form-control"/>
												<span class="input-group-addon"><i class="fa fa-calendar" ></i></span>
												<f:errors path="dateDeFinDeGarantie" cssClass="help-block"></f:errors>
											</div>
										</div>
									</div>
									
									
									<div class="form-group">
					
										<label for="jq-validation-email" class="col-sm-3 control-label">Source électrique A</label>
										<div class="col-sm-9">
											<select   class="form-control" name="sourceelecA">
									            <option value="" label=""/>
												<c:forEach items="${sourceelec }" var="sourceA">
													<option value="${sourceA.id }" >${sourceA.nom }</option>
												</c:forEach>
											</select>
											
									    </div>
								
									</div>
									
									
									<div class="form-group">
					
										<label for="jq-validation-email" class="col-sm-3 control-label">Source électrique B</label>
										<div class="col-sm-9">
											<select   class="form-control" name="sourceelecB">
									             <option value="" label=""/>
												 <c:forEach items="${sourceelec }" var="sourceB">
													<option value="${sourceB.id }" >${sourceB.nom }</option>
												</c:forEach>
											</select>
											
									    </div>
								
									</div>
										
									
									
									
									
									<div class="form-group">
										<label for="jq-validation-description" class="col-sm-3 control-label">Description</label>
										<div class="col-sm-9">
											<f:textarea path="description" class="form-control" name="jq-validation-text" />
											<f:errors path="description" cssClass="help-block"></f:errors>
										</div>
									</div>
									
									
									
		
								</div> <!-- / .tab-pane -->
								
							
								
								<div class="tab-pane fade widget-solutions_applicatives" id="profile-tabs-solutions_applicatives">
									
										
                         			<div class="table-primary">
										<table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered jq-datatables-example">
											<thead>
											  <tr>
												<th id="supchek"> </th>
												<th>Solution Applicative</th>
												<th>Statut</th>
												<th>Criticité</th>
												<th>Date de mise en production</th>
											  </tr>
											</thead>
											<tbody id="tableSolutionApplicative">
												
												
											</tbody>
										</table>
									</div>
									<br>
									<br>

									<div class="form-group">
										<div class="col-sm-offset-3 col-sm-1">
											<button type="button" class="btn btn-warning btn-flat" id="suppSol">Retirer !</button>
										</div>
										
										<div class="col-sm-offset-1 col-sm-7">
											<button type="button" class="btn btn-success btn-flat" data-toggle="modal" data-target="#myModalSolutionApplicative">Ajouter des Solutions Applicatives</button>
										</div>
										
									</div>
		
									
								</div>
								
								<div class="tab-pane fade widget-intarfaces_reseaux" id="profile-tabs-intarfaces_reseaux">
									
		
		
									<div class="table-primary">
										<table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered jq-datatables-example">
											<thead>
												<tr>
													<th id="supchek"> </th> 	 	 	 	 		
													<th>Nom</th>
													<th>Adresse IP</th>
													<th>Adresse MAC</th>
													<th>Commentaire</th>
													<th>Passerelle</th>
													<th>Masque de sous réseau </th>
													<th>Vitesse</th>	
													
												</tr>
											</thead>
											<tbody id="tableinterfacereseau">
												
												
											</tbody>
										</table>
									</div>
									<br>
									<br>

									<div class="form-group">
										<div class="col-sm-offset-3 col-sm-1">
											<button type="button" class="btn btn-warning btn-flat" id="suppir">Retirer !</button>
										</div>
										
										<div class="col-sm-offset-1 col-sm-7">
											<button type="button" class="btn btn-success btn-flat" data-toggle="modal" data-target="#myModalinterfacereseaux">Ajouter des Interfaces reseaux</button>
										</div>
										
									</div>

		
									
		
									
		
									
								</div> <!-- / .tab-pane -->
								<div class="tab-pane fade widget-equipementreseaux" id="profile-tabs-equipementreseaux">
									
		
									<div class="table-primary">
										<table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered jq-datatables-example">
											<thead>
												<tr>
													<th id="supchekertable"> </th>
													<th>Nom</th>
													<th>Statut</th>
													<th>Criticité</th>
													<th>Lieu</th>
													<th>Marque</th>
													<th>Modèle</th>
													<th>Numéro de série</th>
													
												</tr>
											</thead>
											<tbody id="tableEquipementreseaux">
												
												
											</tbody>
										</table>
									</div>
									<br>
									<br>

									<div class="form-group">
										<div class="col-sm-offset-3 col-sm-1">
											<button type="button" class="btn btn-warning btn-flat" id="supper">Retirer !</button>
										</div>
										
										<div class="col-sm-offset-1 col-sm-7">
											<button type="button" class="btn btn-success btn-flat" data-toggle="modal" data-target="#myModalEquipementreseaux">Ajouter des Equipements réseaux</button>
										</div>
										
									</div>

		
		
									
								</div> <!-- / .tab-pane -->
								
								<div class="tab-pane fade widget-fichier_nas" id="profile-tabs-fichier_nas">
									
										

									<div class="table-primary">
									<table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered jq-datatables-example">
										<thead>
											<tr>
												<th id="supchek"> </th>
												<th>Nom</th>
												<th>Niveau RAID</th>
												<th>Taille</th>
												<th>Description</th>	
											</tr>
										</thead>
										<tbody id="tablefichiernas">
											
											
										</tbody>
									</table>
									</div>
									<br>
									<br>

									<div class="form-group">
										<div class="col-sm-offset-3 col-sm-1">
											<button type="button" class="btn btn-warning btn-flat" id="suppfichiernas">Retirer !</button>
										</div>
										
										<div class="col-sm-offset-1 col-sm-7">
											<button type="button" class="btn btn-success btn-flat" data-toggle="modal" data-target="#myModalfichiernas">Ajouter de nouveau Système de fichier NAS</button>
										</div>
										
									</div>
		
									
								</div>
								
								
								
								
								<div class="tab-pane fade widget-contacts" id="profile-tabs-contacts">
									
		
									<div class="table-primary">
										<table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered jq-datatables-example">
											<thead>
												<tr>
													<th id="supchek"> </th>
													<th>Nom complet</th>
													<th>Statut</th>
													<th>Organisation</th>
													<th>Email</th>
													<th>Téléphone</th>
													<th>Fonction</th>	
													
												</tr>
											</thead>
											<tbody id="tablecontact">
												
												
											</tbody>
										</table>
									</div>
									<br>
									<br>

									<div class="form-group">
										<div class="col-sm-offset-3 col-sm-1">
											<button type="button" class="btn btn-warning btn-flat" id="suppContact">Retirer !</button>
										</div>
										
										<div class="col-sm-offset-1 col-sm-7">
											<button type="button" class="btn btn-success btn-flat" data-toggle="modal" data-target="#myModalcontact">Ajouter des Contacts</button>
										</div>
										
									</div>
		
		
									
								</div> <!-- / .tab-pane -->
								
								<div class="tab-pane fade widget-documents" id="profile-tabs-documents">
									
		
									<div class="table-primary">
										<table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered jq-datatables-example">
											<thead>
												<tr>
													<th id="supchek"> </th>
													<th>Nom</th>
													<th>Statut</th>
													<th>Type de document</th>
													<th>Description</th>
													
												</tr>
											</thead>
											<tbody id="tabledocument">
												
												
											</tbody>
										</table>
									</div>
									<br>
									<br>

									<div class="form-group">
										<div class="col-sm-offset-3 col-sm-1">
											<button type="button" class="btn btn-warning btn-flat" id="suppDoc">Retirer !</button>
										</div>
										
										<div class="col-sm-offset-1 col-sm-7">
											<button type="button" class="btn btn-success btn-flat" data-toggle="modal" data-target="#myModaldocument">Ajouter des Documents</button>
										</div>
										
									</div>
		
		
									
								</div> <!-- / .tab-pane -->
								
								<div class="tab-pane fade widget-contrats" id="profile-tabs-contrats">
									
		
									<div class="table-primary">
										<table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered jq-datatables-example">
											<thead>
												<tr>
													<th id="supchek"> </th>
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
												
												
											</tbody>
										</table>
									</div>
									<br>
									<br>

									<div class="form-group">
										<div class="col-sm-offset-3 col-sm-1">
											<button type="button" class="btn btn-warning btn-flat" id="suppContrat">Retirer !</button>
										</div>
										
										<div class="col-sm-offset-1 col-sm-7">
											<button type="button" class="btn btn-success btn-flat" data-toggle="modal" data-target="#myModalcontrat">Ajouter des Contrats</button>
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
									<button type="submit" class="btn btn-lg btn-primary btn-flat">Enregistrer </button>
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
			
			
			
			$('#jq-datatables-example-tickets').dataTable();
			$('#jq-datatables-example-tickets_wrapper .table-caption').replaceWith("<div class='table-caption'><button class='btn btn-success btn-flat' id='addTicket'>Nouveau Ticket</button></div>");
			$('#jq-datatables-example-tickets_wrapper .dataTables_filter input').attr('placeholder', 'Search...');
			
			
		    
		  //<!-- Modal Solutions Applicatives -->    
	        document.getElementById("addSol").onclick = function () {
		    	var chkArray = [];
		    	$(".ckSol:checked").each(function() {
		    		chkArray.push($(this).val());
		    		var tr = document.getElementById("tr_SolutionApplicative_".concat($(this).val()));
			    	$( "#tableSolutionApplicative").append(tr);
			    	//this.checked = false;
		    	});
		    	
		    };
		    
		    document.getElementById("suppSol").onclick = function () {
				var chkArray = [];
		    	
		    	$(".ckSol:checked").each(function() {
		    		chkArray.push($(this).val());
		    		var tr = document.getElementById("tr_SolutionApplicative_".concat($(this).val()));
			    	$( "#tablesolutionapplicativepopup").append(tr);
	                this.checked = false;
		    	});
		    };
		    
		    
		  //<!-- Modal Interface reseaux -->
		    
		    document.getElementById("addir").onclick = function () {
		    	var chkArray = [];
		    	$(".ckir:checked").each(function() {
		    		chkArray.push($(this).val());
		    		var tr = document.getElementById("tr_ir_".concat($(this).val()));
			    	$( "#tableinterfacereseau" ).append(tr);
			    	//this.checked = false;
		    	});
		    	
		    };
		    
		    
		    
		    document.getElementById("suppir").onclick = function () {
				var chkArray = [];
		    	
		    	$(".ckir:checked").each(function() {
		    		chkArray.push($(this).val());
		    		var tr = document.getElementById("tr_ir_".concat($(this).val()));
			    	$( "#tableinterfacereseaupopup" ).append(tr);
                    this.checked = false;
		    	});
		    };
		    
		    
		  //<!-- Modal Equipement reseaux -->
		    document.getElementById("adder").onclick = function () {
		    	var chkArray = [];
		    	$(".cker:checked").each(function() {
		    		chkArray.push($(this).val());
		    		var tr = document.getElementById("tr_er_".concat($(this).val()));
			    	$( "#tableEquipementreseaux" ).append(tr);
			    	//this.checked = false;
		    	});
		    	
		    };
		    
		    
		    
		    document.getElementById("supper").onclick = function () {
				var chkArray = [];
		    	
		    	$(".cker:checked").each(function() {
		    		chkArray.push($(this).val());
		    		var tr = document.getElementById("tr_er_".concat($(this).val()));
			    	$( "#tableEquipementreseauxpopup" ).append(tr);
			    	
                    this.checked = false;
		    	});
		    };
		    
		    

			//<!-- Modal Systeme de fichier NAS -->
 			
		    
		    $(document).ready(function() {
	    		   
	    		  $('#addfichiernas').click(function(event) {
	    		       

					  var nom = $('#id_fichier_nas_nom').val();
					  var niveauRaid = $('#id_fichier_nas_niveauRaid').val();
					  var taille = $('#id_fichier_nas_taille').val();
					  var description = $('#id_fichier_nas_description').val();
	    		      var json = { "nom" : nom, "niveauRaid" : niveauRaid , "taille" : taille, "description": description};
	    		    $.ajax({
	    		        type: "POST",
	    		        data: JSON.stringify(json),
	    		        url: $("#FichierNASForm").attr("action"),
	    		         
	    		        beforeSend: function(xhr) {
	    		            xhr.setRequestHeader("Accept", "application/json");
	    		            xhr.setRequestHeader("Content-Type", "application/json");
	    		        },
	    		        success: function(fichiernas) {
	    		        	if(fichiernas.id != null){
	    		      		var tr = '<tr class="gradeA" id="tr_fichier_nas_'+fichiernas.id+'">'+
	    		      				'<td class="supchekbox"><input type="checkbox" checked="checked" class="ckFichierNAS" name="chFichierNAS" value="'+fichiernas.id+'"></td>'+
	    		      				'<td>'+fichiernas.nom+'</td>'+
	    		      				'<td>'+fichiernas.niveauRaid+'</td>'+
	    		      				'<td>'+fichiernas.taille+'</td>'+
	    		      				'<td>'+fichiernas.description+'</td>'+
	    		      				'</tr>'
	    		      			;
	    		      		$( "#tablefichiernas" ).append(tr);
	    		      		
	    		      		document.forms['FichierNASForm'].reset();
	    		        	}
	    		        }
	    		    });
	    		  });
	    		    
	    		});
	    	
	    	
	    
	    document.getElementById("suppfichiernas").onclick = function () {
	    	
	    	$(".ckFichierNAS:checked").each(function() {
	    		//var tr = document.getElementById("tr_bande_".concat($(this).val()));
		    	$( "#tr_fichier_nas_".concat($(this).val())).hide();
               this.checked = false;
	    	});
	    };

		    
		    

		    
		    
		    //<!-- Modal document -->
		    document.getElementById("addDoc").onclick = function () {
		    	var chkArray = [];
		    	
		    	$(".ckdoc:checked").each(function() {
		    		chkArray.push($(this).val());
		    		var tr = document.getElementById("tr_doc_".concat($(this).val()));
			    	$( "#tabledocument" ).append(tr);
			    	//this.checked = false;
		    	});
		    	
		    };
		    
		    document.getElementById("suppDoc").onclick = function () {
				var chkArray = [];
		    	
		    	$(".ckdoc:checked").each(function() {
		    		chkArray.push($(this).val());
		    		var tr = document.getElementById("tr_doc_".concat($(this).val()));
			    	$( "#tabledocpopup" ).append(tr);
                    this.checked = false;
		    	});
		    };
		    
		    
		    //<!-- Modal contrat -->
		    document.getElementById("addContrat").onclick = function () {
		    	var chkArray = [];
		    	
		    	$(".ckContrat:checked").each(function() {
		    		chkArray.push($(this).val());
		    		var tr = document.getElementById("tr_contrat_".concat($(this).val()));
			    	$( "#tablecontrat" ).append(tr);
			    	//this.checked = false;
		    	});
		    	
		    };
		    
		    document.getElementById("suppContrat").onclick = function () {
				var chkArray = [];
		    	
		    	$(".ckContrat:checked").each(function() {
		    		chkArray.push($(this).val());
		    		var tr = document.getElementById("tr_contrat_".concat($(this).val()));
			    	$( "#tablecontratpopup" ).append(tr);
                    this.checked = false;
		    	});
		    };
		    
		    //<!-- Modal contact -->
		    document.getElementById("addContact").onclick = function () {
		    	var chkArray = [];
		    	
		    	$(".ckContact:checked").each(function() {
		    		chkArray.push($(this).val());
		    		var tr = document.getElementById("tr_contact_".concat($(this).val()));
			    	$( "#tablecontact" ).append(tr);
			    	//this.checked = false;
		    	});
		    	
		    };
		    
		    document.getElementById("suppContact").onclick = function () {
				var chkArray = [];
		    	
		    	$(".ckContact:checked").each(function() {
		    		chkArray.push($(this).val());
		    		var tr = document.getElementById("tr_contact_".concat($(this).val()));
			    	$( "#tablecontactpopup" ).append(tr);
                    this.checked = false;
		    	});
		    };



	});
	window.PixelAdmin.start(init);
</script>

</body>

<!-- Mirrored from infinite-woodland-5276.herokuapp.com/pages-blank.html by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 03 Mar 2016 01:48:30 GMT -->
</html>