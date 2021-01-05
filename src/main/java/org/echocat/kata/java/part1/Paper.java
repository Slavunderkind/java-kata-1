package org.echocat.kata.java.part1;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Paper {
	public final String title;
	public final String isbn;
	public final List<String> authorEmails;
	public static List<Paper> allPapers;

	public Paper(String title, String isbn, Collection<String> authorEmails) {
		this.title = title;
		this.isbn = isbn;
		this.authorEmails = List.copyOf(authorEmails);
	}

	public static void printAll() {
		for (Paper p : allPapers) {
			System.out.println(p);
		}
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Paper)) return false;
		Paper paper = (Paper) o;
		return isbn.equals(paper.isbn);
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	public String getTitle() {
		return title;
	}

	public String getIsbn() {
		return isbn;
	}

	public List<String> getAuthorEmails() {
		return authorEmails;
	}

	public static void findAllByAuthorEmail(String email) {
		for (Paper p : allPapers) {
			if (email.contains(String.join(",", p.authorEmails))) {
				System.out.println(p);
			}
		}
	}

	public static void findAllByIsbn(String isbn) {
		for (Paper p : allPapers) {
			if (p.isbn.equals(isbn)) {
				System.out.println(p);
			}
		}
	}

	public static void printAllSortedByTitle() {
		Stream<Paper> sorted = allPapers.stream().sorted(Comparator.comparing(Paper::title));
		System.out.println(sorted);
	}

	private String title() {
		return this.title;
	}
}
