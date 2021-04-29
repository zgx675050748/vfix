<%--
  Created by IntelliJ IDEA.
  User: 67505
  Date: 2021/4/23
  Time: 19:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="http://localhost:8080/vfix/imgUpload"
          enctype="multipart/form-data" method="post">
        <input type="file" name="upload"/>
        <input type="submit"/>
    </form>
</body>
</html>
