<%--
  Created by IntelliJ IDEA.
  User: Saurav
  Date: 14-03-2021
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form modelAttribute="data" action="save" method="post">

   ID: <form:input path="id"/><br>
   Name: <form:input path="name"/><br>
   Course: <form:input path="course"/><br>

    <input type="submit" value="Submite"/>


</form:form>

</body>
</html>
