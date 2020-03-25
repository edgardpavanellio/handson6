package com.rm334439.UserRegistryModify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;



//@ComponentScan("com.rm334439.domain")
@EntityScan("com.rm334439.domain")
@SpringBootApplication(scanBasePackages={"com.rm334439.domain", "com.rm334439.UserRegistryModify"})
public class UserRegistryModifyApplication extends SpringBootServletInitializer{
	
	//@Autowired
	//private ClientService client_service;

	public static void main(String[] args) {
		SpringApplication.run(UserRegistryModifyApplication.class, args);
	}
	
	 @Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	  return application.sources(UserRegistryModifyApplication.class);
	 }
}
