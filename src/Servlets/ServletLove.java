package Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by User on 24.05.2017.
 */
@WebServlet(name = "ServletLove", urlPatterns = "/love")
public class ServletLove extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserMess userMess = new UserMess();
        request.setAttribute("name",userMess.getUser());
        request.getRequestDispatcher("love.jsp").forward(request,response);
    }


}
