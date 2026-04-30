package org.example;

import java.util.Arrays;

public class CountEvenGreaterThanTen {

    public int countEvenGreaterThanTen(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        return (int) Arrays.stream(arr)
            .filter(n ->n > 10 && n % 2 ==0)
            .count();
    }
}
