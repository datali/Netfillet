<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@ page import="java.util.ArrayList" %>
<%@ page import = "com.entity.pkg.Movie" %>
<%

    int index = Integer.parseInt(request.getParameter("index"));
	ArrayList<Movie> arr = (ArrayList<Movie>)session.getAttribute("movieList");
	Movie mov = arr.get(index);
	session.setAttribute("currMovie", mov);
%>
<!DOCTYPE html>
<html>
<head>
<title>Cinema A Entertainment Category Flat Bootstarp Resposive Website Template | Single :: w3layouts</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />

<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Cinema Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--webfont-->
<link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
</head>
<body>
	<!-- header-section-starts -->
	<div class="full">
			<div class="menu">
				<ul>
					<li><a href="welcome.jsp"><div class="hm"><i class="home1"></i><i class="home2"></i></div></a></li>
					<li><a href="videos.jsp"><div class="video"><i class="videos"></i><i class="videos1"></i></div></a></li>
					<li><a class="active" href="reviews.jsp"><div class="cat"><i class="watching"></i><i class="watching1"></i></div></a></li>
					<li><a href="404.jsp"><div class="bk"><i class="booking"></i><i class="booking1"></i></div></a></li>
					<li><a href="contact.jsp"><div class="cnt"><i class="contact"></i><i class="contact1"></i></div></a></li>
				</ul>
			</div>
		<div class="main">
		<div class="single-content">
			<div class="top-header span_top">
				<div class="logo">
					<a href="welcome.jsp"><img src="images/netfillet.png" alt="" /></a>
				</div>
				<div class="search v-search">
					<form>
						<input type="text" value="Search.." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search..';}"/>
						<input type="submit" value="">
					</form>
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="reviews-section">
				<h3 class="head">Movie Details</h3>
					<div class="col-md-9 reviews-grids">
						<div class="review">
							<div class="movie-pic">
								<a href="#"><img src="${currMovie.src}" alt="" /></a>
							</div>
							<a class="span" href="single.html">${currMovie.name}</a>
							<div class="review-info">
								<p class="ratingview">Movie Rating:</p>
								<div class="rating">
									<span class="glyphicon glyphicon-star-empty"></span>
									<span class="glyphicon glyphicon-star-empty"></span>
									<span class="glyphicon glyphicon-star-empty"></span>
									<span class="glyphicon glyphicon-star-empty"></span>
									<span class="glyphicon glyphicon-star-empty"></span>
								</div>
								<p class="ratingview">
								&nbsp;${currMovie.rating}/5  
								</p>
								<div class="clearfix"></div>
								<div class="clearfix"></div>
								<div class="yrw">
									<div class="dropdown-button">           			
										<select class="dropdown" tabindex="9" data-settings='{"wrapperClass":"flat"}'>
										<option value="0">Your rating</option>	
										<option value="1">1.Poor</option>
										<option value="2">1.5(Below average)</option>
										<option value="3">2.Average</option>
										<option value="4">2.5(Above average)</option>
										<option value="5">3.Watchable</option>
										<option value="6">3.5(Good)</option>
										<option value="7">4.5(Very good)</option>
										<option value="8">5.Outstanding</option>
									  </select>
									</div>
								<!-- 	<div class="rtm text-center">
										<a href="#">REVIEW THIS MOVIE</a>
									</div>
									<div class="wt text-center">
										<a href="#">WATCH THIS TRAILER</a>
									</div> -->
									<div class="clearfix"></div>
								</div>
								<p class="info">NAME:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ${currMovie.name}</p>
								<p class="info">TYPE:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ${currMovie.type}</p>
								<p class="info">ACTORS:&nbsp;&nbsp;&nbsp; ${currMovie.actors}</p>
								<!-- <p class="info">DURATION:&nbsp;&nbsp;&nbsp; &nbsp; 1 hour 45 minutes</p> -->
								<button type="button" class="btn rent-btn">Rent Movie</button>
								<button type="button" class="btn queue-btn">Add to queue</button>
							</div>
							<div class="clearfix"></div>
						</div>
						<div class="single">
							<h3>Lorem Ipsum IS A TENSE, TAUT, COMPELLING THRILLER</h3>
							<p>STORY:<i> Meera and Arjun drive down Lorem Ipsum - can they survive a highway from hell?</i></p>
						</div>
							
							<!-- comments-section-starts -->
	  <!-- comments-section-ends -->
		 
		  </div>

					<div class="clearfix"></div>
			</div>
			</div>
	
	<div class="footer">
		<h6>Disclaimer : </h6>
		<p class="claim">This is a freebies and not an official website, I have no intention of disclose any movie, brand, news.My goal here is to train or excercise my skill and share this freebies.</p>
		<a href="example@mail.com">example@mail.com</a>
		<div class="copyright">
			<p> Template by  <a href="http://w3layouts.com">  W3layouts</a></p>
		</div>
	</div>	
	</div>
	<div class="clearfix"></div>
	</div>
</body>
</html>