package com.paritrabandhan.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pavitrabandhan.modal.MotherTongue;
@Repository
public interface MotherTongueRepositry   extends JpaRepository<MotherTongue, Integer>{

}
