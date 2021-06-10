package com.wjz.demo.component;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.LocaleResolver;

public class MyLocaleResolver implements LocaleResolver {

	@Override
	public Locale resolveLocale(HttpServletRequest request) {
		String l = request.getParameter("l");
		String[] split = null;
		Locale locale = Locale.getDefault();
		if(l != null) {
			split = l.split("_");//zh_CN
			locale = new Locale(split[0],split[1]);
		}
		return locale;
	}

	@Override
	public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {
		// TODO Auto-generated method stub

	}

}
