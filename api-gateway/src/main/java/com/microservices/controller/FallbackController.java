package com.microservices.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallbackController {
	
	private static Logger logger = LoggerFactory.getLogger(FallbackController.class);
	
	@GetMapping("/user")
	public ResponseEntity<String> userFallback() {
		logger.error("User service is unavailable!");
		return new ResponseEntity<>("User service is unavailable!", HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/product")
	public ResponseEntity<String> postFallback() {
		logger.error("Product Management service is unavailable!");
		return new ResponseEntity<>("Product Management service is unavailable!", HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/cart")
	public ResponseEntity<String> commentFallback() {
		logger.error("Cart service is unavailable!");
		return new ResponseEntity<>("Cart service is unavailable!", HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/discount")
	public ResponseEntity<String> feedFallback() {
		logger.error("Cart service is unavailable!");
		return new ResponseEntity<>("Cart service is unavailable!", HttpStatus.NOT_FOUND);
	}

	@GetMapping("/userAuthentication")
	public ResponseEntity<String> identityFallback() {
		logger.error("User Authentication is unavailable!");
		return new ResponseEntity<>("User Authentication is unavailable!", HttpStatus.NOT_FOUND);
	}
}
