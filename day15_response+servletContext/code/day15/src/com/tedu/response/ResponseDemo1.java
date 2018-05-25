package com.tedu.response;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * response向客户端浏览器发送数据
 */
public class ResponseDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1.getOutputStream()
		//>>向外发送数据（英文）
		/*
		response.getOutputStream().write(
				"Hello response!".getBytes());
		*/
		//>>向外发送数据（中文）
		//浏览器接收使用的编码是哪一个呢
		//Content-Type:text/html;charset=GBK
		//response.setHeader("Content-Type", 
		//				"text/html;charset=GBK");
		/*
		response.setContentType(
				"text/html;charset=utf-8");		
		
		//getBytes方法默认使用GBK来发送数据。
		response.getOutputStream().write(
				"哈喽 response!".getBytes("utf-8"));
		*/
		
		//2.getWriter()
		//response.getWriter().write("Hello reponse!");
		
		//如果不指定服务端默认使用iso8859-1来发送数据
		/*
		//指定服务端发送数据使用utf-8
		response.setCharacterEncoding("utf-8");
		
		//指定浏览器接收数据也是用utf-8
		response.setContentType(
				"text/html;charset=utf-8");
		
		response.getWriter().write("哈喽 reponse!");
		*/
		
		/* 这行代码既会通知服务器使用utf-8发送数据，
		 * 也会通知浏览器使用utf-8来接收数据 */
		response.setContentType(
				"text/html;charset=utf-8");
		response.getWriter().write("哈喽 reponse!");
		response.getWriter().write("哈喽 reponse!");
		response.getOutputStream().write("哈喽 reponse!".getBytes("utf-8"));
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
