package cn.lzjtu.jquery;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import cn.lzjtu.dao.CarManager;
import cn.lzjtu.domain.Car;


public class CarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CarServlet() {
       
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码
		request.setCharacterEncoding("utf-8");
		//获取id
		int id = Integer.parseInt(request.getParameter("id"));
		//调用方法获取车的详细信息
		
		Car car = new CarManager().getDetailById(id);
		String input = JSON.toJSONString(car);
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print(input);
		out.close();
		
	}

}
