<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<title>Home page</title>
</head>
<body>
<h2>home page </h2>
<hr>
Welcome to the Active Company home page!
<form:form action="${pageContext.request.contextPath}/logout" method="POST">
<input type="submit" value="Logout"/>
</form:form>
</body>
</html>