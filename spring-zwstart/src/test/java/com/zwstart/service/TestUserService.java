package com.zwstart.service;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserService {

	@Test
	public void testUservice(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(UserService.class);
		UserService userService = applicationContext.getBean(UserService.class);
		userService.test();

	}
}
