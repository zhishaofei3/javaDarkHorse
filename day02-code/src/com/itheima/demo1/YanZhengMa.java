package com.itheima.demo1;

import java.util.Random;

// byte < short < int < long < float < double
public class YanZhengMa {
    public static void main(String[] args) {

        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i < 26) {
                chs[i] = (char) (97 + i);
            } else {
                chs[i] = (char) (65 + i - 26);
            }
        }

        StringBuilder result = new StringBuilder();
        Random r = new Random();

        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            result.append(chs[randomIndex]);
        }

        int number = r.nextInt(10);
        result.append(number);
        System.out.println(result);

//        for(int i = 0; i < chs.length; i++) {
//            System.out.print(chs[i] + " ");
//        }
    }
}
