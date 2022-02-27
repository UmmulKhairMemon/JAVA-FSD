package com.si.config;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/search")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Properties prop= new Properties();
		prop.load(getServletContext().getResourceAsStream("/WEB-INF/config.properties"));
		String ProductName =request.getParameter("ProductName");
		Connection conn= DBCOnfig.getConnect(prop);
		out.print("<h1>Product Details</h1><hr>");
		
		if(conn!=null)
		{
			try {
				
				PreparedStatement stmt= conn.prepareStatement("select * from Product where ProductName=?");
				stmt.setString(1, ProductName);
				ResultSet rs=stmt.executeQuery();
			
				if(rs!=null)
				{
					while(rs.next())
				       {
						out.print("<table border=1 cellspacing=0 cellpadding=10><tr><th>ProductID</th><th>ProductName</th><th>Weight</th>"
								+ "<th>Price</th><th>PackageDate</th><th>ExpiryDate</th>");
						out.print("<tr>");
						out.print("<td>"+rs.getInt(1)+"</td>"+"<td>"+rs.getString(2)+"</td>"+"<td>"+rs.getString(3)+"</td>"
								+"<td>"+rs.getInt(4)+"</td>"+"<td>"+rs.getDate(5)+"</td>"+"<td>"+rs.getDate(6)+"</td>");
						out.print("</table>");
					    out.print("<br>Product found");
				       }
					}
				 else
				 {
					out.print("Failed to fetch data:No such Product exists ");
				 }
			}
			catch(SQLException sql)
			{
				sql.printStackTrace();
			}
		}
		else
		{
			out.print("Error while connecting with database");
		}
	}


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}