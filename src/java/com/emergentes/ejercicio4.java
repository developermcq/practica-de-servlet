/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author maicol
 */
@WebServlet(name = "ejercicio4", urlPatterns = {"/ejercicio4"})
public class ejercicio4 extends HttpServlet {

    
   
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset-utf-8");
        PrintWriter out=response.getWriter();
        try
        {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>juego de datos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> pulse en tirar dados </h1>");
            out.println("<form method='post' action=''>");
            out.println("<table>");
            out.println("<tr>");
            
            out.println("<td><input type='submit' value='Tirar Dados' style='margin:auto' ></td>");
           
           
            out.println("</tr>");
            
            out.println("</table>");
            
            
            out.println("</form>");  
            
            out.println("</body>");
            out.println("</html>");
        }
        finally
        {out.close();}
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
       
        response.setContentType("text/html;charset-utf-8");
        PrintWriter out= response.getWriter();
        try
        {
        int num;
        int num2;
        num=(int) (Math.random()*(6-1+1)+1);
        num2=(int) (Math.random()*(6-1+1)+1);
       
        
         out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>tirar dados</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> los datos reibidos </h1>");
             out.println("<form method='post' action=''>");
             out.println("<table>");
             out.println("<tr>");
         
             out.println(num);
             out.println(num2);
           
             int suma=num+num2;
             
             switch(suma)
             {
                 case 7:
                         
                    out.println("usted gano");  
                    break;
                    
                    case 11:
                         
                    out.println("usted gano");  
                    break;
                    
                    default:
                        out.println("vuelve a intentarlo");
                         
             }
           
             out.println("</tr>");
            
             out.println("</table>");
            out.println("</form>");   
            out.println("</body>");
            out.println("</html>");
        }
        finally
        { out.close();}
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
