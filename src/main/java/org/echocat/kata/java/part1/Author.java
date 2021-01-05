package org.echocat.kata.java.part1;

import java.util.List;

public class Author {
	private final String email;
	private final String firstName;
	private final String lastName;
	public static List<Author> authors;

	public Author(String email, String firstName, String lastName) {
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public static void setAuthors(List<Author> authors) {
		Author.authors = authors;
	}
}
