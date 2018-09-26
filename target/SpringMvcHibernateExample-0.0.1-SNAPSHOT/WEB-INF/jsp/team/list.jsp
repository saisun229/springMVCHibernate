     <%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cricket Team</title>
</head>
<body>

 <h1>Cricket Team</h1>
 <table width="100%" border="1">
  <tr>
   <td>ID</td>
   <td>TEamname</td>
   <td>Captain</td>
   <td>viceCaptain</td>
   <td>Coach</td>
  </tr>  
  <c:forEach items="${list }" var="team" >
   <tr>
    <td>${team.id }</td>
    <td>${team.name }</td>
    <td>${team.captain }</td>
    <td>${team.vicecaptain }</td>
    <td>${team.coach }</td>
    
   </tr>
  </c:forEach>
 </table>
</body>
</html>