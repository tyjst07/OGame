<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="/OGame/js/jquery-1.12.1.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<script type="text/javascript">
	/* $(document).ready(function(){
		
		}); */
		function find(){
		/*var username=$('#username').val();
		console.log(username);
		var password=$('#password').val(); */
		var form = document.forms[0];
		form.action="/OGame/user/ifHasUser";
		form.method="get";
		form.submit();
		}
</script>
</head>
<body background="/OGame/imag/background2.jpg">
<div align="center" style="height: 100%">
	<div style="height: 30%;margin-top: 15%">
	<form >
	<table  style="font: x-large;">
		<tr>
			<td>
				<font color="green" size="18">Welcome Back Commander</font>
			</td>
		</tr>
		<tr>
			<td align="center">
					<font color="green">UserName:</font><input id="username" type="text" name="urn">
			</td>
		</tr>
		<tr>
			<td align="center">
					<font color="green">PassWord:</font><input id="password" type="password" name="pas">
			</td>
		</tr>
		<tr>
			<td align="center">
					<input type="button" value="登录"  onclick="find()" style="background-color: green;color: yellow">
					&nbsp;
					<a href="/OGame/user/toAddUser">注册</a>
			</td>
		</tr>
	</table>
		
	</form>
	</div>
</div>
</body>
</html>