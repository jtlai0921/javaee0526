package day4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/examServlet")
public class examServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public examServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out=response.getWriter();		
		
		
		//response.getWriter().print("<h1>hello</h1>");;
		//response.sendRedirect("success.html");
		
	int X=Integer.parseInt(request.getParameter("x"));
		
		if(X>=60)
		{
			out.print("<h1>>=60</h1>");
		}
		else
		{
			out.print("<h1><60</h1>");
		}
	
	}

	
	

}