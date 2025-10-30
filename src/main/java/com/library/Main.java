package com.library;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    //created array list

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> library = new ArrayList<>();

    public static void main(String[] args) {
        initializeBooks();
        libraryMenu();
    }

    public static void initializeBooks() {

        library.add("Secrets of the Sith");
        library.add("Harry Potter");
        library.add("Captain Underpants");
        library.add("Dune");
        library.add("Divergent");
        library.add( "How to kill a mockingbird");
        library.add( "Hunger Games");
        library.add( "Archie's Weird Mysteries");
        library.add("Holes");
        library.add("Amulet");
    }

    public static void libraryMenu() {
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
                    returnBook();

                default:
                    System.out.println("Invalid input");
                    break;
            }
        }     
    }

    private static void returnBook() {
    }

    private static void checkOutBook() {
        
    }

    private static void showCheckedOutBooks() {
        System.out.println("\nChecked Out Books: ");
        System.out.println("Invalid Input");

    }

    private static void showAvailableBooks() {
            System.out.println("\nAvailable Books: ");
            for (String h : library) {
                if (!h.isCheckedOut()) {
                    System.out.println(h);
                }
            }
        }
    }