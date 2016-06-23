package com.ryanst.innerClass;

/**
 * Created by zhengjuntong on 16/5/20.
 */
class Egg {
    private Yolk y;


    protected class Yolk {
        public Yolk() {
            System.out.println("Egg.Yolk()");
        }
    }


    public Egg() {
        System.out.println("New Egg()");
        y = new Yolk();
    }
}
