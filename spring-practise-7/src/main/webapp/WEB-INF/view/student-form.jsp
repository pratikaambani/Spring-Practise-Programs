<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Form Data</title>
</head>
<body>

<form:form action="/processForm" modelAttribute="studentAttr">
    FirstName: <form:input path="fName" /> <br />
    LastName: <form:input path="lName" /> <br />
    <%--TODO 029 Dropdown options--%>
    <form:select path="country">
<%--TODO 030 We can also retrieve dropdown values from Java Class--%>
<%-- Uncomment this to run 029
        <form:option value="IN" label="IN" />
        <form:option value="US" label="US" />
        <form:option value="UK" label="UK" />
--%>
        <form:options items="${studentAttr.countryOptions}" />
    </form:select>
    <input type="submit" value="Submit">
</form:form>

</body>
</html>
