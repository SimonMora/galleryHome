package com.accenture.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}
	
	@Configuration
	@EnableWebMvc
	public class WebConfig implements WebMvcConfigurer {

	    @Override
	    public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/**").allowedMethods("*").allowedOrigins("http://localhost:4200");
	    }
	}
	
//	@Bean
//	public WebMvcConfigurer corsConfigurer() {
//	    return new WebMvcConfigurerAdapter() {
//	        @Override
//	        public void addCorsMappings(CorsRegistry registry) {
//	            registry.addMapping("/**").allowedOrigins("http://localhost:4200");
//	        }
//	    };
//	}
	

}
