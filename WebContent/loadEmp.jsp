<%@page import="java.util.*,entity.*"%>
<html>
	<head>
		<title>loadEmp</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	</head>
	<body style="font-size:30pt;">
		<form action="list.action" method="post">
			 id:
			 username: <input type='text' name='name' value='"rst.getString("name")'/><br/>
			 salary: <input type='text' name='salary' value='"rst.getDouble("salary")'/><br/>
			 age: <input type='text' name='age' value=''/><br/>
			 <input type='submit' value='Confirm'/>
		</form>
	</body>
</html>



