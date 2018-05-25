<%@taglib uri="http://java.sun.com/jsp/jstl/core"
          prefix="c" %>

<!DOCTYPE html>
<html>
	<body>
		<h1>${student.firstName} ${student.lastName}</h1>
		<br><br>
		<h2>${student.country }</h2>
		<br><br>
		<h2>${student.gender }</h2>
		<br><br>
		<h2>${student.language }</h2>
		<br><br>
		operating system:
		<ul>
			<c:forEach var="temp" items="${student.os}">
			<li>${temp}</li>
			</c:forEach>
		</ul>
		
	</body>
</html>