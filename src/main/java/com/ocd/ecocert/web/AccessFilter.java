package com.ocd.ecocert.web;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ocd.ecocert.entity.User;

/**
 * Servlet Filter implementation class AccessFilter
 */
public class AccessFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AccessFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	private String login="/log_in.html";
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
/*

		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse res=(HttpServletResponse)response;
		HttpSession session=req.getSession();
		// 放过log_in.html
		String path=req.getRequestURI();
		if(path.endsWith(login)){
			chain.doFilter(request, response);
			return;
		}
		User user=(User)session.getAttribute("loginUser");
		// 检查用户是否登录
		if(user==null){
			res.sendRedirect(req.getContextPath()+login);
			return;
		}
*/

		//如果登录就放过，没登录就重定向到登录页
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
