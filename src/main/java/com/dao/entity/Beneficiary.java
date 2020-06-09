package com.dao.entity;

import java.math.BigInteger;

public class Beneficiary {
	private int ben_id;
	private int owner_id;
	private String ben_type;
	private String ben_nick_name;
	private String ben_name;
	private BigInteger ben_acct_num;
	private String ben_bank;
	private String ben_bank_ifsc;
	public int getBen_id() {
		return ben_id;
	}
	public void setBen_id(int ben_id) {
		this.ben_id = ben_id;
	}
	public int getOwner_id() {
		return owner_id;
	}
	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}
	public String getBen_type() {
		return ben_type;
	}
	public void setBen_type(String ben_type) {
		this.ben_type = ben_type;
	}
	public String getBen_nick_name() {
		return ben_nick_name;
	}
	public void setBen_nick_name(String ben_nick_name) {
		this.ben_nick_name = ben_nick_name;
	}
	public String getBen_name() {
		return ben_name;
	}
	public void setBen_name(String ben_name) {
		this.ben_name = ben_name;
	}
	public BigInteger getBen_acct_num() {
		return ben_acct_num;
	}
	public void setBen_acct_num(BigInteger ben_acct_num) {
		this.ben_acct_num = ben_acct_num;
	}
	public String getBen_bank() {
		return ben_bank;
	}
	public void setBen_bank(String ben_bank) {
		this.ben_bank = ben_bank;
	}
	public String getBen_bank_ifsc() {
		return ben_bank_ifsc;
	}
	public void setBen_bank_ifsc(String ben_bank_ifsc) {
		this.ben_bank_ifsc = ben_bank_ifsc;
	}
	@Override
	public String toString() {
		return "Beneficiary [ben_id=" + ben_id + ", owner_id=" + owner_id + ", ben_type=" + ben_type
				+ ", ben_nick_name=" + ben_nick_name + ", ben_name=" + ben_name + ", ben_acct_num=" + ben_acct_num
				+ ", ben_bank=" + ben_bank + ", ben_bank_ifsc=" + ben_bank_ifsc + "]";
	}

	
}
