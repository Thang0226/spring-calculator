package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/calculator")
public class CalculatorController {
	@GetMapping
	public String showCalculator() {
		return "index";
	}

	@PostMapping("/calculate")
	public ModelAndView calculate(@RequestParam double num1, @RequestParam double num2, @RequestParam String action) {
		ModelAndView mv = new ModelAndView("index");
		double result = 0;
		try {
			switch (action) {
				case "add":
					result = num1 + num2;
					break;
				case "subtract":
					result = num1 - num2;
					break;
				case "multiply":
					result = num1 * num2;
					break;
				case "divide":
					result = num1 / num2;
					break;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		mv.addObject("result", result);
		mv.addObject("num1", num1);
		mv.addObject("num2", num2);
		return mv;
	}
}
