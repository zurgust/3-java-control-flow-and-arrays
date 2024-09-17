package com.example.task11;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task11Main {
    public static void main(String[] args) {

    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int min = Arrays.stream(arr).min().getAsInt();
        int lastMinIndex = 0;
        int originalFirst = arr[0];

        for (int i = arr.length - 1; i >= 0; i--) {
            if (min == arr[i]) {
                lastMinIndex = i;
                break;
            }
        }
        arr[0] = arr[lastMinIndex];
        arr[lastMinIndex] = originalFirst;
    }

}