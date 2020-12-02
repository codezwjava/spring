package com.zwstart.service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigText {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(UserService.class);
		UserService bean = applicationContext.getBean(UserService.class);
		bean.test();

	}
}
