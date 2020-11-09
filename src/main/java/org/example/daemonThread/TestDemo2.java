package org.example.daemonThread;

public class TestDemo2 {

    public static void main(String[] args) throws InterruptedException {
        Runnable tr = new TestRunnable();
        Thread thread = new Thread(tr);
        thread.setDaemon(true); //设置守护线程
        thread.start(); //开始执行分进程
        Thread.sleep(2001);
    }

}