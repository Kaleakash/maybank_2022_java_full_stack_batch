package com.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Trainer")
public class Trainer {
@Id
private int tid;
private String tname;
private String tech;
// Through Trainer object we can store student details also (insert, delete, update and retreive)
@OneToMany(mappedBy = "tsid",cascade = CascadeType.ALL)			// mapped by to FK ie tsid 
private List<Student> listOfStd;
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public String getTech() {
	return tech;
}
public void setTech(String tech) {
	this.tech = tech;
}
public List<Student> getListOfStd() {
	return listOfStd;
}
public void setListOfStd(List<Student> listOfStd) {
	this.listOfStd = listOfStd;
}
public Trainer(int tid, String tname, String tech, List<Student> listOfStd) {
	super();
	this.tid = tid;
	this.tname = tname;
	this.tech = tech;
	this.listOfStd = listOfStd;
}
public Trainer() {
	super();
	// TODO Auto-generated constructor stub
}

}
