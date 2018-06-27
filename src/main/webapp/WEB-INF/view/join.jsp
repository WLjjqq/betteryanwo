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


	<!-- Modernizr JS -->
	<script src="../../statics/myjs/modernizr-2.6.2.min.js"></script>
	<!-- FOR IE9 below -->
	<!--[if lt IE 9]>
	<script src="../../statics/myjs/respond.min.js"></script>
	<![endif]-->
	<style>

		#fh5co-header{
			margin-top: -18px;
		}
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

	<header id="fh5co-header" class="fh5co-cover fh5co-cover-sm" role="banner" style="background-image:url(/statics/images/106.jpg);">
		<div class="overlay"></div>
		<div class="container">
			<div class="row">
				<div class="col-md-8 col-md-offset-2 text-center">
					<div class="display-t">
						<div class="display-tc animate-box" data-animate-effect="fadeIn">
							<h1>加入我们</h1>
							<font id="font">Join Us</font>
							<br/>				
							<h2 style="font-family: '微软雅黑';font-size: 31px;">高峰只对攀登它而不是仰望它的人来说才有真正的好处</h2>
							<h2 style="font-family: '微软雅黑';font-size: 25px;">简历投递地址：Ha_siyuyuan@163.com</h2>
						</div>
					</div>
				</div>
			</div>
		</div>
	</header>
	
	<div id="fh5co-contact" style="height: 1200px;">
		<div class="banner joinus">
			<div class="banner_inner">
				<div class="zp">
					<table  cellspacing="0" cellpadding="0" class="left">
						<tr>
							<th>全部岗位</th>
						</tr>
						<tr>
							<td class="active">市场部</td>
						</tr>
						<tr>
							<td>企划部</td>
						</tr>
						
					</table>
					<div class="right chanpin">
						<li class="one">
							<span class="a" style="color: #fff;">岗位</span><span class="b" style="color: #fff;">职位</span><span class="c" style="color: #fff;">查看</span>
						</li>
						<li>
							<span class="a left">销售代表</span><span class="b">职员</span><span class="c"><img src="/statics/images/arrow_bot.png"/></span>
							<div>
								<h3>岗位职责：</h3>
				                <p>1、根据公司提供的精准客户资源与客户进行沟通，开发新客户；</p>
				                <p>2、通过电话、互联网等方式与客户进行有效沟通，邀约客户；</p>
				                <p>3、了解客户需求, 拜访客户，寻找销售机会并完成销售业绩；</p>
				                <p>4、定期与老客户进行沟通，建立良好的长期合作关系，挖掘潜在需求；</p>
				                <h3>任职要求：</h3>
				                <p>1、有强烈的挣钱欲望，吃苦耐劳；</p>
				                <p>2、年龄在18-30之间，热爱销售工作；>
								<p>3、大专及以上学历，（如有销售经验可放宽学历要求，优先录用！）；</p>
								<p>4、语言表达能力强，口齿清晰、思维敏捷；</p>
							</div>
						</li>
						
						<li>
							<span class="a left">网络推广/运营</span><span class="b">职员</span><span class="c"><img src="/statics/images/arrow_bot.png"/></span>
							<div>
								 <h3>岗位职责：</h3>
				                <p>1、了解网站推广工作的各项要求，能够协助策划实施网站推广方案</p>
				                <p>2、通过有效手段利用互联网资源提高网站访问量，多注册发布传播信息推广公司网络</p>
				                <p>3、负责收集反馈数据，并完成产品推广的效果评估，提出改进方案</p>
				                <p>4、对公司官网进行维护管理</p>
				                <p>5、完成上级领导交办的其他工作</p>
				                <h3>任职要求：</h3>
				                <p>1、大专及以上学历，市场营销、广告设计、电子商务、计算机专业优先</p>
				                <p>2、熟悉网络操作流程，了解网络推广路径</p>
				                <p>3、熟练操作计算机</p>
								<p>4、知道百度等搜索引擎排名、微信、微博等推广方式</p>
								<p>5、有地图相关项目开发经验者优先；</p>
								<p>6、在校大学生，图形学成绩优秀者亦可。</p>
							</div>
						</li>
					</div>
					<div class="right shuju">
						<li class="one">
							<span class="a" style="color: #fff;">岗位</span><span class="b" style="color: #fff;">职位</span><span class="c" style="color: #fff;">查看</span>
						</li>
						<li>
							<span class="a left">文案</span><span class="b">职员</span><span class="c"><img src="/statics/images/arrow_bot.png"/></span>
							<div id="yaoqiu">
				                <h3>岗位职责：</h3>
				                <p>1、参与运营部各类线上活动、营销专题的策划、组织 、执行、跟踪、总结；</p>
				                <p>2、根据公司业务需要制作各种宣传文案，塑造良好企业形象；</p>
				                <p>3、负责公司产品文案介绍及各类活动的软文撰写；</p>
								<p>4、熟悉网络热点传播规律，具有创意策划的能力，以创新的视角提炼挖掘产品卖点及亮点；</p>
								<p>5、熟悉网络营销的方法和流程，能独立策划并制定网络营销方案及产品推广方案；</p>
				                <h3>任职要求：</h3>
				                <p>1、大学大专以上学历；</p>
				                <p>2、具有较强的文案写作能力，出色的文字组织能力，写作经验丰富，有丰富的提案经验；</p>
				                <p>3、熟悉市场推广、品牌策划、活动策划的整个流程；</p>
								<p>4、创意能力强、思维敏捷、善于沟通、具有良好的语言表达能力。</p>
				            </div>
						</li>
					</div>
					
				</div>
				<div class="fuli">
					<h1>公司福利</h1>
					<ul>

						<li>
							<div><img src="/statics/images/fenhong.png"/></div>
							<p>年终分红</p>
						</li>
						<li>
							<div><img src="/statics/images/wuxian.png"/></div>
							<p>五险一金</p>
						</li>
						<li>
							<div><img src="/statics/images/shuangxin.png"/></div>
							<p>年终双薪</p>
						</li>
						<li>
							<div><img src="/statics/images/travel.png"/></div>
							<p>员工旅游</p>
						</li>
						<li>
							<div><img src="/statics/images/nianjia.png"/></div>
							<p>带薪年假</p>
						</li>
						<li>
							<div><img src="/statics/images/tijian.png"/></div>
							<p>定期体检</p>
						</li>
						<li>
							<div><img src="/statics/images/jieri.png"/></div>
							<p>节日福利</p>
						</li>
						<li>
							<div><img src="/statics/images/jianshen.png"/></div>
							<p>员工健身</p>
						</li>
						<li>
							<div><img src="/statics/images/shengri.png"/></div>
							<p>生日礼品</p>
						</li>
						<li>
							<div><img src="/statics/images/jiaban.png"/></div>
							<p>加班补助</p>
						</li>
					</ul>
				</div>
			</div>
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
					<p style="margin-top: -17px;"> 
						联系方式：400-885-8630 
					</p >
					<p style="margin-top: -17px;">地址：河南省郑州市金水区紫荆山路与城北路交叉口阳光铭座A座1801室</p>
				</div>
			</div>

		</div>
	</footer>
	</div>


	
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

           


<script src="../../statics/myjs/layer.js" type="text/javascript" charset="utf-8"></script>




<script type="text/javascript">
	jQuery('.right>li').click(function(){
		var _this = $(this);
		jQuery(this).find('div').slideToggle(300,function(){
			if($(this).is(":visible")){
	            _this.find('span').eq(2).find('img').attr('src','/statics/images/arrow_top.png');
	        }else{
	             _this.find('span').eq(2).find('img').attr('src','/statics/images/arrow_bot.png');
	        }
		});
	});
	jQuery('.left td').click(function(){
		jQuery('.left td').removeClass('active');
		jQuery(this).addClass('active');
		if(jQuery(this).text() == '市场部'){
			jQuery('.chanpin').show();
			jQuery('.shuju').hide();
		}
		if(jQuery(this).text() == '企划部'){
			jQuery('.chanpin').hide();
			jQuery('.shuju').show();
		}
	});
</script>


	</body>
</html>

