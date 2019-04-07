package chapter.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 潇潇暮雨
 * @create 2019-04-06   13:10
 */
public class MutexEvenGenerator extends IntGenerator {
    private int i = 0;

    private final Lock lock = new ReentrantLock();

    @Override
    public int next() {
        try {
            lock.lock();
            i++;
            Thread.yield();
            i++;
            return i;
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        MutexEvenGenerator meg = new MutexEvenGenerator();
        ExecutorService es = Executors.newCachedThreadPool();
        int count = 10;
        for (int i = 0; i < count; i++) {
            es.execute(new EvenChecker(meg, i));
        }
        es.shutdown();
    }
}
