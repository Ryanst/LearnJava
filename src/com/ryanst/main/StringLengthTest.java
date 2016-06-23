package com.ryanst.main;

/**
 * Created by zhengjuntong on 16/6/17.
 */

public class StringLengthTest {
    public static void main(String args[]) {
        String str = "这是字符串";
        String str2 = "这是字符串aaa";
        System.out.println(str.length() + "\n" + str2.length());//答案是 5 8 表明对String.length来说中文或者英文都是一样的
    }
}
