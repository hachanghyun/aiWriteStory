package com.hotong.aiWriteStory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class AiWriteStoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiWriteStoryApplication.class, args);
	}

}
