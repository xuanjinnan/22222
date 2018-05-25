package com.tedu.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ɾ��Cookie
 */
public class CookieDemo3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1.����һ��Cookie(Ҫ�ͱ�ɾ����Cookieͬ��)
		Cookie cookie = new Cookie("time", "");
		//2.����Cookie��path(pathҲ��ͬ)
		cookie.setPath(request.getContextPath()+"/");
		//3.����Cookie�Ĵ��ʱ��Ϊ0
		cookie.setMaxAge(0);
		//4.��Cookie��ӵ�response��Ӧ��
		response.addCookie(cookie);
		response.getWriter().write(
				"cookie delete success!");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
