package com.chethan.formvalidation.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/service",loadOnStartup = 1)
public class PatientDetailsServlets extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println(servletRequest.getParameter("Fname"));
        System.out.println(servletRequest.getParameter("gender"));
        System.out.println(servletRequest.getParameter("phone"));
        System.out.println(servletRequest.getParameter("dob"));
        System.out.println(servletRequest.getParameter("ismarried"));
        System.out.println(servletRequest.getParameter("address"));
        System.out.println(servletRequest.getParameter("insurance"));
        System.out.println(servletRequest.getParameter("pom"));


    }
}
