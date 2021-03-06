<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Home</title>
	<!-- <script type="text/javascript" src="/myapp/js/jquery.min.js"></script>-->
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.3/jquery.min.js" type="text/javascript"></script>
	
	<script>	
		$(function(){
			$("#btn").click(function(){
				alert("hello btn");
				$.ajax({
					//編寫json，設定屬性跟值
					url:"test/testajax",
					contentType: "application/json;charset=UTF-8",
					data:'{"username":"hehe","password":"abc77","money":1000}',
					dataType:"json",
					type:"post",
					success:function(data){
						//alert(data);
						//alert(data.username);
						//alert(data.password);
						//alert(data.money);
					}
				});
			});
		});
	</script>
</head>
<body>
<h1>start</h1>
<a href="test/user">user_check</a><br>
<button id="btn">發送ajax的請求...fail:(</button>
</body>
