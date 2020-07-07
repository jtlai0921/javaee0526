package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.porder;


@WebServlet("/addServlet")
public class addServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public addServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int p1=Integer.parseInt(request.getParameter("product1"));
		int p2=Integer.parseInt(request.getParameter("product2"));
		int p3=Integer.parseInt(request.getParameter("product3"));
		
		
		porder p=new porder();		
		p.add(p1, p2, p3);		
		HttpSession session=request.getSession();		
		session.setAttribute("P", p);
		
		
		response.sendRedirect("day10/confirm.jsp");
		
		
	}

}