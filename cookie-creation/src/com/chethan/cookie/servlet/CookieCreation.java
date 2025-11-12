package com.chethan.cookie.servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/service", loadOnStartup = 1)
public class CookieCreation extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        Cookie myCookie = new Cookie("Chethan","asdfghj");
        myCookie.setMaxAge(60*60*24);
        response.addCookie(myCookie);

        writer.println("<h1>Cookie created!!</h1>");

        Cookie[] cookies = request.getCookies();
        if (cookies!=null){
            for (Cookie cookie: cookies){
                if (cookie.getName().equals("Chethan")){
                    writer.println("<p> welcome, "+cookie.getValue()+"</p>");
                }
            }
        }
    }
}
