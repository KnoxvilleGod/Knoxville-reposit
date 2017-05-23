package Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.jar.Attributes;


@WebServlet(name = "Openchat", urlPatterns = "/nickname")
public class Servlet extends HttpServlet {
    private static final String name = "txt_nickname";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Name = request.getParameter(name);

        if (Name.isEmpty()) {
            response.setContentType("text/html");
            response.setCharacterEncoding("UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<head>");
            out.println("<title>Введите ваш ник</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h3>Так не пойдет, сначала укажите свой ник, пожалуйста:</h3>");
            out.println("<form name=\"Никнейм\" action=\"nickname\" method=\"post\">");
            out.println("<label>Введите ваш никнейм</label><input type=\"text\" name=\"txt_nickname\"><br/><br/>");
            out.println("<input type=\"submit\" value=\"Войти в чат\">");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");

        } else {
            User_Mess user_mess = new User_Mess();
            user_mess.setNickname(Name);


            response.setContentType("text/html");
            response.setCharacterEncoding("UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<head>");
            out.println("<title>Чатик</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h3>Поздравляю вас, " + Name + " вы в чате, общайтесь на здоровье)))</h3> ");
            out.println("<br/><br/><br/><br/><br/><br/><br/>");
            out.println("<form name=\"Сообщения\" action=\"message\" method=\"post\">");
            out.println("<textarea rows=\"4\" cols=\"50\" placeholder=\"Введите ваше сообщение...\" name=\"txt_message\"></textarea>");
            out.println("<input type=\"submit\" value=\"Отправить сообщение\">");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");


        }


    }





}
