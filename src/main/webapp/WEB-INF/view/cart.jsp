<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
        <%@    taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
        <!-- Bootstrap -->
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
        <div class="menu-hd MyShangcheng"><a href="#" target="_top"><i class="am-icon-user
        am-icon-fw"></i>个人中心</a></div>
        </div>
        <div class="topMessage mini-cart">
        <div class="menu-hd"><a id="mc-menu-hd" href="#" target="_top"><i class="am-icon-shopping-cart
        am-icon-fw"></i><span>购物车</span><strong id="J_MiniCartNum" class="h">0</strong></a></div>
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

        <div id="page">
        <nav class="fh5co-nav" role="navigation">
        <div class="container">
        <!-- 标题 -->
        <div class="page-header">
        <h1>
        我的购物车 <small>shopping</small>
        </h1>
        </div>

        <!-- 显示购物车商品信息 -->
        <!--bootstarp 是分为行和列。row代表行-->
        <div class="row">
        <div class="col-md-12">
        <table class="table table-hover" id="cart_table">
        <thead>
        <th>

        </th>
        <th style="display:none;">商品ID</th>
        <th> </th>
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


        <!--去结算按钮-->
        <div class="float-bar-wrapper">
        <div id="J_SelectAll2" class="select-all J_SelectAll">
        <div class="cart-checkbox">
        <input class="check-all check" id="check_all" name="select-all" value="true" type="checkbox">
        <label for="J_SelectAllCbx2"></label>
        </div>
        <span>全选</span>
        </div>
        <div class="operations">
        <button class="btn btn-default" id="cart_delete_all_btn">删除选中的商品</button>
        </div>


        <div class="float-bar-right">
        <div class="amount-sum">
        <span class="txt">已选商品</span>
        <em id="J_SelectedItemsCount" class="allnum">0</em><span class="txt">件</span>
        <div class="arrow-box">
        <span class="selected-items-arrow"></span>
        <span class="arrow"></span>
        </div>
        </div>
        <div class="price-sum">
        <span class="txt">合计:</span>
        <strong class="price">¥<em id="J_Total" class="allprice">0.00</em></strong>
        </div>
        <div class="btn-area">
        <a id="J_Go" class="submit-btn submit-btn-disabled" aria-label="请注意如果没有选择宝贝，将无法结算">
        <span>结&nbsp;算</span></a>
        </div>
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
        $.ajax({
        url:"http://localhost:9000/cart/getCart",
        data:"userId=2",
        type:"get",
        success:function(result){
        //console.log(result);
        //1:显示购物车的数据
        build_cart_table(result);

        }
        });
        });
        //显示购物车数据的方法
        function build_cart_table(result){
        var cartItems=result.data;
        $.each(cartItems,function(index,item){
        var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>");
        var goodsId=$("<td></td>")
        .append(item.goodsId).hide();
        var img=$("<td></td>").append($("<a></a>").
        append($("<img height='50' width='50'></img>").addClass("p-img").attr("src",item.gimage)));
        var goodsName=$("<td></td>").append(item.goodsName);
        var gprice=$("<td></td>").append("￥").append(item.gprice);
        var number=$("<td></td>").addClass("quantity-btn")
                .append($("<button></button>")
                .addClass("btn btn-default btn-sm minus")
                .attr("id","minus").attr("cartItemId",item.id).append("-"))
                .append(" ")
                .append($("<input style='width:45px;height:28px'/>")
                .addClass("form-control-static quantity-display")
                .val(item.itemNum))
                .append(" ")
                .append($("<button></button>")
                .addClass("btn btn-default btn-sm plus")
                .attr("id","plus").attr("cartItemId",item.id).append("+"));
        var sum=$("<td></td>").addClass("goods_price").append("￥").append(item.price);
        var delBtn = $("<button></button>").addClass("btn btn-primary btn-sm delete_btn")
        .append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("删除");
        //为删除按钮添加一个自定义的属性来表示当前删除的员工id
        delBtn.attr("del-id",item.id);

                $("<tr></tr>").attr("id",item.goodsId)
                .append(checkBoxTd)
                .append(goodsId)
                .append(img)
                .append(goodsName)
                .append(gprice)
                .append(number)
                .append(sum)
                .append(delBtn)
                .appendTo("#cart_table tbody");

        $(".check_item").prop("checked",true);
        $("#check_all").prop("checked",true);
        var J_SelectedItemsCount=document.getElementById('J_SelectedItemsCount');
        J_SelectedItemsCount.innerHTML=item.snum;
        var J_Total=document.getElementById('J_Total');
        J_Total.innerHTML=item.sprice;
            var J_MiniCartNum=document.getElementById('J_MiniCartNum');
            J_MiniCartNum.innerHTML=$(".check_item:checked").length;
        });
        }


        //给删除按钮绑定单击事件
        $(document).on("click",".delete_btn",function(){
        //1、弹出是否确认删除对话框
        //alert($(this).parents("tr").find("td:eq(1)").text());
        var goodsName=$(this).parents("tr").find("td:eq(3)").text();
        var itemId = $(this).attr("del-id");
        if(confirm("确认删除【"+goodsName+"】吗？")){
        //确认，发送ajax请求删除即可
        $.ajax({
        url:"http://localhost:9000/cart/deleteCart/"+itemId,
        type:"DELETE",
        success:function(result){
                alert(result.data);
                $("#"+itemId).remove();
        }
        });
        }
        });

        //全选，全不选
        $("#check_all").click(function(){
        //当前的元素的checked属性。选中为true。attr获取的是自定义的属性的值。
        //alert($(this).prop("checked"));
        //每个选择都有一个类 check_item。让它的属性值和第一个的一样。
        $(".check_item").prop("checked",$(this).prop("checked"));
        });

        //当底下的全部选中的时候，第一个也选中。
        $(document).on("click",".check_item",function(){
        //判断当前选择中的元素是否全选
        //$(".check_item:checked") 匹配所有选中的被选中元素
        var flag = $(".check_item:checked").length==$(".check_item").length;
        $("#check_all").prop("checked",flag);
        });

        //点击删除选中的商品按钮
        $("#cart_delete_all_btn").click(function(){
        var goodsNames = "";
        var ids = "";

        $.each($(".check_item:checked"),function(){
        //this
        goodsNames += $(this).parents("tr").find("td:eq(3)").text()+",";
        //组装员工id字符串
        ids += $(this).parents("tr").find("td:eq(1)").text()+"-";
        });
        //去除goodsNames多余的,
        goodsNames = goodsNames.substring(0, goodsNames.length-1);
        //去除删除的id多余的-
        ids = ids.substring(0, ids.length-1);

        if(confirm("确认删除【"+goodsNames+"】吗？")){
        $.ajax({
        url:"http://localhost:9000/cart/deleteCart/"+ids,
        type:"DELETE",
        success:function(result){
        alert(result.data);
            location.reload();
        }
        });
        }
        });

        //数量的减少
        $("body").on("click","#minus",function () {
        $(this).parents("tr").find(".check_item").prop("checked",true);
        //$(".check_item").prop("checked",true);
        //获取到值
        var cartNum =$(this).siblings(".quantity-display").val();
        newCartNum = parseInt(cartNum);
        newCartNum--;
        if(newCartNum<0){
        newCartNum=0;
        }
        $(this).siblings(".quantity-display").val(newCartNum);
        //修改相应的价格。
        var price=$(this).parents("tr").find("td:eq(4)").text().substring(1);
        //alert(price);
        var a=price*newCartNum;
        $(this).parents("tr").find("td:eq(6)").empty().append("￥").append(a);
        setTotal();
        });

        //数量的增加
        $("body").on("click","#plus",function () {
        $(this).parents("tr").find(".check_item").prop("checked",true);
        //获取到值
        //var cartNum = $(this).parents("tr").find("td:eq(4)").find("input").val();
        var cartNum =$(this).siblings(".quantity-display").val();
        newCartNum = parseInt(cartNum);
        newCartNum++;
        $(this).siblings(".quantity-display").val(newCartNum);
        //修改相应的价格。
        var price=$(this).parents("tr").find("td:eq(4)").text().substring(1);
        //alert(price);
        var a=price*newCartNum;
        $(this).parents("tr").find("td:eq(6)").empty().append("￥").append(a);
        setTotal();
        });

        $(".quantity-display").blur(function(){
        var z = $(this).val();
        if(z < 0){
        z = 0;
        }
        $(this).val(z);
        });

        //点击勾选按钮，底下商品数量和价格进行统计。
        $(document).on("click",".check_item",function(){
            if($(".check_item").is(":checked") || $(".check_all").is(":checked")){
                    var J_MiniCartNum=document.getElementById('J_MiniCartNum');
                    J_MiniCartNum.innerHTML=$(".check_item:checked").length;
            }else{
                    var J_MiniCartNum=document.getElementById('J_MiniCartNum');
                    J_MiniCartNum.innerHTML=0;
            }
            setTotal();
        });

        $(document).on("click","#check_all",function(){
                if($(".check_item").is(":checked") || $(".check_all").is(":checked")){
                var J_MiniCartNum=document.getElementById('J_MiniCartNum');
                J_MiniCartNum.innerHTML=$(".check_item:checked").length;
                }else{
                var J_MiniCartNum=document.getElementById('J_MiniCartNum');
                J_MiniCartNum.innerHTML=0;
                }
                setTotal();
        });

        var table = document.getElementById('cart_table'); // 购物车表格
        var tr = table.children[1].rows; //行

            function setTotal() {
                    var selected = 0, price = 0;

                    //商品合计
                    var J_SelectedItemsCount=document.getElementById('J_SelectedItemsCount');
                    //总价格合计
                    var J_Total=document.getElementById('J_Total');
                    for (var i = 0; i < tr.length; i++) {
                            if(tr[i].getElementsByTagName('input')[0].checked){
                                selected += parseInt(tr[i].getElementsByTagName('input')[1].value); //计算已选商品数目
                                price += parseFloat(tr[i].getElementsByTagName('td')[6].innerHTML.substring(1)); //计算总计价格
                            }

                    }

                    J_SelectedItemsCount.innerHTML=selected;
                    J_Total.innerHTML=price;

            }


            //点击结算
            $(document).on("click","#J_Go",function(){
                window.location.replace("http://localhost:9000/order");

            });

        </script>
