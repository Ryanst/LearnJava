package com.ryanst.waitAndnotify;

/**
 * Created by zhengjuntong on 16/5/13.
 */
public class OutputThread implements Runnable {

    private int num;
    private Object lock;

    public OutputThread(int num, Object lock) {
        super();
        this.num = num;
        this.lock = lock;
    }

    public void run() {
        try {
            while (true) {
                synchronized (lock) {
                    lock.notifyAll();
                    lock.wait();
                    System.out.println(num);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        final Object lock = new Object();

        Thread thread1 = new Thread(new OutputThread(1, lock));
        Thread thread2 = new Thread(new OutputThread(2, lock));

        thread1.start();
        thread2.start();
    }

}
