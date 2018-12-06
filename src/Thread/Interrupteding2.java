package Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 潇潇暮雨
 * @create 2018-09-10   11:08
 */


class BlockMutex {
    private Lock lock = new ReentrantLock();

    public BlockMutex() {
        lock.lock();
    }

    public void f() {
        try {
            lock.lockInterruptibly();
            System.out.println("锁住了");
        } catch (InterruptedException e) {
            System.out.println("发生了中断异常");
        }
    }
}

class Block2 implements Runnable {
    private BlockMutex bm = new BlockMutex();

    public void run() {
        // run()方法里面执行的是任务代码
        System.out.println("尝试执行f()");
        bm.f();
        System.out.println("执行完了f()-----执行完了run()");
    }
}

public class Interrupteding2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Block2());
        t.start();
        Thread.sleep(1);
        System.out.println("interrupted");
        t.interrupted();

    }
}
