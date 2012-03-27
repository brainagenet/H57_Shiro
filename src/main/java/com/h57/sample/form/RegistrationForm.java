package com.h57.sample.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

/**
 * Basic Registration Form with JSR-303 Validation
 * 
 * @author Bubba Hines (bubba@hines57.com)
 * 
 */
public class RegistrationForm {

	// TODO: Determine uniqueness of usernames. Don't allow one that is already
	// in the DB?
	@NotNull(message = "User Name field is mandatory.")
	@Size(min = 4, max = 50, message = "User Name field must be greater than 4 but less than 50 characters.")
	private String username;

	// TODO: Determine uniqueness of Email Addresses. Don't allow one that is
	// already in the DB
	@NotNull(message = "Email field is mandatory.")
	@Email(message = "Must be a valid, well formed, email address.")
	private String email;

	@NotNull(message = "Passphrase field is mandatory.")
	@Size(min = 8, max = 50, message = "Passphrase field must be greater than 8 but less than 50 characters.")
	private String passphrase;

	private String salt;

	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email.trim();
	}

	public String getPassphrase() {
		return passphrase;
	}

	public void setPassphrase(String passphrase) {
		this.passphrase = passphrase.trim();
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt.trim();
	}

}