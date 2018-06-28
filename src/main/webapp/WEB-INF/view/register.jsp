<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>注册</title>
		<link rel="stylesheet" href="../../statics/css/layui.css" media="all" />
		<link rel="stylesheet" href="../../statics/css/register.css" />
		<style>
			.cell-7{
				float: left;
				margin-bottom: 15px;
				margin-right: 5px;
			}
			.cell-7 input{
				width:110px;
				height: 40px;
				float: left;
				padding-left: 7px;

			}
			.cell-5{
				float: left;
				margin-bottom: 15px;
			}
		</style>

    </head>
	<body id="all" class="beg-login-bg" >
	<div class="beg-login-box">
		<div id="beg-login-box-one">
			<img src="/statics/images/15.png" />
			<div id="one-font">岛 尚 林 语</div>


		</div>
		<div class="beg-login-main">
			<form id="tab" action="/user/Login" class="layui-form" method="post">
					<!--用户名-->
					<div class="layui-form-item" >
						<label class="beg-login-icon">
                        <i id="icon-users">&nbsp;&nbsp;&nbsp;&nbsp;</i>
                    </label>
						<input type="text" name="userName"  lay-verify="userName" autocomplete="off" placeholder="请输入用户名" class="layui-input">
					</div>
					<!--真实姓名-->
					<div class="layui-form-item">
						<label class="beg-login-icon">
                        <i id="icon-realuser">&nbsp;&nbsp;&nbsp;&nbsp;</i>
                    </label>
						<input type="text" name="realName"  lay-verify="realname" autocomplete="off" placeholder="请输入您的姓名" class="layui-input">
					</div>
					<!--密码-->
					<div class="layui-form-item">
						<label class="beg-login-icon">
                        <i id="icon-pwd">&nbsp;&nbsp;&nbsp;&nbsp;</i>
                    </label>
						<input type="password" name="userPassword" id="userPassword" lay-verify="userPassword" autocomplete="off" placeholder="请输入密码" class="layui-input">
					</div>
					<!--确认密码-->
					<div class="layui-form-item">
						<label class="beg-login-icon">
                        <i id="icon-repwd">&nbsp;&nbsp;&nbsp;&nbsp;</i>
                    </label>
						<input type="password" name="rePwd" lay-verify="repwd" autocomplete="off" placeholder="请再次输入密码" class="layui-input">
					</div>
					<!--身份证-->
					<div class="layui-form-item">
						<label class="beg-login-icon">
                        <i id="icon-card">&nbsp;&nbsp;&nbsp;&nbsp;</i>
                    </label>
						<input type="text" name="cardId" lay-verify="cardId" autocomplete="off" placeholder="请输入您的身份证号" class="layui-input">
					</div>
					<!--邮箱-->
					<div class="layui-form-item">
						<label class="beg-login-icon">
                        <i id="icon-email">&nbsp;&nbsp;&nbsp;&nbsp;</i>
                    </label>
						<input type="text" name="email" lay-verify="email" autocomplete="off" placeholder="请输入您的邮箱" class="layui-input">
					</div>
					<!--电话-->
					<div class="layui-form-item">
						<label class="beg-login-icon">
                        <i id="icon-phone">&nbsp;&nbsp;&nbsp;&nbsp;</i>
                    </label>
						<input type="text" name="phone" lay-verify="phone" autocomplete="off" placeholder="请输入您的联系电话" class="layui-input">
					</div>
					<!--验证码   -->
					<div >
						<span class="cell-7">
	                            <input type="text" id="verifyCode" name="verifycode" placeholder="请输入验证码" onclick="">
						</span>
						<span class="cell-5" style="text-align: center;">
	                            <img id="captchaImg" src="/captcha/cpa" >
						</span>
			        </div>
					<div class="layui-form-item">
						<div class="beg-pull-left beg-login-remember">
							<a href="/user/toLogin">已有账号？立即登录</a>
							
						</div>
						<div class="beg-pull-right">
							<button class="layui-btn layui-btn-primary" lay-submit lay-filter="login">
                            <i><img src="/statics/images/icon-log.png" width="20" height="20"></i> 立即注册
                            </button><br/><br/><br/>
<!--                         <a>还没账号？立即注册>></a>-->
						</div>
						
						<div class="beg-clear"></div>
					</div>
				</form>
		</div>
	</div>
	<script type="text/javascript" src="../../statics/js/jquery-2.2.4.min.js"></script>
	<script type="text/javascript" src="../../statics/plugins/layui/layui.js"></script>
	<script type="text/javascript">
/*		window.location.reload();*/
	</script>
	<script>

            layui.use(['form'], function(){
                var form = layui.form(),
                    $ = layui.jquery,
                    layer = layui.layer;


                //自定义验证规则

                form.verify({
                    userName: function(value){
                        if(value.length==0){
                            return '请输入用户名';
                        }
                    }, email: function(value){
                        var regex = /^([\w-\.]+)@([\w-\.]+)(\.[a-zA-Z0-9]+)$/;
                        if(value.length==0){
                            return '请输入邮箱';
                        }else if (!value.match(regex)) {
                            return  '请您输入有效的邮箱号！';
						}
                    },userPassword: function(input){
                        var regex =/^[0-9A-Za-z]+$/;
                        if(input.length==0){
                            return '请输入密码';
                        }else if (!input.match(regex)) {
                            return  '密码格式错误（密码必须包含数字和字母）';
                        }
                    },repwd:function(value){
                        var pwd=document.getElementById("userPassword").value;
                        if(value.length==0){
                            return '请您确认密码';
                        }
                        if(value!=pwd){
                            alert(pwd);
                            return '两次密码输入不一致';
                        }
                    }, realname:function (value) {
                        var regex = /^[\u4e00-\u9fa5]+$/;
                        if(value.length==0){
                            return '请输入您的姓名！';
                        }else if (!value.match(regex)) {
                            return  '请您重新输入（姓名只能为汉字）';
                        }
                    },cardId:function (value) {
                        var regex=/(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
                        if(value.length==0){
                            return '请输入您的身份证号';
                        }else if (!value.match(regex)) {
                            return  '身份证号格式不正确，请您重新输入！';
                        }
                    },phone:function (value) {
                        var regex=/^((\+)?86|((\+)?86)?)0?1[3458]\d{9}$|^(((0\d2|0\d{2})[- ]?)?\d{8}|((0\d3|0\d{3})[- ]?)?\d{7})(-\d{3})?$/;
                        if(value.length==0){
                            return '请输入您的联系电话';
                        }else if (!value.match(regex)) {
                            return  '电话格式不正确，请您重新输入！';
                        }
                    }
                });
                //监听提交
                form.on('submit(login)', function(data){
                    /*layer.alert(JSON.stringify(data.field), {
                      title: '最终的提交信息'
                    });*/

                    var flag=-1;
                    $.post("/user/registered",data.field,function(res){
                        console.log(res);
                        if(res.success){
                            flag=1;
                            sessionStorage.setItem("user",JSON.stringify(res.user));
                            location.href='/user/toLogin';
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
