package com.tedu.response;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ģ��ע�Ṧ��
 */
public class ResponseDemo4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//��ʾ�û�ע��ɹ�, 3��֮�󽫻���ת����ҳ
		//>>������Ӧ��������
		response.setContentType(
				"text/html;charset=utf-8");
		
		response.getWriter().write("��ϲ��ע���"
				+ "��! 3��֮�󽫻���ת����ҳ...");
		
		//ʵ��3��֮��ˢ�µ���ҳ
		response.setHeader("refresh", 
				"3;url=/day15/index.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
