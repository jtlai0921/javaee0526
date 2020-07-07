package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.porderDao;
import Model.porder;

@WebServlet("/finishServlet")
public class finishServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public finishServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		
		porder p=(porder)session.getAttribute("P");
		
		new porderDao().add(p);
		
		response.sendRedirect("day10/finish.jsp");
	
	
	
	}

}