package com.company;

public class TestBall {

    public static void main(String[] args) {
	  Ball b1 = new Ball("Basketball", 7);
    Ball b2 = new Ball("Football", 6);
    b2.setSize(5);
    b2.setType("Volleyball");
    System.out.println(b1);
    System.out.println(b2);
    }
}
