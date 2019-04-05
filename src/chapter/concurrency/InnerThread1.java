package chapter.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 潇潇暮雨
 * @create 2019-04-04   10:51
 */
class InnerThread1 {
    private int countDown = 5;
    Inner inner;

    public InnerThread1(String name) {
        inner = new Inner(name);
    }

    private class Inner extends Thread {
        Inner(String name) {
            super(name);
        }

        @Override
        public void run() {
            while (countDown-- > 0) {
                System.out.println(getName() + " : " + countDown);
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            new InnerThread1(Integer.toString(i)).inner.start();
        }
    }
}
