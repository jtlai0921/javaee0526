package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.memberDao;
import Dao.memberDao2;
import Model.member;

@WebServlet("/addmemberServlet")
public class addmemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public addmemberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("big5");
		
		String name=request.getParameter("name");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String phone=request.getParameter("phone");
		String address=request.getParameter("address");
		String admin=request.getParameter("admin");
		
		boolean ADMIN=true;
		if(admin.equals("f")) ADMIN=false;
		
		member m=memberDao2.queryUser(username);
		
		if(m==null)
		{
			member m2=new member();
			m2.add(name, username, password, phone, address, ADMIN);
			new memberDao().add(m2);
			
			response.sendRedirect("member/addSuccess.jsp");
		}
		else
		{
			response.sendRedirect("member/userError.jsp");
		}
	
	}

}