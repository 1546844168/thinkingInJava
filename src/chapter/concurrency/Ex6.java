package chapter.concurrency;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author 潇潇暮雨
 * @create 2019-03-26   9:55
 */


class Ex6Sleep implements Runnable {
    private long sleepTime = new Random().nextInt(10);

    @Override
    public void run() {
        try {
            TimeUnit.MILLISECONDS.sleep(sleepTime * 1000);
            System.out.println("sleep :" + sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Ex6 {
    public static void main(String[] args) {
        if (args.length < 1)
            throw new NullPointerException("请输入参数：args");
        if (args.length == 1) {
            int n = Integer.parseInt(args[0]);
            ExecutorService es = Executors.newCachedThreadPool();
            for (int i = 0; i < n; i++) {
                es.execute(new Ex6Sleep());
            }
            es.shutdown();
        }
    }
}

