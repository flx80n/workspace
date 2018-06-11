package cn.lzjtu.ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import cn.lzjtu.dao.ProductManager;
import cn.lzjtu.domain.Product;

public class ProductJSONServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProductJSONServlet() {
    	
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json;charset=utf-8");
		List<Product> rows = new ProductManager().findAll();
		String input = JSON.toJSONString(rows);
		PrintWriter out = response.getWriter();
		out.print(input);
		out.close();
		
	}

}
