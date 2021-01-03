package org.echocat.kata.java.part1;

import java.util.Date;
import java.util.List;

public class Magazine extends Paper{
	public Magazine(String title, String isbn, String[] author_emails, Date publishedAt) {
		super(title, isbn, author_emails, publishedAt);
	}
}
