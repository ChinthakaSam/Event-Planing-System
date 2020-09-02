
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<html lang="en">
<head>
<title>Events a Wedding Category Bootstrap Responsive website
	Template | Typography :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Events Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
	SmartPhone Compatible web template, free WebDesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
<script type="application/x-javascript">
	
	
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 


</script>
<!-- Custom Theme files -->
<link href="css/bootstrap.css" type="text/css" rel="stylesheet"
	media="all">
<link href="css/style.css" type="text/css" rel="stylesheet" media="all">
<link href="css/font-awesome.css" rel="stylesheet">
<!-- font-awesome icons -->
<!-- //Custom Theme files -->
<!-- js -->
<script src="js/jquery-2.2.3.min.js"></script>
<!-- //js -->
<!-- web-fonts -->
<link
	href="//fonts.googleapis.com/css?family=Josefin+Sans:300,400,600,700"
	rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
<!-- //web-fonts -->

<style>
* {
	box-sizing: border-box;
}

.containerimg {
	position: relative;
	max-width: 800px;
	margin: 0 auto;
}

.container imgimg {
	vertical-align: middle;
}

.containerimg .contentimg {
	position: absolute;
	bottom: 0;
	background: rgba(0, 0, 0, 0.5);
	/* Black background with transparency */
	color: #f1f1f1;
	width: 100%;
	padding: 20px;
}
</style>
</head>

