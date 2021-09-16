package com.company;

public class TestBook {

    public static void main(String[] args) {
	  Book b1 = new Book("It", "Stephen Edwin King");
    b1.setPages(1426);
    System.out.println(b1.getAuthor());
    System.out.println(b1.getName());
    System.out.println(b1.getPages());
    System.out.println(b1);
    b1.setAuthor("Joanne Rowling");
    b1.setName("Harry Potter and the chamber of secrets");
    System.out.println(b1);
    }
}
