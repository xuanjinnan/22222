package com.tedu.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 对购物车中的商品进行结算
 */
public class PayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1.获取session对象
		HttpSession session = request
				.getSession();
		//2.从session中取出商品信息
		String prod = (String) session
				.getAttribute("prod");
		//3.为商品进行结算(模拟)
		response.setContentType(
				"text/html;charset=utf-8");
		if(prod != null){
			response.getWriter().write("成功为["
					+ prod +"]商品支付了1000元...");
		}else{
			response.getWriter().write("您还没有"
					+ "将任何商品加入购物车...");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
