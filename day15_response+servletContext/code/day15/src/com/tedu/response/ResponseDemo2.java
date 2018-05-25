package com.tedu.response;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * responseʵ�������ض���
 */
public class ResponseDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("ResponseDemo2.doGet()");
		
		//�������ض���ResponseDemo3
		//>>����302״̬��
		/*
		response.setStatus(302);
		//>>����location��Ӧͷ
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
