package com.employee.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LogoutEmp")
public class LogoutEmp extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
		  doPost(req,res);
	  } 

	 public void doPost(HttpServletRequest req, HttpServletResponse res)
             throws ServletException, IOException {

		 req.setCharacterEncoding("UTF-8");
		 res.setContentType("text/html; charset=UTF-8"); 
		 
		 HttpSession session = req.getSession();
		 session.invalidate();
		 String url = req.getContextPath()+"/back_end/emp/EmployeeLogin.jsp";
		 res.sendRedirect(url);
	 }
}