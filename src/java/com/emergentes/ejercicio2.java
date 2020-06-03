
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
@WebServlet(name = "ejercicio2", urlPatterns = {"/ejercicio2"})
public class ejercicio2 extends HttpServlet {

   

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
         response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {
          
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet leeparametros Post (formulario)</title>");            
            out.println("</head>");
            out.println("<body>");
            
             out.println("<form method='post' action=''>");
             out.println("<table>");
             out.println("<tr>");
            
             out.println("<td><input type='number' name='dato' ></td>");
              out.println("<td>");
             out.println("<select name='moneda'>");
             out.println("<option value='uno'>Bs a $</option>");
              out.println("<option value='dos'>$ a Bs</option>");
             out.println("</select>");
             out.println("</td>");
             out.println("<td><input type='submit' value='Convertir'></td>");
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
        
       
       String moneda=request.getParameter("moneda");
       int  convercion=Integer.parseInt(request.getParameter("dato"));
       
       
        
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
        
        
         out.println(convercion+" Bs valen : "+convercion/6.90+" $");
        break;
    case "dos":
          out.println(convercion+" $ valen :"+convercion*6.90+" Bs");
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
