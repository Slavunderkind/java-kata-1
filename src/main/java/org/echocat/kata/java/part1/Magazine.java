package org.echocat.kata.java.part1;

import java.util.Date;
import java.util.List;

public class Magazine extends Paper{
	public Magazine(String title, String isbn, String[] author_emails, Date publishedAt) {
		super(title, isbn, author_emails, publishedAt);
	}

	@Override
    public String toString() {
        return "Magazine [title: " + title + ", isbn:" + isbn + ", authors: " + String.join(", ", author_emails) + ", published at: " + publishedAt
                + "]";
    }
}
