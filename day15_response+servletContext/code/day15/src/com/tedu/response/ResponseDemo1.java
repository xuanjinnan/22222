package com.tedu.response;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * response��ͻ����������������
 */
public class ResponseDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1.getOutputStream()
		//>>���ⷢ�����ݣ�Ӣ�ģ�
		/*
		response.getOutputStream().write(
				"Hello response!".getBytes());
		*/
		//>>���ⷢ�����ݣ����ģ�
		//���������ʹ�õı�������һ����
		//Content-Type:text/html;charset=GBK
		//response.setHeader("Content-Type", 
		//				"text/html;charset=GBK");
		/*
		response.setContentType(
				"text/html;charset=utf-8");		
		
		//getBytes����Ĭ��ʹ��GBK���������ݡ�
		response.getOutputStream().write(
				"��� response!".getBytes("utf-8"));
		*/
		
		//2.getWriter()
		//response.getWriter().write("Hello reponse!");
		
		//�����ָ�������Ĭ��ʹ��iso8859-1����������
		/*
		//ָ������˷�������ʹ��utf-8
		response.setCharacterEncoding("utf-8");
		
		//ָ���������������Ҳ����utf-8
		response.setContentType(
				"text/html;charset=utf-8");
		
		response.getWriter().write("��� reponse!");
		*/
		
		/* ���д���Ȼ�֪ͨ������ʹ��utf-8�������ݣ�
		 * Ҳ��֪ͨ�����ʹ��utf-8���������� */
		response.setContentType(
				"text/html;charset=utf-8");
		response.getWriter().write("��� reponse!");
		response.getWriter().write("��� reponse!");
		response.getOutputStream().write("��� reponse!".getBytes("utf-8"));
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
