package com.xiangyun.git.config;

public class Springmvc {

    public static void main(String[] args) {

        int i = 1;
        i = i++;
        int j = i++;
        int k = i + ++i * i++;

        System.out.println(i);// 4
        System.out.println(j);// 1
        System.out.println(k);// 11

    }
}
