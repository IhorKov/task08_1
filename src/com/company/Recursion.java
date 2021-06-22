package com.company;

public class Recursion {

    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        printArray(arr, 0);

    }
    public static void printArray(int[] arr, int i){
        if(i < arr.length) {
            System.out.println(arr[i]);
            printArray(arr, i + 1);
        }
    }
}
