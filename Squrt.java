package com.jaggu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/sq") 
public class Squrt extends HttpServlet {
	private static final long serialVersionUID = 7574420871059618180L;
	public void service(HttpServletRequest req,HttpServletResponse res) 
			throws IOException, ServletException {

//	PrintWriter p=res.getWriter();
//	p.print("hello world sqrt ");
	

//	PrintWriter p=res.getWriter();
//	int sum=Integer.parseInt(req.getParameter("sum"));
//	p.print("<b>hello send </b>"+sum);

//	HttpSession s=req.getSession();
//	int sum=(int)s.getAttribute("sum");
//    PrintWriter p=res.getWriter();
//    p.print("<b>hello send </b>"+sum);
        
		String sum="";
		Cookie[] cokies=req.getCookies();
		for(Cookie c:cokies) {
			if(c.getName().equals("sum")) {
				sum=c.getValue();}
		}
		int sms=Integer.parseInt(sum);
		sms=sms*sms;
	    PrintWriter p=res.getWriter();
	    p.print("<b>hello send </b>"+sms);
	        
	
	}
	}
