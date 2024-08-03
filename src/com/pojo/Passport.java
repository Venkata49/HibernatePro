package com.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passport {

	@Id
	@GeneratedValue
	private int passid;
	private String passum;
	private int passexp;
	
	
	public int getPassid() {
		return passid;
	}
	public void setPassid(int passid) {
		this.passid = passid;
	}
	public String getPassum() {
		return passum;
	}
	public void setPassum(String passum) {
		this.passum = passum;
	}
	public int getPassexp() {
		return passexp;
	}
	public void setPassexp(int passexp) {
		this.passexp = passexp;
	}
	@Override
	public String toString() {
		return "Passport [passid=" + passid + ", passum=" + passum + ", passexp=" + passexp + "]";
	}
	
	
	
}
