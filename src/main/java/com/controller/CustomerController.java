package com.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.UserDto;
import com.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	
	@GetMapping({"/","/registration"})
	public String getRegistrationPage() {
		return "registration";
	}
	
	@PostMapping("/registerCustomer")
	public String registerUser(@ModelAttribute UserDto userDto,@RequestParam String string_dob) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date parsed = null;
		try {
			parsed = format.parse(string_dob);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		java.sql.Date data = new java.sql.Date(parsed.getTime());
		userDto.setDob(data);
		userDto.setUser_role("C");
		userDto.setUser_status("N");
		customerService.registerCustomer(userDto);		
		return "registration";
	}

}
