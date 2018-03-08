package com.cts.springbootopeshift;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cts.springbootopeshift.repository.MyListRepository;

@Configuration
@ComponentScan(basePackages="com.cts.springbootopeshift.repository")
public class MyConfiguration {

	@Bean
	public MyListRepository getMyListRepository(){
		return new MyListRepository();
	}
	
}
