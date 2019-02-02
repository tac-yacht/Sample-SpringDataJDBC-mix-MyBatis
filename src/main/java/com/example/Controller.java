package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Repository.EmployeeRepository;

@RestController
public class Controller {

	private static final Logger log = LoggerFactory.getLogger(Controller.class);

	@Autowired
	private EmployeeRepository repo;

	@GetMapping("/")
	public String root() {
		return "hello world";
	}

	@GetMapping("/findById")
	public Object findById(@RequestParam Long id) {
		log.debug("call embedded");
		return repo.findById(id);
	}

	@GetMapping("/findByFirstName")
	public Object findByFirstName(@RequestParam String name) {
		log.debug("call custom query");
		return repo.findByFirstName(name);
	}

}
