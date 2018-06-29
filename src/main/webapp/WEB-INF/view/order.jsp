    <%@page contentType="text/html" %>
        <%@page pageEncoding="UTF-8" %>
        <!DOCTYPE html>
        <html>
        <head>
        <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
        <html xmlns="http://www.w3.org/1999/xhtml">

        <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0 ,minimum-scale=1.0, maximum-scale=1.0,
        user-scalable=no">

        <title>结算页面</title>
        <link href="statics/css/amazeui.css" rel="stylesheet" type="text/css" />
        <link href="statics/css/demo.css" rel="stylesheet" type="text/css" />
        <link href="statics/css/cartstyle.css" rel="stylesheet" type="text/css" />
        <link href="statics/css/jsstyle.css" rel="stylesheet" type="text/css" />
        <link rel="stylesheet" href="/statics/css/bootstrap.css">
        <script src="statics/js/jquery.min.js"></script>
        <script src="statics/js/vue.js"></script>
        <script src="statics/js/bootstrap.js"></script>
        </head>
        <body>
        <!--地址添加-->
        <!-- Modal -->
        <div class="modal fade" id="addressAddModel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
        <div class="modal-content">
        <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
        aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">新增地址</h4>
        </div>
        <div class="modal-body">
        <form class="form-horizontal">

        <div class="form-group">
        <label class="col-sm-2 control-label">国家</label>
        <div class="col-sm-10">
        <input type="text" name="country" class="form-control" id="country_add_input" placeholder="哪个国家">
        <span class="help-block"></span>
        </div>
        </div>
        <div class="form-group">
        <label class="col-sm-2 control-label">省份</label>
        <div class="col-sm-10">
        <input type="text" name="Province" class="form-control" id="Province_add_input" placeholder="哪个省">
        <span class="help-block"></span>
        </div>
        </div>
        <div class="form-group">
        <label class="col-sm-2 control-label">市</label>
        <div class="col-sm-10">
        <input type="text" name="city" class="form-control" id="city_add_input" placeholder="哪座城市">
        <span class="help-block"></span>
        </div>
        </div>
        <div class="form-group">
        <label class="col-sm-2 control-label">区</label>
        <div class="col-sm-10">
        <input type="text" name="county" class="form-control" id="county_add_input" placeholder="什么区">
        <span class="help-block"></span>
        </div>
        </div>
        <div class="form-group">
        <label class="col-sm-2 control-label">地址</label>
        <div class="col-sm-10">
        <input type="text" name="site" class="form-control" id="address_add_input" placeholder="地址">
        <span class="help-block"></span>
        </div>
        </div>
        <div class="form-group">
        <label class="col-sm-2 control-label">姓名</label>
        <div class="col-sm-10">
        <input type="text" name="Consignee" class="form-control" id="Consignee_add_input" placeholder="收货人名称">
        <span class="help-block"></span>
        </div>
        </div>
        <div class="form-group">
        <label class="col-sm-2 control-label">电话</label>
        <div class="col-sm-10">
        <input type="text" name="ConsigneeTel" class="form-control" id="ConsigneeTel_add_input" placeholder="收货人电话">
        <span class="help-block"></span>
        </div>
        </div>
        </form>
        </div>
        <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary" id="address_save">Save</button>
        </div>
        </div>
        </div>
        </div>

        <!--编辑-->
        <div class="modal fade" id="addressUpdateModel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
        <div class="modal-content">
        <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
        aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="updateAddress">修改地址</h4>
        </div>
        <div class="modal-body">
        <form class="form-horizontal">
        <div class="form-group">
        <input type="hidden" class="addressId_update_input">
        </div>
        <div class="form-group">
        <label class="col-sm-2 control-label">国家</label>
        <div class="col-sm-10">
        <input type="text" name="country" class="form-control" id="country_update_input" placeholder="哪个国家">
        <span class="help-block"></span>
        </div>
        </div>
        <div class="form-group">
        <label class="col-sm-2 control-label">省份</label>
        <div class="col-sm-10">
        <input type="text" name="Province" class="form-control" id="Province_update_input" placeholder="哪个省">
        <span class="help-block"></span>
        </div>
        </div>
        <div class="form-group">
        <label class="col-sm-2 control-label">市</label>
        <div class="col-sm-10">
        <input type="text" name="city" class="form-control" id="city_update_input" placeholder="哪座城市">
        <span class="help-block"></span>
        </div>
        </div>
        <div class="form-group">
        <label class="col-sm-2 control-label">区</label>
        <div class="col-sm-10">
        <input type="text" name="county" class="form-control" id="county_update_input" placeholder="什么区">
        <span class="help-block"></span>
        </div>
        </div>
        <div class="form-group">
        <label class="col-sm-2 control-label">地址</label>
        <div class="col-sm-10">
        <input type="text" name="site" class="form-control" id="address_update_input" placeholder="地址">
        <span class="help-block"></span>
        </div>
        </div>
        <div class="form-group">
        <label class="col-sm-2 control-label">姓名</label>
        <div class="col-sm-10">
        <input type="text" name="Consignee" class="form-control" id="Consignee_update_input" placeholder="收货人名称">
        <span class="help-block"></span>
        </div>
        </div>
        <div class="form-group">
        <label class="col-sm-2 control-label">电话</label>
        <div class="col-sm-10">
        <input type="text" name="ConsigneeTel" class="form-control" id="ConsigneeTel_update_input" placeholder="收货人电话">
        <span class="help-block"></span>
        </div>
        </div>
        </form>
        </div>
        <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary" id="address_update" >Update</button>
        </div>
        </div>
        </div>
        </div>
        <!--顶部导航条 -->

        <div class="am-container header">
        <ul class="message-l">
        <div class="topMessage">
        <div class="menu-hd">
        <a href="#" target="_top">登录</a>
        <a href="#" target="_top">注册</a>
        </div>
        </div>
        </ul>
        <ul class="message-r">
        <div class="topMessage home">
        <div class="menu-hd"><a href="#" target="_top" >商城首页</a></div>
        </div>
        <div class="topMessage my-shangcheng">
        <div class="menu-hd MyShangcheng"><a href="#" target="_top"><i class="am-icon-user
        am-icon-fw"></i>个人中心</a></div>
        </div>
        <div class="topMessage mini-cart">
        <div class="menu-hd"><a id="mc-menu-hd" href="#" target="_top"><i class="am-icon-shopping-cart
        am-icon-fw"></i><span>购物车</span><strong id="J_MiniCartNum" class="h">{{datas[0]}}</strong></a></div>
        </div>
        </ul>
        </div>

        <!--悬浮搜索框-->

        <div class="nav white">
        <div class="logo"><img src="statics/images/logo.png" /></div>
        <div class="logoBig">
        <li><img src="statics/images/logobig.png" /></li>
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
        <div class="concent">
        <!--地址 -->
        <div class="paycont">


        <div class="address">
        <h3>确认收货地址 </h3>
        <div class="control">
        <div >
        <button type="button" class="btn btn-danger btn-lg" id="address_add_model">
        使用新地址
        </button>
        </div>
        </div>
        <div class="clear"></div>
        <div id="lu">
        <ul>

        <ul>
        <div class="per-border"></div>
        <li class="user-addresslist" v-cloak>
        <div class="address-left" >
        <div class="user DefaultAddr">
        <span class="buy-address-detail">
        <span>用户的姓名:&nbsp &nbsp &nbsp &nbsp</span>
        <span class="buy-user">{{addresss[0].consignee}}</span><br/>
        <span>用户手机号：&nbsp &nbsp &nbsp </span>
        <span class="buy-phone">{{addresss[0].consigneeTel}}</span>
        </span>
        </div>
        <div class="default-address DefaultAddr">
        <span class="buy-line-title buy-line-title-type">收货地址：</span>
        <span class="buy--address-detail">
        <span class="province" >{{addresss[0].province}}</span>省
        <span class="city" >{{addresss[0].city}}</span>市
        <span class="dist" >{{addresss[0].county}}</span>区</br>
        <span class="street" >{{addresss[0].site}}</span>
        </span>

        </span>
        </div>
        <ins class="deftip hidden">默认地址</ins>
        </div>
        <div class="address-right">
        <span class="am-icon-angle-right am-icon-lg"></span>
        </div>
        <div class="clear"></div>

        <div class="new-addr-btn">
        <span class="new-addr-bar">|</span>
        <a href="javascript:void(o);" onclick="update_address(this);" v-bind:value="addresss[0].addressId">编辑</a>
        <span class="new-addr-bar">|</span>
        <a href="javascript:void(0);" onclick="delClick(this);" v-bind:value="addresss[0].addressId">删除</a>
        </div>
        </li>
        </ul>
        </div>
        <div class="clear"></div>
        </div>

        <!--订单 -->
        <div class="concent">
        <div id="payTable">
        <h3>确认订单信息</h3>
        <ul id="orderSerial">
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订单号：
        <span class="order_serial">{{datas[0]}}</span>
        </div>
        <div class="cart-table-th">
        <div class="wp">

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

        </div>

        </div>
        <div class="clear"></div>


        <tr class="item-list">
        <div class="bundle bundle-last" id="cartTable">

        <div class="bundle-main">
        <ul class="item-content clearfix" v-for="goods in datas" v-cloak >
        <div class="pay-phone">
        <li class="td td-item">
        <a href="#">
        <img v-bind:src="goods.gimage" height="60" width="60"></a>

        <input id="goodsid" name="token" type="hidden" v-bind:value="goods.id"/>
        <span class="sku-line">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</span>
        <span class="sku-line">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</span>
        <span class="sku-line">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</span>
        <span class="sku-line">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</span>
        <span class="sku-line">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</span>
        <a href="#" >{{goods.goodsName}}</a>
        </li>


        <li class="td td-info">
        <div class="item-props">
        <span class="sku-line"> </span>
        <span class="sku-line"> </span>
        </div>
        </li>
        <li class="td td-price">
        <div class="item-price price-promo-promo">
        <div class="price-content">
        <em class="J_Price price-now">{{goods.gprice}}</em>
        </div>
        </div>
        </li>
        </div>
        <li class="td td-amount">
        <div class="amount-wrapper ">
        <div class="item-amount ">
        <span class="phone-title">购买数量</span>
        <div class="sl">
        <em tabindex="0" class="text_box">{{goods.itemNum}}</em>
        </div>
        </div>
        </div>
        </li>

        <li class="td td-sum">
        <div class="td-inner">
        <em tabindex="0" class="J_ItemSum number">{{goods.price}}</em>
        </div>
        </li>


        </ul>
        <div class="clear"></div>

        </div>
        </div>
        </tr>
        <div class="clear"></div>
        </div>
        </div>
        <div class="clear"></div>


        <!--留言-->
        <div class="pay-total">
        <!--留言-->
        <div class="order-extra">
        <div class="order-user-info">
        <div id="holyshit257" class="memo">
        <label>买家留言：</label>
        <input type="text" title="选填,对本次交易的说明（建议填写已经和卖家达成一致的说明）" placeholder="选填,建议填写和卖家达成一致的说明" class="memo-input
        J_MakePoint c2c-text-default memo-close">
        <div class="msg hidden J-msg">
        <p class="error">最多输入500个字符</p>
        </div>
        </div>
        </div>
        </div>
        <div class="clear"></div>
        </div>


        <div id="vue1">
        <!--含运费小计 -->
        <div class="buy-point-discharge " >

        <p class="price g_price " >
        合计（含运费10元） <span>¥</span><em class="pay-sum" >{{datas[0].sprice+10}}</em>
        </p>
        </div>

        <!--信息 -->
        <div class="order-go clearfix">
        <div class="pay-confirm clearfix">
        <div class="box">
        <div tabindex="0" id="holyshit267" class="realPay"><em class="t">实付款：</em>
        <span class="price g_price ">
        <span>¥</span> <em class="style-large-bold-red " id="J_ActualFee">{{datas[0].sprice+10}}</em>
        </span>
        </div>

        <div id="holyshit268" class="pay-address">

        <p class="buy-footer-address">
        <span class="buy-line-title buy-line-title-type">寄送至：</span>
        <span class="buy--address-detail">
        <span class="province1"></span>省
        <span class="city1"></span>市
        <span class="dist1"></span>区
        <span class="street1"></span>
        </span>
        </span>
        </p>
        <p class="buy-footer-address">
        <span class="buy-line-title">收货人：</span>
        <span class="buy-address-detail">
        <span class="buy-user1"> </span>
        <span class="buy-phone1"></span>
        </span>
        </p>
        </div>
        </div>

        <div id="holyshit269" class="submitOrder">
        <div class="go-btn-wrap">
        <a id="J_Go" class="btn-go" tabindex="0" title="点击此按钮，提交订单" onclick="order();" >提交订单</a>
        </div>
        </div>
        <div class="clear"></div>
        </div>
        </div>
        </div>
        </div>

        <div class="clear"></div>
        </div>
        </div>
        <div class="footer">
        <div class="footer-hd">
        <p>
        <a href="#">思语缘贸易</a>
        <b>|</b>
        <a href="#">商城首页</a>
        <b>|</b>
        <a href="#">支付宝</a>
        <b>|</b>
        <a href="#">物流</a>
        </p>
        </div>
        <div class="footer-bd">
        <p>
        <a href="#">关于思语缘</a>
        <a href="#">合作伙伴</a>
        <a href="#">联系我们</a>
        <a href="#">网站地图</a>
        <em>© 2015-2025 www.betteryanwo.com 版权所有 </em>
        </p>
        </div>
        </div>

        <div class="clear"></div>


        </body>

        </html>

        <script type="text/javascript">


        //商品的信息
        var vum=new Vue({
        el: "#cartTable",
        data: {
        datas: []

        },
        mounted:function(){
        this.showData();
        //需要执行的方法可以在mounted中进行触发，其获取的数据可以赋到data中后，可以放在前面进行渲染
        },
        methods: {
        showData: function () {
        $.ajax({
        type: 'Get',
        url: "http://localhost:9000/cart/getCart",
        datatype: "json",
        success: function (result) {
        if(result.success){
        for (var i = 0; i < result.data.length; i++) {
        vum.datas.push(result.data[i]);
        }
        }else{
            window.location.href="http://localhost:9000/error";
        }
        }
        })
        }
        }
        })


        //地址
        var address=new Vue({
        el: "#lu",
        data: {
        addresss: []

        },
        mounted:function(){
        this.showData();
        //需要执行的方法可以在mounted中进行触发，其获取的数据可以赋到data中后，可以放在前面进行渲染
        },
        methods: {
        showData: function () {
        $.ajax({
        type: 'Get',
        url: "http://localhost:9000/address/getAddress",
        datatype: "json",
        success: function (result) {
        address.addresss.push(result.data);
        }
        })
        }
        }
        })

        //订单号
        var orderSerial=new Vue({
        el: "#orderSerial",
        data: {
        datas: []

        },
        mounted:function(){
        this.showData();
        //需要执行的方法可以在mounted中进行触发，其获取的数据可以赋到data中后，可以放在前面进行渲染
        },
        methods: {
        showData: function () {
        $.ajax({
        type: 'Get',
        url: "http://localhost:9000/order/getOrderSerial",
        datatype: "json",
        success: function (result) {
        orderSerial.datas.push(result.data);
        }
        })
        }
        }
        })

        $(function(){
        $.ajax({
        url:"http://localhost:9000/address/getAddress",
        type:"get",
        success:function(result){
        //console.log(result);
        //1:显示购物车的数据
        if(result.success){
        //1:显示购物车的数据
        build_address_table(result);
        }else if(result.data==2){
        window.location.href="http://localhost:9000/error";
        }else if(result.data==1){
        window.location.href="http://localhost:9000/user/toLogin";
        }
        }
        });
        });
        //显示购物车数据的方法
        function build_address_table(result) {
        var addressItem = result.data;
        var cart=$(".cart_sum").append(addressItem.cid);//购物车的数量
        var province=$(".province1").append(addressItem.province);//省份province
        var city=$(".city1").append(addressItem.city);//市city
        var dist=$(".dist1").append(addressItem.county);//区county dist
        var street=$(".street1").append(addressItem.site);//地址site street
        var user=$(".buy-user1").append(addressItem.consignee);//收货人 buy-user consignee
        var pphone=$(".buy-phone1").append(addressItem.consigneeTel);//收货人电话 buy-phone consigneeTel
        }

        //合计
        var total=new Vue({
        el: "#vue1",
        data: {
        datas: []
        },
        mounted:function(){
        this.showData();
        //需要执行的方法可以在mounted中进行触发，其获取的数据可以赋到data中后，可以放在前面进行渲染
        },
        methods: {
        showData: function () {
        $.ajax({
        type: 'Get',
        url: "http://localhost:9000/cart/getCart",
        datatype: "json",
        success: function (result) {
        for (var i = 0; i < result.data.length; i++) {
        total.datas.push(result.data[i]);
        }

        }
        })
        }
        }
        })
        //购物车数量
        var cart=new Vue({
        el: ".mini-cart",
        data: {
        datas: []
        },
        mounted:function(){
        this.showData();
        //需要执行的方法可以在mounted中进行触发，其获取的数据可以赋到data中后，可以放在前面进行渲染
        },
        methods: {
        showData: function () {
        $.ajax({
        type: 'Get',
        url: "http://localhost:9000/cart/getCart",
        datatype: "json",
        success: function (result) {
        cart.datas.push(result.data.length);
        }
        })
        }
        }
        })

        //点击添加地址按钮，出现模态框
        $("#address_add_model").click(function(){
        //弹出模态框
        $('#addressAddModel').modal({
        backdrop:"static"
        });
        })
        //点击保存按钮，保存地址
        $("#address_save").click(function () {
        $.ajax({
        url:"http://localhost:9000/address/saveAddress",
        type:"POST",
        data:$("#addressAddModel form").serialize(),

        success:function(result){
        if(result.success==true){
        $('#addressAddModel').modal('hide');
        }
        if(result.success==false){
        alert(result.msg);
        }
        location.reload();
        }
        })
        })

        //地址删除
        function delClick(obj){
        var thisObj=$(obj);//js转jQuery
        var addressId=thisObj.attr("value");
        $.ajax({
        url:"http://localhost:9000/address/delAddress/"+addressId,
        type:"DELETE",
        success:function(result){
        if(result.success==true){
        alert("删除成功");
        }
        },
        error:function(result){
        alert(result.msg);
        }
        })
        location.reload();
        }

        //修改地址
        function update_address(obj){
        var thisObj=$(obj);//js转jQuery
        var addressId=thisObj.attr("value");

        //查出地址的信息
        getAddress(addressId);
        //弹出模态框
        $('#addressUpdateModel').modal({
        backdrop:"static"
        })
        }

        function getAddress(addressId) {
        $.ajax({
        url:"http://localhost:9000/address/selectAddress/"+addressId,
        type:"GET",
        success:function(result){
        alert(result.data);
        $("#country_update_input").val(result.data.country);
        $("#Province_update_input").val(result.data.province);
        $("#city_update_input").val(result.data.city);
        $("#county_update_input").val(result.data.county);
        $("#address_update_input").val(result.data.site);
        $("#Consignee_update_input").val(result.data.consignee);
        $("#ConsigneeTel_update_input").val(result.data.consigneeTel);
        $(".addressId_update_input").attr("edit-id",result.data.addressId);
        }
        })
        }

        $("#address_update").click(function(){
        var addressId=$(".addressId_update_input").attr("edit-id");
        $.ajax({
        url:"http://localhost:9000/address/updateAddress/"+addressId,
        type:"PUT",
        data:$("#addressUpdateModel form").serialize(),
        success:function(result){
        alert(result.msg);
        //1、关闭对话框
        $("#addressUpdateModel").modal("hide");
        }
        })
        location.reload();
        })


        //点击提交订单
        function order() {

        var orderSerial=$(".order_serial").text();
        $.ajax({
        url:"http://localhost:9000/order/confirm/",
        type:"GET",
        data:{isInvoice:0,orderSerial:orderSerial},
        success:function(result){

        }
        })
        window.location.href = "http://localhost:9000/pay";
        }
        </script>