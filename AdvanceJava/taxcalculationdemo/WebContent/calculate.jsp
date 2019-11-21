<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Loan Calculator</h3>
<table border="2" color="red">
	<tr>
		<td>Income Amount</td>
		<td><%=request.getParameter("inc")%></td>
	</tr>
	<tr>
		<td>Invest Amount</td>
		<td><%=request.getParameter("iamt")%></td>
	</tr>
	<tr>
		<td>Total Amount</td>
		<td><%=request.getAttribute("tamt")%></td>
	</tr>
	<tr>
		<td>Principle Amount</td>
		<td><%=request.getAttribute("pamt")%></td>
	</tr>
	<tr>
		<td>Loan Amount</td>
		<td><%=request.getParameter("lamt")%></td>
	</tr>
	<tr>
		<td>Tax Amount</td>
		<td><%=request.getAttribute("tax")%></td>
	</tr>

</table>
</body>
</html>





