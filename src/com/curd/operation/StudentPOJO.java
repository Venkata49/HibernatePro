package com.curd.operation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class StudentPOJO {
	
	@Id
	@GeneratedValue
	private int sid=1;
	private String sname;
	private String scourse;
	private int sage;
	private double smarks;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScourse() {
		return scourse;
	}
	public void setScourse(String scourse) {
		this.scourse = scourse;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public double getSmarks() {
		return smarks;
	}
	public void setSmarks(double smarks) {
		this.smarks = smarks;
	}
	
	
	@Override
	public String toString() {
		return "StudentPOJO [sid=" + sid + ", sname=" + sname + ", scourse=" + scourse + ", sage=" + sage + ", smarks="
				+ smarks + "]";
	}

	
	

}
