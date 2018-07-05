	<%@page contentType="text/html"%>
		<%@page pageEncoding="UTF-8"%>
		<!DOCTYPE HTML>
		<html>
		<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<title>500</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<meta name="author" content="gettemplates.co" />



		<!-- Facebook and Twitter integration -->
		<meta property="og:title" content=""/>
		<meta property="og:image" content=""/>
		<meta property="og:url" content=""/>
		<meta property="og:site_name" content=""/>
		<meta property="og:description" content=""/>
		<meta name="twitter:title" content="" />
		<meta name="twitter:image" content="" />
		<meta name="twitter:url" content="" />
		<meta name="twitter:card" content="" />

		<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet">
		<link href="https://fonts.googleapis.com/css?family=Playfair+Display:400,400i" rel="stylesheet">

		<!-- Animate.css -->
		<link rel="stylesheet" href="../../statics/mycss/animate.css">
		<!-- Icomoon Icon Fonts-->
		<link rel="stylesheet" href="../../statics/mycss/icomoon.css">
		<!-- Bootstrap  -->
		<link rel="stylesheet" href="../../statics/mycss/bootstrap.css">

		<!-- Flexslider  -->
		<link rel="stylesheet" href="../../statics/mycss/flexslider.css">


		<!-- Owl Carousel  -->
		<link rel="stylesheet" href="../../statics/mycss/owl.carousel.min.css">
		<link rel="stylesheet" href="../../statics/mycss/owl.theme.default.min.css">

		<!-- Theme style  -->
		<link rel="stylesheet" href="../../statics/mycss/style.css">



		<link rel="stylesheet" type="text/css" href="../../statics/mycss/reset.css"/>

		<link rel="stylesheet" type="text/css" href="../../statics/mycss/nav.css"/>

		<link rel="stylesheet" type="text/css" href="../../statics/mycss/common.css"/>

		<link rel="stylesheet" href="../../statics/css/layui.css" media="all" />
		<!-- Modernizr JS -->
		<script src="../../statics/myjs/modernizr-2.6.2.min.js"></script>
		<!-- FOR IE9 below -->
		<!--[if lt IE 9]>
		<script src="../../statics/myjs/respond.min.js"></script>
		<![endif]-->
		<style>
		#log{
		position: relative;
		left: 70px;
		top: -37px;
		}
		#log a:hover{
		color: #D1C286;
		}
		#fh5co-header{
		margin-top: -18px;
		}
		#row{
		padding-top: 12px;
		}
		#font{
		font-size: 30px;
		font-family:"bodoni mt black";
		color: #FFFFFF;
		font-weight:500;
		}
		.col-md-12 p{
		margin-top: -18px;
		font-size: 14px;

		}
		.col-md-12 p small{
		margin-top: 60px;
		font-size: 13.5px;
		}

		.cart-empty{
		height: 273px;

		padding-left: 558px;

		margin: 65px 0 130px;

		background: url("../../statics/images/cart-empty.png") no-repeat 124px 0;

		color: #b0b0b0;

		overflow: hidden;

		_zoom: 1;
		}
		.btn-primary {
		background: #ff6700;
		background-color: rgb(255, 103, 0);
		border-color: #ff6700;
		color: #fff;
		}
		#paycenter{
		width: 300px;
		height: 300px;
		border: 1px solid #000000;
		margin: 70px auto 0px;
		}
		#payfont{
		width: 300px;
		height: 60px;
		text-align: center;
		margin: 20px auto;
		}
		
		</style>

		</head>
		<body>

		<div class="fh5co-loader"></div>

		<div id="page">
		<nav class="fh5co-nav" role="navigation">
		<div class="container">
		<div class="row" id="row">
		<div class="col-md-3 col-xs-2">
		<div id="fh5co-logo"><a href="index.html">思语燕坊</a></div>
		</div>
		<div class="col-md-6 col-xs-6 text-center menu-1">
		<ul>

		<li><a href="about.html">首页</a></li>
		<li class="has-dropdown">
		<a href="product.html">产品中心</a>
		<ul class="dropdown">
		<li><a href="single.html">干燕系列</a></li>
		<li><a href="#">鲜炖系列</a></li>
		</ul>
		</li>
		<li class="has-dropdown">
		<a href="services.html">企业新闻</a>
		<ul class="dropdown">
		<li><a href="#">最新活动</a></li>
		<li><a href="#">企业文化</a></li>
		<li><a href="#">发展历程</a></li>
		<li><a href="#">加入我们</a></li>
		</ul>
		</li>
		<li class="has-dropdown">
		<a href="product.html">招募活动</a>
		<ul class="dropdown">
		<li><a href="single.html">企业试吃</a></li>
		<li><a href="#">个人体验</a></li>
		</ul>
		</li>
		<li><a href="about.html">个人中心</a></li>
		</ul>
		</div>
		<div class="col-md-3 col-xs-4 text-right hidden-xs menu-2">
		<ul>
		<li class="search">
		<div class="input-group">
		<input type="text" placeholder="Search..">
		<span class="input-group-btn">
		<button class="btn btn-primary" type="button"><i class="icon-search"></i></button>
		</span>
		</div>
		</li>
		<li class="shopping-cart"><a href="#" class="cart"><span><small>0</small><i class="icon-shopping-cart"></i></span></a></li>
		<li id="log"><a href="#" class="cart"> 登录</a></li>
		</ul>
		</div>
		</div>

		</div>
		</nav>


		<div id="J_cartEmpty" class="cart-empty cart-empty-nologin">
			<h2>您的购物车还是空的！</h2>
			<p>&nbsp;</p>
			<p>&nbsp;</p>
			<p>&nbsp;</p>
			<a class="btn btn-primary btn-shoping J_goShoping" href="#">马上购物</a>
		</div>






		<footer id="fh5co-footer" role="contentinfo">
		<div class="container">
		<div class="row row-pb-md">
		<div class="col-md-4 fh5co-widget">
		<h3>思语燕坊</h3>
		<p>Facilis ipsum reprehenderit nemo molestias. Aut cum mollitia reprehenderit. Eos cumque dicta adipisci architecto culpa amet.</p>
		</div>
		<div class="col-md-2 col-sm-4 col-xs-6 col-md-push-1">
		<ul class="fh5co-footer-links">
		<li>产品中心</li>
		<li><a href="#">干燕系列</a></li>
		<li><a href="#">鲜炖系列</a></li>
		</ul>
		</div>

		<div class="col-md-2 col-sm-4 col-xs-6 col-md-push-1">
		<ul class="fh5co-footer-links">
		<li>企业新闻</li>
		<li><a href="#">最新活动</a></li>
		<li><a href="#">企业文化</a></li>
		<li><a href="#">发展历程</a></li>
		<li><a href="#">加入我们</a></li>
		</ul>
		</div>

		<div class="col-md-2 col-sm-4 col-xs-6 col-md-push-1">
		<ul class="fh5co-footer-links">
		<li>招募活动</li>
		<li><a href="#">企业试吃</a></li>
		<li><a href="#">个人体验</a></li>
		</ul>
		</div>
		</div>

		<div class="row copyright">
		<div class="col-md-12 text-center">
		<p>
		<small class="block">Copyright © 2018 betteryanwo.com 版权所有. 豫ICP备18020315 </small>
		</p>
		<p>
		联系方式：400-885-8630
		</p>
		<p>地址：河南省郑州市金水区紫荆山路与城北路交叉口阳光铭座A座1801室</p>
		</div>
		</div>

		</div>
		</footer>
		</div>

		<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="icon-arrow-up"></i></a>
		</div>

		<!-- jQuery -->
		<script src="../../statics/myjs/jquery.min.js"></script>
		<!-- jQuery Easing -->
		<script src="../../statics/myjs/jquery.easing.1.3.js"></script>
		<!-- Bootstrap -->
		<script src="../../statics/myjs/bootstrap.min.js"></script>
		<!-- Waypoints -->
		<script src="../../statics/myjs/jquery.waypoints.min.js"></script>
		<!-- Carousel -->
		<script src="../../statics/myjs/owl.carousel.min.js"></script>
		<!-- countTo -->
		<script src="../../statics/myjs/jquery.countTo.js"></script>
		<!-- Flexslider -->
		<script src="../../statics/myjs/jquery.flexslider-min.js"></script>
		<!-- Google Map -->
		<!---<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCefOgb1ZWqYtj7raVSmN4PL2WkTrc-KyA&sensor=false"></script>--->
		<script src="../../statics/myjs/google_map.js"></script>

		<!-- Main -->
		<script src="../../statics/myjs/main.js"></script>

		</body>
		</html>

