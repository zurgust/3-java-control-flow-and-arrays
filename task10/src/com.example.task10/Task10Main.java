package com.example.task10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task10Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));
         */
    }

    static int numMin(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        int min = Arrays.stream(arr).min().getAsInt();
        int lastIndex = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (min == arr[i]) {
                lastIndex = i;
                break;
            }
        }
        return lastIndex;
    }

}