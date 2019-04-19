package chapter.concurrency;

import java.util.concurrent.TimeUnit;

/**
 * @author 潇潇暮雨
 * @create 2019-04-19   15:10
 */
public class InterruptedThread implements Runnable {
    @Override
    public void run() {
        int i = 1;
        while (true) {
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i++);
        }

    }

    public static void main(String[] args) {
        Thread thread = new Thread(new InterruptedThread());
        thread.start();
        System.out.println(thread.isAlive());
        System.out.println(thread.getState());
    }
}
