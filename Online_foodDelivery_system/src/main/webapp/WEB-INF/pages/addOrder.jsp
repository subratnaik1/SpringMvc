<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>

<frm:form action="submit" modelAttribute="food">
orderId : <frm:input path="orderId"/><br>
customerName : <frm:input path="customerName"/><br>
itemName : <frm:input path="itemName"/><br>
Employee DeptNo : <frm:input path="quantity"/><br>
Employee DeptNo : <frm:input path="price"/><br>
Employee DeptNo : <frm:input path="totalAmount"/><br>
<button>Submit</button>
</frm:form>
