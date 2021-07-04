<%--
  Created by IntelliJ IDEA.
  User: liumiaoyi
  Date: 2021/6/8
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<p>第一个springmvc项目</p>
<p><a href="some.do">发起some.do的请求</a></p>

<p>第一个springmvc项目</p>
<p><a href="other.do">发起other.do的请求</a></p>

</br>
<p>使用java对象接受请求参数</p>
<form action="receiveobject.do" method="post">
    姓名:<input type="text" name="name"><br/>
    年龄:<input type="text" name="age"><br/>
    性别:<input type="text" name="sex"><br/>
    <input type="submit" value="提交参数">
</form>

</body>
</html>
