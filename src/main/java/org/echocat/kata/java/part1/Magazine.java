package org.echocat.kata.java.part1;

import java.util.Collection;
import java.util.Date;

public class Magazine extends Paper{
	private final Date publishedAt;

	public Magazine(String title, String isbn, Collection<String> author_emails, Date publishedAt) {
		super(title, isbn, author_emails);
		this.publishedAt = publishedAt;
	}

	@Override
    public String toString() {
        return "Magazine [title: " + title + ", isbn:" + isbn + ", authors: " + String.join(", ", authorEmails) + ", published at: " + publishedAt
                + "]";
    }
}
