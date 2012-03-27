package com.h57.sample.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 
 * Basic login form with JSR-303 Annotations for validation
 * 
 * @author Bubba Hines (bubba@hines57.com)
 * 
 */
public class LoginForm {

	@NotNull(message = "User Name field is mandatory.")
	@Size(min = 4, max = 50, message = "User Name field must be greater than 4 but less than 50 characters.")
	private String username;

	@NotNull(message = "Passphrase field is mandatory.")
	@Size(min = 8, max = 50, message = "Passphrase field must be greater than 8 but less than 50 characters.")
	private String passphrase;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username.trim();
	}

	public String getPassphrase() {
		return passphrase;
	}

	public void setPassphrase(String passphrase) {
		this.passphrase = passphrase.trim();
	}
}