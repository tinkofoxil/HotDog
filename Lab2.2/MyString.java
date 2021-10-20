package com.company;

public class MyString {
    private final char[] mystring;

    MyString()
    {
        mystring = new char[1];
        mystring[0] = ' ';
    }

    MyString(char[] value)
    {
        mystring = new char[value.length];
        for(int i = 0; i < value.length; i++)
            mystring[i] = value[i];
    }

    MyString(String str)
    {
        mystring = str.toCharArray();
    }

    MyString(MyString mstr)
    {
        mystring = mstr.mystring;
    }

    public MyString concat(MyString str)
    {
        char[] new_string = new char[mystring.length + str.mystring.length];
        for(int i = 0; i < mystring.length; i++)
            new_string[i] = mystring[i];
        for(int i = mystring.length, j = 0; i < mystring.length + str.mystring.length; i++, j++)
            new_string[i] = str.mystring[j];
        MyString newString = new MyString(String.valueOf(new_string));
        return newString;
    }

    public char charAt(int index)
    {
        if(index >= 0 && index < mystring.length)
            return mystring[index];
        else
            return '~';
    }

    public boolean equals(MyString str)
    {
        if(mystring == str.mystring)
            return true;
        else
            return false;
    }

    public MyString trim()
    {
        char[] new_string = new char[mystring.length - 1];
        for(int i = 0; i < mystring.length - 1; i++)
            new_string[i] = mystring[i];

        MyString newString = new MyString(String.valueOf(new_string));
        return newString;
    }

    public boolean empty()
    {
        if(mystring.length == 0)
            return true;
        else
            return false;
    }

    public int length()
    {
        return mystring.length;
    }

    public int compareTo(MyString str)
    {
        if (mystring.length == str.mystring.length)
        {
            for (int i = 0; i < mystring.length; i++)
            {
                if(mystring[i] > str.mystring[i]) return 1;
                else
                if(mystring[i] < str.mystring[i]) return -1;
                else
                    return 0;
            }
        }
        else
        if(mystring.length > str.mystring.length) return 1;
        return -1;
    }

    public MyString substring(int startindex, int endindex)
    {
        char[] newstr = new char[endindex - startindex];
        for(int i = 0; i + startindex < endindex; i++)
            newstr[i] = mystring[i + startindex];
        MyString new_str = new MyString(String.valueOf(newstr));
        return new_str;
    }

    @Override
    public String toString()
    {
        String tmp = new String(String.valueOf(mystring));
        return tmp;
    }
}
