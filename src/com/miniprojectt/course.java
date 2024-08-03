package com.miniprojectt;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class course {
	
	@Id
	@GeneratedValue
	private int cid;
	private String cname;
	private double cfees;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getCfees() {
		return cfees;
	}
	public void setCfees(double cfees) {
		this.cfees = cfees;
	}
	@Override
	public String toString() {
		return "course [cid=" + cid + ", cname=" + cname + ", cfees=" + cfees + "]";
	}
	

	
}
