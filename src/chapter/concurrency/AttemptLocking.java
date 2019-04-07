package chapter.concurrency;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 潇潇暮雨
 * @create 2019-04-06   18:50
 */
public class AttemptLocking {
    private Lock lock = new ReentrantLock();

    public void untimed() {
        boolean captured = lock.tryLock();
        try {
            System.out.println("tryLock() : " + captured);
//            TimeUnit.MILLISECONDS.sleep(3000);
        } finally {
            if (captured) {
                lock.unlock();
            }
        }
    }

    public void timed() {
        boolean captured = false;
        try {
            captured = lock.tryLock(2, TimeUnit.SECONDS);
            System.out.println("tryLock 2 TimeUnit.SECONDS ：" + captured);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        } finally {
            if (captured) {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        final AttemptLocking al = new AttemptLocking();
        al.untimed();
        al.timed();
        new Thread() {
//            {
//                setDaemon(true);
//            }

            public void run() {
                al.lock.lock();
                System.out.println("acquired");
                try {
                    TimeUnit.MILLISECONDS.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    al.lock.unlock();
                }
            }
        }.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread.yield();
        al.untimed();
        al.timed();
    }
}
