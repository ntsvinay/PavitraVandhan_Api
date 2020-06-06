package com.paritrabandhan.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pavitrabandhan.modal.Caste;
import com.pavitrabandhan.modal.UserDetails;
@Repository
public interface UserDeatilsRepositry extends JpaRepository<UserDetails, Integer>{
	@Query("SELECT userDetails FROM UserDetails userDetails where userDetails.userEmail=:userEmail AND userDetails.userName=:userName")
	public UserDetails getValidUserDetails(@Param("userEmail") String userEmail,@Param("userName") String userName);
	

}
