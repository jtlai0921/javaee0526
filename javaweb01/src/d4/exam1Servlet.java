package d4;//d4.exam1Servlet

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/exam1Servlet")
public class exam1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public exam1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//PrintWriter out=response.getWriter();		
		
		
		//response.getWriter().print("<h1>hello</h1>");;
		//response.sendRedirect("success.html");
		
	String user=request.getParameter("user");
	String password=request.getParameter("password");	
		if(user.equals("abc")&&password.equals("123"))
		{
			//out.print("<h1>>=60</h1>");
			
			response.sendRedirect("success.html");
		}
		else
		{
			//out.print("<h1><60</h1>");
			response.sendRedirect("error.html");
		}
	
	}

	
	

}