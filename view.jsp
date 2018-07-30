<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page isELIgnored="false" %>
<html>
<body>
<form action="/SpringMVC1/save" method="post" modelattribute="vendor">
Enter Vendor ID: <input type="text" name="vId" id="vId" /><br>
Enter Vendor Name:<input type="text" name="vName" id="vName" /><br>
<input type="submit" value="save vendor" />
</form>
</body>
</html>