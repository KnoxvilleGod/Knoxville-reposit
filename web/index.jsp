
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Register</title>
  </head>
  <body>
  <h3>Пожалуйста, введите необходимые данные</h3>
  <form name="Личные данные" action="register" method="post">
    <label>Введите ваше имя</label> <input type="text" title="Введите ваш никнейм" name="txt_name"><br/><br/>

    <label>Введите вашу фамилию</label><input type="text" title="Введите фамилию" name="txt_surname"><br/><br/>

    <label>Введите ваш пароль</label> <input type="password" title="Ввудите ваш пароль" name="numb_password"><br/><br/>
    <input type="submit" value="Зарегестриваться">
    <form name="Возврат к форме" action=>
      <input type="submit" value="Вернуться назад к форме">
    </form>
    </form>
  </body>
</html>