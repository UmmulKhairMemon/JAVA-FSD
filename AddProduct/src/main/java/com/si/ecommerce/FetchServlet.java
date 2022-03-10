package com.si.ecommerce;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

@WebServlet("/fetch")
public class FetchServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SessionFactory factory= HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        
        List<EProduct> list= session.createQuery("from EProduct").list();
        
        PrintWriter out=response.getWriter();
        for(EProduct p:list)
        {
        	out.print(p.getName()+" "+p.getPrice()+" "+p.getDateAdded());
        }
    }
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            // TODO Auto-generated method stub
            doGet(request,response);
        }
        }
        