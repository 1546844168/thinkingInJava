package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 潇潇暮雨
 * @create 2018-09-08   17:56
 */
public class DaemonFromFactory implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread() + " : " + this);
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool(new DaemonThreadFactory());
        for (int i = 0; i < 6; i++) {
            exec.execute(new DaemonFromFactory());
        }
        System.out.println("所有的线程都开始了");
        Thread.sleep(500);
    }
}
