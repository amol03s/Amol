package com.training.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculateServlet extends HttpServlet {
	   double slb1;
	   double slb2;
	   double interest;
	   public void init(ServletConfig c) //using this init method we have to initialize the value slb1,slb2,interest
	   {
		   double slb1=Double.parseDouble(c.getInitParameter("slb1"));
		   double slb2=Double.parseDouble(c.getInitParameter("slb2"));
		   double interest=Double.parseDouble(c.getInitParameter("interest"));
	   }
	
	 public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		   
		   double inc=Double.parseDouble(req.getParameter("inc"));
		   double iamt=Double.parseDouble(req.getParameter("iamt"));
		   double lamt=Double.parseDouble(req.getParameter("lamt"));
		   double tamt=0;  //total amount 
		   if(iamt<100000)  //if investment amount is less than 100000 then follow below formula
		   {
			   tamt=inc-iamt;
		   }
		   else   //if investment amount is greater than 100000 then follow below formula
		   {
			   tamt=inc-100000;
			   
		   }
		   req.setAttribute("tamt",tamt);
		  
		   double pamt=0;
		   pamt=lamt-(lamt*interest);
		   req.setAttribute("pamt",pamt);
		   
		   double taxamt=0;
		   taxamt=tamt-pamt;
		   
		   double tax;
		   if(taxamt<=slb1)
		   {
			   tax=0;
			   
		   }
		   else if(taxamt<slb1 && taxamt>slb2)
		   {
			   taxamt=taxamt-slb1;
			   tax=taxamt*(0.20);
			   
		   }
		   else
		   {

			   taxamt=taxamt-slb1;
			   tax=taxamt*(0.30);
			  
		   }
		   req.setAttribute("tax",tax);
		   RequestDispatcher rd = req.getRequestDispatcher("calculate.jsp");
		
		   rd.forward(req, res);
		 }
	 
}
