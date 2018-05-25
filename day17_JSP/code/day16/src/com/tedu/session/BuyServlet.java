package com.tedu.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 将请求中的商品加入购物车(session)
 */
public class BuyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//0.处理乱码
		//>>响应正文乱码
		response.setContentType(
				"text/html;charset=utf-8");
		//1.获取要保存的商品信息
		//>>请求参数乱码
		String prod = request
				.getParameter("prod");
		prod = new String( 
				prod.getBytes("iso8859-1"),"utf-8");
		//2.获取session对象
		HttpSession session = request
				.getSession();
		
		/* 
		 * Session创建成功后, 服务器会为其分配ID,
		 * 并将ID作为Cookie发送给浏览器保存,但是
		 * 这个Cookie是一个会话级别的Cookie, 
		 * 浏览器关闭Cookie就会丢失(ID也会丢失),
		 * Cookie丢失, session就再也找不到了.
		 */
		Cookie cookie = new Cookie(
				"JSESSIONID", session.getId());
		cookie.setPath( 
				request.getContextPath()+"/" );
		cookie.setMaxAge( 30*60 );
		response.addCookie(cookie);
		
		//3.将商品信息保存到购物车中
		session.setAttribute("prod", prod);
		//4.做出响应(提示成功将商品加入购物车中)
		response.getWriter().write("成功将["
				+ prod +"]商品加入了购物车...");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
