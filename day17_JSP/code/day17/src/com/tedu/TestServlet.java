package com.tedu;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 */
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1.��ѯ��ǰ�û��ĸ�����Ϣ
		String username = "�ŷ�";
		String password = "123";
		String email = "zf@163.com";
		int age = 18;
		
		//2.���û��ĸ�����Ϣ���͵������չʾ
		request.setAttribute("username", username);
		request.setAttribute("password", password);
		request.setAttribute("email", email);
		request.setAttribute("age", age);
		
		request.getRequestDispatcher(
				"/show.jsp")
				.forward(request, response);
		/*
		response.setContentType(
				"text/html;charset=utf-8");
		response.getWriter().write(username);
		response.getWriter().write(password);
		response.getWriter().write(email);
		response.getWriter().write(age+"");
		*/
		
		/*
		response.setContentType(
				"text/html;charset=utf-8");
		response.getWriter().write("<!doctype html>");
		response.getWriter().write("<html>");
		response.getWriter().write("<head>");
		response.getWriter().write("<meta charset='utf-8'/>");
		response.getWriter().write("</head>");
		response.getWriter().write("<body>");
		response.getWriter().write("<h1 >");
		response.getWriter().write("��������");
		response.getWriter().write("</h1>");
		response.getWriter().write("<p>");
		response.getWriter().write("�û���:"+username);
		response.getWriter().write("</p>");
		response.getWriter().write("<p>");
		response.getWriter().write("����:"+password);
		response.getWriter().write("</p>");
		response.getWriter().write("<p>");
		response.getWriter().write("����:"+email);
		response.getWriter().write("</p>");
		response.getWriter().write("<p>");
		response.getWriter().write("����:"+age);
		response.getWriter().write("</p>");
		response.getWriter().write("</body>");
		response.getWriter().write("</html>");
		*/
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
