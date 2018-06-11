package cn.lzjtu.ajax;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cn.lzjtu.dao.StudentManager;
import cn.lzjtu.domain.Student;


public class SaveStuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SaveStuServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String sn = request.getParameter("sn");
		String name = request.getParameter("name");
		new StudentManager().save(new Student(1,sn,name,""));
		response.setContentType("text/plain;charset = utf-8");
		PrintWriter out = response.getWriter();
		out.print(0);
		out.close();
	}
}
