<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
	response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
	response.setHeader("Expires", "0");
	response.setHeader("Pragma","no-cache");
%>
<!DOCTYPE HTML>
	<html>
	<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>购物车</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<meta name="author" content="" />

	<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Playfair+Display:400,400i" rel="stylesheet">

	<!-- Bootstrap  -->
	<link rel="stylesheet" href="/statics/css/bootstrap.css">

	<link href="/statics/css/amazeui.css" rel="stylesheet" type="text/css" />
	<link href="/statics/css/demo.css" rel="stylesheet" type="text/css" />
	<link href="/statics/css/cartstyle.css" rel="stylesheet" type="text/css" />
	<link href="/statics/css/optstyle.css" rel="stylesheet" type="text/css" />
	<script src="/statics/js/jquery.min.js"></script>
	</head>

	<body>
	<!--顶部导航条 -->
	<div class="am-container header">
	<ul class="message-l">
	<div class="topMessage">
	<div class="menu-hd">
	<a href="#" target="_top" class="h">亲，请登录</a>
	<a href="#" target="_top">免费注册</a>
	</div>
	</div>
	</ul>
	<ul class="message-r">
		<div class="topMessage home">
		<div class="menu-hd"><a href="#" target="_top" class="h">商城首页</a></div>
		</div>
		<div class="topMessage my-shangcheng">
		<div class="menu-hd MyShangcheng"><a href="#" target="_top"><i class="am-icon-user am-icon-fw"></i>个人中心</a></div>
		</div>
		<div class="topMessage mini-cart">
		<div class="menu-hd"><a id="mc-menu-hd" href="#" target="_top"><i class="am-icon-shopping-cart  am-icon-fw"></i><span>购物车</span><strong id="J_MiniCartNum" class="h">0</strong></a></div>
		</div>
		<div class="topMessage favorite">
	</ul>
	</div>

	<!--悬浮搜索框-->

	<div class="nav white">
	<div class="logo"><img src="/statics/images/logo.png" /></div>
	<div class="logoBig">
	<li><img src="/statics/images/logobig.png" /></li>
	</div>

	<div class="search-bar pr">
	<a name="index_none_header_sysc" href="#"></a>
	<form>
	<input id="searchInput" name="index_none_header_sysc" type="text" placeholder="搜索" autocomplete="off">
	<input id="ai-topsearch" class="submit am-btn" value="搜索" index="1" type="submit">
	</form>
	</div>
	</div>

	<div class="clear"></div>

	<!--购物车 -->
	<div class="concent">
	<div id="cartTable">
	<div class="cart-table-th">
	<div class="wp">
	<div class="th th-chk">
	<div id="J_SelectAll1" class="select-all J_SelectAll">

	</div>
	</div>
	<div class="th th-item">
	<div class="td-inner">商品信息</div>
	</div>
	<div class="th th-price">
	<div class="td-inner">单价</div>
	</div>
	<div class="th th-amount">
	<div class="td-inner">数量</div>
	</div>
	<div class="th th-sum">
	<div class="td-inner">金额</div>
	</div>
	<div class="th th-op">
	<div class="td-inner">操作</div>
	</div>
	</div>
	</div>
	<div class="clear"></div>

	<tr class="item-list">
	<div class="bundle  bundle-last" id="head11" >
	<div class="bundle-main" id="cartTable">
	<!-- 商品列表 -->
	<ul class="item-content clearfix"  v-for="todo in todos" v-cloak>
		<li class="td td-chk">
			<div class="cart-checkbox ">
				<input class="check" id="J_CheckBox_170037950254" name="items[]" value="170037950254" type="checkbox">
				<label for="J_CheckBox_170037950254"></label>
			</div>
		</li>
		<li class="td td-item">
			<div class="item-pic">
	<a href="#" target="_blank" data-title="美康粉黛醉美东方唇膏口红正品 持久保湿滋润防水不掉色护唇彩妆" class="J_MakePoint" data-point="tbcart.8.12">
	<img v-bind:src="'http://localhost/ShopMall/'+todo.picture" class="itempic J_ItemImg"></a>
	</div>
	<div class="item-info">
	<div class="item-basic-info">
	<a href="#" target="_blank" title="美康粉黛醉美唇膏 持久保湿滋润防水不掉色" class="item-title J_MakePoint" data-point="tbcart.8.11"></a>
	</div>
	</div>
	</li>
	<li class="td td-info">
	<div class="item-props item-props-can">
	<span class="sku-line"> </span>
	<span class="sku-line"> </span>
	<span tabindex="0" class="btn-edit-sku theme-login">修改</span>
	<i class="theme-login am-icon-sort-desc"></i>
	</div>
	</li>
	<li class="td td-price">
	<div class="item-price price-promo-promo">
	<div class="price-content">
	<div class="price-line">
	<em class="price-original">{{todo.price}}</em>
	</div>
	<div class="price-line">
	<em class="J_Price price-now" tabindex="0">{{todo.promotion_price}}</em>
	</div>
	</div>
	</div>
	</li>
	<li class="td td-amount">
	<div class="amount-wrapper ">
	<div class="item-amount ">
	<div class="sl">
		<input class="min am-btn" name="" type="button" value="-" />
		<input class="text_box" name="" type="text" v-bind:value="todo.number" style="width:30px;" />
		<input class="add am-btn" name="" type="button" value="+" />
	</div>
	</div>
	</div>
	</li>
	<li class="td td-sum">
	<div class="td-inner">
	<em tabindex="0" class="J_ItemSum number">{{todo.promotion_price*todo.number}}</em>
	</div>
	</li>
		<li class="td td-op">
			<div class="td-inner">
				<a href="javascript:;" data-point-url="#" class="delete">删除</a>
			</div>
		</li>
	</ul>
	</div>
	</div>
	</tr>
	</div>


	</body>
