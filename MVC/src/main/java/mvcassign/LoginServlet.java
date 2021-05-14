package mvcassign;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
            
            
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		
		
	}
	
	
    
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
{
	
	      //PrintWriter a=response.getWriter();
	     
	Recognition n=new Recognition();
	

	    
	        String name=request.getParameter("name");
	        String pass=request.getParameter("password");
	        
	       boolean isvalid= n.RecongnationUser(name,pass);
	       
	       if(isvalid==true)
	       {	   
	     request.setAttribute("name",name);
	    request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
	       }
	       else
	       { 
	    	   
	    	   request.setAttribute("errormessage","invalid user");
	    	   request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	       }
	       
	       
	
}
	

}