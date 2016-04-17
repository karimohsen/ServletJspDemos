/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author Karim
 */
public class MyServerListener implements ServletContextListener{

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext con = sce.getServletContext();
        con.setAttribute("count", 0);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Context is Destroyed");
    }
    
}
