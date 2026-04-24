package org.example;

public class DoubleThreed {

    public int[] doubleThreed(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }

        for (int i = 2; i < arr.length; i+=3 ) {
            if (arr[i] < 0 ) {
                arr[i] = arr[i] * 2;
            }
        }
        return arr;
    }
    
}
