<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%--
The taglib directive below imports the JSTL library. If you uncomment it,
you must also add the JSTL library to the project. The Add Library... action
on Libraries node in Projects view can be used to add the JSTL 1.1 library.
--%>
<%--
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
--%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import = "java.util.*" %>
<%@ page import = "test.FindCustomer" %>
<html>
    <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <jsp:useBean id="FA" scope="application" class="test.FindCustomer" />
    <jsp:setProperty name="FA" property ="*"/>
    <body>
    <h1>customer identification</h1>
   <%
    Vector v = (vector)FA.getResult();
    Enumeration enu = v.elements();
  
    while(enum.hasMoreElements())
    {
    out.println("Customer Name:"+enu.nextElement());
    %>
    <br>
    <%
    out.println("Address:"+enu.nextElement());
    %>
    <br>
    <% 
    out.println("City:"+enu.nextElement()); 
    %>
    
    </body>
</html>
