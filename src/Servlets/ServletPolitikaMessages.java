package Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "ServletPolitikaMessages",urlPatterns = "/politikMessage")
public class ServletPolitikaMessages extends HttpServlet {
    private static final String message = "txt_message";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Message = request.getParameter(message);
        UserMess userMess = new UserMess();
        userMess.setMessagePolitika(Message);
        request.setAttribute("name",userMess.getUser());
        request.setAttribute("mess",userMess.getMessagePoliika());
        request.getRequestDispatcher("politikaMessage.jsp").forward(request,response);
    }


}
