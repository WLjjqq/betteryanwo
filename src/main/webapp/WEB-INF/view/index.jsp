<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Home</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="" />
    <meta name="keywords" content="" />
    <meta name="author" content="" />


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
        #lun{
            margin-top: -18px;
        }
        #row{
            padding-top: 12px;
        }
        #info{
            margin-top: 140px;
        }
        #left{
            width: 140px;
            height: 170px;

            margin-left: 140px;
            float: left;
            margin-top: 35px;
        }
        #left a{
            display: block;
            color: #fff;
            font-family: "微软雅黑";
            width: 130px;
            height: 45px;
            line-height: 45px;
            background:#D1C286;
            text-align: center;
            margin-bottom: 15px;

        }
        #left a:hover{
            background: #C0A16B;
        }
        #right{
            width: 796px;
            height: 290px;

            float: left;
            margin-left: 50px;
            margin-top: -35px;
        }
        #right img{
            width: 310px;
            height: 310px;

            margin-right: 35px;
        }
        .col-md-12 p{
            margin-top: -18px;
            font-size: 14px;

        }
        .col-md-12 p small{
            margin-top: 60px;
            font-size: 13.5px;
        }
        .desc a{
            font-family: "微软雅黑";
            font-size: 18px;
            color: #000000;
        }
        .desc a:hover{
            color:  #C0A16B;
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
                    <div id="fh5co-logo"><a href="/jump/toIndex">思语燕坊</a></div>
                </div>
                <div class="col-md-6 col-xs-6 text-center menu-1">
                    <ul>

                        <li><a href="/jump/toIndex">首页</a></li>
                        <li class="has-dropdown">
                            <a href="#">产品中心</a>
                            <ul class="dropdown">
                                <li><a href="/jump//toDrydan">干燕系列</a></li>
                                <li><a href="/jump/toFreshstew">鲜炖系列</a></li>
                            </ul>
                        </li>
                        <li class="has-dropdown">
                            <a href="#">企业新闻</a>
                            <ul class="dropdown">
                                <li><a href="#">最新活动</a></li>
                                <li><a href="/jump/toAbout">企业文化</a></li>
                                <li><a href="/jump/toJoin">加入我们</a></li>
                            </ul>
                        </li>
                        <li class="has-dropdown">
                            <a href="#">招募活动</a>
                            <ul class="dropdown">
                                <li><a href="/jump/toEat">企业试吃</a></li>
                                <li><a href="/jump/toPersonal">个人体验</a></li>
                            </ul>
                        </li>
                        <li><a href="#">个人中心</a></li>
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
                        <li id="log"><a href="/user/toLogin" class="cart" id="login" > 登录 </a></li>
                    </ul>
                </div>
            </div>

        </div>
    </nav>

    <aside id="fh5co-hero" class="js-fullheight">
        <div class="flexslider js-fullheight" id="lun">
            <ul class="slides">
                <li style="background-image: url(/statics/images/img_bg_1.jpg);">
                    <div class="overlay-gradient"></div>
                    <div class="container">
                        <div class="col-md-6 col-md-offset-3 col-md-pull-3 js-fullheight slider-text">
                            <div class="slider-text-inner">
                                <div class="desc" id="info">
                                    <span class="price">$800</span>
                                    <h2>Alato Cabinet</h2>
                                    <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove.</p>
                                    <p><a href="single.html" class="btn btn-primary btn-outline btn-lg">Purchase Now</a></p>
                                </div>
                            </div>
                        </div>
                    </div>
                </li>
                <li style="background-image: url(/statics/images/img_bg_2.jpg);">
                    <div class="container">
                        <div class="col-md-6 col-md-offset-3 col-md-pull-3 js-fullheight slider-text">
                            <div class="slider-text-inner">
                                <<div class="desc" id="info">
                                <span class="price">$530</span>
                                <h2>The Haluz Rocking Chair</h2>
                                <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove.</p>
                                <p><a href="single.html" class="btn btn-primary btn-outline btn-lg">Purchase Now</a></p>
                            </div>
                            </div>
                        </div>
                    </div>
                </li>

                <li style="background-image: url(/statics/images/img_bg_4.jpg);">
                    <div class="container">
                        <div class="col-md-6 col-md-offset-3 col-md-pull-3 js-fullheight slider-text">
                            <div class="slider-text-inner">
                                <div class="desc" id="info">
                                    <span class="price">$540</span>
                                    <h2>The WW Chair</h2>
                                    <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove.</p>
                                    <p><a href="single.html" class="btn btn-primary btn-outline btn-lg">Purchase Now</a></p>
                                </div>
                            </div>
                        </div>
                    </div>
                </li>
            </ul>
        </div>
    </aside>

    <div id="fh5co-product">
        <div class="container">
            <div class="row animate-box">
                <div class="col-md-8 col-md-offset-2 text-center fh5co-heading">
                    <span>Product</span>
                    <h2>产品介绍</h2>
                    <p>Dignissimos asperiores vitae velit veniam totam fuga molestias accusamus alias autem provident. Odit ab aliquam dolor eius.</p>
                </div>
            </div>
            <div class="row">
                <div class="col-md-4 text-center animate-box">
                    <div class="product">
                        <div class="product-grid" style="background-image:url(/statics/images/index-05.jpg);">

                        </div>
                        <div class="desc">
                            <a href="#">干燕系列</a><br>
                            <span class="price">燕盏、燕条、燕碎</span>
                        </div>
                    </div>
                </div>
                <div class="col-md-4 text-center animate-box">
                    <div class="product">
                        <div class="product-grid" style="background-image:url(/statics/images/index-03.jpg);">


                        </div>
                        <div class="desc">
                            <a href="#">鲜炖系列</a><br>
                            <span class="price">当天鲜炖、冷鲜配送</span>
                        </div>
                    </div>
                </div>
                <div class="col-md-4 text-center animate-box">
                    <div class="product">
                        <div class="product-grid" style="background-image:url(/statics/images/index-04.jpg);">
                        </div>
                        <div class="desc">
                            <a href="#">产品活动</a><br>
                            <span class="price">关注官方微信号“燕坊”，了解公司最新活动，好礼等你来！</span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>


    <div id="fh5co-services" class="fh5co-bg-section">
        <div class="container">
            <div id="left">
                <a href="#">企业文化</a>
                <a href="#">个人体验</a>
                <a href="#">加入我们</a>
            </div>
            <div id="right">
                <img src="/statics/images/index-01.jpg" />
                <img src="/statics/images/index-02.jpg" />
            </div>
        </div>
    </div>


    <div id="fh5co-product">
        sdgsd
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
<!-- Main -->
<script src="../../statics/myjs/main.js"></script>

</body>
</html>