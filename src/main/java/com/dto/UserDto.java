package com.dto;

import java.math.BigInteger;
import java.sql.Date;


public class UserDto {
	private int user_id;
	private String username;
	private String password;
	private String user_role;
	private String user_status;
	private String first_name;
	private String last_name;
	private Date dob;
	private String add_line1;
	private String add_line2;
	private String city;
	private String state;
	private int pin;
	private BigInteger mobile_number;
	private String email_id;
	private BigInteger aadhar_id;
	private String pan;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUser_role() {
		return user_role;
	}
	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}
	public String getUser_status() {
		return user_status;
	}
	public void setUser_status(String user_status) {
		this.user_status = user_status;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public BigInteger getAadhar_id() {
		return aadhar_id;
	}
	public void setAadhar_id(BigInteger aadhar_id) {
		this.aadhar_id = aadhar_id;
	}
	public String getAdd_line1() {
		return add_line1;
	}
	public void setAdd_line1(String add_line1) {
		this.add_line1 = add_line1;
	}
	public String getAdd_line2() {
		return add_line2;
	}
	public void setAdd_line2(String add_line2) {
		this.add_line2 = add_line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public BigInteger getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(BigInteger mobile_number) {
		this.mobile_number = mobile_number;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	@Override
	public String toString() {
		return "UserDto [user_id=" + user_id + ", username=" + username + ", password=" + password + ", user_role="
				+ user_role + ", user_status=" + user_status + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", dob=" + dob + ", add_line1=" + add_line1 + ", add_line2=" + add_line2 + ", city=" + city
				+ ", state=" + state + ", pin=" + pin + ", mobile_number=" + mobile_number + ", email_id=" + email_id
				+ ", aadhar_id=" + aadhar_id + ", pan=" + pan + "]";
	}
	
	
	
}
