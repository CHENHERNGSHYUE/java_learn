<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h1>User</h1>
	<form action="param/save" method="post">
	<!-- 下面的name是去抓setter方法 -->
		帳號: <input type="text" name="username" /><br>
		密碼: <input type="text" name="password" /><br>
		金額: <input type="text" name="money" /><br>
		<input type="submit" values="送出" /><br>
	</form>

</body>
</html>