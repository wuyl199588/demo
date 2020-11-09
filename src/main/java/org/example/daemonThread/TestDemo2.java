package org.example.daemonThread;

public class TestDemo2 {
    /**
     * 因为主线程迅速的结束了 守护线程还在睡眠1000ms中 所以守护线程也随之结束 没有写入文件
     */
    public static void main(String[] args) throws InterruptedException {
        Runnable tr = new TestRunnable();
        Thread thread = new Thread(tr);
        thread.setDaemon(true); //设置守护线程
        thread.start(); //开始执行分进程
//        Thread.sleep(2000);
    }

}