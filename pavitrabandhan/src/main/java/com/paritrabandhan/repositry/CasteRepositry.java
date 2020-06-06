package com.paritrabandhan.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pavitrabandhan.modal.Caste;

@Repository
public interface CasteRepositry extends JpaRepository<Caste, Integer>{
	@Query("SELECT caste FROM Caste caste where caste.caste_religion_id=:id")
	public List<Caste> getCasteById(@Param("id") int id);

}
