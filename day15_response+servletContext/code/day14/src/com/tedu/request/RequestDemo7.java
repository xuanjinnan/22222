package com.tedu.request;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * request作为域对象使用
 */
public class RequestDemo7 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("RequestDemo7.doGet()");
		
		//往request域中添加一些域属性
		request.setAttribute("name", "刘德华");
		request.setAttribute("nickname", "andy");
		request.setAttribute("age", "18");
		
		//转发到Demo8(这样Demo7和Demo8中的
		// request对象就是同一个了)
		request.getRequestDispatcher(
				"/RequestDemo8")
				.forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
