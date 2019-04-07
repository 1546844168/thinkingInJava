package Thread;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * @author 潇潇暮雨
 * @create 2018-09-10   8:57
 */


class SleepBlocked implements Runnable {

    public void run() {
        try {
            TimeUnit.SECONDS.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("sleep 中断异常");
        }
        System.out.println("sleep 执行完run()");
    }
}

class IOBlocked implements Runnable {
    private InputStream in;

    public IOBlocked(InputStream in) {
        this.in = in;
    }

    public void run() {
        try {
            System.out.println("等待键盘输入");
            in.read();
        } catch (IOException e) {
            if (Thread.currentThread().isInterrupted())
                System.out.println("ioandfile 中断异常");
            else{
                throw new RuntimeException();
            }
        }
        System.out.println("ioandfile 执行完run()");
    }
}

class SynchronizedBlock implements Runnable {

    public synchronized void f() {
        while (true) {
            Thread.yield();
        }
    }

    public SynchronizedBlock() {
        new Thread() {
            public void run() {
                f();
            }
        };
    }

    public void run() {
        System.out.println("尝试执行f()");
        f();
        System.out.println("syn执行 run()完毕");
    }
}


public class Interrupting {
    static ExecutorService exec = Executors.newCachedThreadPool();

    public static void test(Runnable r) throws InterruptedException {
        Future<?> future = exec.submit(r);
        // 主线程睡个100毫秒
        TimeUnit.MILLISECONDS.sleep(100);
        System.out.println("准备canceled:" + r.getClass().getName());
        future.cancel(true);
        System.out.println("已经canceled:" + r.getClass().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        test(new SleepBlocked());
        test(new IOBlocked(System.in));
        test(new SynchronizedBlock());
        TimeUnit.MILLISECONDS.sleep(3);
        System.out.println("exit by system");
        System.exit(0);
    }
}
