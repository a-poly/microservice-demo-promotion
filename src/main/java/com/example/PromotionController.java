package com.example;

import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PromotionController {


	
	/**
	 * Get a specific product:
	 */
	@GetMapping("/promotions/{code}")
	public Promotion getPromotion( @PathVariable String code) {
		
		//	Business logic is basic, so just implementing it in-line:
		Promotion p = new Promotion(code);
		
		if ("AAA".equalsIgnoreCase(code) || "BBB".equalsIgnoreCase(code)) {
			p.setShippingDiscount(ShippingDiscount.FREE_STANDARD_SHIPPING);
		}
		
		if ("BBB".equalsIgnoreCase(code)) {
			p.setPriceDiscount(5);
		}
		if ("CCC".equalsIgnoreCase(code)) {
			p.setPriceDiscount(5);
		}
		
		return p;
	}
	

}
