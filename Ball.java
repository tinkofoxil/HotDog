package com.company;

public class Ball {
    public int size;
    public String type;
    public Ball (String t, int s) {
        type = t;
        size = s;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return this.type + ", size: " + this.size;
    }
}