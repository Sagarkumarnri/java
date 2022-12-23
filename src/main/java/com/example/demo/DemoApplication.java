package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;



@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class DemoApplication {
	 
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
//		 
	 new Thread(() -> {
		     System.out.println("here");
		}).start();
	}
	 
	
	
}
