package com.project.login;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthOptionPaneUI;

import com.project.dbHandler.Validator;
@WebServlet("/log")
public class LoginServlet extends HttpServlet  {

	public void doPost(HttpServletRequest req, HttpServletResponse resp) 
	{

		try 
		{
			String email = req.getParameter("email");
			String pass = req.getParameter("pass");
			boolean login_status = Validator.validate(email, pass);
			if (login_status == true) {
				resp.sendRedirect("home.html");
			} else {
				resp.sendRedirect("login.html");
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
		}
	}
	

}
