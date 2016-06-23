package com.ryanst.innerClass;

/**
 * Created by zhengjuntong on 16/5/20.
 */
class Egg2 {
    protected class Yolk {
        public Yolk() {
            System.out.println("Egg2.Yolk()");
        }


        public void f() {
            System.out.println("Egg2.Yolk.f()");
        }
    }


    private Yolk y = new Yolk();


    public Egg2() {
        System.out.println("New Egg2()");
    }


    public void insertYolk(Yolk yy) {
        y = yy;
    }


    public void g() {
        y.f();
    }
}

