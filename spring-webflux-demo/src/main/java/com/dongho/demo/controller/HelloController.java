package com.dongho.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public Mono<String> helloWorld() {
		return Mono.just("hello world!");
	}

}
