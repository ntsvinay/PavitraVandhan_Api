package com.paritrabandhan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paritrabandhan.repositry.ReligionRepositry;
import com.pavitrabandhan.modal.Religion;

@Service
public class ReligionServiceImpl implements ReligionService {

	@Autowired
	private ReligionRepositry religionRepositry;

	@Override
	public List<Religion> getAllReligion() {
		// TODO Auto-generated method stub
		return religionRepositry.findAll();
	}

}
