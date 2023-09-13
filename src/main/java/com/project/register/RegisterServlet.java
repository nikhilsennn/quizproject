package com.project.register;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.project.dbHandler.RegistertoDb;
@WebServlet("/reg")
public class RegisterServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)  
	{
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		String add=req.getParameter("address");
		String gen=req.getParameter("gender");
		RegistertoDb.InsertData(email, pass, add, gen);


	}

}
