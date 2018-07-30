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
<form method="post" action="/SpringMVC1/search">
<table>
<tr>
<td>Vendor ID:</td>
<td><input type="text" name="vendorid" id="vendorid" /></td>
</tr>
<td><input type="submit" value="search"/></td>
</tr>
</table>
</form>