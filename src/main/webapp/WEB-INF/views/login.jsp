<!DOCTYPE html>
<!--[if IE 8]>         <html class="ie8"> <![endif]-->
<!--[if IE 9]>         <html class="ie9 gt-ie8"> <![endif]-->
<!--[if gt IE 9]><!--> <html class="gt-ie8 gt-ie9 not-ie"> <!--<![endif]-->

<!-- Mirrored from infinite-woodland-5276.herokuapp.com/pages-signin.html by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 03 Mar 2016 01:46:11 GMT -->
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<title>Login ITIL-CCM</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0">

	<link rel="icon" type="image/png" href="<%=request.getContextPath()%>/resources/assets/images/pixel-admin/logo3.png" />
	
	<!-- Open Sans font from Google CDN -->
	<link href="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,400,600,700,300&amp;subset=latin" rel="stylesheet" type="text/css">

	<!-- Pixel Admin's stylesheets -->
	<link href="<%=request.getContextPath()%>/resources/assets/stylesheets/bootstrap.min.css" rel="stylesheet" type="text/css">
	<link href="<%=request.getContextPath()%>/resources/assets/stylesheets/pixel-admin.min.css" rel="stylesheet" type="text/css">
	<link href="<%=request.getContextPath()%>/resources/assets/stylesheets/pages.min.css" rel="stylesheet" type="text/css">
	<link href="<%=request.getContextPath()%>/resources/assets/stylesheets/rtl.min.css" rel="stylesheet" type="text/css">
	<link href="<%=request.getContextPath()%>/resources/assets/stylesheets/themes.min.css" rel="stylesheet" type="text/css">

	<!--[if lt IE 9]>
		<script src="<%=request.getContextPath()%>/resources/assets/javascripts/ie.min.js"></script>
	<![endif]-->


<!-- $DEMO =========================================================================================

	Remove this section on production
-->
	<style>
		#signin-demo {
			position: fixed;
			right: 0;
			bottom: 0;
			z-index: 10000;
			background: rgba(0,0,0,.6);
			padding: 6px;
			border-radius: 3px;
		}
		#signin-demo img { cursor: pointer; height: 40px; }
		#signin-demo img:hover { opacity: .5; }
		#signin-demo div {
			color: #fff;
			font-size: 10px;
			font-weight: 600;
			padding-bottom: 6px;
		}
	</style>
<!-- / $DEMO -->
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

</head>


<!-- 1. $BODY ======================================================================================
	
	Body

	Classes:
	* 'theme-{THEME NAME}'
	* 'right-to-left'     - Sets text direction to right-to-left
-->
<body class="theme-default page-signin">

<script>
	var init = [];

</script>
<!-- Demo script --> <script src="<%=request.getContextPath()%>/resources/assets/demo/demo.js"></script> <!-- / Demo script -->

	<!-- Page background -->
	<div id="page-signin-bg">
		<!-- Background overlay -->
		<div class="overlay"></div>
		<!-- Replace this with your bg image -->
		<img src="<%=request.getContextPath()%>/resources/assets/demo/cosumar.jpg" alt="">
	</div>
	<!-- / Page background -->

	<!-- Container -->
	<div class="signin-container">

		<!-- Left side -->
		<div class="signin-info">
			
				<img src="<%=request.getContextPath()%>/resources/assets/images/pixel-admin/logo3.png" alt="" style="margin-top: -5px;">
				<strong style="color: #5f6060; font-size: 28px; position: relative; margin-top: 5px; top: 8px;">ITIL-CCM</strong>
				&nbsp;
				
			 <!-- / .logo -->
			<div class="slogan">
				Les Processus d'ITIL :
			</div> <!-- / .slogan -->
			<ul>
				<li><i class="menu-icon fa fa-users"></i> Gestion des Utilisateurs</li>
				<li><i class="menu-icon fa fa-cogs"></i> Gestion des Configurations</li>
				<li><i class="menu-icon fa fa-th"></i> Gestion des Incidants</li>
				<li><i class="menu-icon fa fa-retweet"></i> Gestion des Changements</li>
			</ul> <!-- / Info list -->
		</div>
		<!-- / Left side -->

		<!-- Right side -->
		<div class="signin-form">

			<!-- Form -->
			<form action="j_spring_security_check" method="POST" id="signin-form_id">
			
				<div class="signin-text">
					<span>Connectez vous dans votre Compte</span>
				</div> <!-- / .signin-text -->&nbsp;&nbsp;&nbsp;
				<c:if test="${param.error != null}">
		            <div class="note note-danger">
		            	<div class="note-title">
			                Erreur de connexion : Matricule ou mot de passe incorrect.
		                </div>
		            </div>
		        </c:if>

				<div class="form-group w-icon">
					<input type="text" name="matricule" id="username_id" class="form-control input-lg" placeholder="Matricule">
					<span class="fa fa-user signin-form-icon"></span>
				</div> <!-- / Username -->

				<div class="form-group w-icon">
					<input type="password" name="password" id="password_id" class="form-control input-lg" placeholder="Password">
					<span class="fa fa-lock signin-form-icon"></span>
				</div> <!-- / Password -->&nbsp;&nbsp;

				<div class="form-actions">
					<input type="submit" value="Se connecter" class="signin-btn bg-primary">
					<a href="<c:url value="/forgot"/>" class="forgot-password" id="forgot-password-link">Mot de passe oublié?</a>
				</div> <!-- / .form-actions -->
			</form>
			<!-- / Form -->

			<!-- "Sign In with" block -->
			<div class="signin-with">
				<!-- Facebook -->
				
			</div>
			<!-- / "Sign In with" block -->

			<!-- Password reset form -->
			
			<!-- / Password reset form -->
		</div>
		<!-- Right side -->
	</div>
	<!-- / Container -->

	
<!-- Get jQuery from Google CDN -->
<!--[if !IE]> -->
	<script type="text/javascript"> window.jQuery || document.write('<script src="<%=request.getContextPath()%>/resources/assets/ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js">'+"<"+"/script>"); </script>
<!-- <![endif]-->
<!--[if lte IE 9]>
	<script type="text/javascript"> window.jQuery || document.write('<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js">'+"<"+"/script>"); </script>
<![endif]-->


<!-- Pixel Admin's javascripts -->
<script src="<%=request.getContextPath()%>/resources/assets/javascripts/bootstrap.min.js"></script>
<script src="<%=request.getContextPath()%>/resources/assets/javascripts/pixel-admin.min.js"></script>

<script type="text/javascript">
	// Resize BG
	init.push(function () {
		var $ph  = $('#page-signin-bg'),
		    $img = $ph.find('> img');

		$(window).on('resize', function () {
			$img.attr('style', '');
			if ($img.height() < $ph.height()) {
				$img.css({
					height: '100%',
					width: 'auto'
				});
			}
		});
	});

	// Show/Hide password reset form on click
	
	// Setup Sign In form validation
	

	// Setup Password Reset form validation
	

	window.PixelAdmin.start(init);
</script>

</body>

<!-- Mirrored from infinite-woodland-5276.herokuapp.com/pages-signin.html by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 03 Mar 2016 01:48:00 GMT -->
</html>
