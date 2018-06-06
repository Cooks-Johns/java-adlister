
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<%@ include file="/WEB-INF/partials/navbar.jsp"%>
    <style>
        body {
            background-color: tan;
        }
        h1  {
            position: center;
        }
    </style>
    
    
</head>
<body>
    <jsp:include page="WEB-INF/partials/head.jsp"/>
    <div class="container">
        <h1>Welcome to the Adlister!</h1>
        <input type="submit" class="btn lg">
    </div>


</body>
</html>
