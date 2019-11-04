package com.fun.design;

import java.util.Arrays;

/**
 * @ClassName test
 * @Description TODO
 * @Author whw
 * @Date 2019/8/7 16:39
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        String[] strings = new String[]{"hello" , "world" , "it"};
        System.out.println("数组输出===" + strings);

        String s1 = Arrays.toString(strings);
        System.out.println("字符串输出==="+ s1);


        int[] ints = new int[]{1, 2, 3, 4};
        System.out.println(ints);
        String s = Arrays.toString(ints);
        System.out.println("str === " + s);
    }

}
