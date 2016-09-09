package com.god;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
//@Configuration
//@ComponentScan("com.god")
//@EnableAutoConfiguration
//// @SpringBootApplication
//public class Application {
//
//	public static void main(String[] args) {
//		SpringApplication app = new SpringApplication(Application.class);
//		app.setWebEnvironment(true);
////		app.setShowBanner(false);
//
//		Set<Object> set = new HashSet<Object>();
//		// set.add("classpath:applicationContext.xml");
//		app.setSources(set);
//		app.run(args);
//
//	}
//
//}