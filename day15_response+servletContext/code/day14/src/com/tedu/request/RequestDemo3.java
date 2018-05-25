package com.tedu.request;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * request实现请求包含
 */
public class RequestDemo3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//做出响应
		response.getWriter().write("Hello...");
		
		//将RequestDemo4包含进来和当前Servlet一起处理请求
		//http://localhost/day14/RequestDemo4
		request.getRequestDispatcher("/RequestDemo4")
					.include(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
