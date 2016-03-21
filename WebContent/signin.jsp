<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="/OGame/js/jquery-1.12.1.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SignIn</title>
<script type="text/javascript">
	/* $(document).ready(function(){
		
		}); */
		function add(){
		var username=$('#urn').val();
		var password=$('#pas').val();
		var password2=$('#pas2').val();
		if(password!=password2){
			alert("两次输入密码不一致");
			}
		else{
			var form = document.forms[0];
			form.action="/OGame/user/addUser";
			form.method="get";
			form.submit();
			}
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
				<font color="green" size="18">Welcome Commander</font>
			</td>
		</tr>
		<tr>
			<td align="center">
					<font color="green">UserName:</font><input id="urn" type="text" name="urn">
			</td>
		</tr>
		<tr>
			<td align="center">
					<font color="green">PassWord:</font><input id="pas" type="password" name="pas">
			</td>
		</tr>
		<tr>
			<td align="center">
					<font color="green">RepeatPassWord:</font><input id="pas2" type="password" name="pas2">
			</td>
		</tr>
		<tr>
			<td align="center">
					<input type="button" value="注册"  onclick="add()" style="background-color: green;color: yellow">
					&nbsp;
					<a href="/OGame/user/backToLogin">返回</a>
			</td>
		</tr>
	</table>
		
	</form>
	</div>
</div>
</body>
</html>