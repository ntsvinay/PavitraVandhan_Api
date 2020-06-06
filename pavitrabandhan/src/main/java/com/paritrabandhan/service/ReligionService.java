package com.paritrabandhan.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pavitrabandhan.modal.Religion;

@Service
public interface ReligionService {
	public List<Religion> getAllReligion();

}
