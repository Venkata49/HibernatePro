package com.demo.connection;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity	//Represent mapping class to hibernate..

// MySql - emp , TableName - Employe.
public class Employee {
	
	@Id	//Represent primary key..
	private int eid;
	private String ename;
	private double esal;
	private String edesg;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public String getEdesg() {
		return edesg;
	}
	public void setEdesg(String edesg) {
		this.edesg = edesg;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", edesg=" + edesg + "]";
	}
	
	

}
