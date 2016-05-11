

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
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<title>Nouveau PDU - ITIL-CCM</title>
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
							<a tabindex="-1" href="#"><span class="mm-text">Nouveau CI</span></a>
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
		<div class="panel">
					<div class="panel-heading">
						<span class="panel-title">Nouveau  PDU</span>
					</div>
					<div class="panel-body">
						<f:form modelAttribute="pdu" action="savePdu" methode="post" enctype="multipart/form-data" class="form-horizontal" id="jq-validation-form">
					
					
		
						<hr class="profile-content-hr no-grid-gutter-h">
						
						<div class="profile-content">
		
							<ul id="profile-tabs" class="nav nav-tabs">
								<li class="active">
									<a href="#profile-tabs-proprietes" data-toggle="tab">Propriétés</a>
								</li>
								
								<li>
									<a href="#profile-tabs-contacts" data-toggle="tab">Contacts</a>
								</li>
								
								<li>
									<a href="#profile-tabs-documents" data-toggle="tab">Documents</a>
								</li>
								
								<li>
									<a href="#profile-tabs-contrats" data-toggle="tab">Contrats fournisseur</a>
								</li>
								<li>
									<a href="#profile-tabs-tickets" data-toggle="tab">Tickets en cours</a>
								</li>
								
								
							</ul>
		
							<div class="tab-content tab-content-bordered panel-padding">
								<div class="widget-article-comments tab-pane panel no-padding no-border fade in active" id="profile-tabs-proprietes">
		
									
		
									<div class="panel-body">
						
						
							
							<div class="form-group">
								<label for="jq-validation-email" class="col-sm-3 control-label">Nom</label>
								<div class="col-sm-6">
									<f:input path="nom" type="text" class="form-control" id="inputError-4" name="jq-validation-nom" />
									<f:errors path="nom" cssClass="help-block"></f:errors>
								</div>
							</div>
							
							<div class="form-group">
								<label for="jq-validation-email" class="col-sm-3 control-label">Statut</label>
								<div class="col-sm-4">
										<f:select  path="statut" class="form-control" name="jq-validation-select2" id="jq-validation-select2">
										            <f:option value="NONE"> -- choisir une valeur --</f:option>
										            <f:option value="implémentation">implémentation</f:option>
												<f:option value="obsolète"> obsolète</f:option>
												<f:option value="production"> production</f:option>
												<f:option value="stock"> stock</f:option>
												</f:select>
										<f:errors path="statut" cssClass="help-block"></f:errors>
							     </div>
							</div>
							
							<div class="form-group">
								<label for="jq-validation-email" class="col-sm-3 control-label">Criticité</label>
								<div class="col-sm-4">
										<f:select  path="criticite" class="form-control" name="jq-validation-criticite" id="jq-validation-criticite">
										            <f:option value="NONE"> -- choisir une valeur --</f:option>
													<f:option value="haute"> haute</f:option>
													<f:option value="basse"> basse</f:option>
													<f:option value="moyenne"> moyenne</f:option>
												</f:select>
										<f:errors path="criticite" cssClass="help-block"></f:errors>
							     </div>
							</div>
							<div class="form-group">
								<label for="jq-validation-select2" class="col-sm-3 control-label">Site</label>
								<div class="col-sm-4">
									<f:select  path="" class="form-control" name="jq-validation-site" id="jq-validation-site">
										<f:option value="NONE"> -- choisir une valeur --</f:option>
										<f:options items="${l }" itemValue="id" itemLabel="nom" />
									</f:select>
									<f:errors path="" cssClass="help-block"></f:errors>
								</div>
							</div>
								<div class="form-group">
								<label for="jq-validation-select2" class="col-sm-3 control-label">Rack</label>
								<div class="col-sm-4">
									<f:select  path="rack.id" class="form-control" name="jq-validation-rack" id="jq-validation-rack">
										<f:option value="NONE"> -- choisir une valeur --</f:option>
										<f:options items="${r }" itemValue="id" itemLabel="nom" />
									</f:select>
									<f:errors path="rack.id" cssClass="help-block"></f:errors>
								</div>
							</div>
								<div class="form-group">
								<label for="jq-validation-select2" class="col-sm-3 control-label">Arrivée électrique</label>
								<div class="col-sm-4">
									<f:select  path="arriveeElectrique.id" class="form-control" name="jq-validation-arriveeElectrique" id="jq-validation-arriveeElectrique">
										<f:option value="NONE"> -- choisir une valeur --</f:option>
										<f:options items="${a }" itemValue="id" itemLabel="nom" />
									</f:select>
									<f:errors path="arriveeElectrique.id" cssClass="help-block"></f:errors>
								</div>
							</div>
							<div class="form-group">
								<label for="jq-validation-email" class="col-sm-3 control-label">Marque</label>
								<div class="col-sm-6">
									<f:input path="marque" type="text" class="form-control" id="inputError-4" name="jq-validation-marque" />
									<f:errors path="marque" cssClass="help-block"></f:errors>
								</div>
							</div>
							<div class="form-group">
								<label for="jq-validation-email" class="col-sm-3 control-label">Modèle</label>
								<div class="col-sm-6">
									<f:input path="modele" type="text" class="form-control" id="inputError-4" name="jq-validation-modele" />
									<f:errors path="modele" cssClass="help-block"></f:errors>
								</div>
							</div>
							<div class="form-group">
								<label for="jq-validation-email" class="col-sm-3 control-label">Numéro de série</label>
								<div class="col-sm-6">
									<f:input path="numeroDeSerie" type="text" class="form-control" id="inputError-4" name="jq-validation-numeroDeSerie" />
									<f:errors path="numeroDeSerie" cssClass="help-block"></f:errors>
								</div>
							</div>
							<div class="form-group">
								<label for="jq-validation-email" class="col-sm-3 control-label">Numéro Asset</label>
								<div class="col-sm-6">
									<f:input path="numeroAsset" type="text" class="form-control" id="inputError-4" name="jq-validation-numeroAsset" />
									<f:errors path="numeroAsset" cssClass="help-block"></f:errors>
								</div>
							</div>
							
							
									<script>
					init.push(function () {
						
						var options = {
								
								orientation: $('body').hasClass('right-to-left') ? "auto right" : 'auto auto'
							}
							$('#bs-datepicker-component').datepicker();
						    $('#bs-datepicker-component2').datepicker();
						    $('#bs-datepicker-component3').datepicker();
						

					});
				</script>
				
				<div class="form-group ">
					<label for="jq-validation-email" class="col-sm-3 control-label">Date de mise en production</label>
					
						<div class=" col-sm-3" >
							<div class=" input-group date" id="bs-datepicker-component">
								<f:input path="dateDeMiseEnProduction" type="text" class="form-control" name="dateDeMiseEnProduction"  />
								<span class="input-group-addon"><i class="fa fa-calendar" ></i></span>
								<f:errors path="dateDeMiseEnProduction" cssClass="help-block"></f:errors>
							</div>				
						</div>
				</div>
				<div class="form-group ">
					<label for="jq-validation-email" class="col-sm-3 control-label">Date d'achat</label>
					
						<div class=" col-sm-3" >
							<div class=" input-group date" id="bs-datepicker-component2">
								<f:input path="dateD_achat" type="text" class="form-control" name="dateD_achat"  />
								<span class="input-group-addon"><i class="fa fa-calendar" ></i></span>
								<f:errors path="dateD_achat" cssClass="help-block"></f:errors>
							</div>				
						</div>
				</div>
				<div class="form-group ">
					<label for="jq-validation-email" class="col-sm-3 control-label">Date de fin de garantie</label>
					
						<div class=" col-sm-3" >
							<div class=" input-group date" id="bs-datepicker-component3">
								<f:input path="dateDeFinDeGarantie" type="text" class="form-control" name="dateDeFinDeGarantie"  />
								<span class="input-group-addon"><i class="fa fa-calendar" ></i></span>
								<f:errors path="dateDeFinDeGarantie" cssClass="help-block"></f:errors>
							</div>				
						</div>
				</div>
							
							<div class="form-group">
								<label for="jq-validation-text" class="col-sm-3 control-label">Description</label>
								<div class="col-sm-6">
									<f:textarea path="description" class="form-control" name="jq-validation-description" id="jq-validation-description" />
									<f:errors path="description" cssClass="help-block"></f:errors>
								</div>
							</div>
							
							
							
							</div>
		
								</div> <!-- / .tab-pane -->
								
								
								<div class="tab-pane fade widget-contacts" id="profile-tabs-contacts">
									
									Contacts
									
									
								</div> <!-- / .tab-pane -->
								
								<div class="tab-pane fade widget-documents" id="profile-tabs-documents">
									
		
									documents
		
		
									
								</div> <!-- / .tab-pane -->
								
								
						
								<div class="tab-pane fade widget-contrats" id="profile-tabs-contrats">
									
		
									contrats
		
		
									
								</div> <!-- / .tab-pane -->
								
								<div class="tab-pane fade widget-tickets" id="profile-tabs-tickets">
									
		
		
									Tickests
		
									
									
								</div> <!-- / .tab-pane -->
								
							</div> <!-- / .tab-content -->
						</div>
				
					
					
					
					
					
							<hr class="panel-wide">
							
							<div class="form-group">
								<div class="col-sm-offset-3 col-sm-1">
									<button type="reset" class="btn btn-lg btn-danger btn-flat" onclick="location.href='<c:url value="/users/index" />'">Annuler</button>
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
	});
	window.PixelAdmin.start(init);
</script>

</body>

<!-- Mirrored from infinite-woodland-5276.herokuapp.com/pages-blank.html by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 03 Mar 2016 01:48:30 GMT -->
</html>