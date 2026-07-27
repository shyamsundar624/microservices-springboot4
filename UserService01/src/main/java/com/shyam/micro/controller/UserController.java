package com.shyam.micro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shyam.micro.client.CartClient;

@RestController
public class UserController {

	@Autowired
	private CartClient cartClient;
	@GetMapping("/user")
	public String getUser() {
		return "User Service is working! "+cartClient.getCart();
	}
}
