package com.ecom.order.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderServiceController {

	@GetMapping
	public String testController() {
		return "hello order Service";
	}
}
