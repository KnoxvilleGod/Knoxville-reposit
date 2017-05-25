package Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by User on 25.05.2017.
 */
@WebServlet(name = "ServletAllMessage", urlPatterns = "/allMessage")
public class ServletAllMessage extends HttpServlet {
    private static final String message = "txt_message";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Message = request.getParameter(message);
        UserMess userMess = new UserMess();
        userMess.setMessageAll(Message);
        request.setAttribute("name",userMess.getUser());
        request.setAttribute("mess",userMess.getAll());
        request.getRequestDispatcher("chat.jsp").forward(request,response);
    }


}
