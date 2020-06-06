package com.paritrabandhan.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paritrabandhan.repositry.UserDeatilsRepositry;
import com.pavitrabandhan.modal.UserDetails;

@Service("userDetailsService")
public class UserDetailsService implements UserDetailsServiceInter {
	@Autowired
	private UserDeatilsRepositry userdeatilsRepObj;

	public List<UserDetails> findAllUser() { // TODO Auto-generated method stub
		List<UserDetails> users = new ArrayList<UserDetails>();
		userdeatilsRepObj.findAll().forEach(users::add);
		return users;
	}

	public void addUser(UserDetails userDetails) { // TODO Auto-generated method
		userdeatilsRepObj.save(userDetails);

	}

	public String gettst() {
		return "test";
	}

	@Override
	public UserDetails updateUser(UserDetails user) {
		// TODO Auto-generated method stub
		return userdeatilsRepObj.save(user);
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userdeatilsRepObj.deleteById(id);
	}

	@Override
	public UserDetails getUserReligionId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDetails userValidation(String mail, String pass) {
		// TODO Auto-generated method stub
		return userdeatilsRepObj.getValidUserDetails(mail, pass);
	}

}
