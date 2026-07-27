package com.shyam.micro.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "CARTSERVICE")
public interface CartClient {

	@GetMapping("/cart")
	public String getCart();
}
