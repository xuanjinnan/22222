package com.tedu.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * �������е���Ʒ���빺�ﳵ(session)
 */
public class BuyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//0.��������
		//>>��Ӧ��������
		response.setContentType(
				"text/html;charset=utf-8");
		//1.��ȡҪ�������Ʒ��Ϣ
		//>>�����������
		String prod = request
				.getParameter("prod");
		prod = new String( 
				prod.getBytes("iso8859-1"),"utf-8");
		//2.��ȡsession����
		HttpSession session = request
				.getSession();
		
		/* 
		 * Session�����ɹ���, ��������Ϊ�����ID,
		 * ����ID��ΪCookie���͸����������,����
		 * ���Cookie��һ���Ự�����Cookie, 
		 * ������ر�Cookie�ͻᶪʧ(IDҲ�ᶪʧ),
		 * Cookie��ʧ, session����Ҳ�Ҳ�����.
		 */
		Cookie cookie = new Cookie(
				"JSESSIONID", session.getId());
		cookie.setPath( 
				request.getContextPath()+"/" );
		cookie.setMaxAge( 30*60 );
		response.addCookie(cookie);
		
		//3.����Ʒ��Ϣ���浽���ﳵ��
		session.setAttribute("prod", prod);
		//4.������Ӧ(��ʾ�ɹ�����Ʒ���빺�ﳵ��)
		response.getWriter().write("�ɹ���["
				+ prod +"]��Ʒ�����˹��ﳵ...");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
