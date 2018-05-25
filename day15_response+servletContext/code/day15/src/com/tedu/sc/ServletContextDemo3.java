package com.tedu.sc;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * (模拟)统计网站中的资源被访问的次数
 */
public class ServletContextDemo3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1.获取ServletContext对象
		ServletContext context = this
					.getServletContext();
		/* 2.判断ServletContext域中是否包含统计
		 * 访问次数的计数器
		 */
		int count = 0;
		if(context.getAttribute("count") == null){
			//>>如果是第一次访问, 将计数器存入域中
			context.setAttribute("count", ++count);
		}else{
			//>>如果不是第一次访问, 取出计数器+1再存入域中
			count = (int) context.getAttribute("count");
			context.setAttribute("count", ++count);
		}
		
		//3.响应
		response.setContentType(
				"text/html;charset=utf-8");
		response.getWriter().write(
					"您是第"+count
					+"位访问本网站的用户...");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
