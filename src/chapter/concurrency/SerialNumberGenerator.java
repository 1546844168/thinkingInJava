package chapter.concurrency;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author 潇潇暮雨
 * @create 2019-04-07   10:20
 */
public class SerialNumberGenerator extends Thread {
    private static volatile int i;
    private Set set = Collections.synchronizedSet(new HashSet<Integer>());

    public static synchronized int getI() {

        Thread.yield(); // 进行线程上下文切换
        Thread.yield(); // 进行线程上下文切换
        Thread.yield(); // 进行线程上下文切换
        return i++;
    }

    @Override
    public void run() {
        for (int j = 0; j < 6000; j++) {
            int val = getI();
            set.add(val);
            System.out.println(Thread.currentThread().getName() + " : " + val);
        }
    }

    public static void main(String[] args) {
        SerialNumberGenerator sng = new SerialNumberGenerator();
        ThreadPool.execute(sng, 10);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(sng.set.size());

    }
}
