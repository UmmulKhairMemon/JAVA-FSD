package com.detail;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.hibernate.Session;
import org.hibernate.SessionFactory;



@WebServlet("/save")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pname = request.getParameter("pname");
		double pprice = new Double(request.getParameter("pprice"));

		try {
			SessionFactory factory = HibernateUtil.getSessionFactory();

			Session session = factory.openSession();
			session.beginTransaction();

			EProduct ep = new EProduct();
			ep.setName(pname);
			ep.setPrice(pprice);
			Date d = new Date();
			
			session.save(ep);
			session.getTransaction().commit();
			// using HQL
			List<EProduct> list = session.createQuery("from EProduct", EProduct.class).list();

			session.close();

			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			out.println("Product has been added..<br><br>");
			out.println("<b>Product Listing</b><br>");
			for (EProduct p : list) {
				out.println("ID: " + String.valueOf(p.getID()) + ", Name: " + p.getName() + ", Price: "
						+ String.valueOf(p.getPrice()));
			}
			out.println("<br><a href =\"index.jsp\">Return to home</a>");
			out.println("</body></html>");

		} catch (Exception ex) {
			throw ex;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
