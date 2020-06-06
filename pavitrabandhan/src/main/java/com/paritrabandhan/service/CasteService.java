package com.paritrabandhan.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pavitrabandhan.modal.Caste;
@Service
public interface CasteService {
	
	public List<Caste> getAllCaste();
	public List<Caste> getCaste(int id);

}
