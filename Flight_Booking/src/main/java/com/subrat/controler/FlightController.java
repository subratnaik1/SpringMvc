package com.subrat.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.subrat.model.Flight;

@Controller
public class FlightController {
@GetMapping("/")
	public String viewFlight(Model model) {
		Flight f=new Flight("Indigo",1,3,3000);
		int airfare=f.getNoOfTickets()*f.getPaybleAmt();
		f.setAirfare(airfare);
		int finalAmt=f.getAirfare()*10;
		f.setFinalAmt(finalAmt);
		model.addAttribute("flight", f);

		return "flight";
	}
}
