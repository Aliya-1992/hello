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
        printWriter.write("<h1> Hello my little pony</h1>");
    }
}
