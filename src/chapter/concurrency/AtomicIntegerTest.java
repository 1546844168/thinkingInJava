package chapter.concurrency;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author 潇潇暮雨
 * @create 2019-04-07   12:33
 */
public class AtomicIntegerTest implements Runnable {
    private AtomicInteger ai = new AtomicInteger(0);

    public int getI() {
        return ai.get();
    }

    public void setEvenI() {
        ai.addAndGet(2);
    }


    @Override
    public void run() {
        while (true) {
            setEvenI();
            int i = getI();
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                return;
            }
        }
    }

    public static void main(String[] args) {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("exit");
                System.exit(0);
            }
        }, 3000);
        AtomicIntegerTest at = new AtomicIntegerTest();
        ThreadPool.execute(at, 10);
    }
}
