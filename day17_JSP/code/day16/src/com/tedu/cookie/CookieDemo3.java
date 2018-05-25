package com.tedu.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 删除Cookie
 */
public class CookieDemo3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1.创建一个Cookie(要和被删除的Cookie同名)
		Cookie cookie = new Cookie("time", "");
		//2.设置Cookie的path(path也相同)
		cookie.setPath(request.getContextPath()+"/");
		//3.设置Cookie的存活时间为0
		cookie.setMaxAge(0);
		//4.将Cookie添加到response响应中
		response.addCookie(cookie);
		response.getWriter().write(
				"cookie delete success!");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
