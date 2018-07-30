<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isELIgnored="false" %>
<html>
<head>
<style type="text/css">
.style1
{
color:red;
}
</style>

</head>
<body>
<form:form method="post" action="/SpringMVC1/saveVendor" modelAttribute="vendor">
<table>
<tr>
<td>Vendor ID:</td>
<td><form:input path="vId" /></td>
<td><form:errors  path="vId" class="style1"></form:errors></td>
</tr>
<tr>
<td>Vendor Name:</td>
<td><form:input path="vName"  /></td>
<td><form:errors  path="vName" class="style1"></form:errors></td>
</tr>
<tr><td colspan="2">
<input type="submit" value="save"/></td></tr>
</table>
</form:form>
</body>
</html>