package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@Controller
public class DemoApplication {

	@RequestMapping("/")
	public ModelAndView greetings(@RequestParam(defaultValue="world") String name) {
		return new ModelAndView("greetings", "name", name);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
