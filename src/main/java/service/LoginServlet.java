package service;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        int num3 = Integer.parseInt(request.getParameter("num3"));
        
    
        int sum = num1 + num2 + num3;
        int avg = (num1 + num2 + num3)/3;
     
        response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        response.getWriter().println("SUM of 3 Numbers is: " + sum);
        
        response.getWriter().println("Average of 3 Numbers is: " +avg); 
        response.getWriter().println("</body></html>");
    }
}