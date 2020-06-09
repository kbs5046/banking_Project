package com.dao.entity;

import java.sql.Timestamp;

public class Transaction {
	private int trn_id;
	private int debit_acct;
	private int ben_id;
	private String trn_desc;
	private double trn_amt;
	private Timestamp trn_dt_time;
	public int getTrn_id() {
		return trn_id;
	}
	public void setTrn_id(int trn_id) {
		this.trn_id = trn_id;
	}
	public int getDebit_acct() {
		return debit_acct;
	}
	public void setDebit_acct(int debit_acct) {
		this.debit_acct = debit_acct;
	}
	public int getBen_id() {
		return ben_id;
	}
	public void setBen_id(int ben_id) {
		this.ben_id = ben_id;
	}
	public String getTrn_desc() {
		return trn_desc;
	}
	public void setTrn_desc(String trn_desc) {
		this.trn_desc = trn_desc;
	}
	public double getTrn_amt() {
		return trn_amt;
	}
	public void setTrn_amt(double trn_amt) {
		this.trn_amt = trn_amt;
	}
	public Timestamp getTrn_dt_time() {
		return trn_dt_time;
	}
	public void setTrn_dt_time(Timestamp trn_dt_time) {
		this.trn_dt_time = trn_dt_time;
	}
	@Override
	public String toString() {
		return "Transaction [trn_id=" + trn_id + ", debit_acct=" + debit_acct + ", ben_id=" + ben_id + ", trn_desc="
				+ trn_desc + ", trn_amt=" + trn_amt + ", trn_dt_time=" + trn_dt_time + "]";
	}
	
	

}
