package com.training.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


 public class MyAdderServlet extends HttpServlet{
 	public  void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException, IOException{
 		PrintWriter out=resp.getWriter();
 		resp.setContentType("text/html");
 		
 		int num1=Integer.parseInt(req.getParameter("n1"));
 		int num2=Integer.parseInt(req.getParameter("n2"));
 		
 		out.println("Addition is :"+(num1+num2));
 
 	}
 }
