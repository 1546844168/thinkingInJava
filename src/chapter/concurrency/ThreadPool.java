package chapter.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 潇潇暮雨
 * @create 2019-04-07   10:22
 */
public class ThreadPool {
    /**
     * @param obj   要执行的任务
     * @param count 开启线程的数量
     */
    public static void execute(Object obj, int count) {
        ExecutorService es = Executors.newCachedThreadPool();
        for (int i = 0; i < count; i++) {
            es.execute((Runnable) obj);
        }
        es.shutdown();
    }
}
