package com.tedu.response;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * response实现请求重定向
 */
public class ResponseDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("ResponseDemo2.doGet()");
		
		//将请求重定向到ResponseDemo3
		//>>设置302状态码
		/*
		response.setStatus(302);
		//>>设置location响应头
		response.setHeader("location", 
						"/day15/ResponseDemo3");
		*/
		
		response.sendRedirect(
				"/day15/ResponseDemo3");
		
		/*
		response.sendRedirect(
				"/day14/param.html");
		
		response.sendRedirect(
				"http://tmooc.cn");
		*/
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
