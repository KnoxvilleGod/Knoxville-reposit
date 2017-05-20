package com.register.servlets;

import ConnecorBD.Connector;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

@WebServlet(name = "MyServlet",urlPatterns = "/register")
public class MyServlet extends HttpServlet {
    private static final String Name = "txt_name";
    private static final String Surname = "txt_surname";
    private static final String Password = "numb_password";


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter(Name);
        String surname = request.getParameter(Surname);
        String password = request.getParameter(Password);

        if(name.isEmpty()){
            name="NoName";
        }

        if(surname.isEmpty()){
            surname="NoSurname";
        }


        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
        out.println("<title>Спасибо за регистрацию</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>Благодарим вас за регистрацию уважаемый  " + name + " " + surname + "</h3>");
        out.println("<title>zuzu</title>");
        out.println("");




    }
    @Override
    public void init(ServletConfig config) throws ServletException{
    super.init(config);
}
    @Override
    public  void init()throws ServletException{
        super.init();
    }
    @Override
    public void destroy(){super.destroy();}



}
