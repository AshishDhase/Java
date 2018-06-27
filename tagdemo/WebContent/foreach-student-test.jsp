<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page import = "java.util.*, com.ashish.jsp.tagdemo.Student" %>

<%
	// Create some sample data
	List<Student> data = new ArrayList<>();

	data.add(new Student("John", "Doe" , false));
	data.add(new Student("Mary", "Snow" , true));
	data.add(new Student("Johnny", "Bravo" , false));
	
	pageContext.setAttribute("myStudents", data);
%>
<html>
<body>
	<table border = "1">
	<tr>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Gold Customer</th>
	</tr>
		<c:forEach var = "tempStudent" items = "${myStudents}">
		
			<tr>
				<td>${tempStudent.firstName}</td>
				<td>${tempStudent.lastName} </td>
				<td>${tempStudent.goldCustomer} </td>
			</tr>
			
	 	</c:forEach>
	 </table>
</body>
</html>