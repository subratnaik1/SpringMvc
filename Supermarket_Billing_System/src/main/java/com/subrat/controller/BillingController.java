package com.subrat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.subrat.model.Customer;

@Controller
public class BillingController {
	@GetMapping("/")
	public String viewBill(Model model) {

		Customer c = new Customer("subrat naik", "pipe", 2, 600);
		int subTotal = c.getProdQuantity() * c.getProdPrice();
		Double prodGST = 0.18 * subTotal;
		Double discount;
		if (subTotal > 5000) {
			discount = 0.10 * subTotal;
		} else {
			discount = 0.0;
		}
		Double finalAmt = subTotal + prodGST - discount;
		c.setProdGST(prodGST);
		c.setDiscount(discount);
		c.setSubTotal(subTotal);
		c.setFinalBillAmt(finalAmt);
		
		model.addAttribute("customer", c);

		return "bill";
	}
}
