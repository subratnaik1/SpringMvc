<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table border="1" align="center" bgcolor="cyan">
<tr>
<th>orderId </th>
<th>customerName </th>
<th>itemName </th>
<th>quantity </th>
<th>price</th>
<th>totalAmount</th>
<th colspan="2"> Order</th>
</tr>

<c:forEach var="food" items="${result}">
<tr>
<td>${food.orderId}</td>
<td>${food.customerName}</td>
<td>${food.itemName}</td>
<td>${food.quantity}</td>
<td>${food.price}</td>
<td>${food.totalAmount}</td>

<td>
<a href="emp_edit?no=${food.orderId}">Edit</a>
</td>

<td>
<a href="emp_delete?no=${food.orderId}">Delete</a>
</td>

</tr>
</c:forEach>

</table>

<h2 style="color:green;text-align:center">
<a href="add">Add FoodOrder</a>
</h2>