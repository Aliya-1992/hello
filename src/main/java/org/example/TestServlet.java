package org.example;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class TestServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {

        PrintWriter printWriter = response.getWriter();
       //printWriter.write("<h1> Hello my little pony</h1>");
        //String id = request.getParameter("id");
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        printWriter.println("<h1>name: " + name + "</h1>"); //http://localhost:8084/newjava/testServlet?id=12  http://localhost:8084/newjava/testServlet?name=Vladimir&age=33
        printWriter.println("<h1>age: " + age + "</h1>");

    }
}
