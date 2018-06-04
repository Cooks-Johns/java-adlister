<%--
  Created by IntelliJ IDEA.
  User: johnathoncook
  Date: 6/4/18
  Time: 11:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ads</title>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="View all Ads"/>
    </jsp:include>
</head>
<body>
    <jsp:include page="/partials/head.jsp"/>
    <div class="container">
        <h1>A list of all of our adds</h1>
        <c:forEach var="ad" items="${ads}">
            <div class="col-md-6">
                <h2>${ad.title}</h2>
                <p>${ad.description}</p>
            </div>
        </c:forEach>
    </div>



</body>
</html>


