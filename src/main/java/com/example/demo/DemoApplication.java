package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.client.RestTemplate;



@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
@EnableDiscoveryClient
public class DemoApplication {
	 
	
	public static void main(String[] args) {
		
		SpringApplication.run(DemoApplication.class, args);
	
}
	
	
	@Bean
	@LoadBalanced
	 RestTemplate restTemplate()
	{
		return new RestTemplate(); 
	}
}
