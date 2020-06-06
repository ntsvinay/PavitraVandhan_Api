package com.pavitrabandhan.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class ProfileOwner {

	private String profileCreaterName;
	public String getProfileCreaterName() {
		return profileCreaterName;
	}
	public void setProfileCreaterName(String profileCreaterName) {
		this.profileCreaterName = profileCreaterName;
	}
	public int getProfileCreaterId() {
		return profileCreaterId;
	}
	public void setProfileCreaterId(int profileCreaterId) {
		this.profileCreaterId = profileCreaterId;
	}
	@Override
	public String toString() {
		return "ProfileOwner [profileCreaterName=" + profileCreaterName + ", profileCreaterId=" + profileCreaterId
				+ "]";
	}
	@Id
	@GeneratedValue
	private int profileCreaterId;
	
}
