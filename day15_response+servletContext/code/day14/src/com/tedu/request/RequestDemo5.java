package com.tedu.request;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * request实现请求转发
 */
public class RequestDemo5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("RequestDemo5.doGet()");
		
		//response.getWriter().write("Demo5...");
		//response.flushBuffer();
		
		//实现请求转发:将请求转发给Demo6
		request.getRequestDispatcher(
				"/RequestDemo6")
				.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
