package com.tedu.cookie;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ����ҳ����ʾ�ϴη���ʱ�䣨Cookie API��
 */
public class CookieDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//0.������Ӧ��������
		response.setContentType(
				"text/html;charset=utf-8");
		//1.��ȡ����¼�����η��ʵ�ʱ��
		String dateStr = new Date()
				.toLocaleString();
		//2.������ʱ�䷢�͸����������
		//>>����һ��Cookie����
		Cookie timeCookie = 
				new Cookie("time",dateStr);
		//>>����Cookie�������ʱ��( 3600*24/�� )
		timeCookie.setMaxAge( 3600*24 );
		
		//>>����Cookie��·��Ϊ��ǰWEBӦ�õĸ�·��
		timeCookie.setPath( 
				request.getContextPath()+"/");
		
		//>>��Cookie��ӵ���Ӧ�У����͸��������
		response.addCookie( timeCookie );
		
		//3.��ȡ��ǰ����������cookie��ɵ�����
		Cookie[] cs = request.getCookies();
		//>>����Cookie���飬��ȡ����Ϊtime��Cookie
		if(cs != null){
			for(Cookie c : cs){
				//4.�ж��������Ƿ�����ϴη���ʱ���Cookie
				//>>�������,����Ӧ�ϴη���ʱ��
				if( "time".equals(c.getName()) ){
					//��Ӧ�ϴη��ʵ�ʱ��
					response.getWriter().write(
							"���ϴη��ʵ�ʱ��Ϊ: "
							+c.getValue());
					return;
				}
			}
		}
		//>>���������,����Ӧ�ǵ�һ�η���
		response.getWriter().write(
						"���ǵ�һ�η��ʱ���վ!");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
