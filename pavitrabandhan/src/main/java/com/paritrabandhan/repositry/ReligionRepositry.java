package com.paritrabandhan.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pavitrabandhan.modal.Religion;

@Repository
public interface ReligionRepositry extends JpaRepository<Religion, Integer> {

}
