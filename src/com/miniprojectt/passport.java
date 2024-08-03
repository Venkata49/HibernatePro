package com.miniprojectt;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class passport {
	

	@Id
	@GeneratedValue
	private int passid;
	private String passnum;
	private int passexp;
	
	
	public int getPassid() {
		return passid;
	}
	public void setPassid(int passid) {
		this.passid = passid;
	}
	public String getPasnsnum() {
		return passnum;
	}
	public void setPassnum(String passnum) {
		this.passnum = passnum;
	}
	public int getPassexp() {
		return passexp;
	}
	public void setPassexp(int passexp) {
		this.passexp = passexp;
	}
	
	
	@Override
	public String toString() {
		return "passport [passid=" + passid + ", passnum=" + passnum + ", passexp=" + passexp + "]";
	}
	
	
	

}
