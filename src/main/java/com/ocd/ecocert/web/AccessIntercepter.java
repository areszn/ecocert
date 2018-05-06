package com.ocd.ecocert.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class AccessIntercepter implements HandlerInterceptor {

	public AccessIntercepter() {
	
	}

	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		

	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
	

	}

	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handle) throws Exception {
		String path=req.getRequestURI();
		System.out.println("intercepter:"+path);
		
		return true;
	}

}
