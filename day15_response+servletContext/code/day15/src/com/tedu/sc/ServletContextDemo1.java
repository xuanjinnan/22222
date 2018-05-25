package com.tedu.sc;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * ServletContext对象作为与对象使用
 */
public class ServletContextDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取ServletContext对象
		ServletContext context = this
					.getServletContext();
		context.setAttribute("name", 
							"尼古拉斯赵四");
		context.setAttribute("age", 38);
		context.setAttribute("addr", "东北");
		
		System.out.println("demo1...");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
