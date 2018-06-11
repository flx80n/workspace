package cn.lzjtu.jquery;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoadServlet() {
      
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.修改响应格式
		response.setContentType("text/html;charset = utf-8");
		//发送
		PrintWriter out = response.getWriter();
		out.print("ccc");
		out.close();
	
	}

}
