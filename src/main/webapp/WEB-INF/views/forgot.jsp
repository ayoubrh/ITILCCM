<!DOCTYPE html>
<!--[if IE 8]>         <html class="ie8"> <![endif]-->
<!--[if IE 9]>         <html class="ie9 gt-ie8"> <![endif]-->
<!--[if gt IE 9]><!--> <html class="gt-ie8 gt-ie9 not-ie"> <!--<![endif]-->

<!-- Mirrored from infinite-woodland-5276.herokuapp.com/pages-signup.html by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 03 Mar 2016 01:48:28 GMT -->
<head>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<title>Mot de passe oubliè - ITIL-CCM</title>
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
		<script src="assets/javascripts/ie.min.js"></script>
	<![endif]-->


<!-- $DEMO =========================================================================================

	Remove this section on production
-->
	<style>
		#signup-demo {
			position: fixed;
			right: 0;
			bottom: 0;
			z-index: 10000;
			background: rgba(0,0,0,.6);
			padding: 6px;
			border-radius: 3px;
		}
		#signup-demo img { cursor: pointer; height: 40px; }
		#signup-demo img:hover { opacity: .5; }
		#signup-demo div {
			color: #fff;
			font-size: 10px;
			font-weight: 600;
			padding-bottom: 6px;
		}
	</style>
<!-- / $DEMO -->

</head>


<!-- 1. $BODY ======================================================================================
	
	Body

	Classes:
	* 'theme-{THEME NAME}'
	* 'right-to-left'     - Sets text direction to right-to-left
-->
<body class="theme-default page-signup">


<!-- Demo script --> <script src="<%=request.getContextPath()%>/resources/assets/demo/demo.js"></script> <!-- / Demo script -->

	<!-- Page background -->
	<div id="page-signup-bg">
		<!-- Background overlay -->
		<div class="overlay"></div>
		<!-- Replace this with your bg image -->
		<img src="<%=request.getContextPath()%>/resources/assets/demo/cosumar.jpg" alt="">
	</div>
	<!-- / Page background -->

	<!-- Container -->
	<div class="signup-container">
		<!-- Header -->
		<div class="signup-header">
				
				<img src="<%=request.getContextPath()%>/resources/assets/images/pixel-admin/logo3.png" alt="" style="margin-top: -5px;">
				<strong style="color: #5f6060; font-size: 28px; position: relative; margin-top: 5px; top: 8px;">
				ITIL-CCM</strong>			
		</div>
		<!-- / Header -->
		<script type="text/javascript">
		init.push(function () {
			
			$("#signup-form_id").validate({ 
				focusInvalid: false, 
				rules : {
					'signup_name': {
						required: true,
						minlength: 6,
						maxlength: 20
					},
					'signup_email': {
						required: true,
						email: true
					}
				},
				messages: {
					'signup_name': 'Le matricule doit être entre 6 et 20 caractères ',
					'signup_email': 'Entrez un E-mail valide'
				}
			});
			
		});
		
		
		</script>

		<!-- Form -->
		<div class="signup-form">
			<form action="recop" method="post" id="signup-form_id">
				
				<div class="signup-text">
					<span>Mot de passe oubliè !</span>
				</div>
				
				<c:if test="${param.error != null}">
		            <div class="note note-danger">
		            	<div class="note-title">
			                Erreur : votre matricule ou E-mail est incorrect!
		                </div>
		            </div>
		        </c:if>
		        
		        <c:if test="${param.error2 != null}">
		            <div class="note note-danger">
		            	<div class="note-title">
			                Erreur : votre matricule ou E-mail n'existe pas !
		                </div>
		            </div>
		        </c:if>

				<div class="form-group w-icon">
					<input type="text" name="signup_name" id="signup_name" class="form-control input-lg" placeholder="Matricule">
					<span class="fa fa-info signup-form-icon"></span>
				</div>

				<div class="form-group w-icon">
					<input type="text" name="signup_email" id="signup_email" class="form-control input-lg" placeholder="E-mail">
					<span class="fa fa-envelope signup-form-icon"></span>
				</div>

				<div class="form-actions">
					<input type="submit" value="Envoyer" class="signup-btn bg-primary">
				</div>
			</form>
			<!-- / Form -->

			<!-- "Sign In with" block -->
			
			<!-- / "Sign In with" block -->
		</div>
		<!-- Right side -->
	</div>

		<div class="have-account">
		Vous avez deja un compte ? <a href='<c:url value="/login"/>'>Login</a>
	</div>


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
		var $ph  = $('#page-signup-bg'),
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

	window.PixelAdmin.start(init);
</script>

</body>

<!-- Mirrored from infinite-woodland-5276.herokuapp.com/pages-signup.html by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 03 Mar 2016 01:48:28 GMT -->
</html>
