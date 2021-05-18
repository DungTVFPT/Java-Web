/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener;

import dao.ViewCountDAO;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Web application lifecycle listener.
 *
 * @author fb.com/truongdung0706
 */
public class ViewCount implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        ServletContext ctx = null;
        try {
            ViewCountDAO viewDAO = new ViewCountDAO();
            
            //Update views
            viewDAO.updateViewCount(); 
            
            //Get views from database          
            int count = viewDAO.getViewCount();
                                  
            //Set attribute
            ctx = se.getSession().getServletContext();
            ctx.setAttribute("totalViews", count);
            
        } catch (Exception e) {
            ctx.setAttribute("error", e.getMessage());
        }
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
    }
}
