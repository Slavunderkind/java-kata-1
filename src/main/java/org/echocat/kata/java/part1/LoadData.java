package org.echocat.kata.java.part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoadData {
	private final String csvDirectory = "src/main/resources/org/echocat/kata/java/part1/data/";
	List<Paper> papers = new ArrayList<>();
	List<Author> authors = new ArrayList<>();

	public void start(String fileName){
		Path pathToFile = Paths.get(csvDirectory + fileName + ".csv");

		try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.UTF_8)) {
			br.readLine();
			String line = br.readLine();
			while (line != null) {
                String[] attributes = line.split(";");
                switch (fileName){
					case "books":
						papers.add(loadBooks(attributes));
						break;
					case "magazines":
						papers.add(loadMagazines(attributes));
						break;
					case "authors":
						authors.add(loadAuthors(attributes));
						break;
				}
                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
		if (fileName == "authors"){
			addAuthors(authors);
		}else if(fileName == "books" || fileName == "magazines"){
			addPapers(papers);
		}
	}

	private void addAuthors(List<Author> authors) {
		Author.setAuthors(authors);
	}

	private void addPapers(List<Paper> papers) {
		Paper.allPapers = papers;
	}

	private Author loadAuthors(String[] attributes) {
		String email = attributes[0];
		String firstName = attributes[1];
		String lastName = attributes[2];

		return new Author(email, firstName, lastName);
	}

	private Paper loadBooks(String[] attributes){
		String title = attributes[0];
		String isbn = attributes[1];
		String[] emails = attributes[2].split(",");
        String description = attributes[3];

		return new Book(title, isbn, emails, description);
	}

	private Paper loadMagazines(String[] attributes) {
		String title = attributes[0];
		String isbn = attributes[1];
		String[] emails = attributes[2].split(",");

		Date publishedAt = null;
		try {
			publishedAt = new SimpleDateFormat("dd.MM.yyyy").parse(attributes[3]);
		} catch (ParseException e) {
			e.printStackTrace();
			publishedAt = null;
		}

		return new Magazine(title, isbn, emails, publishedAt);
	}
}
