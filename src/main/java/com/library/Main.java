package com.library;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    //created array list

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Book> library = new ArrayList<>();

    public static void main(String[] args) {
        initializeBooks();
        libraryMenu();
    }

    public static void initializeBooks() {

        library.add(new Book(1,"91-1","Secrets of the Sith"));
        library.add(new Book(2, "91-2","Harry Potter"));
        library.add(new Book(3, "91-3","Captain Underpants"));
        library.add(new Book(4,"91-4", "Dune"));
        library.add(new Book(5, "91-5","Divergent"));
        library.add(new Book(6, "91-6","How to kill a mockingbird"));
        library.add(new Book(7,"91-7","Hunger Games"));
        library.add(new Book(8, "91-8","Archie's Weird Mysteries"));
        library.add(new Book(9, "91-9","Holes"));
        library.add(new Book(10, "92-0","Amulet"));
    }

    public static void libraryMenu() {
        String choice = "";

        while (!choice.equals("3")) {
            System.out.println("\n===================");
            System.out.println(" The Library Archives ");
            System.out.println("=================");
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Check Out Book");
            System.out.println("4. Exit");
            System.out.println("===============");
            System.out.println("Enter choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    showAvailableBooks();
                    break;
                case "2":
                    showCheckedOutBooks();
                    break;
                case "3":
                    checkOutBook();
                    break;
                case "4":
                    System.out.println("Have a wonderful day.");
                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }
        }     
    }

    private static void showAvailableBooks() {
        System.out.println("\nAvailable Books: ");
        int count = 0;
        for (Book book : library) {
            if (!book.isCheckedOut()) {
                count++;
                System.out.println(count + ". " + book.getTitle());
            }
        }
        if (count == 0) {
            System.out.println("No books available.");
            return;
        }
    }

    private static void showCheckedOutBooks() {
        System.out.println("\nChecked Out Books: ");
        boolean found = false;
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).isCheckedOut()) {
                System.out.println((i + 1) + ". " + library.get(i).getTitle());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books are currently checked out.");
       }

    }
    private static void checkOutBook() {
        showAvailableBooks();
        System.out.println("Enter book number to check out: ");
        int choice = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (Book book : library) {
            if (!book.isCheckedOut()) {
                count++;
                if (count == choice) {
                    book.setCheckedOut(true);
                    System.out.println("You have checked out: " + book.getTitle());
                    return;
                }
            }
        }
    }
}