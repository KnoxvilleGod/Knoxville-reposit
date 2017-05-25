package Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by User on 24.05.2017.
 */
@WebServlet(name = "FirstServlet", urlPatterns = "/register")
public class FirstServlet extends HttpServlet {
    private static final String name = "txt_name";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Name = request.getParameter(name);
        UserMess userMess = new UserMess();
        userMess.setUser(Name);
        if (Name.isEmpty()){
            request.getRequestDispatcher("noName.jsp").forward(request,response);
        }else {
            request.setAttribute("name",Name);
            request.getRequestDispatcher("chat.jsp").forward(request,response);
        }

    }


}
