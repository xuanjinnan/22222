package com.tedu.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * �Թ��ﳵ�е���Ʒ���н���
 */
public class PayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1.��ȡsession����
		HttpSession session = request
				.getSession();
		//2.��session��ȡ����Ʒ��Ϣ
		String prod = (String) session
				.getAttribute("prod");
		//3.Ϊ��Ʒ���н���(ģ��)
		response.setContentType(
				"text/html;charset=utf-8");
		if(prod != null){
			response.getWriter().write("�ɹ�Ϊ["
					+ prod +"]��Ʒ֧����1000Ԫ...");
		}else{
			response.getWriter().write("����û��"
					+ "���κ���Ʒ���빺�ﳵ...");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
