package com.webapplication.jee;

public class UserValidationService {

	public boolean isUserValid(String user, String password) {
		if (user.equals("Shivam") && password.equals("LOL")) {
			return true;
		}
		return false;

	}
}
