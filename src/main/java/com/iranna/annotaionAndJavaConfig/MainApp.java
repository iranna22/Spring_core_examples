package com.iranna.annotaionAndJavaConfig;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {
    	/*two ways to configure beans annotation and av based */
        // Load both configurations
        ApplicationContext context = new AnnotationConfigApplicationContext(ServiceConfig.class, RepositoryConfig.class);

        // Get the UserService bean
        UserService userService = context.getBean(UserService.class);

        // Use the service to get user details
        System.out.println(userService.getUserDetails(1));
        
        UserRepository userRepository = context.getBean(UserRepository.class);
        System.out.println(userRepository.findUserById(12));
    }
}

