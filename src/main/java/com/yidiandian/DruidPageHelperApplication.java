package com.yidiandian;

import com.github.pagehelper.autoconfigure.PageHelperAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = PageHelperAutoConfiguration.class)
public class DruidPageHelperApplication {

	public static void main(String[] args) {
		SpringApplication.run(DruidPageHelperApplication.class, args);
	}

}
