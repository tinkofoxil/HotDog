package com.company;

public class Recursion {

    public String taskOne(int n)
    {
        int s = 0;
        int k = 0;
        if (n == 1)
            System.out.print("1");
        else
        {
            for (int i = 1; s < n; i++)
            {
                s  = s + i;
                k = i;
            }
            System.out.print(taskOne(--n) + " " + k);
        }
        return "";
    }

    public String taskTwo(int n)
    {
        {
            if (n == 1)
                return "1";
            return taskTwo(n - 1) + " " + n;
        }
    }

    public String taskThree(int firstNum, int secondNum)
    {
        if (firstNum > secondNum)
        {
            return firstNum + " " + taskThree(firstNum - 1, secondNum);
        } else
        {
            if (firstNum == secondNum)
                return Integer.toString(firstNum);
            return firstNum + " " + taskThree(firstNum + 1, secondNum);
        }

    }

    public static void main(String[] args){
        Recursion rec = new Recursion();
        rec.taskOne(10);
        System.out.print("\n");
        System.out.println(rec.taskTwo(10));
        System.out.println(rec.taskThree(23, 25));
    }
}
