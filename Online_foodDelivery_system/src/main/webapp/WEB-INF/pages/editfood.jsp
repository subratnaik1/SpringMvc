<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>

<frm:form action="edit" modelAttribute="food">
orderId: <frm:input path="orderId" readonly="true"/><br>
customerName: <frm:input path="customerName" /><br>
itemName : <frm:input path="itemName" /><br>
quantity : <frm:input path="quantity" /><br>
price : <frm:input path="price"/><br>
totalAmount : <frm:input path="totalAmount"/><br>
<input type="submit" value="Edit">
</frm:form>
