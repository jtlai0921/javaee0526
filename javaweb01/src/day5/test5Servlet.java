package day5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/test5")
public class test5Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public test5Servlet() {
        super();
    }


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		
		out.println("�m�W:"+name);
		/*Cookie co=new Cookie(name,name);
		co.setMaxAge(5);			
		response.addCookie(co);*/
		
		HttpSession session=request.getSession();
		
		session.setAttribute("Name", name);
		out.println("<a href=test5_2 target=_blank>test5_2</a>");

		
	}

	
}
