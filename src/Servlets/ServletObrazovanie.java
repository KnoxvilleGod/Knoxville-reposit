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
@WebServlet(name = "ServletObrazovanie",urlPatterns = "/obrazovanie")
public class ServletObrazovanie extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserMess userMess = new UserMess();
        request.setAttribute("name",userMess.getUser());
        request.getRequestDispatcher("obrazovanie.jsp").forward(request,response);
    }


}
