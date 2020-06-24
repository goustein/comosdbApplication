package com.company.appname;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.slf4j.MDC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.company.appname.commons.Constants;
import com.groupon.uuid.UUID;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {
	
	// setting spring boot application to UTC timeZone
	@PostConstruct
	void setAppTimezone() {
		TimeZone.setDefault(TimeZone.getTimeZone("Etc/UTC"));
	}
	 
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) { 
        MDC.put(Constants.CORRELATION_ID, new UUID().toString() + Constants.STARTUP);
        return application.sources(Application.class);
    }
    
    public static void main(String[] args) {
        MDC.put(Constants.CORRELATION_ID, new UUID().toString() + Constants.STARTUP);
        SpringApplication.run(Application.class, args);
    }
}

