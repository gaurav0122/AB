package com.profile.app.impl;

public class AddUserException extends Exception {

	private String check;
	
	public AddUserException(String check) {
		this.check = check;
		getUser();
	}
	
	public String getUser() {
		return check;
	}

	@Override
	public String toString() {
		return "AddUserException [check=" + check + "]";
	}

	
}
