package com.paritrabandhan.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pavitrabandhan.modal.ProfileOwner;

@Repository
public interface ProfileOwnerRepositry extends JpaRepository<ProfileOwner, Integer>{

}
