package com.tedu.request;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * request��Ϊ�����ʹ��
 */
public class RequestDemo8 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//��ȡrequest���е�����
		String name = (String) request
						.getAttribute("name");
		String nickname = (String) request
						.getAttribute("nickname");
		String age = (String) request
						.getAttribute("age");
		//��ӡ���
		System.out.println(name+" : "+nickname
				+" : "+age);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
