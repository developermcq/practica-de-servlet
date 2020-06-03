
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ejercicio1", urlPatterns = {"/ejercicio1"})
public class ejercicio1 extends HttpServlet {

   
  

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
           
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {
          
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet leeparametros Post (formulario)</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> los datos reibidos </h1>");
            String nombre =request.getParameter("nombre");
            String correo =request.getParameter("correo");
            String telefono =request.getParameter("telefono");
            if(nombre!=null || correo!=null ||telefono!=null   )
            {
               
                out.println("Su nombre es : "+nombre+"<br>");
                out.println("Su correo es : "+correo+"<br>");
                 out.println("Su Telefono es :"+telefono+"<br>");
                
            }
            else
                out.println("ponga los parametros en la URL");
            out.println("</body>");
            out.println("</html>");
          } finally
        {   
            out.close();
        }
    }


}
