package chapter.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author 潇潇暮雨
 * @create 2019-04-19   19:48
 */
class ARunnable implements Runnable {
    private volatile boolean flag = false;

    boolean getFlag() {
        return flag;
    }

    void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(1);
            System.out.println("a 睡眠了1秒钟");
        } catch (InterruptedException e) {
            System.out.println("a intertupted");
        }
        System.out.println("a 的flag = true  了");
        setFlag(true);
    }
}

class BusyWait implements Runnable {
    private ARunnable a;

    BusyWait(ARunnable a) {
        this.a = a;
    }

    @Override
    public void run() {
        System.out.println("a 的flag = " + a.getFlag());
        long start, end;
        start = System.currentTimeMillis();
        while (!Thread.interrupted()) {
            if (a.getFlag()) {
                System.out.println("将a 的 flag 设置为了 false");
                a.setFlag(false);
                end = System.currentTimeMillis();
                System.out.println("等待了" + (end - start) + "毫秒");
            }
        }
    }
}

class BettreWait implements Runnable {

    @Override
    public void run() {

    }
}


public class Ex22 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = Executors.newCachedThreadPool();
        ARunnable command = new ARunnable();
        es.execute(command);
        es.execute(new BusyWait(command));
        TimeUnit.SECONDS.sleep(2);
        es.shutdownNow();
    }
}
