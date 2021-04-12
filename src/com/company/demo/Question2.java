package com.company.demo;

public class Question2 {

    public void printStringifTwoChractersNotMatch(String a, String b)
    {
        int n =a.length();
        int  i =0;
        while (i<n)
        {
            if(a.charAt(i)!=b.charAt(i))
            {

                if(a.charAt(i+1)!=b.charAt(i+1))
                {
                    System.out.println(a.charAt(i)+""+a.charAt(i+1)+","+b.charAt(i)+""+b.charAt(i+1));
                    i++;
                }
                else {
                    System.out.println(a.charAt(i)+","+b.charAt(i));
                }
            }
            i++;
        }


    }


}
