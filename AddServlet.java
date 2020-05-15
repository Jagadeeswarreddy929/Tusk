package com.jaggu;

//import java.io.IOException;
//import java.io.PrintWriter;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletConfig;
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
@WebServlet("/add")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = -3675230375684776185L;

	public void service(HttpServletRequest req,HttpServletResponse res) 
			throws IOException, ServletException {
//		
//		int num1=Integer.parseInt(req.getParameter("num1"));
//		int num2=Integer.parseInt(req.getParameter("num2"));
//		System.out.print("sum of numbers is "+num1+num2);
		PrintWriter g=res.getWriter();
		g.print("hbhbhkh ");
		
//		int i=(Integer.parseInt(req.getParameter("num1"))+
//				 Integer.parseInt(req.getParameter("num2")));
//	   req.setAttribute("sum",i);
//		RequestDispatcher dr=req.getRequestDispatcher("sq");
//		dr.forward(req, res);
//		
		
//		
//		PrintWriter g=res.getWriter();
//		g.print("hbhbhkh ");
		
//		int i=(Integer.parseInt(req.getParameter("num1"))+
//				 Integer.parseInt(req.getParameter("num2")));
//		res.sendRedirect("sq?sum="+i);
		
//		int i=(Integer.parseInt(req.getParameter("num1"))+
//                Integer.parseInt(req.getParameter("num2")));
//		HttpSession session=req.getSession();	
//		session.setAttribute("sum", i);
//		res.sendRedirect("add.jsp");

//		
//		int i=(Integer.parseInt(req.getParameter("num1"))+
//              Integer.parseInt(req.getParameter("num2")));
//		Cookie ne=new Cookie("sum",i+"");
//		res.addCookie(ne);
//		res.sendRedirect("sq");
		
//		PrintWriter p=res.getWriter();
//		ServletContext obj=getServletContext();
//		String s=obj.getInitParameter("Name");
//		p.println("<b>Hello </b>"+s);
//		ServletConfig odbj=getServletConfig();
//		String ds=odbj.getInitParameter("name");
//		p.println("<b>Hello </b>"+ds);

		
//		Data data=new Data("Rahul",452);
//		req.setAttribute("student", data);
//		RequestDispatcher obj=req.getRequestDispatcher("add.jsp");
//		obj.forward(req, res);
		

	}
}
