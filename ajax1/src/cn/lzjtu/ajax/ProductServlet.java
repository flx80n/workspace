package cn.lzjtu.ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.lzjtu.dao.ProductManager;
import cn.lzjtu.domain.Product;


public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ProductServlet() {
        super();
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/xml;charset=utf-8");
		List<Product> rows = new  ProductManager().findAll();
		String input = "<?xml version='1.0' encoding='utf-8'?>";
		input+= "<products>";
		for (int i = 0; i < rows.size(); i++) {
			input += "<product>";
			input += "<id>"+rows.get(i).getId()+"</id>";
			input += "<name>"+rows.get(i).getName()+"</name>";
			input += "<price>"+rows.get(i).getPrice()+"</price>";
			input += "<pic>"+rows.get(i).getPic()+"</pic>";
			input += "<ctime>"+rows.get(i).getCtime()+"</ctime>";
			input += "</product>";
		}
		input+= "</products>";
		PrintWriter out = response.getWriter();
		out.print(input);
		out.close();
	}

}
