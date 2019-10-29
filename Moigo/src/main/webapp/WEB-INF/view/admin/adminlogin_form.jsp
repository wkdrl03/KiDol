<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>모이고 로그인</title>
</head>
<style>
.login_form{text-align: center;}

#title{text-align: center; color: blue;}

</style>


	
	<script>
	function login(){
			
			var id = window.document.FrmLogin.id
		
			if(id.value == ""){
				alert("아이디를 입력하세요.");
				document.FrmLogin.action="adminform.do";
				return false;
			}
		}
	</script>
	
	
	<body>
		<h1 id="title">로그인</h1>
		
			<form name="FrmLogin" action="adminLogin.do" method="post" onsubmit="login()">
			
			<div class="login_form"><input name="email" type="text" placeholder="ID"></div>
			
			<div class="login_form"><input name="password" type="password" placeholder="PW"></div>
			<p>
			<div class="login_form"><input type="submit" value="로그인"></div>
	
		</form>
	
	
	</body>
</html>