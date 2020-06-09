package com.tkm.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.tkm.bank")
public class LockDownTimeApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(LockDownTimeApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		
		return builder.sources(LockDownTimeApplication.class);
	}

}

// here we have extended our main class to sprinnboot servlet initializer and override the configure method to create the war file.
