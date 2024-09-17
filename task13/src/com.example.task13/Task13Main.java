package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int[] arr = {};
        arr = removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static int[] removeMoreThen1000(int[] arr) {
        int[] result = {};
        if (arr == null ) return null;
        else {
            for (int j : arr) {
                if (j <= 1000) {
                    result = addElement(result, j);
                }
            }
            return result;
        }
    }

    public static int[] addElement(int[] array, int newElement) {

        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = newElement;

        return newArray;
    }

}