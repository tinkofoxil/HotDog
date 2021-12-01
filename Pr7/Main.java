package com.company;

public class Main {
    public static void main(String[] args)
    {
        MovablePoint movablePoint = new MovablePoint(0, 0, 1, 1);
        MovablePoint movablePoint1 = (MovablePoint) movablePoint.clone();
        System.out.println("Movable Point: " + movablePoint);
        System.out.println("Copy of Movable Point: " + movablePoint1);
        movablePoint1.moveUp();
        movablePoint1.moveRight();
        System.out.println("Copy of Movable Point after movement: " + movablePoint1);
        System.out.println();

        MovableCircle movableCircle = new MovableCircle(1, 1, 2, 2, 5);
        MovableCircle movableCircle1 = (MovableCircle) movableCircle.clone();
        movableCircle1.moveRight();
        System.out.println("Movable Circle: " + movableCircle);
        System.out.println("Copy of Movable Circle: " + movableCircle1);
        movableCircle1.moveLeft();
        movableCircle1.moveDown();
        System.out.println("Copy of Movable Circle after movement: " + movableCircle1);
    }
}
