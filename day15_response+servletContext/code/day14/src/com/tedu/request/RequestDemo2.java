package com.tedu.request;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * request获取请求参数
 */
public class RequestDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1.getParameter()
		/*
		String username = request
				.getParameter("username");
		System.out.println("username: "+username);
		
		String nickname = request
				.getParameter("nickname");
		System.out.println("nickname: "+nickname);
		*/
		
		//2.getParameterValues()
		/*
		String[] vs = request
				.getParameterValues("like");
		System.out.println( Arrays.toString(vs) );
		*/
		
		//3.getParameterMap()
		/*
		Map<String, String[]> map = request
				.getParameterMap();
		Set<Entry<String, String[]>> entrySet = map.entrySet();
		for(Entry<String, String[]> entry : entrySet){
			System.out.println( entry.getKey() );
			System.out.println( Arrays.toString(
				entry.getValue()
			) );
		}
		*/
		
		/* 请求参数中文乱码问题 */
		//通知服务器使用utf-8来接受请求实体内容中的数据
		request.setCharacterEncoding("utf-8");
		
		String username = request
				.getParameter("username");
		System.out.println("username: "+username);
		/*
		//通过手动编解码来解决乱码
		byte[] bytes = username.getBytes("iso8859-1");
		username = new String(bytes, "utf-8");
		System.out.println("解决后，username: "+username);
		*/
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
