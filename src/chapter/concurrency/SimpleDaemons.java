package chapter.concurrency;

import java.util.concurrent.TimeUnit;

/**
 * @author 潇潇暮雨
 * @create 2019-03-26   12:43
 */
public class SimpleDaemons implements Runnable {
    @Override
    public void run() {
        while (true) {
            try {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread().getName() + " : " + this);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("start");
        for (int i = 0; i < 10; i++) {
            Thread daemons = new Thread(new SimpleDaemons());
            daemons.setDaemon(true);
            daemons.start();
        }
        try {
            TimeUnit.MILLISECONDS.sleep(190);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("exit");
    }
}
