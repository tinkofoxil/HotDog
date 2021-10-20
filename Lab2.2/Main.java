package com.company;

public class Main {
    public static void main(String[] args){

        MyString str1 = new MyString("Hello123");
        MyString str2 = new MyString("World789");

        System.out.println(str1.toString());
        System.out.println(str2.toString());

        System.out.println(str1.charAt(3));

        str1 = str1.concat(str2);
        System.out.println(str1);

        System.out.println(str1.trim());

        System.out.println(str1.equals(str2));

        System.out.println(str2.empty());

        System.out.println(str2.compareTo(str1));
        System.out.println(str1.substring(1, 3));
        System.out.println(str2.length());
    }
}
