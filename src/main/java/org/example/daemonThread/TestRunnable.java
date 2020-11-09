package org.example.daemonThread;

import java.io.*;

/**
 * 完成文件输出的守护线程任务
 */
public class TestRunnable implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);//守护线程阻塞1秒后运行
            File f = new File("daemon.txt");
            FileOutputStream os = new FileOutputStream(f, true);
            os.write("daemon".getBytes());
            os.flush();
            os.close();
        } catch (Exception e) {
        }
    }
}
