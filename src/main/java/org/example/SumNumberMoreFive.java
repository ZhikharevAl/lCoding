package org.example;

public class SumNumberMoreFive {
    public int sumNumberMoreFive(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int n:arr) {
            if (n > 5) {
                sum+=n;
            }
        } 
        return sum;
    }
    
}
