package com.h57.sample.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * MyBatis Domain object to access Identity information.
 * 
 * @author Bubba
 * 
 */
public class Identity implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	private String userid;
	private String salt;
	private String email;
	private Date created;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}