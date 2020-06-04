package day3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/memberServlet")
public class exam extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public exam() {
        super();
        
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("ok");
		
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("big5");
		
		
		String Name=request.getParameter("name");
		String Address=request.getParameter("address");
	
		String[] Interest=request.getParameterValues("interest");
		
		String str="";
		
		for(int i=0;i<Interest.length;i++)
		{
			str=str+Interest[i]+" ";
		}
		
		String Sex=request.getParameter("sex");
		String Memo=request.getParameter("memo");
		
		
		int Ruler=Integer.parseInt(request.getParameter("ruler"));
		int Pen=Integer.parseInt(request.getParameter("pen"));
	
		int sum=Ruler*25+Pen*30;
		
		PrintWriter out=response.getWriter();
		
		out.print("姓名:"+Name+
				"<br>地址:"+Address+
				"<br>興趣:"+str+
				"<br>性別："+Sex+
				"<br>尺:"+Ruler+
				"<br>筆:"+Pen+
				"<br>共："+sum+"元"+
				"<br>備註:"+Memo);
	
	}

	/*public void init()
	{
		System.out.println("start");
	}*/
	

}