
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ejercicio3", urlPatterns = {"/ejercicio3"})
public class ejercicio3 extends HttpServlet {

   
    

   
    @Override
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
             out.println("<form method='post' action=''>");
             out.println("<table>");
             out.println("<tr>");
            
             out.println("<td><input type='number' name='dato' ></td>");
             out.println("<td>");
             out.println("<select name='operacion' >");
             out.println("<option value='uno'> + </option>");
             out.println("<option value='dos'> - </option>");
             out.println("<option value='tres'> * </option>");
             out.println("<option value='cuatro'> / </option>");
             out.println("</select>");
             out.println("</td>");
              out.println("<td><input type='number' name='dato2' ></td>");
             out.println("<td><input type='submit' value='Procesar'></td>");
             out.println("</tr>");
            
             out.println("</table>");
            out.println("</form>");   
            out.println("</body>");
            out.println("</html>");
          } finally
        {   
            out.close();
        }
    }

    

   
   
         @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        
       
       String moneda=request.getParameter("operacion");
       int  dato=Integer.parseInt(request.getParameter("dato"));
       int  dato2=Integer.parseInt(request.getParameter("dato2"));
       
       
        
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
            
           
           switch (moneda) {
                case "uno":
                     out.println("la suma de "+dato+"+"+dato2+"es :"+(dato+dato2));
                    break;
                case "dos":
                     out.println("La resta de "+dato+"-"+dato2+"es :"+ (dato-dato2));
                    break;
                  case "tres":
                      out.println("la multiplicacion "+dato+"*"+dato2+"es :"+dato*dato2);
                    break;
              case "cuatro":
                      out.println("la division de "+dato+"/"+dato2+"es :"+dato/dato2);
                    break;        
   
                           }
             
            out.println("</body>");
            out.println("</html>");
          } finally
        {
            out.close();
        }
    }
}

   
    

