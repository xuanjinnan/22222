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
 * request��ȡ�������
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
		
		/* ������������������� */
		//֪ͨ������ʹ��utf-8����������ʵ�������е�����
		request.setCharacterEncoding("utf-8");
		
		String username = request
				.getParameter("username");
		System.out.println("username: "+username);
		/*
		//ͨ���ֶ���������������
		byte[] bytes = username.getBytes("iso8859-1");
		username = new String(bytes, "utf-8");
		System.out.println("�����username: "+username);
		*/
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
