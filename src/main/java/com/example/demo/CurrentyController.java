package com.example.demo;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrentyController {

	@GetMapping("/currency-converter/quantity/{quantity}")
	public CurrentyBean convertCurrency(@PathVariable BigDecimal quantity) {
		BigDecimal bd = new BigDecimal(10);
		return new CurrentyBean(quantity, quantity.multiply(bd));
	}
}
