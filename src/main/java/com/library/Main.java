package com.library;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //created array list
        ArrayList<String> book = new ArrayList();

        System.out.println("What book would you like to check out today?: ");
        String bookname = scanner.next();
        scanner.nextLine();

        book.add("Secrets of the Sith");
        book.add("Harry Potter");
        book.add("Captain Underpants");
        book.add("Dune");
        book.add("Divergent");
        book.add("How to kill a mockingbird");
        book.add("Hunger Games");
        book.add("Archie's Weird Mysteries");
        book.add("Holes");
        book.add("Amulet");

        scanner.close();

        //book.remove(1); - removes book from  indicated index line
        //book.set(1, "Ex Machina"); - replaces book with new book on indicated index line
        //System.out.println(book); - prints books
        // System.out.println(book.size()); - prints the quantity of books
       // Collections.sort(book); - sort books in alphabetical order
        }
    }