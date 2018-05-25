package com.tedu.cookie;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * ����ҳ����ʾ�ϴη���ʱ��
 */
public class CookieDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//0.������Ӧ��������
		response.setContentType(
				"text/html;charset=utf-8");
		//1.��ȡ����¼�����η��ʵ�ʱ��
		String dateStr = new Date()
						.toLocaleString();
		//2.�����η���ʱ�䷢�͸����������
		response.setHeader("Set-Cookie", 
							"time="
							+"2018��3��32�� 13:13:13");
		
		//3.��ȡ������ϴη��ʵ�ʱ�䣨Cookie��
		String dateStr2 = request
						.getHeader("cookie");
		//4.�ж��Ƿ���б����ϴη���ʱ���Cookie
		if(dateStr2 != null){
			//>>�����Cookie������Ӧ������ϴη���ʱ��
			response.getWriter().write(
					"���ϴη��ʵ�ʱ��Ϊ��"
					+dateStr2);
		}else{
			//>>���û��Cookie������Ӧ������ǵ�һ�η��� 
			response.getWriter().write(
					"���ǵ�һ�η��ʱ���վ��");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
