package com.glassbox.webinvoice.shared.DTOentity;

import java.io.Serializable;

public class EmailDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;

	private String emailAddress;

	private PersonDTO person;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public PersonDTO getPerson() {
		return person;
	}

	public void setPerson(PersonDTO person) {
		this.person = person;
	}

}