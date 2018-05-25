package com.tedu.sc;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * ServletContext������Ϊ�����ʹ��
 */
public class ServletContextDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//��ȡServletContext����
		ServletContext context = this
					.getServletContext();
		context.setAttribute("name", 
							"�����˹����");
		context.setAttribute("age", 38);
		context.setAttribute("addr", "����");
		
		System.out.println("demo1...");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
