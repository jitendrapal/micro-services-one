package com.demo.microservicesone;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix
@EnableDiscoveryClient
@SpringBootApplication
public class MicroServicesOneApplication extends SpringBootServletInitializer {

	/*public static void main(String[] args) {
		SpringApplication.run(CrasEurekaServerApplication.class, args);
	}*/
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		
		return application.sources(MicroServicesOneApplication.class);
	}
}
