package chapter.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 潇潇暮雨
 * @create 2019-03-25   16:32
 */


public class Ex3 {
    public static void main(String[] args) {
        // cached();
        fixed();
    }

    public static void fixed() {
        ExecutorService es = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            es.execute(new Ex1RunnerA());
        }
        es.shutdown();
    }

    public static void cached() {
        ExecutorService es = Executors.newCachedThreadPool();
        for (int i = 0; i < 3; i++) {
            es.execute(new Ex1RunnerA());
        }
        es.shutdown();
    }


}
