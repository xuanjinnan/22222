package com.tedu.sc;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * (ģ��)ͳ����վ�е���Դ�����ʵĴ���
 */
public class ServletContextDemo3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1.��ȡServletContext����
		ServletContext context = this
					.getServletContext();
		/* 2.�ж�ServletContext�����Ƿ����ͳ��
		 * ���ʴ����ļ�����
		 */
		int count = 0;
		if(context.getAttribute("count") == null){
			//>>����ǵ�һ�η���, ����������������
			context.setAttribute("count", ++count);
		}else{
			//>>������ǵ�һ�η���, ȡ��������+1�ٴ�������
			count = (int) context.getAttribute("count");
			context.setAttribute("count", ++count);
		}
		
		//3.��Ӧ
		response.setContentType(
				"text/html;charset=utf-8");
		response.getWriter().write(
					"���ǵ�"+count
					+"λ���ʱ���վ���û�...");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
