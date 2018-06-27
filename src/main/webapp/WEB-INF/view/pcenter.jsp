<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
	<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>加入我们</title>
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

	<%--<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet"> --%>
	<%--<link href="https://fonts.googleapis.com/css?family=Playfair+Display:400,400i" rel="stylesheet"> --%>

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
	<link rel="stylesheet" href="../../statics/css/btable.css" />
	<!-- Modernizr JS -->
	<script src="../../statics/myjs/modernizr-2.6.2.min.js"></script>
	<!-- FOR IE9 below -->
	<!--[if lt IE 9]>
	<script src="../../statics/myjs/respond.min.js"></script>
	<![endif]-->
	<style>

		.col-md-12 p{
			margin-top: -18px;
			font-size: 14px;

		}
		.col-md-12 p small{
			margin-top: 60px;
			font-size: 13.5px;
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
			margin-top: 5px;
			font-size: 14px;

		}
		.col-md-12 p small{
			margin-top: 60px;
			font-size: 13.5px;
		}

        .font{
            font-family: "微软雅黑";
            font-size: 26px;
            margin-bottom: 20px;
        }
        #tab input{
            width: 260px;
            height: 50px;
            border-radius:8px;
            display: inline;
        }
        #gongsi{
            width: 520px;
        }
        #btn{
            width: 130px;
            height: 45px;
            line-height: 45px;
            background-color: #D1C286;
            border: none;
            color: #fff;
            font-size: 16px;
            border-radius: 10px;
        }
        .fuli {
        	text-align: center;
        }
		.fuli h1{
			margin-bottom: 40px;
			margin-top: 30px;
		}
		.layui-elem-quote p{
			font-size: 16px;
		}
		.layui-elem-quote{
			background-color: #f8f8f8;
			border-left: 5px solid #D1C286;

		}
		.layui-table thead tr{
			text-align: center;
			background-color: #f7f7f7;

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
									<li><a href="/jump/toDrydan">干燕系列</a></li>
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
							<li><a href="/jump/toCenter">个人中心</a></li>
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
							<li id="log"><a id="login" href="/user/toLogin">登录</a><a id="username" href="#">${user.userName}</a></li>
						</ul>
					</div>
				</div>

			</div>
		</nav>
		<div style="background-color: white; margin:-10px 40px;">

	        <blockquote class="layui-elem-quote">
	            <p >我的订单</p>
	        </blockquote>
	        <div></div>
	        <div id="content" style="width: 100%;height: 533px;"></div>
   		</div>


	<footer id="fh5co-footer" role="contentinfo">
		<div class="container">
			<div class="row row-pb-md">
				<div class="col-md-4 fh5co-widget" id="one">
					<h3>思语燕坊</h3>
					<p>Facilis ipsum reprehenderit nemo molestias. Aut cum mollitia reprehenderit. Eos cumque dicta adipisci architecto culpa amet.</p>
				</div>
				<div class="col-md-2 col-sm-4 col-xs-6 col-md-push-1" id="one">
					<ul class="fh5co-footer-links">
						<li>产品中心</li>
						<li><a href="#">干燕系列</a></li>
						<li><a href="#">鲜炖系列</a></li>
					</ul>
				</div>

				<div class="col-md-2 col-sm-4 col-xs-6 col-md-push-1" id="one">
					<ul class="fh5co-footer-links">
						<li>企业新闻</li>
						<li><a href="#">最新活动</a></li>
						<li><a href="#">企业文化</a></li>
						<li><a href="#">发展历程</a></li>
						<li><a href="#">加入我们</a></li>
					</ul>
				</div>

				<div class="col-md-2 col-sm-4 col-xs-6 col-md-push-1" id="one">
					<ul class="fh5co-footer-links">
						<li>招募活动</li>
						<li><a href="#">企业试吃</a></li>
						<li><a href="#">个人体验</a></li>
					</ul>
				</div>
			</div>

			<div class="row copyright">
				<div class="col-md-12 text-center">
					<p >
						<small class="block">Copyright © 2018 betteryanwo.com 版权所有. 豫ICP备18020315 </small>
					</p>
					<p style="margin-top: 5px;">
						联系方式：400-885-8630
					</p >
					<p style="margin-top: 5px;">地址：河南省郑州市金水区紫荆山路与城北路交叉口阳光铭座A座1801室</p>
				</div>
			</div>

		</div>
	</footer>
	</div>



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

	<script src="../../statics/myjs/layer.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript" src="../../statics/plugins/layui/layui.js"></script>
	<script>
        $(function () {
            var users="<%=session.getAttribute("user")%>";
			/*var userId=${user.userId};*/
            alert(users);
            if (users!='null'){
                $("#log #login").css("opacity","0");
                $("#log #login").css("display","none");
                $("#log #username").css("position","relative");
                $("#log #username").css("left","70px");
                $("#log #username").css("top","-37px");
            }
            if(users ='null'){
                $("#log #login").css("position","relative");
                $("#log #login").css("left","75px");
                $("#log #login").css("top","-37px");
            }
			// alert(userId);


        })
	</script>

	<script>
        layui.config({
            base: '/statics/js/'
        }).use(['btable', 'form'], function () {
            var btable = layui.btable(),
                $ = layui.jquery,
                layerTips = parent.layer === undefined ? layui.layer : parent.layer, //获取父窗口的layer对象
                layer = layui.layer,//获取当前窗口的layer对象;
                form = layui.form();
            btable.set({
                openWait: true,//开启等待框
                elem: '#content',
                url: '/userorder/selorder?userId=12',/*+userId,*/ //数据源地址
                columns: [{ //配置数据列
                    fieldName: '订单号', //显示名称
                    field: 'orderSerial' //字段名
                }, {
                    fieldName: '商品名称',
                    field: 'goodsName'

                }, {
                    fieldName: '商品图片',
                    field: 'gimage'
                },{
                    fieldName: '商品价格',
                    field: 'gprice'
                },{
                    fieldName: '订购数量',
                    field: 'itemNum'
                },{
                    fieldName: '总价格',
                    field: 'price'
                },{
                    fieldName: '支付状态',
                    field: 'status'
                },{
                    fieldName: '发货状态',
                    field: 'shoppingStatus'
                }],
                even: true,//隔行变色
                field: 'id', //主键ID
                //skin: 'row',
                checkbox: false,//是否显示多选框
                singleSelect: false//只允许选择一行，checkbox为true生效
            });
            btable.render();
            $(window).on('resize', function (e) {
                var $that = $(this);
                $('#content').height($that.height() - 92);
            }).resize();
        });

	</script>
	</body>
</html>

