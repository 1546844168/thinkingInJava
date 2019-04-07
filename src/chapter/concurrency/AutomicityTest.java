package chapter.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 潇潇暮雨
 * @create 2019-04-07   10:00
 */
public class AutomicityTest implements Runnable {
    private volatile int i;

    public synchronized int getI() {
        return i;
    }

    public synchronized void evenIncreaseI() {
        i++;
        i++;
    }

    @Override
    public void run() {
        while (true) {
            evenIncreaseI();
        }
    }

    public static void main(String[] args) {
        AutomicityTest at = new AutomicityTest();
        ExecutorService es = Executors.newCachedThreadPool();
        es.execute(at);
        while (true) {
            int i = at.getI();
            if (i % 2 != 0) {
                System.out.println(i);
                System.exit(0);
            }
        }
    }
}
