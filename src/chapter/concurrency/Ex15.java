package chapter.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 潇潇暮雨
 * @create 2019-04-07   16:35
 */
class A15 {
    private final Object obj1 = new Object();
    private final Object obj2 = new Object();

    public synchronized void f() {
        for (int i = 0; i < 100; i++) {
            System.out.println("f()");
            Thread.yield();
        }
    }

    public void g() {
        synchronized (obj1) {
            for (int i = 0; i < 100; i++) {
                Thread.yield();
                System.out.println("g()");
                Thread.yield();
            }
        }
    }

    public void h() {
        synchronized (obj2) {
            for (int i = 0; i < 100; i++) {
                System.out.println("h()");
                Thread.yield();
            }
        }

    }
}

class A15Lock {
    private final Lock lock1 = new ReentrantLock();
    private final Lock lock2 = new ReentrantLock();

    public synchronized void f() {
        for (int i = 0; i < 100; i++) {
            System.out.println("f()");
            Thread.yield();
        }
    }

    public void g() {
        lock1.lock();
        try {
            for (int i = 0; i < 1000; i++) {
                System.out.println("g()");
                Thread.yield();
            }
        } finally {
            lock1.unlock();
        }
    }

    public void h() {
        lock2.lock();
        try {
            for (int i = 0; i < 100; i++) {
                System.out.println("h()");
                Thread.yield();
            }
        } finally {
            lock2.unlock();
        }
    }
}

public class Ex15 {
    public static void main(String[] args) {
        A15Lock a15 = new A15Lock();
        new Thread() {
            @Override
            public void run() {
                a15.f();
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                a15.g();
            }
        }.start();
        a15.h();
    }
}
