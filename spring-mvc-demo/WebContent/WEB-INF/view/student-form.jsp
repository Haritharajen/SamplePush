<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>STUDENT FORM</title>
</head>
<body>
<h1 align = "center" style = "color:RED;"> REGISTER YOUR DETAILS </h1>
	<hr>
		<form:form action="processForm" modelAttribute="student" method="post">
			First Name : <form:input path="firstName" />
		<br>
		<br>
			Last Name : <form:input path="lastName" />
		<br>
		<br>
			Country  : <form:select path="country">
			<%-- <form:options items = "${student.countryOptions}" /> --%>
			<form:options items="${countries}" />
		</form:select>
		<br>
		<br>
		    Gender :<br>
		<br>
		    
		    Female: <form:radiobutton path="gender" value="female" />
		    Male: <form:radiobutton path="gender" value="male" />

		<%-- <br><br>
		    Favorite Languages :<br><br>
		    JAVA: <form:radiobutton path="language" value = "JAVA"/>
		    C#: <form:radiobutton path="language" value = "C#"/>
		    PERL: <form:radiobutton path="language" value = "PERL"/> --%>

		<br>
		<br>
		    Favorite Languages :<br>
		<br>
		<form:radiobuttons path="language" items="${student.languageOptions}" />


		<br>
		<br>		    
		    OperatingSystem:<br>
		<br>
		    mac <form:checkbox path="os" value="mac" />
		    linux <form:checkbox path="os" value="linux" />
		    windows <form:checkbox path="os" value="windows" />
		<br>
		<br>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>