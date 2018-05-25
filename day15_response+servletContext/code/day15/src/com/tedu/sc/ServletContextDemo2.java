package com.tedu.sc;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ServletContext��Ϊ�����ʹ��
 */
public class ServletContextDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//��ȡServletContext����
		ServletContext context = this
						.getServletContext();
		//��ȡServletContext���е�����
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
