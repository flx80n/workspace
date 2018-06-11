jquery中ajax封装函数

jquery中ajax方法

1： load
	$('选择器').load(url,[data],[fn]);
	$('选择器').load(url);
	
	# $是jquery一个函数名称：工厂函数
	# 选择器 #id .class 元素...
	# url 
	
	
	跨域请求和JSONP
	Cross Domain Request:跨域名的HTTP请求
	浏览器从某个域名下的资源访问了另一个域名下的资源，可能是协议，域名，端口号。
	域名：www.jd.com
	
	端口号：
	每一个网络程序在运行中都有一个唯一的地址，地址就是端口号，端口号就是程序访问地址
	oracle 1521
	mysql 3306
	tomcat 8080
	范围：1～65535 使用端口1024以上
	协议：通讯双方达成默认工作方式
	tomcat <---> 浏览器
			http 80 传输网页
			ftp  21 文件上传
			https 443 网页加密传输
	浏览器那些情况下允许跨域请求
	<img > 
	<link >
	<script >
	<iframe >内连帧
	浏览器那些情况下禁止跨域请求
	xhr（XMLHttpRequest）


解决方案
	1：2：3：4：5：6：
	
	7：给被跨域访问的资源添加响应消息头部
		设定允许那个域名下的页面访问当前页面：Access-Contorl-Allow-Origin:http//xxx
	8：

	
	
	