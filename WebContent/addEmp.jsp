<%@page import="java.util.*,entity.*"%>
<html>
	<head>
		<title>addEmp</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	</head>
	<body style="font-size:30pt;">
		<form action="list.action" method="post">
			<fieldset>
				<legend>add employee</legend>
				name:<input type="text" name="name"/><br/>
				salary:<input type="text" name="salary"/><br/>
				age:<input type="text" name="salary"/><br/>
				<input type="submit" value="Confirm"/>
			</fieldset>
		</form>
	</body>
</html>