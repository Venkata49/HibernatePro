package com.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {
	
	@Id
	@GeneratedValue
	private int pid;
	private String pname;
	private int page;
	private String ploc;
	
	@OneToOne(cascade = CascadeType.ALL) 	//This is reference to one to one relation ...this is taken one by one into Person classs.
	@JoinColumn(name = "fkpid") //We are using joins so me mention joincolumn
	private Passport pass;	//This is Passport class..

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getPloc() {
		return ploc;
	}

	public void setPloc(String ploc) {
		this.ploc = ploc;
	}

	public Passport getPass() {
		return pass;
	}

	public void setPass(Passport pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", page=" + page + ", ploc=" + ploc + ", pass=" + pass + "]";
	}
	

	
}
