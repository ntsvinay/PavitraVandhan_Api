package com.paritrabandhan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paritrabandhan.repositry.ProfileOwnerRepositry;
import com.pavitrabandhan.modal.ProfileOwner;
@Service
public class ProfileOwnerImpl implements ProfileOwnerService{

	@Autowired
	private ProfileOwnerRepositry profileOwnerRipoObj;
	@Override
	public List<ProfileOwner> getProfileOwner() {
		// TODO Auto-generated method stub
		return profileOwnerRipoObj.findAll();
	}

}
