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

</head>
<body>


<div id="page">
	<nav class="fh5co-nav" role="navigation">
	<div class="container">
	<!-- 标题 -->
	<div class="page-header">
	<h1>
	我的购物车 <small>shopping</small>
	</h1>
	</div>
	<a class="btn btn-default"
	href="#" role="button">返回购物页面</a>
	<div class="col-md-offset-11">
	<button class="btn btn-danger null_cart" ng-show="data.length"
	ng-click="data={}">清空购物车</button>
	</div>

	<!-- 显示购物车商品信息 -->
	<!--bootstarp 是分为行和列。row代表行-->
	<div class="row">
	<div class="col-md-12">
	<table class="table table-hover" id="cart_table">
	<thead>
	<th>
	<input type="checkbox" id="check_all"/>全选
	</th>
	<th>商品信息</th>
	<th>单价</th>
	<th>数量</th>
	<th>合计</th>
	<th>操作</th>
	</tr>
	</thead>
	<tbody>

	</tbody>


	</table>
	</div>
	</div>

	<div class="row">
	<div class="col-md-4 col-md-offset-8" id="sum_goods"></div>
	<div class="col-md-4 col-md-offset-8" id="sum_price"></div>
	</div>
	<!--去结算按钮-->
	<div class="row">
	<div class="col-md-4 col-md-offset-9">
	<button class="btn btn-danger" id="toSettlement">去结算</button>
	</div>
	</div>
	</div>
	</nav>
	<!-- jQuery -->
	<script src="/statics/js/jquery.min.js"></script>
	</body>
	</html>

<script type="text/javascript">

	$(function(){
		//当前页
		to_cart();
	});

	function to_cart(){
		$.ajax({
			url:"http://localhost:9000/cart/getCart",
			data:"userId=2",
			type:"get",
			success:function(result){
				//console.log(result);
				//1:显示购物车的数据
			 build_cart_table(result);
				//2:显示多少商品，合计多少
			 build_cart_count(result);
		}
		});
	}
	//显示购物车数据的方法
	function build_cart_table(result){
		var cartItems=result.data;
	$.each(cartItems,function(index,item){
		//$("#cart_table tbody").empty();
		var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>");
			var goodsName=$("<td></td>").append(item.goodsName);
			var gprice=$("<td></td>").append("￥").append(item.gprice);
			var number=$("<td></td>").append(item.itemNum);
			var sum=$("<td></td>").append("￥").append(item.price);
			var delBtn = $("<button></button>").addClass("btn btn-primary btn-sm delete_btn")
			.append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("删除");
			//为删除按钮添加一个自定义的属性来表示当前删除的员工id
            delBtn.attr("del-id",item.id);

            $("<tr></tr>").append(checkBoxTd)
						.append(goodsName)
						.append(gprice)
						.append(number)
						.append(sum)
						.append(delBtn)
						.appendTo("#cart_table tbody");

		});
	}
	function build_cart_count(result){
		$("#sum_goods").empty();
		$("#sum_price").empty();
		$("#sum_goods").append("共  "+" "+result.data[0].snum +"  件商品");
		$("#sum_price").append("总价格￥："+result.data[0].sprice);
	}

    //给删除按钮绑定单击事件
    $(document).on("click",".delete_btn",function(){
    //1、弹出是否确认删除对话框
    //alert($(this).parents("tr").find("td:eq(1)").text());
    var goodsName=$(this).parents("tr").find("td:eq(1)").text();
    var itemId = $(this).attr("del-id");
    if(confirm("确认删除【"+goodsName+"】吗？")){
    //确认，发送ajax请求删除即可
        $.ajax({
        url:"http://localhost:9000/cart/deleteCartItem/"+itemId,
        type:"DELETE",
        success:function(result){
        	alert(result.data);

        	}
        });
    }
    });

	//点击清空购物车
	$(document).on("click",".null_cart",function(){

	var cartId = 3;
	alert(cartId);
	if(confirm("确认清空购物车吗？")){
	//确认，发送ajax请求删除即可
	$.ajax({
	url:"http://localhost:9000/cart/deleteShopCart/"+cartId,
	type:"DELETE",
	success:function(result){
	alert(result.data);

	}
	});
	}
	});
</script>
