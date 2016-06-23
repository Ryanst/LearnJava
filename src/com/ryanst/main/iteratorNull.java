package com.ryanst.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by zhengjuntong on 16/6/12.
 */
public class iteratorNull {
    public static void main(String args[]) {

        List<Object> list = new ArrayList<>();
        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {

        }
    }
}
