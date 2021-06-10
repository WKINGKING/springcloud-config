package com.wjz.demo.entities;

import java.util.Date;

public class User {

	private Integer uId;
	private String uName;
	private Integer uGender;
	private Integer uAge;
	private String uLoginname;
	private String uPassword;
	private Date uBirth;
	private String uEmail;
	private String uAddress;

	public Integer getuId() {
		return uId;
	}

	public void setuId(Integer uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public Integer getuGender() {
		return uGender;
	}

	public void setuGender(Integer uGender) {
		this.uGender = uGender;
	}

	public Integer getuAge() {
		return uAge;
	}

	public void setuAge(Integer uAge) {
		this.uAge = uAge;
	}

	public String getuLoginname() {
		return uLoginname;
	}

	public void setuLoginname(String uLoginname) {
		this.uLoginname = uLoginname;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	public Date getuBirth() {
		return uBirth;
	}

	public void setuBirth(Date uBirth) {
		this.uBirth = uBirth;
	}

	public String getuEmail() {
		return uEmail;
	}

	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}

	public String getuAddress() {
		return uAddress;
	}

	public void setuAddress(String uAddress) {
		this.uAddress = uAddress;
	}

	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + ", uGender=" + uGender + ", uAge=" + uAge + ", uLoginname="
				+ uLoginname + ", uPassword=" + uPassword + ", uBirth=" + uBirth + ", uEmail=" + uEmail + ", uAddress="
				+ uAddress + "]";
	}

	public User(Integer uId, String uName, Integer uGender, Integer uAge, String uLoginname, String uPassword,
			Date uBirth, String uEmail, String uAddress) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.uGender = uGender;
		this.uAge = uAge;
		this.uLoginname = uLoginname;
		this.uPassword = uPassword;
		this.uBirth = uBirth;
		this.uEmail = uEmail;
		this.uAddress = uAddress;
	}

	public User() {
		super();
	}
}
