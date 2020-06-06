package com.pavitrabandhan.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class MotherTongue {
	private String motherTongueName;
	@Id
	@GeneratedValue
	private int motherTongueId;
	@Override
	public String toString() {
		return "MotherTongue [motherTongueName=" + motherTongueName + ", motherTongueId=" + motherTongueId + "]";
	}
	public String getMotherTongueName() {
		return motherTongueName;
	}
	public void setMotherTongueName(String motherTongueName) {
		this.motherTongueName = motherTongueName;
	}
	public int getMotherTongueId() {
		return motherTongueId;
	}
	public void setMotherTongueId(int motherTongueId) {
		this.motherTongueId = motherTongueId;
	}

}
