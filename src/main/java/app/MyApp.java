package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;


@ComponentScan("app.controller")
@SpringBootApplication
@EnableAutoConfiguration
public class MyApp {
	
	

	public static void main(String[] args) {
		SpringApplication.run(MyApp.class, args);
	}

}
