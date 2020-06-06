package com.paritrabandhan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paritrabandhan.repositry.MotherTongueRepositry;
import com.pavitrabandhan.modal.MotherTongue;
@Service
public class MotherTongueImpl implements MotherTongueService {
	@Autowired
	private MotherTongueRepositry mtRipoObj;

	@Override
	public List<MotherTongue> getMotherTongue() {
		// TODO Auto-generated method stub
		return mtRipoObj.findAll();
	}

}
