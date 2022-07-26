<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Product"%>
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
	<th>Category</th>
</tr>
<%
Object obj = request.getAttribute("listOfProduct");
if(obj != null){
	List<Product> listOfProduct = (List<Product>)obj;
	Iterator<Product> ii = listOfProduct.iterator();
	while(ii.hasNext()){
		Product p = ii.next();
		%>
		<tr>
				<td><%=p.getPid() %></td>
				<td><%=p.getPname() %></td>
				<td><%=p.getPrice() %></td>
				<td><%=p.getCategory() %></td>
		</tr>
		<%
	}
}
%>
<a href="index.jsp">logout</a>
</table>
</body>
</html>