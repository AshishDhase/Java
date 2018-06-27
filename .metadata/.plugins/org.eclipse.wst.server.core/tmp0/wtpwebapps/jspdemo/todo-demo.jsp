<%@ page import = "java.util.*" %>

<html>
<body>

<!-- Step1: Create HTML FORM -->
<form action ="todo-demo.jsp">
	Add new item: <input type="text" name = "theItem">
	<input type="submit" value = "submit">
</form>

<br>


<!-- Step2: Add new item to "To Do" list -->
<%
	// get the To Do item from the session
	List<String> items = (List<String>) session.getAttribute("myToDoList");
	// if the TO DO  item doesn't exist, then create a new one
	if(items == null) {
		items = new ArrayList<String>();
		session.setAttribute("myToDoList", items);
	//	out.println(session.getId());
	}
	// see if there is form data to add
	String theItem = request.getParameter("theItem");
	
	if( (theItem != null) && (!theItem.trim().equals("")) ) {
		items.add(theItem);
	}
	
	
%>
<!-- Step3: Display all "To-Do" item from session -->
<hr>
<b>To do list items: </b> <br>
<ol>
<%
	for(String temp : items){
		out.println("<li>"+temp+"</li>");
	}
%>

</ol>

</body>
</html>