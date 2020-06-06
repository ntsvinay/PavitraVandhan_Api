package com.pavitrabandhan.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Religion {
	@Id
	@GeneratedValue
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Religion [id=" + id + ", religion_id=" + religion_id + ", religion_name=" + religion_name + "]";
	}
	public int getReligion_id() {
		return religion_id;
	}
	public void setReligion_id(int religion_id) {
		this.religion_id = religion_id;
	}
	public String getReligion_name() {
		return religion_name;
	}
	public void setReligion_name(String religion_name) {
		this.religion_name = religion_name;
	}
	private int religion_id;
	private String religion_name;
}
