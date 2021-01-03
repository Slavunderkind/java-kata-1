package org.echocat.kata.java.part1;

import java.util.Date;
import java.util.List;

public class Paper {
	private String title;
    private String description;
    private String isbn;
    private List<String> author_emails;
    private Date publishedAt;

    public Paper(String title, String isbn, List<String> author_emails, String description) {
        this.title = title;
        this.isbn = isbn;
        this.author_emails = author_emails;
        this.description = description;
    }

    public Paper(String title, String isbn, List<String> author_emails, Date publishedAt) {
        this.title = title;
        this.isbn = isbn;
        this.author_emails = author_emails;
        this.publishedAt = publishedAt;
    }
}