<body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top">
	<!-- banner -->
	<div class="w3ls-banner-1">
		<!-- banner-text -->

		<!-- //banner -->
		<!-- header -->
		<div class="header-w3layouts">
			<!-- Navigation -->
			<nav class="navbar navbar-default navbar-fixed-top">
				<div class="container">
					<div class="navbar-header page-scroll">
						<button type="button" class="navbar-toggle" data-toggle="collapse"
							data-target=".navbar-ex1-collapse">
							<span class="sr-only">Events</span> <span class="icon-bar"></span>
							<span class="icon-bar"></span> <span class="icon-bar"></span>
						</button>
						<table>
							<tr>
								<td>
									<a class="navbar-brand" href="welcome.jsp"><img src="images/logo1.png" width="50" height="50"></a>
								</td>
								<td>
									<h1>
										<a class="navbar-brand" href="welcome.jsp">Black Pearl Events</a>
									</h1>
								</td>
							</tr>
						</table>
					</div>
					<%
						String name = (String) session.getAttribute("name");
					%>
					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse navbar-ex1-collapse">
						<ul class="nav navbar-nav navbar-right">
							<!-- Hidden li included to remove active class from about link when scrolled up past about section -->
							<li class="hidden"><a class="page-scroll" href="#page-top"></a>
							</li>
							<li><a class="hvr-sweep-to-right" href="index.html">Home</a></li>
							<li><a class="hvr-sweep-to-right" href="about.html">About</a></li>
							<li><a class="hvr-sweep-to-right" href="events.html">Contact</a></li>
							<li class="dropdown"><a href="#"
								class="dropdown-toggle hvr-sweep-to-right" data-hover="Pages"
								data-toggle="dropdown">Events <b class="caret"></b></a>
								<ul class="dropdown-menu">
									<li><a class="hvr-sweep-to-right" href="weddingEvents.jsp">Wedding
											Events</a></li>
									<li><a class="hvr-sweep-to-right"
										href="corporateEvents.jsp">Corporate Events</a></li>
									<li><a class="hvr-sweep-to-right"
										href="nonProfitEvents.jsp">Non-profit Events</a></li>
									<li><a class="hvr-sweep-to-right" href="otherEvents.jsp">Other
											Events</a></li>
								</ul></li>
							<li><a class="hvr-sweep-to-right" href="gallery.html">Gallery</a></li>
							<li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
							<li><a href="events.html"><img src="images/cart.png"
									width="30" height="30"></a></li>
							<li class="dropdown"><a href="#" data-hover="Pages"
								data-toggle="dropdown"><img src="images/user.png" width="30"
									height="30"> <label class="dropbtn"> <%
 	out.println(name);
 %></label></a>
								<ul class="dropdown-menu">
									<li><a class="hvr-sweep-to-right" href="myprofie.jsp">My
											Profile</a></li>
									<li><a class="hvr-sweep-to-right" href="index.jsp">Logout</a></li>
								</ul></li>

						</ul>
					</div>
				</div>
				<!-- /.container -->
			</nav>
		</div>
		<!-- //header -->

	</div>
	<!-- typography -->



	<div class="typo">
		<div class="container">

			<div class="grid_3 grid_4 w3layouts" align="center">
				<h2 class="heading-agileinfo">
					Other Events<span>Plan with your passion</span>
				</h2>
				<br> <br>
				<table>
					<tr>
						<td>



							<div class="containerimg">
								<a href="BirthdayEvents.jsp"> <img src="images/b1.jpg"
									alt="Birthday" style="width: 100%;"></a>
								<div class="contentimg">
									<h1>
										<a href="BirthdayEvents.jsp" style="color: white">Birthday</a>
									</h1>
								</div>

							</div>

						</td>
						<td width="50"></td>
						<td>
							<div class="containerimg">
								<img src="images/b1.jpg" alt="Birthday" style="width: 100%;">
								<div class="contentimg">
									<h1>Graduation</h1>
								</div>
							</div>
						</td>
					</tr>
					<tr height="50">
					</tr>
					<tr>
						<td>
							<div class="containerimg">
								<img src="images/b1.jpg" alt="Birthday" style="width: 100%;">
								<div class="contentimg">
									<h1>New Year Parties</h1>
								</div>
							</div>
						</td>
						<td width="50"></td>
						<td>
							<div class="containerimg">
								<img src="images/b1.jpg" alt="Birthday" style="width: 100%;">
								<div class="contentimg">
									<h1>Customize Events</h1>
								</div>
							</div>
						</td>
					</tr>
				</table>

			</div>
		</div>

		<div class="col-md-6 w3-agileits"></div>

	</div>
	<!-- //typography-->
	<!-- footer-top -->
	<div class="footer-top">
		<div class="container">
			<div class="col-md-3 foot-left">
				<h3>About Us</h3>

				<p>Lorem Ipsum is simply dummy text of the printing and
					typesetting industry. Lorem Ipsum has been the industry's standard.</p>
			</div>
			<div class="col-md-3 foot-left">
				<h3>Get In Touch</h3>
				<p>Lorem Ipsum is simply dummy text of the printing and
					typesetting.</p>

				<div class="contact-btm">
					<span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>
					<p>90 Street, City, State 34789.</p>
				</div>
				<div class="contact-btm">
					<span class="glyphicon glyphicon-earphone" aria-hidden="true"></span>
					<p>+456 123 7890</p>
					<div class="contact-btm"></div>
					<span class="fa fa-envelope-o" aria-hidden="true"></span>
					<p>
						<a href="mailto:example@email.com">info@example.com</a>
					</p>
				</div>
				<div class="clearfix"></div>

			</div>
			<div class="col-md-3 foot-left">
				<h3>Latest Events</h3>
				<ul>
					<li><a href="#" data-toggle="modal" data-target="#myModal"><img
							src="images/g1.jpg" alt="" class="img-responsive"></a></li>
					<li><a href="#" data-toggle="modal" data-target="#myModal"><img
							src="images/g2.jpg" alt="" class="img-responsive"></a></li>
					<li><a href="#" data-toggle="modal" data-target="#myModal"><img
							src="images/g3.jpg" alt="" class="img-responsive"></a></li>
					<li><a href="#" data-toggle="modal" data-target="#myModal"><img
							src="images/g4.jpg" alt="" class="img-responsive"></a></li>
				</ul>
				<div class="clearfix"></div>
			</div>
			<div class="col-md-3 foot-left">
				<h3>Subscribe</h3>
				<p>Lorem Ipsum is simply dummy text of the printing and Lorem
					Ipsum has</p>
				<form action="#" method="post">
					<input type="email" Name="Enter Your Email"
						placeholder="Enter Your Email"> <input type="submit"
						value="Subscribe">
				</form>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
	<!-- /footer-top -->

	<!-- footer -->
	<div class="copy-right">
		<div class="container">
			<div class="col-md-6 col-sm-6 col-xs-6 copy-right-grids">
				<div class="copy-left">
					<p>
						&copy; 2017 Events. All rights reserved | Design by <a
							href="http://w3layouts.com/">W3layouts</a>
					</p>
				</div>
			</div>
			<div class="col-md-6 col-sm-6 col-xs-6 top-middle">
				<ul>
					<li><a href="#"><i class="fa fa-facebook"></i></a></li>
					<li><a href="#"><i class="fa fa-twitter"></i></a></li>
					<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
					<li><a href="#"><i class="fa fa-vimeo"></i></a></li>
				</ul>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>

	<!-- //footer -->
	<!-- bootstrap-modal-pop-up -->
	<div class="modal video-modal fade" id="myModal" tabindex="-1"
		role="dialog" aria-labelledby="myModal">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					Events
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<img src="images/g8.jpg" alt=" " class="img-responsive" />
					<p>
						Ut enim ad minima veniam, quis nostrum exercitationem ullam
						corporis suscipit laboriosam, nisi ut aliquid ex ea commodi
						consequatur? Quis autem vel eum iure reprehenderit qui in ea
						voluptate velit esse quam nihil molestiae consequatur, vel illum
						qui dolorem eum fugiat quo voluptas nulla pariatur. <i>" Quis
							autem vel eum iure reprehenderit qui in ea voluptate velit esse
							quam nihil molestiae consequatur.</i>
					</p>
				</div>
			</div>
		</div>
	</div>
	<!-- //bootstrap-modal-pop-up -->
	<a href="#" id="toTop" style="display: block;"> <span
		id="toTopHover" style="opacity: 1;"> </span></a>

	<script src="js/jquery-2.2.3.min.js"></script>

	<!-- skills -->
	<script type="text/javascript" src="js/move-top.js"></script>
	<script type="text/javascript" src="js/easing.js"></script>
	<script type="text/javascript">
		jQuery(document).ready(function($) {
			$(".scroll").click(function(event) {
				event.preventDefault();
				$('html,body').animate({
					scrollTop : $(this.hash).offset().top
				}, 1000);
			});
		});
	</script>
	<!-- start-smoth-scrolling -->
	<script src="js/bootstrap.js"></script>
	<!-- //for bootstrap working -->
	<!-- here stars scrolling icon -->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
				var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
				};
			 */

			$().UItoTop({
				easingType : 'easeOutQuart'
			});

		});
	</script>
	<!-- //here ends scrolling icon -->
</body>
</html>