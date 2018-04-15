<%@page import="java.util.*,entity.*"%>
<html>
	<head>
		<title>emplist</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	</head>
	<body>
		<div id="wrap">
			<div id="top_content">
				<div id="rightheader">
					<p>2018/4/4<br/></p>
				</div>
				<div id="topheader">
					<h1 id="title"><a href='#'>main</a></h1>
				</div>
				<div id="navigation"></div>
			</div>
			<div id="content">
				<p id="whereami"></p>
				<h1>Welcome!</h1>
				<table class="table">
					<tr class="table_header">
						<td>ID</td>
						<td>Name</td>
						<td>Salary</td>
						<td>Age</td>
						<td>Operation</td>
					</tr>
					<% 
						List<Employe> employees=(List<Employe>)request.getAttribute("employees");
						for(int i=0;i<employees.size();i++){
							Employe e=employees.get(i);
					%>
					<tr class="row<%=(i%2+1)%>">
						<td><%=e.getId()%></td>
						<td><%=e.getName()%></td>
						<td><%=e.getSalary()%></td>
						<td><%=e.getAge()%></td>
						<td><a href="delEmp.action?id=<%=e.getId()%>">delete emp</a>&nbsp;
							<a href="loadEmp.action?id=<%=e.getId()%>">update emp</a>&nbsp;
						</td>
					</tr>
						<%}%>
				</table>
				<p><input type="button" class="button" value="Add Employee" onclick="location='addEmp.jsp'"/></p>
			</div>
		</div>
		<div id="footber">
			<div id="footber_bg">110@110.com</div>
		</div>
	</body>
</html>