package com.validation;

import java.io.*;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Logout")
public class Logout extends HttpServlet {
        private static final long serialVersionUID = 1L;
    
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        	 response.setContentType("text/html");  
             PrintWriter out=response.getWriter();  
               
               
               
             HttpSession session=request.getSession();  
             session.invalidate();  
               
             out.print("You are successfully logged out!");  
             out.print("<br><br><a href='Login'>Login</a>");
             out.close();  
       }  
        

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                doGet(request, response);
        }
}