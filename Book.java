package com.company;

public class Book {
    public int pages;
    public String name;
    public String author;
    public Book (String n, a) {
        name = n;
        author = a;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPages(int pages){
        this.pages = pages;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }

    public String getName(String name){
        return name;
    }
    
    public String getAuthor(String author){
        return author;
    }
    
    public int getPages(int pages){
        return pages;
    }

    public String toString() {
        return this.author + " " this.name + ", pages: " + this.pages;
    }

}