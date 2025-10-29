package com.library;

public class Book {
    int id;
    String isbn;
    String title;
    boolean isCheckedOut;
    String checkedOutTo;

    void checkOut(String name) {
        isCheckedOut = true;
        checkedOutTo = name;
    }

    void checkIn() {
        isCheckedOut = false;
        checkedOutTo = "";
    }

}
