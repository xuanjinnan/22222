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
		//1.查询当前用户的个人信息
		String username = "张飞";
		String password = "123";
		String email = "zf@163.com";
		int age = 18;
		
		//2.将用户的个人信息发送到浏览器展示
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
		response.getWriter().write("个人资料");
		response.getWriter().write("</h1>");
		response.getWriter().write("<p>");
		response.getWriter().write("用户名:"+username);
		response.getWriter().write("</p>");
		response.getWriter().write("<p>");
		response.getWriter().write("密码:"+password);
		response.getWriter().write("</p>");
		response.getWriter().write("<p>");
		response.getWriter().write("邮箱:"+email);
		response.getWriter().write("</p>");
		response.getWriter().write("<p>");
		response.getWriter().write("年龄:"+age);
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
