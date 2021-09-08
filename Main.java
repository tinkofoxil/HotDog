package com.company;
import java.util.Scanner;
import java.util.Locale;

class Person{
    String name;
    int age;
    double height;
    void display_info(){
        System.out.printf("Name: %s \tAge: %d \tHeight: %f\n", name, age, height);
    }
}

public class Main {

    public static void main(String[] args) {
	Person tom = new Person();
    Scanner in = new Scanner(System.in).useLocale(Locale.US);
    tom.name = in.nextLine();
    tom.age=in.nextInt();
    while (tom.age > 200){
        System.out.println("wrong age, enter another age: ");
        tom.age=in.nextInt();
    }
    tom.height=in.nextDouble();
    while (tom.height < 3.2){
        System.out.println("wrong height, enter another height: ");
        tom.height=in.nextDouble();
    }
    tom.display_info();
    }
}

