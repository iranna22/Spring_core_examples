package com.iranna.singletonbean;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		/*
		 * ConfigurableApplicationContext context = new
		 * AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		 * 
		 * CacheManager cacheManager = context.getBean(CacheManager.class);
		 * System.out.println(cacheManager);
		 * 
		 * CacheManager cacheManager2 = context.getBean(CacheManager.class);
		 * System.out.println(cacheManager2);
		 * 
		 * ConfigurableApplicationContext context2 = new
		 * AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		 * 
		 * CacheManager cacheManager3 = context2.getBean(CacheManager.class);
		 * System.out.println(cacheManager3);
		 * 
		 * CacheManager cacheManager4 = context2.getBean(CacheManager.class);
		 * System.out.println(cacheManager4);
		 */
		
		ConfigurableApplicationContext context3 = new
				  AnnotationConfigApplicationContext(ApplicationConfiguration.class);
			AuthenticationService authenticationService = context3.getBean(AuthenticationService.class);
			UserService userService = context3.getBean(UserService.class);
			EmailService emailService = context3.getBean(EmailService.class);
			
			System.out.println(authenticationService.getCacheManager());
			System.out.println(userService.getCacheManager());
			System.out.println(emailService.getCacheManager());
			
	
	}
	

}
