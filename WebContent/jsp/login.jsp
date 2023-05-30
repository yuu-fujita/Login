<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<form action="/Login/jsp/login-ok.jsp" method="post"><!-- loginAction --> 
		<p>ログイン名<input type="text" name="id"></p>
		<p>パスワード<input type="password" name="pass"></p>
		<p><input type="submit" value="ログイン"></p>
	</form>

</body>
</html>

