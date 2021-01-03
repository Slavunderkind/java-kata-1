package org.echocat.kata.java.part1;

import java.util.List;

public class Book extends Paper{
	public String title;

	public Book(String title, String isbn, String[] author_emails, String description) {
		super(title, isbn, author_emails, description);
	}
}
