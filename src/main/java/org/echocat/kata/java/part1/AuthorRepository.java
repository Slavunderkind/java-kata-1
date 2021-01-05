package org.echocat.kata.java.part1;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toUnmodifiableMap;

public class AuthorRepository {

	private final Map<String, Author> emailToAuthors;

	public AuthorRepository(Collection<Author> authors) {
		this.emailToAuthors = authors.stream()
				.collect(toUnmodifiableMap(
						Author::getEmail,
						author -> author
				));
	}

	public static AuthorRepository load() {
		throw new UnsupportedOperationException("Please implement me.");
	}

	public Optional<Author> findBy(String email) {
		return Optional.ofNullable(emailToAuthors.get(email));
	}

}


