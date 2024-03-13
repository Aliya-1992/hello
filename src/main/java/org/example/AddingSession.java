package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/session")
public class AddingSession extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        /*HttpSession httpSession = req.getSession();
        String name = (String) httpSession.getAttribute("key");

        PrintWriter printWriter = resp.getWriter();
        if(name == null){
            httpSession.setAttribute("key", "value");
            printWriter.println(2);
        }
        else{
            printWriter.println(name);
            httpSession.removeAttribute("key");
        }*/
        HttpSession httpSession = req.getSession();
        Person person = (Person) httpSession.getAttribute("person");
        PrintWriter printWriter = resp.getWriter();
        if(person == null){
            person = new Person("Roma", 57);
            httpSession.setAttribute("person", person);
            printWriter.println(4);
        }
        else{
            printWriter.println(person.getName());
            printWriter.println(person.getAge());
            httpSession.removeAttribute("person");
        }

    }
}
