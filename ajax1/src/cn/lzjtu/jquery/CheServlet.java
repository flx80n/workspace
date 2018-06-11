package cn.lzjtu.jquery;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import cn.lzjtu.dao.CarManager;
import cn.lzjtu.domain.Che;


public class CheServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CheServlet() {
        
    }
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String type = request.getParameter("type");
		List<Che> rows = new CarManager().findAllByType(type);
		String input = JSON.toJSONString(rows);
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println(input);
		out.close();
	
	
	}

}
