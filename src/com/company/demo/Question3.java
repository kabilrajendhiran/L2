package com.company.demo;

public class Question3 {

    public void isPalinDrome(int a)
    {
        int binaryRep = findBinaryRep(a);
        int temp = binaryRep;
        int r = 0;
        while (temp!=0)
        {
            //System.out.print(binaryRep%10 +" ");
            r = r*10 + temp%10;
            temp=temp/10;
        }

        if(binaryRep==r)
        {
            System.out.println("Yes, it's a palindrome");
        }
        else {
            System.out.println("No, it's not a palindrome");
        }
    }


    public int findBinaryRep(int n)
    {
        int binary = 0;
        int cnt = 0;
        while (n!=0)
        {
            binary = binary + (n%2)*findPow(cnt++);
            n = n/2;
        }
        return binary;
    }

    public static int findPow(int i)
    {
        int number = 1;
        while (i>0)
        {
            number = number*10;
            i--;
        }
        return number;
    }

}
