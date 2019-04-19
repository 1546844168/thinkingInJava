package chapter.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author 潇潇暮雨
 * @create 2019-04-19   19:26
 */
class AThread implements Runnable {

    @Override
    public void run() {
        synchronized (this) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("a 线程在执行");
        }
    }
}

class BThread implements Runnable {
    private final Object o;

    BThread(Object o) {
        this.o = o;
    }

    @Override
    public void run() {
        synchronized (o) {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("B睡了3秒钟");
            System.out.println("唤醒a线程");
            o.notify();
        }

    }
}

public class Ex21 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        AThread command = new AThread();
        es.execute(command);
        es.execute(new BThread(command));
    }
}
