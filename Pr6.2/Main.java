package com.company;

public class Main
{
    public static void main(String[] args) {
        Integer a = 3;
        MyArrayList<Integer> myArrayList = new MyArrayList<Integer>(a.getClass(), 5);
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4, 2);
        System.out.println(myArrayList);
        myArrayList.clear();
        System.out.println(myArrayList.isEmpty());
        System.out.println(myArrayList.size());
    }
}
