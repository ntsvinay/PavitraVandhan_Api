package com.paritrabandhan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paritrabandhan.repositry.CasteRepositry;
import com.pavitrabandhan.modal.Caste;

@Service
public class CasteServiceImpl implements CasteService {

	@Autowired
	private CasteRepositry casteRepositry;

	@Override
	public List<Caste> getAllCaste() {
		// TODO Auto-generated method stub
		return casteRepositry.findAll();
	}

	@Override
	public List<Caste> getCaste(int id) {
		// TODO Auto-generated method stub
		
		return  casteRepositry.getCasteById(id);
	}

}
