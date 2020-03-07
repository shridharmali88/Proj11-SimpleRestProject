package com.teklead.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeResource {

	@GetMapping("/gret/msg")
	public ResponseEntity<String> getWelcomeMsg(){
		return new ResponseEntity<String>("Welcome To Rest",HttpStatus.OK);
	}
}
