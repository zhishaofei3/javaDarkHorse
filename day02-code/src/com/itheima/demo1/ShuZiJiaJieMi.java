package com.itheima.demo1;

public class ShuZiJiaJieMi {
    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 3};
        // 每位加5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }

        // 对10求余
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }

        // 将所有数字反转
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }

        System.out.println(number); // 8346

//        for (int j : arr) {
//            System.out.print(j + " ");
//        }

    }
}
