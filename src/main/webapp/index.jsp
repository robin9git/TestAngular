<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Robin's Park</title>
<script src="http://code.angularjs.org/angular-1.0.1.js"></script>

<style type="text/css">
.footer{
    text-align: center;
    border-top: 4px solid #e0ddd5;
    color: #5a6b7b;
    line-height: 26px;
/*     padding: 25px; */
}

.header{
	text-align: center;
	line-height: 26px;
}

.body{
	padding:50px 0 700px;
	
	width: 50%;
	height: 70%;
	margin-left: auto;
	margin-right: auto;
/* 	line-height: 500px; */
/* 	text-align: center; */
/* 	line-height: 26px; */
}

div {
    display: block;
}

.ul_left{
	
}
</style>

</head>
<body>
<!-- header-div -->
<div class="header" data-sudaclick="header" ng-app ng-init="msg = 'hello angular'">
<input ng-model="msg" />
    <p>{{msg}}</p>
Hello,myfrinds！Welcome to Robin's Park! <br>
123.57.150.250

负载均衡测试------------8581-------------<br>
<font style="color: red;">我是8581端口内容！！！</font>
</div>
<!-- header-div -->

<!-- body-div -->
<div class="body" data-sudaclick="body" >

<div class="body_left" style="float: left;">
	<ul class="ul_left">
		<li><a href="http://blog.sina.com.cn/sovad" target="_blank">我的博客</a></li>
		<li><a href="https://github.com/robin9git" target="_blank">My Github</a></li>
	
		<li><a href="http://admin.cloudmirror.cn/" target="_blank">花枪后台</a></li>
		<li><a href="http://shop.guns-rose.com/goods_list.html?category=1" target="_blank">花枪前台</a></li>
		
		<li><a href="http://101.201.150.111:83" target="_blank">中科工程公司后台</a></li>
		<li><a href="http://101.201.150.111:81" target="_blank">中科工程公司前台</a></li>
		<li><a href="http://101.201.150.111:85" target="_blank">中科工程公司Swagger</a></li>
		<li><a href="http://admin.24j.cn" target="_blank">新农创</a></li>
		<li><a href="http://114.242.195.204:81" target="_blank">中科后台</a></li>
		<li><a href="http://114.242.195.204" target="_blank">中科前台</a></li>
		
		<!--
		<li><a href="http://123.57.150.250:9001" target="_blank">Hello Angular</a></li>
		<li><a href="http://123.57.150.250:9002" target="_blank">backend_guns&roses</a></li>
		<li><a href="http://123.57.150.250:9100" target="_blank">中科后台</a></li>
		<li><a href="http://123.57.150.250:9101" target="_blank">中科前台</a></li>
		<li><a href="http://123.57.150.250:9102" target="_blank">中科BBS</a></li>
		<li></li>
		<li></li>
		<li></li>
		-->
	</ul>
</div>

<div class="body_right" style="float: right;">
	<ul class="ul_left">
<!-- 	<li><a href="http://blog.sina.com.cn/sovad" target="_blank">我的博客</a></li> -->
<!-- 	<li><a href="https://github.com/robin9git" target="_blank">My Github</a></li> -->
<!-- 	<li><a href="http://123.57.150.250:9001" target="_blank">Hello Angular</a></li> -->
<!-- 	<li><a href="http://123.57.150.250:9002" target="_blank">backend_guns&roses</a></li> -->
<!-- 	<li><a href="http://123.57.150.250:9100" target="_blank">中科后台</a></li> -->
<!-- 	<li><a href="http://123.57.150.250:9101" target="_blank">中科前台</a></li> -->
<!-- 	<li><a href="http://123.57.150.250:9102" target="_blank">中科BBS</a></li> -->
</ul>
</div>

</div>
<!-- body-div -->

<!-- footer-div -->
<div class="footer" data-sudaclick="footer" style="clear: both;">
	<p>Copyright © 2016 COCO2048 Corporation, All Rights Reserved</p>
	<p>珂珂公司 <a target="_blank" href="http://www.coco2048.com">版权所有</a> <a target="_blank" href="http://www.miitbeian.gov.cn/">京ICP备16023678号-1</a></p>
	
</div>
<!-- footer-div -->

</body>
</html>