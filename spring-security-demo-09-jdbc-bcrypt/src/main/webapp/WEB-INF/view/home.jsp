<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
<title>Home page</title>
</head>
<body>
<h2>home page </h2>
<hr>
<p>
User : <security:authentication property="principal.username"/>
<br><br>
Role(s): <security:authentication property="principal.authorities"/>
</p>
<hr>
<security:authorize access="hasRole('MANAGER')">
<p>
<a href="${pageContext.request.contextPath}/leaders">Leadership Meeting</a>
(only for Manager peeps)
</p>
</security:authorize>

<security:authorize access="hasRole('ADMIN')">
<p>
<a href="${pageContext.request.contextPath}/systems">IT System Meeting</a>
(only for Admin peeps)
</p>
</security:authorize>

Welcome to the Active Company home page!
<form:form action="${pageContext.request.contextPath}/logout" method="POST">
<input type="submit" value="Logout"/>
</form:form>
</body>
</html>