package Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "ServletIsskustvoMessage",urlPatterns = "/isskustvoMessage")
public class ServletIsskustvoMessage extends HttpServlet {
    private static final String message = "txt_message";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Message = request.getParameter(message);
        UserMess userMess = new UserMess();
        userMess.setMessageIsskustvo(Message);
        request.setAttribute("name",userMess.getUser());
        request.setAttribute("mess",userMess.getMessageIsskustvo());
        request.getRequestDispatcher("isskustvoMessage.jsp").forward(request,response);
    }


}
