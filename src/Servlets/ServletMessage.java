package Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.jar.Attributes;


@WebServlet(name = "ServletMessage", urlPatterns = "/message")
public class ServletMessage extends HttpServlet {
    private static final String message = "txt_message";
    private static final String name = "txt_nickname";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Message = request.getParameter(message);
        String Name = request.getParameter(name);
        User_Mess user_mess = new User_Mess();
        Servlet servlet = new Servlet();

        if(Message.isEmpty()){
            response.setContentType("text/html");
            response.setCharacterEncoding("UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<head>");
            out.println("<title>Чатик</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h3>Поздравляю вас "+Name+", вы в чате, общайтесь на здоровье</h3>");
            out.println("<br/><br/><br/><br/>");
            out.println("Как так, ты же не ввел сообщение дружище, так не пойдет!");
            out.println("<form name=\"Сообщения\" action=\"message\" method=\"post\">");
            out.println("<textarea rows=\"4\" cols=\"50\" placeholder=\"Введите ваше сообщение...\" name=\"txt_message\"></textarea>");
            out.println("<input type=\"submit\" value=\"Отправить сообщение\">");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");

        }else{
            user_mess.setMessages(Message);

                response.setContentType("text/html");
                response.setCharacterEncoding("UTF-8");
                PrintWriter out = response.getWriter();
                out.println("<!DOCTYPE html>");
                out.println("<head>");
                out.println("<title>Чатик</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h3>Поздравляю вас "+Name+", вы в чате, общайтесь на здоровье</h3>");
                out.println(user_mess.getAll());
                out.println("<br/><br/><br/><br/>");
                out.println("<form name=\"Сообщения\" action=\"message\" method=\"post\">");
                out.println("<textarea rows=\"4\" cols=\"50\" placeholder=\"Введите ваше сообщение...\" name=\"txt_message\"></textarea>");
                out.println("<input type=\"submit\" value=\"Отправить сообщение\">");
                out.println("</form>");
                out.println("</body>");
                out.println("</html>");


        }
    }

}
