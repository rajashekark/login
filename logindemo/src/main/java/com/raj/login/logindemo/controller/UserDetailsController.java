package com.raj.login.logindemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raj.login.logidemo.model.UserDetails;
import com.raj.login.logindemo.repository.UserDetailsRepository;

@RestController
@RequestMapping("/user")
public class UserDetailsController {

	@Autowired
	UserDetailsRepository userDetailsRepository;

	@RequestMapping("/showUserDetails")
	public List<UserDetails> showAllUsers() {
		return userDetailsRepository.findAll();
	}

}
