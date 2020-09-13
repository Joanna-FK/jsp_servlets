<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>ExerciseOne</title>

</head>
<body>
<jsp:include page="/menu.jsp"/>
<table>
    <c:forEach var="product" items="${requestScope.product_list}">
        <tr>
            <td><a href="${pageContext.request.contextPath}/product?id=${product.id}">Product: <c:out value="${product.name}"/></a></td>
        </tr>
    </c:forEach>
</table>
<jsp:include page="/footer.jsp"/>
</body>
</html>