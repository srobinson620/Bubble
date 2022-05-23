package com.sparta.sr;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] x = {4,3,2,9};
        int[] y = {8,4,6,7};
        System.out.println( Arrays.toString(bubbleSort(x)));
        //bubbleSort(x);
    }

    public static int[] bubbleSort(int[] xArray) {
        int count = xArray.length;
        int temp;
        for (int outer = count - 1; outer > 0; outer--)
            for (int inner = 0; inner < outer; inner++) {
                if (xArray[inner] > xArray[inner + 1]) {
                    temp = xArray[inner];
                    xArray[inner] = xArray[inner + 1];
                    xArray[inner + 1] = temp;
                }
            }
        return xArray;
    }
}
