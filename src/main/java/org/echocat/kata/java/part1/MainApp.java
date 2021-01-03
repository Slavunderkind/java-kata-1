package org.echocat.kata.java.part1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        loadInitialData();
        System.out.println("Enter an Action: ");
        Scanner scanner = new Scanner(System.in);
        String action = scanner.next();
        pickAnAction(action, scanner);
    }

    public static void pickAnAction(String action, Scanner scanner){
        switch (action) {
            case "1":
                Paper.printAll();
                break;
            case "2":
                System.out.println("Enter ISBN: ");
                String isbn = scanner.next();

                Paper.findAllByIsbn(isbn);
                break;
            case "3":
                System.out.println("Enter author email: ");
                String email = scanner.next();
                Paper.findAllbyAuthorEmail(email);
                break;
            case "4":
                Paper.printAllSortedByTitle();
                break;
        }
    }

    protected static String getHelloWorldText() {
        return "Hello World!";
    }

    protected static void loadInitialData(){
        LoadData loader = new LoadData();
        loader.start("books");
        loader.start("magazines");
        loader.start("authors");
    }
}
