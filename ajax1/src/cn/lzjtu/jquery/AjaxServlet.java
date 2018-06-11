package cn.lzjtu.jquery;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AjaxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/plain;charset = utf-8");
    	PrintWriter out = response.getWriter();
    	out.println("hello");
    	out.close();
    	
    }
}
