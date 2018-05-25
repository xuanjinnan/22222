package com.tedu.request;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * request��ȡ�ͻ���������Ϣ����ȡ����ͷ��Ϣ
 */
public class RequestDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//getRequestURL()
		String url = request.getRequestURL()
							.toString();
		System.out.println("url="+url);
		
		//getRequestURI()
		String uri = request.getRequestURI();
		System.out.println("uri="+uri);
		
		//getRemoteAddr()
		String ip = request.getRemoteAddr();
		System.out.println("ip="+ip);
		
		//getContextPath()!!!
		String path = request.getContextPath();
		System.out.println("contextPath="+path);
		
		//�����ض���
		//response.sendRedirect(path+"/index.jsp");
		
		String value = request.getHeader("host");
		System.out.println("Host:"+value);
		
		response.getWriter().write("request demo...");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
