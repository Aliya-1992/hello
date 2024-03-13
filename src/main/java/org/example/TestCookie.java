package org.example;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/test")

public class TestCookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        //Cookie cookie = new Cookie("key", "value");
       // resp.addCookie(cookie);
        Cookie[] cookie = req.getCookies();
        String cookkieTemp = "key";
        Cookie cookie1 = null;
        if(cookie != null){
            for(Cookie cookie2: cookie){
                if (cookkieTemp.equals(cookie2.getName())){
                    cookie1 = cookie2;
                    break;
                }
            }
            PrintWriter printWriter = resp.getWriter();
            printWriter.println(cookie1.getValue());
        }



    }
}
