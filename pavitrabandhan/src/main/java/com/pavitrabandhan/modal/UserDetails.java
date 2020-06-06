package com.pavitrabandhan.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "user_details")
public class UserDetails {
	@Id
	@GeneratedValue
	private int userId;
	@OneToOne
	@JoinColumn(name = "religion_id")
	private Religion userReligion;

	public Religion getUserReligion() {
		return userReligion;
	}

	public void setUserReligion(Religion userReligion) {
		this.userReligion = userReligion;
	}

	@OneToOne
	@JoinColumn(name = "caste_id")
	private Caste userCaste;

	public Caste getUserCaste() {
		return userCaste;
	}

	public void setUserCaste(Caste userCaste) {
		this.userCaste = userCaste;
	}

	private String userName;
	@NaturalId
	@NotEmpty(message = "email must not be empty")
	@Email(message = "email should be a valid email")
	@Column(unique = true)
	private String userEmail;

	private int userMobile;
	private String userGender;

	public MotherTongue getUserMotherTongue() {
		return userMotherTongue;
	}

	public void setUserMotherTongue(MotherTongue userMotherTongue) {
		this.userMotherTongue = userMotherTongue;
	}

	public ProfileOwner getUserProfileOwner() {
		return userProfileOwner;
	}

	public void setUserProfileOwner(ProfileOwner userProfileOwner) {
		this.userProfileOwner = userProfileOwner;
	}

	@OneToOne
	@JoinColumn(name = "motherTongueId")
	private MotherTongue userMotherTongue;
	@OneToOne
	@JoinColumn(name = "profileCreaterId")
	private ProfileOwner userProfileOwner;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public int getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(int userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

}
