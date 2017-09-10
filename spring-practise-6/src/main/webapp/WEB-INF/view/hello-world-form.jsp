<%--
  Created by IntelliJ IDEA.
  User: AmbaniP
  Date: 10/09/2017
  Time: 12:18 PM
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Hello world input form</title>
</head>
<body>


<%--TODO 024: Form processing | using /processForm path--%>
<%--<form action="processForm" method="get">--%>
<%--TODO 025: Form processing + oprations | using /processFormToUpperCase path--%>
<%--<form action="processFormToUpperCase" method="get">--%>
<%--TODO 026: Form processing without HttpServletRequest | using /processToUpperCase path--%>
<form action="processToUpperCase" method="get">
<%--TODO 027: @RequestMapping to controller--%>
<form action="mappingOnController/processToUpperCase" method="get">
    <input type="text" name="studentName" placeholder="Name please!" />
    <input type="submit" />
</form>

</body>
</html>
