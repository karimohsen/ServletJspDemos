/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 *
 * @author Karim
 */
public class MyServerListener implements ServletContextListener,HttpSessionListener{

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext con = sce.getServletContext();
        con.setAttribute("visit", 0);
        con.setAttribute("online", 0);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Context is Destroyed");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
    ServletContext cont = se.getSession().getServletContext();    
    int count = (Integer)cont.getAttribute("online");
    count++;
    cont.setAttribute("online", count);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
    ServletContext cont = se.getSession().getServletContext();    
    int count = (Integer)cont.getAttribute("online");
    count--;
    System.out.println(count);
    cont.setAttribute("online", count);
    }
    
}
