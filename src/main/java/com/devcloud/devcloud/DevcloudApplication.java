package com.devcloud.devcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DevcloudApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DevcloudApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(DevcloudApplication.class);
	}
// Added comment from MUMBAI
//  TODO : Added comment from SINGAPORE
//  Added comment from branch1 MUMBAI
}
