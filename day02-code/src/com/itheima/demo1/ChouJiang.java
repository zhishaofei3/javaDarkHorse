package com.itheima.demo1;

import java.util.Random;

public class ChouJiang {
    public static void main(String[] args) {
        int[] arr = {2, 24, 54, 88, 91};

        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            int temp = arr[randomIndex];
            arr[randomIndex] = arr[i];
            arr[i] = temp;
        }

        for (int j : arr) {
            System.out.println(j);
        }

    }
}
