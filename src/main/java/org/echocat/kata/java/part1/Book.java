package org.echocat.kata.java.part1;

import java.util.Collection;

public class Book extends Paper {

	private final String description;

	public Book(String title, String isbn, Collection<String> author_emails, String description) {
		super(title, isbn, author_emails);
		this.description = description;
	}

	@Override
	public String toString() {
		return "Book [title: " + title + ", isbn: " + isbn + ", authors: " + String.join(", ", authorEmails) + ", description: " + description
				+ "]";
	}
}
