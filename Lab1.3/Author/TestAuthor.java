package com.company;

public class TestAuthor {

    public static void main(String[] args) {
	Author author1 = new Author("Stephen Edwin King", "stephen.king@gmail.com", 'm');
    System.out.println(author1);
    author1.setEmail("stephen_king@gmail.com");
    System.out.println(author1);
    Author author2 = new Author("Joanne Rowling", "joanne.rowling@gmail.com", 'f');
    System.out.println(author2);
    }
}
