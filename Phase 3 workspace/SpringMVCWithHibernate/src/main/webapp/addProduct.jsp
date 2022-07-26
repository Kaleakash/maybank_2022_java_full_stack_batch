<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
${requestScope.msg}
<form action="addProduct" method="post">
<label>PId</label>
<input type="number" name="pid"><br/>
<label>PName</label>
<input type="text" name="pname"><br/>
<label>Price</label>
<input type="number" name="price"><br/>
<label>Category</label>
<select name="category">
	<option>-- Select Category --</option>
	<option value="electronic device">electronic device</option>
	<option value="cloths">cloths</option>
</select>
<br/>
<input type="submit" value="Add Product">
<input type="reset" value="reset">
</form>
<br/>
<a href="index.jsp">logout</a>
</body>
</html>