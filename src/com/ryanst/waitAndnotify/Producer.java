package com.ryanst.waitAndnotify;

/**
 * Created by zhengjuntong on 16/5/13.
 */

public class Producer implements Runnable {

    private QueueBuffer q;

    Producer(QueueBuffer q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
