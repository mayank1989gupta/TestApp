/**
 * 
 */
package com.test.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MGupta
 *
 */
@SpringBootApplication
@RestController
public class TestApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(TestApp.class, args);
	}
	
	@GetMapping("/testApp")
	public String test() {
		System.out.println();
		return "Hello!!";
	}
	
	@GetMapping("/testApp1")
	public String test1(@RequestParam(value="name") String name) {
		return "Hello!!" + name;
	}
	
	@GetMapping("/testApp4")
	public String test4(@RequestParam(value="name") String name) {
		return "Hello!!" + name;
	}
}
