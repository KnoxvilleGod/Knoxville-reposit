package Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "ServletPolitika",urlPatterns = "/politika")
public class ServletPolitika extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserMess userMess = new UserMess();
        request.setAttribute("name",userMess.getUser());
        request.getRequestDispatcher("politika.jsp").forward(request,response);
    }


}
