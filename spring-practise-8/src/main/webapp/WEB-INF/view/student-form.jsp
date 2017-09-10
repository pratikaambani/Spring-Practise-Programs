<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Form Data</title>
</head>
<body>

<form:form action="/processForm" modelAttribute="studentAttr">
    FirstName: <form:input path="fName" /> <br />
    LastName: <form:input path="lName" /> <br />
    <form:select path="country">
<%-- Uncomment this to run 029
        <form:option value="IN" label="IN" />
        <form:option value="US" label="US" />
        <form:option value="UK" label="UK" />
--%>
        <form:options items="${studentAttr.countryOptions}" />
    </form:select>
    <br />
    Your favourite language:
    Java <form:radiobutton path="favouriteLang" value="java" />
    C <form:radiobutton path="favouriteLang" value="c" />
    C++ <form:radiobutton path="favouriteLang" value="cpp" /> <br />
    
    Favourite OS:
    Windows <form:checkbox path="os" value="windows"/>
    Linux <form:checkbox path="os" value="linux"/>
    Mac <form:checkbox path="os" value="mac"/>
    <br />
    
    <input type="submit" value="Submit">
</form:form>
<br />



</body>
</html>
