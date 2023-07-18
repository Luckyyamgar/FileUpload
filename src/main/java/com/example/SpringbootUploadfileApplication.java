package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import com.example.service.FileServices;
import jakarta.annotation.Resource;
@SpringBootApplication(exclude = {DataSourceAutoConfiguration .class })
//@SpringBootApplication
public class SpringbootUploadfileApplication {
     @Resource
	FileServices fileServices;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootUploadfileApplication.class, args);
	}


	public void run(String... arg) throws Exception {
		fileServices.init();
	}
}
