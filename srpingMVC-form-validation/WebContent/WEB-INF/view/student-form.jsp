<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<head>
	<title>Student Registration Form</title>
	<style>
		.error {color:red}
	</style>
</head>

<body>
	<form:form action="processForm" modelAttribute="student">
	
		FirstName: <form:input path="firstName" />
		<br><br>
		lastName(*): <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />
		<br><br>
		<input type="submit" value="submit"/>	
	</form:form>

</body>

</html>


