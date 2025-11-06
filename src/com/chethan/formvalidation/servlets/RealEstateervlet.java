package com.chethan.formvalidation.servlets;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/realestate",loadOnStartup = 1)
public class RealEstateervlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println(servletRequest.getParameter("sellerFullName"));
        System.out.println(servletRequest.getParameter("sellerEmail"));
        System.out.println(servletRequest.getParameter("sellerPhone"));
        System.out.println(servletRequest.getParameter("sellerContactPreference"));
        System.out.println(servletRequest.getParameter("propertyAddress"));
        System.out.println(servletRequest.getParameter("propertyType"));
        System.out.println(servletRequest.getParameter("bedrooms"));
        System.out.println(servletRequest.getParameter("squareFootage"));
        System.out.println(servletRequest.getParameter("lotSize"));
        System.out.println(servletRequest.getParameter("yearBuilt"));
        System.out.println(servletRequest.getParameter("sellerFeatures"));
        System.out.println(servletRequest.getParameter("reasonForSelling"));
        System.out.println(servletRequest.getParameter("sellingPrice"));
        System.out.println(servletRequest.getParameter("closingDate"));
        System.out.println(servletRequest.getParameter("deed"));
        System.out.println(servletRequest.getParameter("taxStatements"));
        System.out.println(servletRequest.getParameter("utulityills"));
        System.out.println(servletRequest.getParameter("floorPlans"));
        System.out.println(servletRequest.getParameter("propertyPhotos"));
        System.out.println(servletRequest.getParameter("buyerFullName"));
        System.out.println(servletRequest.getParameter("buyerEmail"));
        System.out.println(servletRequest.getParameter("buyerPhone"));
        System.out.println(servletRequest.getParameter("buyerContactPreference"));
        System.out.println(servletRequest.getParameter("buyerPropertyType"));
        System.out.println(servletRequest.getParameter("prefferedLocations"));
        System.out.println(servletRequest.getParameter("desiredBedrooms"));
        System.out.println(servletRequest.getParameter("desiredBathrooms"));
        System.out.println(servletRequest.getParameter("minSqft"));
        System.out.println(servletRequest.getParameter("maxSqft"));
        System.out.println(servletRequest.getParameter("budgetRange"));
        System.out.println(servletRequest.getParameter("buyerFeatures"));
        System.out.println(servletRequest.getParameter("perchaseTimeline"));
        System.out.println(servletRequest.getParameter("preApproval"));
        System.out.println(servletRequest.getParameter("lenderDetails"));


    }
}
