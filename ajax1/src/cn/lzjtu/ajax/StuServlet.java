package cn.lzjtu.ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import cn.lzjtu.dao.StudentManager;
import cn.lzjtu.domain.Student;

public class StuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public StuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String clazzid = request.getParameter("clazzid");
		List<Student> rows = new StudentManager().findAllByClasszzId(clazzid);
		String input = JSON.toJSONString(rows);
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println(input);
		out.close();
		
		
		
	}

}
