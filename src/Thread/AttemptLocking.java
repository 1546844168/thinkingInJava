package Thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 潇潇暮雨
 * @create 2018-09-09   15:21
 */
public class AttemptLocking {
    private Lock lock = new ReentrantLock();

    public void untimed() {
        boolean b = lock.tryLock();
        try {
            System.out.println("untimed: " + b);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (b) {
                lock.unlock();
            }
        }
    }

    public void timed() {
        boolean b = false;
        try {
            b = lock.tryLock(2, TimeUnit.SECONDS);
            System.out.println("timed: " + b);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (b) {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AttemptLocking al = new AttemptLocking();
        al.timed();
        al.untimed();
        System.out.println("开启一个线程去竞争锁");
        new Thread() {
            public void run() {
                al.lock.lock();
            }
        }.start();
        Thread.sleep(10);
        al.timed();
        al.untimed();
    }
}
