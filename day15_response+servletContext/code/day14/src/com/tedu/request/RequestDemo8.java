package com.tedu.request;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * request作为域对象使用
 */
public class RequestDemo8 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取request域中的属性
		String name = (String) request
						.getAttribute("name");
		String nickname = (String) request
						.getAttribute("nickname");
		String age = (String) request
						.getAttribute("age");
		//打印结果
		System.out.println(name+" : "+nickname
				+" : "+age);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
