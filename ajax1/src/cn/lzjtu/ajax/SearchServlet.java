package cn.lzjtu.ajax;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SearchServlet() {
       
    }
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	//String name = request.getParameter("name");
    	String input = "";
    	
    	
    	
    }

}
