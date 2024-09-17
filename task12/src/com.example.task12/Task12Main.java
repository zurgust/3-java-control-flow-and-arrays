package com.example.task12;

import java.util.Arrays;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void selectionSort(int[] arr) {
        if (arr == null || arr.length < 2) {return;}
        for (int i = 0; i < arr.length - 2; i++) {
            int[] minAndIndex = findMinValueAndIndex(arr, i, arr.length - 1 );
            arr[minAndIndex[1]] = arr[i];
            arr[i] = minAndIndex[0];
        }
    }


    public static int[] findMinValueAndIndex(int[] array, int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex >= array.length || startIndex > endIndex) {
            return null; // Промежуток некорректен
        }

        int minValue = array[startIndex];
        int minIndex = startIndex;

        for (int i = startIndex + 1; i <= endIndex; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }

        return new int[]{minValue, minIndex};
    }
}

