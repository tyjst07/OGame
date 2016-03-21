<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body style="width: 100%">
	<div align="center" style="width: 60%;margin: 0 auto;">
		<table style="width: 30%; float: left; height: 30px">
			<tr>
				<td rowspan="2">
					<img alt="planet" src="/OGame/imag/planet2.jpg">
				</td>
				<td>
					<font color="white">xiao</font>
				</td>
			</tr>
			<tr>
				<td>
					<font color="white">172.5</font>
				</td>
			</tr>
		</table>
		<table style="width: 70%; float: right;height: 30px">
			<tr>
				<td>
				</td>
				<td>
					<img alt="metal" src="/OGame/imag/metal.gif">
				</td>
				<td>
					<img alt="beton" src="/OGame/imag/beton.gif">
				</td>
				<td>
					<img alt="fuel" src="/OGame/imag/fuel.gif">
				</td>
			</tr>
			<tr>
				<td>
				</td>
				<td>
					<font color="white">金属</font>
				</td>
				<td>
					<font color="white">砾石</font>
				</td>
				<td>
					<font color="white">燃油</font>
				</td>
			</tr>
			<tr>
				<td style="text-align: center;">
					<font color="green">库存</font>
				</td>
				<td>
					<font color="white">${resource.metal }</font>
				</td>
				<td>
					<font color="white">${resource.beton }</font>
				</td>
				<td>
					<font color="white">${resource.fuel }</font>
				</td>
			</tr>
			<tr>
				<td style="text-align: center;">
					<font color="green">产量/h</font>
				</td>
				<td>
					<font color="white">${resource.metalAdd }</font>
				</td>
				<td>
					<font color="white">${resource.betonAdd }</font>
				</td>
				<td>
					<font color="white">${resource.fuelAdd }</font>
				</td>
			</tr>
		</table>
	</div>
	<div align="center" style="width: 60%;margin: 0 auto;">
		<table>
			<tr>
				<td>
					<a href="/OGame/toPage/toIndex?id=${user.uid }">
						<input type="button" value="概况" style="background-color: green;color: yellow">
					</a>
				</td>
				<td>
					<a href="/OGame/toPage/toConstruction?id=${user.uid }">
						<input type="button" value="建筑" style="background-color: green;color: yellow">
					</a>
				</td>
				<td>
					<a href="/OGame/toPage/toShipyard?id=${user.uid }">
						<input type="button" value="船厂" style="background-color: green;color: yellow">
					</a>
				</td>
				<td>
					<a href="/OGame/toPage/toUniverse?id=${user.uid }">
						<input type="button" value="星图" style="background-color: green;color: yellow">
					</a>
				</td>
				<td>
					<a href="/OGame/toPage/toMessage?id=${user.uid }">
						<input type="button" value="消息" style="background-color: green;color: yellow">
					</a>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>