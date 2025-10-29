package com.library;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    //created array list
    static ArrayList<String> book = new ArrayList();

    public static void main(String[] args) {
        initializeBooks();
        checkedOutTo();
    }

    public static void initializeBooks() {

        book.add(1, "Secrets of the Sith");
        book.add(2, "Harry Potter");
        book.add(3, "Captain Underpants");
        book.add(4, "Dune");
        book.add(5, "Divergent");
        book.add(6, "How to kill a mockingbird");
        book.add(7, "Hunger Games");
        book.add(8, "Archie's Weird Mysteries");
        book.add(9, "Holes");
        book.add(10, "Amulet");
    }

    public static void checkedOutTo() {
        String choice = "";

        while (!choice.equals("3")) {
            System.out.println("\n===================");
            System.out.println(" The Library Archives ");
            System.out.println("=================");
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Exit");
            System.out.println("===============");
            System.out.println("Enter choice: ");
            choice = scanner.nextLine();
        }

        scanner.close();

        //book.remove(1); - removes book from  indicated index line
        //book.set(1, "Ex Machina"); - replaces book with new book on indicated index line
        //System.out.println(book); - prints books
        //System.out.println(book.size()); - prints the quantity of books
        //Collections.sort(book); - sort books in alphabetical order
        }
    }