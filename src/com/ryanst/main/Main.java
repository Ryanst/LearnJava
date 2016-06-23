package com.ryanst.main;

import com.ryanst.lock.Test;

import java.util.Objects;

/**
 * Created by zhengjuntong on 16/5/26.
 */
public class Main {
    public static void main(String args[]) {
        TestClass testClass = new TestClass();
        String class1 = testClass.getClass().toString();
        String class2 = TestClass.class.toString();
        System.out.printf("%s\n%s", class1, class2);
    }
}
