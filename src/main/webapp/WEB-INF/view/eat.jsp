<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
	<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>企业试吃</title>
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

		<link rel="stylesheet" href="../../statics/css/layui.css" media="all" />
		<link rel="stylesheet" href="../../statics/css/register.css" />




		<!-- Modernizr JS -->
		<script src="../../statics/myjs/modernizr-2.6.2.min.js"></script>
		<!-- FOR IE9 below -->
		<!--[if lt IE 9]>
		<script src="js/respond.min.js"></script>
	<![endif]-->
	<style>

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
			margin-top: 5px;
			font-size: 14px;
			
		}
		.col-md-12 p small{
			margin-top: 60px;
			font-size: 13.5px;
		}
		#fh5co-contact{
			height: 650px;
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

	<header id="fh5co-header" class="fh5co-cover fh5co-cover-sm" role="banner" style="background-image:url(/statics/images/img_bg_2.jpg);">
		<div class="overlay"></div>
		<div class="container">
			<div class="row">
				<div class="col-md-8 col-md-offset-2 text-center">
					<div class="display-t">
						<div class="display-tc animate-box" data-animate-effect="fadeIn">
							<h1>企业试吃</h1>
							<h2>Enterprises Try To Eat</h2>
						</div>
					</div>
				</div>
			</div>
		</div>
	</header>
	
	<div id="fh5co-contact">
		<div class="container">
			<div class="row">
				<div class="col-md-5 col-md-push-1 animate-box">
					
					<div class="fh5co-contact-info">
						<div class="font">联系我们</div>
						<ul>
							<li class="address">河南省郑州市金水区紫荆山路与城北路<br> 交叉口阳光铭座A座1801室</li>
							<li class="phone">400-885-8630 </li>
							<li class="email">Ha_siyuyuan@163.com</li>
							<li class="url"><a href="http://www.betteryanwo.com/">www.betteryanwo.com</a></li>
						</ul>
					</div>

				</div>
				<div class="col-md-6 animate-box">
					<div class="font">联系我们</div>
					<form id="tab" class="layui-form" method="post" action="eat.jsp">
                        <!--公司全称-->
                        <div class="layui-form-item" >
                            <input type="text"  name="corporateName"  lay-verify="corporateName" autocomplete="off" placeholder="您的公司全称" class="layui-input">
                            <input type="text"  name="cAddress"  lay-verify="cAddress" autocomplete="off" placeholder="您的公司的详细地址" class="layui-input">
                        </div>
                        <!--品尝地点-->
                        <div class="layui-form-item" >
                            <input type="text" name="tasting"  lay-verify="tasting" autocomplete="off" placeholder="品尝地点" class="layui-input">
                            <input type="text" name="number"  lay-verify="number" autocomplete="off" placeholder="试吃人数" class="layui-input">
                        </div>

                        <!--品尝地点-->
                        <div class="layui-form-item" >
                            <input type="text" name="position"  lay-verify="position" autocomplete="off" placeholder="您的职位" class="layui-input">
                            <input type="text" name="applicant"  lay-verify="applicant" autocomplete="off" placeholder="您的姓名" class="layui-input">
                        </div>
                        <!--品尝地点-->
                        <div class="layui-form-item" >
                            <input type="text" name="pThone"  lay-verify="pThone" autocomplete="off" placeholder="您的电话" class="layui-input">
                            <input type="text" name="pEmail"  lay-verify="pEmail" autocomplete="off" placeholder="您的邮箱" class="layui-input">
                        </div>
                        <div class="layui-form-item layui-form-text">
                                <textarea placeholder="备注"  name="remarks" class="layui-textarea"></textarea>
                        </div>
                        <div class="layui-form-item">
                            <div class="beg-pull-right">
                                <button class="layui-btn layui-btn-primary" id="btn" lay-submit lay-filter="submit">
                                  	 立即试吃
                                </button><br/><br/><br/>
                            </div>
                            <div class="beg-clear"></div>
                        </div>
                    </form>
				</div>
			</div>
			
		</div>
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

	<script type="text/javascript" src="../../statics/plugins/layui/layui.js"></script>

	<script>
        $(function () {
            var users="<%=session.getAttribute("user")%>";
            if (users!='null'){
                $("#log #login").css("opacity","0");
                $("#log #login").css("display","none");
                $("#log #username").css("position","relative");
                $("#log #username").css("left","70px");
                $("#log #username").css("top","-37px");
            }
            if(users='null'){
                $("#log #login").css("position","relative");
                $("#log #login").css("left","75px");
                $("#log #login").css("top","-37px");
            }
        })
	</script>
	<script>

            layui.use(['form'], function(){
                var form = layui.form(),
                    $ = layui.jquery,
                    layer = layui.layer;


                //自定义验证规则

                form.verify({
                    pEmail: function(value){
                        var regex = /^([\w-\.]+)@([\w-\.]+)(\.[a-zA-Z0-9]+)$/;
                        if (value.length!=0&&!value.match(regex)) {
                            return  '请您输入有效的邮箱号！';
                        }
                    },pThone:function (value) {
                        var regex=/^((\+)?86|((\+)?86)?)0?1[3458]\d{9}$|^(((0\d2|0\d{2})[- ]?)?\d{8}|((0\d3|0\d{3})[- ]?)?\d{7})(-\d{3})?$/;
                        if(value.length==0){
                            return '请输入您的联系电话';
                        }else if (!value.match(regex)) {
                            return  '电话格式不正确，请您重新输入！';
                        }
                    },number: function(input) {
                        var regex = /^[0-9]*[1-9][0-9]*$/;
                        if(!input.match(regex)) {
                            return "请输入试吃人数（必须为正整数）！";
                        }
                    },corporateName:function(value){
				      if(value.length==0){
				        return '请输入公司的全称';
				      }
				    },cAddress:function(value){
				      if(value.length==0){
				        return '请输入您公司的地址';
				      }
				    },tasting:function(value){
				      if(value.length==0){
				        return '请输入品尝的地址';
				      }
				    },position:function(value){
				      if(value.length==0){
				        return '请输入您的职位';
				      }
				    },applicant:function(value){
				      if(value.length==0){
				        return '请输入您的姓名';
				      }
				    }
                });
                //监听提交
                form.on('submit(submit)', function(data){
                    /*layer.alert(JSON.stringify(data.field), {
                      title: '最终的提交信息'
                    });*/
                    var flag=-1;
                    $.post("/eat/trytoeat",data.field,function(res){
                        console.log(res);
                        if(res.success){
                            flag=1;
                            window.location.reload();
                        }else{
                            layer.alert(res.msg, {
                                title: '系统提示',
                            });
                        }
                    });
                    if(flag>0){
                        return true;
                    }else{
                        return false;
                    }
                });
            });
        </script>

	</body>
</html>
