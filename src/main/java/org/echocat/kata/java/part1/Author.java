package org.echocat.kata.java.part1;

import java.util.List;

public class Author {
	private String email;
    private String firstName;
    private String lastName;
	public static List<Author> authors;

	public Author(String email, String firstName, String lastName){
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public static void setAuthors(List<Author> authors) {
		Author.authors = authors;
	}
}
