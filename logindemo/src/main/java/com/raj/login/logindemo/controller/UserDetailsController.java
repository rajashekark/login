package com.raj.login.logindemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.raj.login.logidemo.model.UserDetails;
import com.raj.login.logindemo.repository.UserDetailsRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

@RequestMapping("/user")
public class UserDetailsController {

	@Autowired
	UserDetailsRepository userDetailsRepository;

	@RequestMapping("/showUserDetails")
	public List<UserDetails> showAllUsers() {
		return userDetailsRepository.findAll();
	}
	
	@RequestMapping(value="/saveUserDetails", method = RequestMethod.POST)
	public UserDetails saveUserDetails(@RequestBody UserDetails userDetails) {
		return userDetailsRepository.save(userDetails);
	}
	
	@RequestMapping("/showUser/{id}")
	public Optional<UserDetails> findById(@PathVariable("id") long id) {
		return userDetailsRepository.findById(id);		
	}

	/*@RequestMapping(value="/updateUser/", method=RequestMethod.PUT)
	public UserDetails updateUser(UserDetails user) {
		return userDetailsRepository.update(user) ;
	}*/
	
}
