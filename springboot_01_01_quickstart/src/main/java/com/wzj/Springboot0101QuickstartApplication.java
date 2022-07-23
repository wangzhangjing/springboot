package com.wzj;

import com.wzj.ccoomm.wzj;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot0101QuickstartApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Springboot0101QuickstartApplication.class, args);
		wzj bean = run.getBean(wzj.class);
		System.out.println("bean============>"+bean);
		User user = run.getBean(User.class);
		System.out.println(user);
	}

}
