
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Чат</title>
</head>
<body>
<h1>${name} Добро пожаловать в чат </h1>
<h4> ${mess}</h4>
<br/><br/><br/><br/><br/><br/><br/>
<form name="сообщения" action="allMessage" method="post" >
    <textarea rows="4" cols="50" placeholder="Введите ваше сообщение" name="txt_message"></textarea>
    <input type="submit" value="Отправить сообщение">
</form>
<br/>
<h3>${name} Можешь выбрать одну из комнат по твоим интересам</h3>
    <form method="post">
        <label>Политика</label><button type="submit" formaction="politika">Войти</button> <br/><br/>
        <label>Исскуство</label><button type="submit" formaction="isskustvo">Войти</button> <br/><br/>
        <label>Образование</label><button type="submit" formaction="obrazovanie">Войти</button> <br/><br/>
        <label>Домашние животные</label><button type="submit" formaction="pets">Войти</button> <br/><br/>
        <label>Любовь и знакомства</label><button type="submit" formaction="love">Войти</button>
    </form>

</body>
</html>
