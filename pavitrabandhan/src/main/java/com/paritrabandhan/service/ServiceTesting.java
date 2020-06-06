package com.paritrabandhan.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pavitrabandhan.modal.UserDetails;

@Service
public class ServiceTesting {
	List<UserDetails> users = new ArrayList<UserDetails>();

	public List<UserDetails> getList() {
		return users;
	}

	public void addUser(UserDetails ud) {
		users.add(ud);
	}

}
