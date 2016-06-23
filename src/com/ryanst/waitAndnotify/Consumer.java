package com.ryanst.waitAndnotify;

/**
 * Created by zhengjuntong on 16/5/13.
 */

public class Consumer implements Runnable {

    private QueueBuffer q;

    Consumer(QueueBuffer q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        while (true) {
            q.get();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
