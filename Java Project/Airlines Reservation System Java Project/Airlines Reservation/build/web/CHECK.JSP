<html>
<body>
<%@page language="java" import="java.sql.*,java.io.*" %>
<%
String x="",y="";
x=request.getParameter("n");
y=request.getParameter("pwd");
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
}
catch(ClassNotFoundException e)
{}

try
{
Connection con=DriverManager.getConnection("jdbc:odbc:mar");
PreparedStatement p=con.prepareStatement("select name,key from aaa where name=? and pass=?");
p.setString(1,x);
p.setString(2,y);
ResultSet rs=p.executeQuery();
String k="";
if(rs.next())
{
session.setAttribute("user",x);
k=rs.getString(2);
int ss=Integer.parseInt(k);
if(ss>6)
{
response.sendRedirect("http://localhost:7000/examples/marees/home.jsp");
}
else if(ss>3)
{
response.sendRedirect("http://localhost:7000/examples/marees/home1.jsp");
}
else if(ss>0 || ss==3)
{
response.sendRedirect("http://localhost:7000/examples/marees/home2.jsp");
}

}
else
{

response.sendRedirect("http://localhost:7000/examples/marees/err.jsp");

}
}
catch(SQLException e){}
%>
</body>
</html>
