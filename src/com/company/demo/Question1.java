package com.company.demo;

import java.util.Arrays;

public class Question1 {

    public static void findFactorsAndSort(int arr[])
    {
        int factors[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            factors[i] = getNumberOfFactors(arr[i]);
        }

        sortArr(arr,factors);
    }


    public static void sortArr(int arr[], int factors[])
    {

        for (int i = 1; i < factors.length; i++) {
            int k = arr[i];
            int k1 = factors[i];
            int j=i-1;
            while (j>=0 && factors[j]<k1)
            {
                arr[j+1] = arr[j];
                factors[j+1] = factors[j];
                j = j-1;
            }
            arr[j+1] = k;
            factors[j+1] = k1;


        }
        System.out.println("Numbers : "+Arrays.toString(arr));
        System.out.println("Factors : "+Arrays.toString(factors));
    }

    public static int getNumberOfFactors(int n)
    {
        int div = 1;

        for (int i = 1; i < n; i++) {
            if(n%i==0)
            {
                div++;
            }
        }
        return div;
    }

}


