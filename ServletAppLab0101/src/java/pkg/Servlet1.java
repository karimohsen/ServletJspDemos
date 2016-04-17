/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg;

import javax.servlet.*;
import java.io.*;

public class Servlet1 implements Servlet{
	ServletConfig myconf;
        @Override
	public void init(ServletConfig config) throws ServletException{
		myconf=config;
	}
        @Override
	public void service (ServletRequest request,ServletResponse response)throws ServletException,IOException{
         ServletContext cont = 	myconf.getServletContext();
         response.setContentType("text/html");
	 PrintWriter out = response.getWriter();
         int count = (int)cont.getAttribute("count");
         count++;
         out.print("Number of Users in System is : "+count);
         cont.setAttribute("count", count);
        }
        @Override
	public void destroy(){
		System.out.println("I am inside the destroy method");
	}
        @Override
	public String getServletInfo(){
		return null;
	}
        @Override
	public ServletConfig getServletConfig(){
		return null;
	}
	
}