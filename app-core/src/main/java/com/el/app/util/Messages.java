package com.el.app.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Messages implements ApplicationContextAware {

	private static final String MESSAGE_NOT_FOUND = "Message not found from message resources.";
	
	private static ApplicationContext context;
	
	private Messages() {
		
	}
	
	public static String getMessage(String id, String... args) {
		return context.getMessage(id, args, MESSAGE_NOT_FOUND, null);
	}
	
	public static String getMessage(String id) {
		return context.getMessage(id, null, MESSAGE_NOT_FOUND, null);
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		if(applicationContext != null) {
			Messages.context = applicationContext;
		}
	}

}
