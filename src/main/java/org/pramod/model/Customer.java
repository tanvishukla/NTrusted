package org.pramod.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER")
public class Customer {

	@Id @GeneratedValue
	@Column(name="fbId")
	private int fbId;
	@Column
	private String fName;
	@Column
	private String lName;
	@Column
	private String emailId;
	@Column
	private String phoneNumber;
	/*@Column
	private String state;
	@Column
	private int pin;*/
	public int getFbId() {
		return fbId;
	}
	public void setFbId(int fbId) {
		this.fbId = fbId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
