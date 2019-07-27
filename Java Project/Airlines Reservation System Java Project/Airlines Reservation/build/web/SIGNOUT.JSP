<%@ page language="java" %>
<html>
<head>
<meta http-equiv='refresh'>
</head>
<body>
<%
session.removeAttribute("user");
session.invalidate();
response.sendRedirect("http://localhost:7000/examples/marees/first.html");
%>
</body>
</html>