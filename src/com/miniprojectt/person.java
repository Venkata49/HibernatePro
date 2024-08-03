package com.miniprojectt;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.miniprojectt.mobile;
import com.miniprojectt.passport;

@Entity
public class person {
	
	@Id
	@GeneratedValue
	private int pid;
	private String pname;
	private int page;
	private String ploc;
	
//	passport 
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fkpid")
	private passport port;
	
//	mobile
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fkpmid")
	private List<mobile> mob;
	
	
	@JoinTable(name = "percourse",joinColumns = @JoinColumn(name = "ffkpid"),inverseJoinColumns = @JoinColumn(name = "ffkcid"))
	@ManyToMany(cascade = CascadeType.ALL)
	private List<course> cours;

	public List<course> getCours() {
		return cours;
	}

	public void setCours(List<course> cours) {
		this.cours = cours;
	}

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

	public passport getPort() {
		return port;
	}

	public void setPort(passport port) {
		this.port = port;
	}

	public List<mobile> getMob() {
		return mob;
	}

	public void setMob(List<mobile> mob) {
		this.mob = mob;
	}

	@Override
	public String toString() {
		return "person [pid=" + pid + ", pname=" + pname + ", page=" + page + ", ploc=" + ploc + ", port=" + port
				+ ", mob=" + mob + ", cours=" + cours + "]";
	}

	
	
	

}
