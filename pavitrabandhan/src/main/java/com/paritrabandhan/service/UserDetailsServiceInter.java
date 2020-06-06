package com.paritrabandhan.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pavitrabandhan.modal.UserDetails;

public interface UserDetailsServiceInter {
	public List<UserDetails> findAllUser();
	public void addUser(UserDetails userDetails);
	public UserDetails updateUser(UserDetails user);
	public void deleteUser(int id);
	public UserDetails getUserReligionId();
	public UserDetails userValidation(String mail,String pass);

}
