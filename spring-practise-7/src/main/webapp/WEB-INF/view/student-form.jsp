<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Form Data</title>
</head>
<body>

<form:form action="/processForm" modelAttribute="studentAttr">
    FirstName: <form:input path="fName" /> <br />
    LastName: <form:input path="lName" /> <br />
    <input type="submit" value="Submit">
</form:form>

</body>
</html>
