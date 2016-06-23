package com.ryanst.innerClass;

/**
 * Created by zhengjuntong on 16/5/20.
 */

public class BigEgg extends Egg {
    public class Yolk {
        public Yolk() {
            System.out.println("BigEgg.Yolk()");
        }
    }


    public static void main(String[] args) {
        new BigEgg();
    }
}
