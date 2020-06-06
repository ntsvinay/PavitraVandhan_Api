package com.pavitrabandhan.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.paritrabandhan.service.CasteService;
import com.paritrabandhan.service.MotherTongueService;
import com.paritrabandhan.service.ProfileOwnerService;
import com.paritrabandhan.service.ReligionService;
import com.paritrabandhan.service.ServiceTesting;
import com.paritrabandhan.service.UserDetailsServiceInter;
import com.pavitrabandhan.modal.Caste;
import com.pavitrabandhan.modal.MotherTongue;
import com.pavitrabandhan.modal.ProfileOwner;
import com.pavitrabandhan.modal.Religion;
import com.pavitrabandhan.modal.UserDetails;

@RestController
@ComponentScan
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ControllerClass {
//http://localhost:8080/userDetails
	
	@Autowired
	private ReligionService religionService;
	@Autowired
	private UserDetailsServiceInter userDetailsService;
	@Autowired
	private CasteService casteService;
	@Autowired
	private ProfileOwnerService profileOwnerService;
	@Autowired
	private MotherTongueService motherTongueService;

	@RequestMapping("/testing")
	public String test() {
		return "test";
	}

	@Autowired
	private ServiceTesting tst;

	@RequestMapping("/userDetails")
	public List<UserDetails> getUserDetails() {
		// return tst.getList();
		return userDetailsService.findAllUser();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/userDetails")
	public ResponseEntity<UserDetails> add(@Valid @RequestBody UserDetails ud) {
		userDetailsService.addUser(ud);
		return new ResponseEntity<UserDetails>(ud, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/updateUser")
	public UserDetails updateUser(@RequestBody UserDetails user) {
		return userDetailsService.updateUser(user);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/deleteUser/{id}")
	public void deleteUser(@PathVariable int id) {
		userDetailsService.deleteUser(id);
	}

	@RequestMapping("/allCaste")
	public List<Caste> getallCaste() {
		return casteService.getAllCaste();
	}

	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@RequestMapping("/caste/{id}")
	public List<Caste> getCaste(@PathVariable int id) {
		return casteService.getCaste(id);
	}

	// get all religion
	@RequestMapping("/allReligion")
	public List<Religion> getAllReligion() {
		return religionService.getAllReligion();
	}

	// get profile creater list
	@RequestMapping("/profileOwner")
	public List<ProfileOwner> getAllProfileOwner() {
		return profileOwnerService.getProfileOwner();
	}

	// get mother tongue list
	@RequestMapping("/motherTongue")
	public List<MotherTongue> getMotherTongueList() {
		return motherTongueService.getMotherTongue();
	}
	
	@RequestMapping("/userLoging")
	public UserDetails userDetails(@Valid @RequestBody UserDetails user)
	{
		
		
		return userDetailsService.userValidation(user.getUserEmail(),user.getUserName());
		
	}

}
