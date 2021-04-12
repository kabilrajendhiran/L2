package com.company.demo;

import static java.lang.Math.max;

public class Question4 {

    public int findMaxPath(int[][] arr)
    {
        int sum = 0;

        int start = 0;
        int m = 0;
        int maxIdx = 0;
        int i =0;

        for (i = 0; i < arr.length; i++) {

            if(i==0)
            {
                maxIdx = 0;
            }
            else {
                maxIdx= findMaxElementinRowIndex(arr[i], start);
            }

            if(i<arr.length-1 && maxIdx<arr[i].length)
            {
                m = max(arr[i][maxIdx+1],arr[i+1][maxIdx]);
                System.out.print(arr[i][maxIdx]);
                System.out.print("->");
                System.out.print(m);
                System.out.print("->");
                sum = sum + max(arr[i][maxIdx+1],arr[i+1][maxIdx]) +arr[i][maxIdx];

            }

            start = maxIdx;

        }

        if (maxIdx == arr[0].length-1)
        {
            sum = sum + arr[i-1][maxIdx];
            System.out.print(arr[i-1][maxIdx]);

        }
        else {
            while (maxIdx != arr[0].length-1)
            {
                maxIdx++;
                sum = sum + arr[i-1][maxIdx];
                System.out.print(arr[i-1][maxIdx]);
                System.out.print("->");
            }
        }

        System.out.print("="+sum);
        return 0;
    }

    public int findMaxElementinRowIndex(int [] arr, int s)
    {
        int max = 0,idx=0;
        for (int i = s; i < arr.length; i++) {
            if(max<arr[i])
            {
                idx = i;
                max = arr[i];
            }
        }

        return idx;
    }



}
