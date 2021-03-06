<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
<title>NetFillet</title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<link href="css/carousel.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- Custom Theme files -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Cinema Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 
</script>
<!--webfont-->
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800'
	rel='stylesheet' type='text/css'>
</head>
<body>
	<!-- header-section-starts -->
	<div class="full">
		<div class="menu">
			<ul>
				<li><a class="active" href="welcome.jsp"><i class="home"></i></a></li>
				<li><a href="videos.jsp"><div class="video">
							<i class="videos"></i><i class="videos1"></i>
						</div></a></li>
				<li><a href="reviews.jsp"><div class="cat">
							<i class="watching"></i><i class="watching1"></i>
						</div></a></li>
				<li><a href="404.jsp"><div class="bk">
							<i class="booking"></i><i class="booking1"></i>
						</div></a></li>
				<li><a href="contact.jsp"><div class="cnt">
							<i class="contact"></i><i class="contact1"></i>
						</div></a></li>
			</ul>
		</div>
		<div class="main">
			<div class="header">
				<div class="top-header">
					<div class="logo">
						<a href="welcome.jsp"><img src="images/netfillet.png" alt="" /></a>
					</div>
					<div class="search">
						<form>
							<input type="text" value="Search.." onfocus="this.value = '';"
								onblur="if (this.value == '') {this.value = 'Search..';}" /> <input
								type="submit" value="">
						</form>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="header-info">
					<h1>IRONMAN 3</h1>
					<p class="age">
						<a href="#">All Age</a> Shane Black, Robert Downy Jr
					</p>
					<p class="review">Rating
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: &nbsp;&nbsp; 4/5</p>
					<p class="review">&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;Genre
						 Action, Adventure, Sci-Fi </p>
					
					<!-- <p class="special">The special bond that develops between
						plus-sized inflatable robot Baymax, and prodigy Hiro Hamada, who
						team up with a group of friends to form a band of high-tech
						heroes.</p> -->
					<button type="button" class="btn-lg rent-btn">Rent Movie</button>
					<button type="button" class="btn-lg queue-btn">Add to queue</button>
					<!-- <a class="book" href="#"><i class="book1"></i>BOOK TICKET</a> -->
				</div>
			</div>
			
			<div class="review-slider">
				<h3>User Movie queue</h3>
				<ul id="flexiselDemo1">
					<c:forEach items="${movieList}" var="movie" varStatus="loop">
						<li><div class="tile" onclick="location.href='single.jsp?index=${loop.index}'">
							<div class="tile__media">
								<img class="tile__img" src="${movie.src}" alt="" />
							</div>
							<div class="tile__details">
								<div class="tile__title">${movie.name}</div>
							</div>
						</div></li>
					</c:forEach>
				</ul>
				<script type="text/javascript">
					$(window).load(function() {

						$("#flexiselDemo1").flexisel({
							visibleItems : 4,
							animationSpeed : 1000,
							autoPlay : true,
							autoPlaySpeed : 3000,
							pauseOnHover : true,
							enableResponsiveBreakpoints : true,
							responsiveBreakpoints : {
								portrait : {
									changePoint : 480,
									visibleItems : 2
								},
								landscape : {
									changePoint : 640,
									visibleItems : 3
								},
								tablet : {
									changePoint : 768,
									visibleItems : 4
								}
							}
						});
					});
				</script>
				<script type="text/javascript" src="js/jquery.flexisel.js"></script>
			</div>
			
			<!--//pop-up-box -->
			<br>
			<br>
			<div class="contain">
				<h3>Latest Movies</h3>
				<div class="row">
					<div class="row__inner">
						<div class="tile" onclick="location.href='single.jsp'">
							<div class="tile__media">
								<img class="tile__img"
									src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/70390/show-1.jpg"
									alt="" />
							</div>
							<div class="tile__details">
								<div class="tile__title">Top Gear</div>
							</div>
						</div>

						<div class="tile">
							<div class="tile__media">
								<img class="tile__img"
									src="images/poster_default.gif"
									alt="" />
							</div>
							<div class="tile__details">
								<div class="tile__title">Top Gear</div>
							</div>
						</div>

						<div class="tile">
							<div class="tile__media">
								<img class="tile__img"
									src="images/r5.jpg"
									alt="" />
							</div>
							<div class="tile__details">
								<div class="tile__title">Top Gear</div>
							</div>
						</div>

						<div class="tile">
							<div class="tile__media">
								<img class="tile__img"
									src="images/poster_default.gif"
									alt="" />
							</div>
							<div class="tile__details">
								<div class="tile__title">Top Gear</div>
							</div>
						</div>

						<div class="tile">
							<div class="tile__media">
								<img class="tile__img"
									src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/70390/show-5.jpg"
									alt="" />
							</div>
							<div class="tile__details">
								<div class="tile__title">Top Gear</div>
							</div>
						</div>

						<div class="tile">
							<div class="tile__media">
								<img class="tile__img"
									src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/70390/show-6.jpg"
									alt="" />
							</div>
							<div class="tile__details">
								<div class="tile__title">Top Gear</div>
							</div>
						</div>

						<div class="tile">
							<div class="tile__media">
								<img class="tile__img"
									src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/70390/show-7.jpg"
									alt="" />
							</div>
							<div class="tile__details">
								<div class="tile__title">Top Gear</div>
							</div>
						</div>

						<div class="tile">
							<div class="tile__media">
								<img class="tile__img"
									src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/70390/show-8.jpg"
									alt="" />
							</div>
							<div class="tile__details">
								<div class="tile__title">Top Gear</div>
							</div>
						</div>

						<div class="tile">
							<div class="tile__media">
								<img class="tile__img"
									src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/70390/show-9.jpg"
									alt="" />
							</div>
							<div class="tile__details">
								<div class="tile__title">Top Gear</div>
							</div>
						</div>

						<div class="tile">
							<div class="tile__media">
								<img class="tile__img"
									src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/70390/show-10.jpg"
									alt="" />
							</div>
							<div class="tile__details">
								<div class="tile__title">Top Gear</div>
							</div>
						</div>

						<div class="tile">
							<div class="tile__media">
								<img class="tile__img"
									src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/70390/show-11.jpg"
									alt="" />
							</div>
							<div class="tile__details">
								<div class="tile__title">Top Gear</div>
							</div>
						</div>

						<div class="tile">
							<div class="tile__media">
								<img class="tile__img"
									src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/70390/show-12.jpg"
									alt="" />
							</div>
							<div class="tile__details">
								<div class="tile__title">Top Gear</div>
							</div>
						</div>

						<div class="tile">
							<div class="tile__media">
								<img class="tile__img"
									src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/70390/show-13.jpg"
									alt="" />
							</div>
							<div class="tile__details">
								<div class="tile__title">Top Gear</div>
							</div>
						</div>

						<div class="tile">
							<div class="tile__media">
								<img class="tile__img"
									src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/70390/show-14.jpg"
									alt="" />
							</div>
							<div class="tile__details">
								<div class="tile__title">Top Gear</div>
							</div>
						</div>

						<div class="tile">
							<div class="tile__media">
								<img class="tile__img"
									src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/70390/show-15.jpg"
									alt="" />
							</div>
							<div class="tile__details">
								<div class="tile__title">Top Gear</div>
							</div>
						</div>

						<div class="tile">
							<div class="tile__media">
								<img class="tile__img"
									src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/70390/show-16.jpg"
									alt="" />
							</div>
							<div class="tile__details">
								<div class="tile__title">Top Gear</div>
							</div>
						</div>

						<div class="tile">
							<div class="tile__media">
								<img class="tile__img"
									src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/70390/show-17.jpg"
									alt="" />
							</div>
							<div class="tile__details">
								<div class="tile__title">Top Gear</div>
							</div>
						</div>

						<div class="tile">
							<div class="tile__media">
								<img class="tile__img"
									src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/70390/show-18.jpg"
									alt="" />
							</div>
							<div class="tile__details">
								<div class="tile__title">Top Gear</div>
							</div>
						</div>

						<div class="tile">
							<div class="tile__media">
								<img class="tile__img"
									src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/70390/show-19.jpg"
									alt="" />
							</div>
							<div class="tile__details">
								<div class="tile__title">Top Gear</div>
							</div>
						</div>

					</div>
				</div>
				
				
				<h3>Popular Movies</h3>
				<div class="row">
					<div class="row__inner">
						<c:forEach items="${movieList}" var="movie">
    						<div class="tile" onclick="location.href='single.jsp'">
							<div class="tile__media">
								<img class="tile__img" src="${movie.src}" alt="" />
							</div>
							<div class="tile__details">
								<div class="tile__title">${movie.name}</div>
							</div>
						</div>
						</c:forEach>
						
					</div>
				</div>

			</div>
		</div>
		<div class="clearfix"></div>
		
		
</body>
</html>