package com.tedu.sc;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ServletContext作为域对象使用
 */
public class ServletContextDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取ServletContext对象
		ServletContext context = this
						.getServletContext();
		//获取ServletContext域中的数据
		String name = (String) context
					.getAttribute("name");
		int age = (Integer) context
					.getAttribute("age");
		String addr = (String) context
					.getAttribute("addr");
		System.out.println(name+" : "+age+" : "+addr);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
