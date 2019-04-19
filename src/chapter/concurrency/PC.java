package chapter.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author 潇潇暮雨
 * @create 2019-04-19   20:38
 */
class C {
    int i = 0;
    boolean flag = false;

    synchronized void incrementI() {
        i++;
    }

    public synchronized int getI() {
        return i;
    }
}

class A1 implements Runnable {
    private final C c;

    A1(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                synchronized (c) {
                    c.incrementI();
                    System.out.println(Thread.currentThread().getName() + " --- " + c.getI());
                    TimeUnit.MILLISECONDS.sleep(190);
                    c.flag = true;
                    c.notify();
                    while (c.flag) {
                        c.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println("a1 interrupted");
        }
    }
}

class B1 implements Runnable {
    private final C c;

    B1(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                synchronized (c) {
                    while (!c.flag) {
                        c.wait();
                    }
                    System.out.println(Thread.currentThread().getName() + "-----" + c.getI());
                    TimeUnit.MILLISECONDS.sleep(200);
                    c.flag = false;
                    c.notify();
                }

            }
        } catch (InterruptedException e) {
            System.out.println("b1 interrupted");
        }
    }
}

public class PC {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = Executors.newCachedThreadPool();
        C c = new C();
        es.execute(new A1(c));
        es.execute(new B1(c));
        TimeUnit.SECONDS.sleep(10);
        es.shutdownNow();
    }
}
