package com.dkit.gd2.johnloane;

public class Utilities
{
    //Returns a char array with every nth char. When sourceArray.length < n, returns sourceArray
    public char[] everyNthChar(char[] sourceArray, int n)
    {
        if(sourceArray == null || sourceArray.length < n)
        {
            return sourceArray;
        }
        int returnedLength = sourceArray.length/n;
        char[] result = new char[returnedLength];

        int index = 0;
        for(int i=n-1; i < sourceArray.length; i+=n)
        {
            result[index++] = sourceArray[i];
        }
        return result;
    }

    //Remove pairs of the same character that are next to each other, by removing one occurrence of the character
//ABBCDEEF -> ABCDEF
//ABCBDEEF -> ABCBDEF
    public String removePairs(String source)
    {
        if(source.length() < 2)
        {
            return source;
        }

        StringBuilder sb = new StringBuilder();
        char[] string = source.toCharArray();

        for(int i=0; i < string.length - 1 ; i++)
        {
            if(string[i] != string[i+1])
            {
                sb.append(string[i]);
            }
        }
        return sb.toString();
    }

    public int converter(int a, int b)
    {
        return (a/b) + (a * 30) -2;
    }

    public String nullIfOddLength(String source)
    {
        if(source.length() % 2 == 0)
        {
            return source;
        }
        return null;
    }
}




