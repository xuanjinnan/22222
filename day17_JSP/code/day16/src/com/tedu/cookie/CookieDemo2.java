package com.tedu.cookie;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 在网页中显示上次访问时间（Cookie API）
 */
public class CookieDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//0.处理响应正文乱码
		response.setContentType(
				"text/html;charset=utf-8");
		//1.获取（记录）本次访问的时间
		String dateStr = new Date()
				.toLocaleString();
		//2.将本次时间发送给浏览器保存
		//>>创建一个Cookie对象
		Cookie timeCookie = 
				new Cookie("time",dateStr);
		//>>设置Cookie的最大存活时间( 3600*24/秒 )
		timeCookie.setMaxAge( 3600*24 );
		
		//>>设置Cookie的路径为当前WEB应用的根路径
		timeCookie.setPath( 
				request.getContextPath()+"/");
		
		//>>将Cookie添加到响应中（发送给浏览器）
		response.addCookie( timeCookie );
		
		//3.获取当前请求中所有cookie组成的数组
		Cookie[] cs = request.getCookies();
		//>>遍历Cookie数组，获取名称为time的Cookie
		if(cs != null){
			for(Cookie c : cs){
				//4.判断请求中是否包含上次访问时间的Cookie
				//>>如果包含,则响应上次访问时间
				if( "time".equals(c.getName()) ){
					//响应上次访问的时间
					response.getWriter().write(
							"您上次访问的时间为: "
							+c.getValue());
					return;
				}
			}
		}
		//>>如果不包含,则响应是第一次访问
		response.getWriter().write(
						"您是第一次访问本网站!");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
