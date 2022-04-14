package com.motivity3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "College")
@Entity

public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int college_id;

	@Column(name = "name")
	private String name;

	@Column(name = "mail")
	private String mail;

	@Column(name = "location")
	private String location;

	@Column(name = "contact_num")
	private String contact_num;
	
	public College(int college_id){
		//constructor
		this.college_id = college_id;
		
	}
	
	public College() {
		
	}

	public College(int college_id, String name, String mail, String location, String contact_num) {
		// TODO Auto-generated constructor stub
		this.college_id = college_id;
		this.name = name;
		this.mail = mail;
		this.location = location;
		this.contact_num = contact_num;

	}

	public int getCollege_id() {
		return college_id;
	}

	public void setCollege_id(int college_id) {
		this.college_id = college_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getContact_num() {
		return contact_num;
	}

	public void setContact_num(String contact_num) {
		this.contact_num = contact_num;
	}

	

}
