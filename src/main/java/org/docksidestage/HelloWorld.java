package org.docksidestage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("serial")
public class HelloWorld extends HttpServlet {

	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory
			.getLogger(HelloWorld.class);
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8"); 
		PrintWriter out = response.getWriter();
		out.println("<!doctype html>");
		out.println("<html>");
	    out.println("<head>");
	    out.println("<meta charset=\"UTF-8\">");
	    out.println("<title>sample</title>");
	    out.println("</head>");
	    out.println("<body>");

	    out.println("<p>Hello, World</p>");

	    out.println("</body>");
	    out.println("</html>");

	    out.close();
	}
}
