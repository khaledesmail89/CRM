<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration Form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
First Name : <form:input path="firstName"/>
<br><br>
Last Name : <form:input path="lastName"/>
<br><br>

Country:
<form:select path="country">
<form:options items="${student.countryOptions }" />
</form:select>

<br><br>
Favorite Language:
Java<form:radiobutton path="favouriteLanguage" value="Java"/>
C#<form:radiobutton path="favouriteLanguage" value="C#"/>
GO<form:radiobutton path="favouriteLanguage" value="GO"/>
Ruby<form:radiobutton path="favouriteLanguage" value="Ruby"/>

<br><br>

operating systems: 
Linux: <form:checkbox path="operatingSystems" value="linux"/>
Mac Os: <form:checkbox path="operatingSystems" value="mac os"/>
Windows : <form:checkbox path="operatingSystems" value="winows"/>
<br><br>
<input type="submit" value="submit"/>
</form:form>
</body>
</html>