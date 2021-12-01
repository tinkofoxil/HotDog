package com.company;

public class MovablePoint implements Movable {

    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint (int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public Movable clone()
    {
        return new MovablePoint(this.x, this.y,this.xSpeed,this.ySpeed);
    }

    @Override
    public String toString()
    {
        return "Point (" + x + ", " + y + ")";
    }

    @Override
    public void moveUp()
    {
        y=y+ySpeed;
    }

    @Override
    public void moveDown()
    {
        y=y-ySpeed;
    }

    @Override
    public void moveRight()
    {
        x=x+xSpeed;
    }

    @Override
    public void moveLeft()
    {
        x=x-xSpeed;
    }
}