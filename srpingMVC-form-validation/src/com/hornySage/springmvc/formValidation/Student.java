package com.hornySage.springmvc.formValidation;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {
	String firstName;
	
	@NotNull(message = "is required")
	@Size(min=1,message="is required")
	String lastName;

	Student() {
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
