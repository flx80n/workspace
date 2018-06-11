package cn.lzjtu.jquery;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.lzjtu.dao.StudentManager;


public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public StudentServlet() {
 
    }
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String sn = request.getParameter("sn");
		response.setContentType("text/plain;charset=utf-8");
		PrintWriter out = response.getWriter();
		boolean temp = new StudentManager().findBySN(sn);
		out.println(temp?1:0);
		out.close();
	}
	
	

}
