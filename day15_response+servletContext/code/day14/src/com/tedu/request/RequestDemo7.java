package com.tedu.request;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * request��Ϊ�����ʹ��
 */
public class RequestDemo7 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("RequestDemo7.doGet()");
		
		//��request�������һЩ������
		request.setAttribute("name", "���»�");
		request.setAttribute("nickname", "andy");
		request.setAttribute("age", "18");
		
		//ת����Demo8(����Demo7��Demo8�е�
		// request�������ͬһ����)
		request.getRequestDispatcher(
				"/RequestDemo8")
				.forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
