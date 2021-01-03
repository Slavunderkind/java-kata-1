package org.echocat.kata.java.part1;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        System.out.println(getHelloWorldText());
    }

    protected static String getHelloWorldText() {
        LoadData loader = new LoadData();
        loader.start("books");
        loader.start("magazines");
        loader.start("authors");
        return "Okay!";
    }

}
