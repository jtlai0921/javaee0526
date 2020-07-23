package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.member;
import Model.porder;

@WebServlet("/addPorderServlet")
public class addPorderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public addPorderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int p1=Integer.parseInt(request.getParameter("product1"));
		int p2=Integer.parseInt(request.getParameter("product2"));
		int p3=Integer.parseInt(request.getParameter("product3"));
		HttpSession session=request.getSession();
		member m=(member)session.getAttribute("M");
		
		porder p=new porder();		
		p.add(m.getName(), p1, p2, p3);
		
		session.setAttribute("P", p);
		
		response.sendRedirect("porder/confirm.jsp");
	
	}

}