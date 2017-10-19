package com.company.course;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan ("com.company.course,com.company.security.utils")
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 86400*30)
public class CourseAccessApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseAccessApplication.class, args);
		
		try {
			
		}
		catch(Throwable e)
		{
		   e.printStackTrace();	
		}
	}
}
