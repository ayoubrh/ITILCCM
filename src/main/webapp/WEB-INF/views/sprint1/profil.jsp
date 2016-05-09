

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
										<img src="photo?id=${logged.id }" alt="" class=""/>
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
							<a tabindex="-1" href="<c:url value="/config/admin/dashboard" />"><span class="mm-text">Tableau de bord</span></a>
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
								<div class="list-group-item"><strong>Département : </strong> ${user.departement.libelle }</div>
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
									<a href="#profile-tabs-board" data-toggle="tab">Board</a>
								</li>
								<li>
									<a href="#profile-tabs-activity" data-toggle="tab">Timeline</a>
								</li>
								<li>
									<a href="#profile-tabs-followers" data-toggle="tab">Followers</a>
								</li>
								<li>
									<a href="#profile-tabs-following" data-toggle="tab">Following</a>
								</li>
							</ul>
		
							<div class="tab-content tab-content-bordered panel-padding">
								<div class="widget-article-comments tab-pane panel no-padding no-border fade in active" id="profile-tabs-board">
		
									<div class="comment">
										<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/1.jpg" alt="" class="comment-avatar">
										<div class="comment-body">
											<form action="#" id="leave-comment-form" class="comment-text no-padding no-border">
												<textarea class="form-control" rows="1"></textarea>
												<div class="expanding-input-hidden" style="margin-top: 10px;">
													<label class="checkbox-inline pull-left">
														<input type="checkbox" class="px">
														<span class="lbl">Private message</span>
													</label>
													<button class="btn btn-primary pull-right">Leave Message</button>
												</div>
											</form>
										</div> <!-- / .comment-body -->
									</div>
		
									<hr class="no-panel-padding-h panel-wide">
		
									<div class="comment">
										<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/2.jpg" alt="" class="comment-avatar">
										<div class="comment-body">
											<div class="comment-text">
												<div class="comment-heading">
													<a href="#" title="">Robert Jang</a><span>14 hours ago</span>
												</div>
												Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore.
											</div>
											<div class="comment-footer">
												<a href="#"><i class="fa fa-thumbs-o-up"></i></a>&nbsp;&nbsp;
												<a href="#"><i class="fa fa-thumbs-o-down"></i></a>
												&nbsp;&nbsp;·&nbsp;&nbsp;
												<a href="#">Reply</a>
											</div>
										</div> <!-- / .comment-body -->
		
										<div class="comment">
											<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/4.jpg" alt="" class="comment-avatar">
											<div class="comment-body">
												<div class="comment-text">
													<div class="comment-heading">
														<a href="#" title="">Timothy Owens</a><span>14 hours ago</span>
													</div>
													Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore.
												</div>
												<div class="comment-footer">
													<a href="#"><i class="fa fa-thumbs-o-up"></i></a>&nbsp;&nbsp;
													<a href="#"><i class="fa fa-thumbs-o-down"></i></a>
													&nbsp;&nbsp;·&nbsp;&nbsp;
													<a href="#">Reply</a>
												</div>
											</div> <!-- / .comment-body -->
										</div> <!-- / .comment -->
		
										<div class="comment">
											<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/5.jpg" alt="" class="comment-avatar">
											<div class="comment-body">
												<div class="comment-text">
													<div class="comment-heading">
														<a href="#" title="">Denise Steiner</a><span>14 hours ago</span>
													</div>
													Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore.
												</div>
												<div class="comment-footer">
													<a href="#"><i class="fa fa-thumbs-o-up"></i></a>&nbsp;&nbsp;
													<a href="#"><i class="fa fa-thumbs-o-down"></i></a>
													&nbsp;&nbsp;·&nbsp;&nbsp;
													<a href="#">Reply</a>
												</div>
											</div> <!-- / .comment-body -->
		
											<div class="comment">
												<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/1.jpg" alt="" class="comment-avatar">
												<div class="comment-body">
													<div class="comment-text">
														<div class="comment-heading">
															<a href="#" title="">John Doe</a><span>14 hours ago</span>
														</div>
														Lorem ipsum dolor sit amet, consectetur adipisicing elit.
													</div>
													<div class="comment-footer">
														<a href="#"><i class="fa fa-thumbs-o-up"></i></a>&nbsp;&nbsp;
														<a href="#"><i class="fa fa-thumbs-o-down"></i></a>
														&nbsp;&nbsp;·&nbsp;&nbsp;
														<a href="#">Reply</a>
													</div>
												</div> <!-- / .comment-body -->
											</div> <!-- / .comment -->
										</div> <!-- / .comment -->
									</div> <!-- / .comment -->
		
									<div class="comment">
										<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/3.jpg" alt="" class="comment-avatar">
										<div class="comment-body">
											<div class="comment-text">
												<div class="comment-heading">
													<a href="#" title="">Michelle Bortz</a><span>14 hours ago</span>
												</div>
												Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore.
											</div>
											<div class="comment-footer">
												<a href="#"><i class="fa fa-thumbs-o-up"></i></a>&nbsp;&nbsp;
												<a href="#"><i class="fa fa-thumbs-o-down"></i></a>
												&nbsp;&nbsp;·&nbsp;&nbsp;
												<a href="#">Reply</a>
											</div>
										</div> <!-- / .comment-body -->
									</div> <!-- / .comment -->
		
									<div class="comment">
										<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/2.jpg" alt="" class="comment-avatar">
										<div class="comment-body">
											<div class="comment-text">
												<div class="comment-heading">
													<a href="#" title="">Robert Jang</a><span>14 hours ago</span>
												</div>
												Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore.
											</div>
											<div class="comment-footer">
												<a href="#"><i class="fa fa-thumbs-o-up"></i></a>&nbsp;&nbsp;
												<a href="#"><i class="fa fa-thumbs-o-down"></i></a>
												&nbsp;&nbsp;·&nbsp;&nbsp;
												<a href="#">Reply</a>
											</div>
										</div> <!-- / .comment-body -->
		
										<div class="comment">
											<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/4.jpg" alt="" class="comment-avatar">
											<div class="comment-body">
												<div class="comment-text">
													<div class="comment-heading">
														<a href="#" title="">Timothy Owens</a><span>14 hours ago</span>
													</div>
													Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore.
												</div>
												<div class="comment-footer">
													<a href="#"><i class="fa fa-thumbs-o-up"></i></a>&nbsp;&nbsp;
													<a href="#"><i class="fa fa-thumbs-o-down"></i></a>
													&nbsp;&nbsp;·&nbsp;&nbsp;
													<a href="#">Reply</a>
												</div>
											</div> <!-- / .comment-body -->
										</div> <!-- / .comment -->
		
										<div class="comment">
											<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/5.jpg" alt="" class="comment-avatar">
											<div class="comment-body">
												<div class="comment-text">
													<div class="comment-heading">
														<a href="#" title="">Denise Steiner</a><span>14 hours ago</span>
													</div>
													Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore.
												</div>
												<div class="comment-footer">
													<a href="#"><i class="fa fa-thumbs-o-up"></i></a>&nbsp;&nbsp;
													<a href="#"><i class="fa fa-thumbs-o-down"></i></a>
													&nbsp;&nbsp;·&nbsp;&nbsp;
													<a href="#">Reply</a>
												</div>
											</div> <!-- / .comment-body -->
		
											<div class="comment">
												<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/1.jpg" alt="" class="comment-avatar">
												<div class="comment-body">
													<div class="comment-text">
														<div class="comment-heading">
															<a href="#" title="">John Doe</a><span>14 hours ago</span>
														</div>
														Lorem ipsum dolor sit amet, consectetur adipisicing elit.
													</div>
													<div class="comment-footer">
														<a href="#"><i class="fa fa-thumbs-o-up"></i></a>&nbsp;&nbsp;
														<a href="#"><i class="fa fa-thumbs-o-down"></i></a>
														&nbsp;&nbsp;·&nbsp;&nbsp;
														<a href="#">Reply</a>
													</div>
												</div> <!-- / .comment-body -->
											</div> <!-- / .comment -->
										</div> <!-- / .comment -->
									</div> <!-- / .comment -->
		
									<div class="comment">
										<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/3.jpg" alt="" class="comment-avatar">
										<div class="comment-body">
											<div class="comment-text">
												<div class="comment-heading">
													<a href="#" title="">Michelle Bortz</a><span>14 hours ago</span>
												</div>
												Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore.
											</div>
											<div class="comment-footer">
												<a href="#"><i class="fa fa-thumbs-o-up"></i></a>&nbsp;&nbsp;
												<a href="#"><i class="fa fa-thumbs-o-down"></i></a>
												&nbsp;&nbsp;·&nbsp;&nbsp;
												<a href="#">Reply</a>
											</div>
										</div> <!-- / .comment-body -->
									</div> <!-- / .comment -->
		
								</div> <!-- / .tab-pane -->
								<div class="tab-pane fade" id="profile-tabs-activity">
									<div class="timeline">
										<!-- Timeline header -->
										<div class="tl-header now">Now</div>
		
										<div class="tl-entry">
											<div class="tl-time">
												1h ago
											</div>
											<div class="tl-icon bg-warning"><i class="fa fa-envelope"></i></div>
											<div class="panel tl-body">
												<h4 class="text-warning">Lorem ipsum dolor sit amet</h4>
												Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
											</div> <!-- / .tl-body -->
										</div> <!-- / .tl-entry -->
		
										<div class="tl-entry left">
											<div class="tl-time">
												2h ago
											</div>
											<div class="tl-icon bg-success"><i class="fa fa-picture-o"></i></div>
											<div class="panel tl-body">
												<a href="#">Denise Steiner</a> shared an image on <a href="#">The Gallery</a>
												<div class="tl-wide text-center" style="padding: 10px;margin-top:15px;margin-bottom: 15px;background: #f1f1f1">
													<img src="<%=request.getContextPath()%>/resources/assets/demo/signin-bg-5.jpg" alt="" style="max-height: 150px;max-width: 100%;">
												</div>
												<i class="text-muted text-sm">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</i>
											</div> <!-- / .tl-body -->
										</div> <!-- / .tl-entry -->
		
										<div class="tl-entry">
											<div class="tl-time">
												3h ago
											</div>
											<div class="tl-icon bg-success"><img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/2.jpg" alt=""></div>
											<div class="panel tl-body">
												<a href="#">Robert Jang</a> commented on <a href="#">The Article</a>
												<div class="well well-sm" style="margin: 10px 0 0 0;">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</div>
											</div> <!-- / .tl-body -->
										</div> <!-- / .tl-entry -->
		
										<div class="tl-entry left">
											<div class="tl-time">
												4h ago
											</div>
											<div class="tl-icon bg-dark-gray"><i class="fa fa-check"></i></div>
											<div class="panel tl-body">
												<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/5.jpg" alt="" class="rounded" style=" width: 20px;height: 20px;margin-top: -2px;">&nbsp;&nbsp;<a href="#">Denise Steiner</a> followed <a href="#">Johg Doe</a>
											</div> <!-- / .tl-body -->
										</div> <!-- / .tl-entry -->
		
										<!-- Timeline header -->
										<div class="tl-header">Yesterday</div>
		
										<div class="tl-entry">
											<div class="tl-time">
												9:02 pm
											</div>
											<div class="tl-icon bg-info"><i class="fa fa-comment"></i></div>
											<div class="panel tl-body">
												<a href="#">Denise Steiner</a> liked a comment on <a href="#">Some Article</a>
												<div style="margin-top: 10px;" class="text-sm">
													<img src="<%=request.getContextPath()%>/resources/assets/demo/avatars/3.jpg" alt="" class="rounded" style=" width: 20px;height: 20px;margin-top: -2px;">&nbsp;&nbsp;<a href="#">Michelle Bortz</a> commented 2 days ago
													<div class="well well-sm" style="margin: 6px 0 0 0;">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</div>
												</div>
											</div> <!-- / .tl-body -->
										</div> <!-- / .tl-entry -->
		
										<div class="tl-entry left">
											<div class="tl-time">
												5:47 pm
											</div>
											<div class="panel tl-body">
												Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
											</div> <!-- / .tl-body -->
										</div> <!-- / .tl-entry -->
		
										<div class="tl-entry">
											<div class="tl-time">
												2:35 pm
											</div>
											<div class="tl-icon bg-danger"><i class="fa fa-heart"></i></div>
											<div class="panel tl-body">
												<a href="#">Denise Steiner</a> liked <a href="#">Shop Item</a>
											</div> <!-- / .tl-body -->
										</div> <!-- / .tl-entry -->
		
										<div class="tl-entry left">
											<div class="tl-time">
												11:21 am
											</div>
											<div class="panel tl-body">
												<h4 class="text-danger">Lorem ipsum dolor sit amet</h4>
												Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
											</div> <!-- / .tl-body -->
										</div> <!-- / .tl-entry -->
		
									</div> <!-- / .timeline -->
								</div> <!-- / .tab-pane -->
								<div class="tab-pane fade widget-followers" id="profile-tabs-followers">
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