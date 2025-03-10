package gov.usps.eir9361.testutility.ipmismockd.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ResourceServerController {
	
	@GetMapping()
	public ResponseEntity<String> get() {
		/*
		 * Return json String
		 */
		
		return null;
	}

}
