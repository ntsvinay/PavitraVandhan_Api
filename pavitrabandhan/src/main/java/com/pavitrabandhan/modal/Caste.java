package com.pavitrabandhan.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Caste {
	@Id
	@GeneratedValue
	private int id;
	private int caste_id;
	private int caste_religion_id;
	private String caste_name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCaste_id() {
		return caste_id;
	}

	@Override
	public String toString() {
		return "Caste [id=" + id + ", caste_id=" + caste_id + ", caste_religion_id=" + caste_religion_id
				+ ", caste_name=" + caste_name + "]";
	}

	public void setCaste_id(int caste_id) {
		this.caste_id = caste_id;
	}

	public int getCaste_religion_id() {
		return caste_religion_id;
	}

	public void setCaste_religion_id(int caste_religion_id) {
		this.caste_religion_id = caste_religion_id;
	}

	public String getCaste_name() {
		return caste_name;
	}

	public void setCaste_name(String caste_name) {
		this.caste_name = caste_name;
	}

}
