package com.dubbox.demo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

/**
 *dubbo demo
 */
@SpringBootApplication
@ImportResource({"classpath:dubbo.xml"})
public class ApplicationConsumer extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationConsumer.class);
	}

}
