package com.tedu.response;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 模拟注册功能
 */
public class ResponseDemo4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//提示用户注册成功, 3秒之后将会跳转到主页
		//>>处理响应正文乱码
		response.setContentType(
				"text/html;charset=utf-8");
		
		response.getWriter().write("恭喜您注册成"
				+ "功! 3秒之后将会跳转到主页...");
		
		//实现3秒之后刷新到主页
		response.setHeader("refresh", 
				"3;url=/day15/index.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
