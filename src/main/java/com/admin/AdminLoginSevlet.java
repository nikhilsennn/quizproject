package com.admin;
import javax.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class AdminLoginSevlet {
	@WebServlet("/log2")
	public class AdminLoginServlet extends HttpServlet {
		public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException
		{
			String webuser=req.getParameter("email");
			String webpass=req.getParameter("pass");
			
			String aemail="admin@hello.com";
			String apass="admin123";
			
			if(aemail.equals(webuser)&& apass.equals(webpass))
			{
				resp.sendRedirect("addq.jsp");
			}
			
			else {
				resp.sendRedirect("index.jsp");
			}
		}
	  
	}


}
