package org.example;

public class SumLessZero {

    public int sumLessZero(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        
        int sum = 0;
        for (int n: arr) {
            if (n < 0) {
                sum+=n;
            }
        }
        return sum;
    }
}
