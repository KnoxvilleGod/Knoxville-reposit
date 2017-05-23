<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 20.05.2017
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Молодежный чат</title>
  </head>
  <body>
  <h3>Перед тем как зайти в чат, укажите, как вас величать)))</h3>
      <form name="Никнейм" action="nickname" method="post">
        <label>Введите ваш никнейм</label><input type="text" name="txt_nickname"><br/><br/>
        <input type="submit" value="Войти в чат">
      </form>
  </body>
</html>
