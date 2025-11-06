package com.chethan.formvalidation.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/drivinglicence",loadOnStartup = 3)
public class DrivingLicenceServlets extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println(servletRequest.getParameter("fullName"));
        System.out.println(servletRequest.getParameter("guardianName"));
        System.out.println(servletRequest.getParameter("dob"));
        System.out.println(servletRequest.getParameter("gender"));
        System.out.println(servletRequest.getParameter("bloodGroup"));
        System.out.println(servletRequest.getParameter("mobile"));
        System.out.println(servletRequest.getParameter("email"));
        System.out.println(servletRequest.getParameter("address"));
        System.out.println(servletRequest.getParameter("state"));
        System.out.println(servletRequest.getParameter("district"));
        System.out.println(servletRequest.getParameter("pincode"));
        System.out.println(servletRequest.getParameter("licenceType"));
        System.out.println(servletRequest.getParameter("vehicleType"));
        System.out.println(servletRequest.getParameter(""));
        System.out.println(servletRequest.getParameter(""));
        System.out.println(servletRequest.getParameter(""));
        System.out.println(servletRequest.getParameter(""));
        System.out.println(servletRequest.getParameter(""));
    }
}
