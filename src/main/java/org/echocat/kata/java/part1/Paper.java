package org.echocat.kata.java.part1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Paper {
    public String title;
    public String description;
    public String isbn;
    public String[] author_emails;
    public Date publishedAt;
    public static List<Paper> allPapers;

    public Paper(String title, String isbn, String[] author_emails, String description) {
        this.title = title;
        this.isbn = isbn;
        this.author_emails = author_emails;
        this.description = description;
    }

    public Paper(String title, String isbn, String[] author_emails, Date publishedAt) {
        this.title = title;
        this.isbn = isbn;
        this.author_emails = author_emails;
        this.publishedAt = publishedAt;
    }
}
