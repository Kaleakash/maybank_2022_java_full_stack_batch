<%@page import="java.util.Iterator"%>
<%@page import="com.bean.*"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<th>PId</th>
		<th>PName</th>
		<th>Price</th>
	</tr>

<%
Object obj =request.getAttribute("obj");
List<Product> listOfProdut = (List<Product>)obj;
Iterator<Product> li = listOfProdut.iterator();
while(li.hasNext()){
	Product p  = li.next();
	%>
	<tr>
		<td><%=p.getPid() %> </td>
		<td><%=p.getPname() %> </td>
		<td><%=p.getPrice() %> </td>
	</tr>
	<%
}
%>

</table>
</body>
</html>