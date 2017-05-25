<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 24.05.2017
  Time: 22:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Исскуство</title>
</head>
<body>
<h1>${name} вы в комнате где обсуждают исскуство</h1>
<h4>${name}: ${mess}</h4>
<br/><br/><br/><br/><br/><br/><br/>
<form name="сообщения" action="isskustvoMessage" method="post" >
    <textarea rows="4" cols="50" placeholder="Введите ваше сообщение" name="txt_message"></textarea>
    <input type="submit" value="Отправить сообщение">
</form>
<br/><br/>
<form name="Back" action="backToChat" method="post">
    <label>Вернуться к выбору комнат</label> <input type="submit" value="Жмяк"/>
</form>
</body>
</html>
