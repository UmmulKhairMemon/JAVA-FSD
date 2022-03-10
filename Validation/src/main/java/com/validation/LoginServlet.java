package com.validation;


import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
        private static final long serialVersionUID = 1L;
  
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        	 response.setContentType("text/html");  
             PrintWriter out=response.getWriter();  
             //request.getRequestDispatcher("index.html").include(request, response);  
               
             String name=request.getParameter("name");  
             String password=request.getParameter("password");  
               
             if(password.equals("admin123")){  
             out.print("Welcome, "+name);  
             HttpSession session=request.getSession();  
             session.setAttribute("name",name); 
             response.sendRedirect("Dashboard");
             }  
             else{  
            	 
                 out.print("Sorry, username or password is wrong!"); 
                 out.print("<br><br><a href='Login'>Login</a>");
             }  
             out.close();  
         }  
        
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                doGet(request, response);
        }

}

