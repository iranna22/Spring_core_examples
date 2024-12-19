package com.iranna.prototypebean;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		
		  ConfigurableApplicationContext applicationContext = new
		  AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		  
		  CacheManager cacheManager = applicationContext.getBean(CacheManager.class);
		  System.out.println(cacheManager);
		  
		  CacheManager cacheManager2 = applicationContext.getBean(CacheManager.class);
		  System.out.println(cacheManager2);
		  
		  ConfigurableApplicationContext applicationContext2 = new
		  AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		  
		  CacheManager cacheManager3 = applicationContext2.getBean(CacheManager.class);
		  System.out.println(cacheManager3);
		  
		  CacheManager cacheManager4 = applicationContext2.getBean(CacheManager.class);
		  System.out.println(cacheManager4);
		 
		
	/*	ConfigurableApplicationContext applicationContext3 = new
				  AnnotationConfigApplicationContext(ApplicationConfiguration.class);
			AuthenticationService authenticationService = applicationContext3.getBean(AuthenticationService.class);
			UserService userService = applicationContext3.getBean(UserService.class);
			EmailService emailService = applicationContext3.getBean(EmailService.class);
			
			System.out.println(authenticationService.getCacheManager());
			System.out.println(userService.getCacheManager());
			System.out.println(emailService.getCacheManager());
			*/
	
	}
	

}
