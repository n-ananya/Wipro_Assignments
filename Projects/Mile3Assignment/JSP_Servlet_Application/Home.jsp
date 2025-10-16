<%
String user = (String) request.getAttribute("userid");
%>
<h2>Welcome: <%= user %></h2>
<a href="changePassword.jsp">Change Password</a>
