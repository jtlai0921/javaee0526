package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.memberDao;
import Model.member;

@WebServlet("/addServlet")
public class addServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public addServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username,name,password,phone,address;
		
		username=request.getParameter("username");
		
		
		boolean m=new memberDao().checkAccount(username);
		
		
		if(m)
		{
			response.sendRedirect("addError.jsp");
		}
		else
		{
			name=request.getParameter("name");
			password=request.getParameter("password");
			phone=request.getParameter("phone");
			address=request.getParameter("address");
			
			member m2=new member();
			
			m2.setName(name);
			m2.setUsername(username);
			m2.setPassword(password);
			m2.setPhone(phone);
			m2.setAddress(address);
			
			
			new memberDao().add(m2);
			
			
			response.sendRedirect("addSuccess.jsp");
		}
	}

}