package com.flaudio.spring_boot_poc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class SpringBootPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPocApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println("Beans inspection:");

			String[] beanNames = ctx.getBeanDefinitionNames();

			Arrays.sort(beanNames);
			for (String bean : beanNames) {
				System.out.println(bean);
			}
		};
	}
}
