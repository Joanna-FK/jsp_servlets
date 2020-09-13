<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>ExerciseOne</title>
    <jsp:include page="/menu.jsp"/>
</head>
<body>
<h1>Product name: <c:out value="${requestScope.product.name}"/></h1>
<h1>Product price: <c:out value="${requestScope.product.price}"/></h1>
</body>
<jsp:include page="/footer.jsp"/>
</html>