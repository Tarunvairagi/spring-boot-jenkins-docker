package com.java_docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaDockerApplication {

    @GetMapping("/message")
    public String getMessage(){
        return "Hello Docker with java spring boot project";
    }

	public static void main(String[] args) {
		SpringApplication.run(JavaDockerApplication.class, args);
	}

}
