package com.admin;
import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.admin.Qbank;
	@WebServlet("/add1")
	public class AddQuestion extends HttpServlet {
		public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException
		{
		 String qid=req.getParameter("qid");	
		 String ques=req.getParameter("ques");
		 String opA=req.getParameter("opA");
		 String opB=req.getParameter("opB");
		 String ans=req.getParameter("ans");
		 Qbank.add(qid, ques, opA, opB, ans);
		}

	}


}
