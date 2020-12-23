<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
    <title>My JSP 'register.jsp' starting page</title>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <form action="doregister" method="post">
    	用户名：<input type="text" name="username">
    	密码：<input type="password" name="password">
    	<button type="submit">提交</button>
    </form>
  </body>
</html>
