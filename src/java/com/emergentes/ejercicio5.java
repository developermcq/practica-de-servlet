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


@WebServlet(name = "ejercicio5", urlPatterns = {"/ejercicio5"})
public class ejercicio5 extends HttpServlet {

  
  
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
      response.setContentType("text/html;charset-utf-8");
      PrintWriter out = response.getWriter();
      
      
      try
      {
          out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>juego de datos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Matriz caracol (:) </h1>");
            out.println("<form method='post' action=''>");
            out.println("<table>");
            out.println("<tr>");
            
            out.println("<td><input type='number' placeholder='ingrese cantidad caracol' name='cantidad' size='25' ></td>");
            out.println("<td><input type='submit' value='Vamos!'></td>");
           
            out.println("</tr>");
            
            out.println("</table>");
            
            
            out.println("</form>");  
            
            out.println("</body>");
            out.println("</html>");
      }
      finally
      {
          out.close();
      }
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
      response.setContentType("text/html;charset-utf-8");
      PrintWriter out = response.getWriter();
      
      int n=Integer.parseInt(request.getParameter("cantidad"));
      int x=1;
      try
      {
          out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>juego de datos</title>");            
            out.println("</head>");
            out.println("<body>");
           
           
            
           int[][] M = new int[n + 1][n + 1];
            for (int a = 1; a <= n / 2; a++) {
            for (int i = a; i <= n - a; i++) {
                M[a][i] = x;
                x++;
            }
            for (int i = a; i <= n - a; i++) {
                M[i][n - a + 1] = x;
                x++;
            }
            for (int i = n - a + 1; i >= a + 1; i--) {
                M[n - a + 1][i] = x;
                x++;
            }
            for (int i = n - a + 1; i >= a + 1; i--) {
                M[i][a] = x;
                x++;
            }
        }
        if (n % 2 == 1) {
            M[n / 2 + 1][n / 2 + 1] = x;
        }
        
        
        out.println("<table style='margin:auto' ");
         out.println("<tr>");
        
        
        for (int i = 1; i <= n; i++) 
      {
            for (int j = 1; j <= n; j++) 
            {
                 out.println("<td>");
                 
               out.println( M[i][j]);
                out.println("<td>");
            }
            out.println("<br>");
            
          out.println("</tr>");   
      }     
       out.println("<table>");      
           
            
            
            
          
            
            out.println("</body>");
            out.println("</html>");
      }
      finally
      {
          out.close();
      }
    }

    

  
    @Override
    public String getServletInfo() 
     {
        return "Short description";
    }// </editor-fold>

}

