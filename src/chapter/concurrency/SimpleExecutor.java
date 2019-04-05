package chapter.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 潇潇暮雨
 * @create 2019-04-04   10:22
 */
public class SimpleExecutor implements Runnable {
    private int countDown = 5;
    private static int count = 0;
    private final int id = count++;


    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.println(id + " : " + countDown);
        }
    }

    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            es.execute(new SimpleExecutor());
        }
        es.shutdown();
    }

}
