package com.miniprojectt;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class mobile {
	@Id
	@GeneratedValue
	private int mid;
	private String msim;
	private long mnumber;
	
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMsim() {
		return msim;
	}
	public void setMsim(String msim) {
		this.msim = msim;
	}
	public long getMnumber() {
		return mnumber;
	}
	public void setMnumber(long mnumber) {
		this.mnumber = mnumber;
	}
	@Override
	public String toString() {
		return "mobile [mid=" + mid + ", msim=" + msim + ", mnumber=" + mnumber + "]";
	}
	
	



}
