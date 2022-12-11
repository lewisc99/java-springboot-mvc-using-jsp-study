<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Student Registration Form</title>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
<div class="row">
<div class="col col-md">
<form:form action="processForm" modelAttribute="student" >
First Name: <form:input path="firstName" class="form-control"/>
<br><br>
Last Name:  <form:input path="lastName" class="form-control" />
<br><br>
Country:
<form:select path="country" class="form-control">
<form:options  items="${student.countryOptions }"  />


</form:select>
<br><br>

Favorite Language:

Java <form:radiobutton path="favoriteLanguage" value="Java"/>
C# 	<form:radiobutton path="favoriteLanguage" value="c#" />
PHP	<form:radiobutton path="favoriteLanguage" value="Php" />
Ruby 	<form:radiobutton path="favoriteLanguage" value="Ruby" />
<br><br>
Operating Systems:
Linux <form:checkbox path="operatingSystems" value="Linux" />
Linux <form:checkbox path="operatingSystems" value="Mac" />
MS Windows <form:checkbox path="operatingSystems" value="Windows" />


<br><br>
<input type="submit"  value="Submit" class="btn btn-primary" />
</form:form>

</div>
</div>
</div>
</body>

</html>
