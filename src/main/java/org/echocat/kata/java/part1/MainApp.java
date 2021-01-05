package org.echocat.kata.java.part1;

import java.util.Scanner;

public class MainApp {

	private final AuthorRepository authorRepository = AuthorRepository.load();
	private final PaperRepository paperRepository = PaperRepository.load();

	public void run() {
		loadInitialData();
		authorRepository.findBy("foo@bar.com")
				.ifPresent(author -> System.out.println("Author: " + author));
		System.out.println("Here is a list of available actions:");
		System.out.println("Enter 1 to print all Books and Magazines.");
		System.out.println("Enter 2 to search by entered ISBN in all Books and Magazines.");
		System.out.println("Enter 3 to search by entered author email in all Books and Magazines.");
		System.out.println("Enter 4 to print all Books and Magazines sorted by title.");

		System.out.println("Enter an Action: ");
		Scanner scanner = new Scanner(System.in);
		String action = scanner.next();
		pickAnAction(action, scanner);

	}

	public static void main(String[] args) {
		final var app = new MainApp();
		app.run();
	}

	public static void pickAnAction(String action, Scanner scanner) {
		switch (action) {
			case "1" -> Paper.printAll();
			case "2" -> {
				System.out.println("Enter ISBN: ");
				String isbn = scanner.next();
				Paper.findAllByIsbn(isbn);
			}
			case "3" -> {
				System.out.println("Enter author email: ");
				String email = scanner.next();
				Paper.findAllByAuthorEmail(email);
			}
			case "4" -> Paper.printAllSortedByTitle();
		}
	}

	protected static String getHelloWorldText() {
		return "Hello World!";
	}

	protected static void loadInitialData() {
		LoadData loader = new LoadData();
		loader.start("books");
		loader.start("magazines");
		loader.start("authors");
	}
}
