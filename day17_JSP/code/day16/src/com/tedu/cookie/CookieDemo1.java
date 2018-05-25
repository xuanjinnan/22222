package com.tedu.cookie;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 在网页中显示上次访问时间
 */
public class CookieDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//0.处理响应正文乱码
		response.setContentType(
				"text/html;charset=utf-8");
		//1.获取（记录）本次访问的时间
		String dateStr = new Date()
						.toLocaleString();
		//2.将本次访问时间发送给浏览器保存
		response.setHeader("Set-Cookie", 
							"time="
							+"2018年3月32日 13:13:13");
		
		//3.获取浏览器上次访问的时间（Cookie）
		String dateStr2 = request
						.getHeader("cookie");
		//4.判断是否具有保存上次访问时间的Cookie
		if(dateStr2 != null){
			//>>如果有Cookie，则响应浏览器上次访问时间
			response.getWriter().write(
					"您上次访问的时间为："
					+dateStr2);
		}else{
			//>>如果没有Cookie，则响应浏览器是第一次访问 
			response.getWriter().write(
					"您是第一次访问本网站！");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
