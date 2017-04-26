<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="LoginServlet" method="POST"> 
Enter ID:<input type="text" name="id" id = "id"/>  
<select name = "userType" id = "userType">
  <option value="customer">Customer</option>
  <option value="employee">Employee</option>
  <option value="manager">Manager</option>
</select>
<input type="submit" value="login"> </input>
</form> 

</body>
</html>