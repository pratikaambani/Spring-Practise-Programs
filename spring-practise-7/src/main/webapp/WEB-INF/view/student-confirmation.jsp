<%--
  Created by IntelliJ IDEA.
  User: AmbaniP
  Date: 10/09/2017
  Time: 3:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Confirmation Page</title>
</head>
<body>

Student is confirmed. Details are: ${studentAttr.fName} and ${studentAttr.lName}
<br />
<%--TODO 029 Dropdown options--%>
Country: ${studentAttr.country} <br />
<%--TODO 031 radio --%>
Favourite Language is ${studentAttr.favouriteLang}
<%--TODO 032 Checkboxes --%>
Favourite OS:

<ul>
    <c:forEach var="os" items="${studentAttr.os}" >
        <li>${os}</li>
    </c:forEach>
</ul>


</body>
</html>
