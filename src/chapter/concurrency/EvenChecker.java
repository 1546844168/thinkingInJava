package chapter.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 潇潇暮雨
 * @create 2019-04-06   10:57
 */
public class EvenChecker implements Runnable {
    private IntGenerator intGenerator;
    private final int id;

    public EvenChecker(IntGenerator intGenerator, int id) {
        this.intGenerator = intGenerator;
        this.id = id;
    }

    @Override
    public void run() {
        while (!intGenerator.isCanceled()) {
            int val = intGenerator.next();
            System.out.println(id + " : " + val);
            if (val % 2 != 0) {
                System.out.println(id + " : " + val + " not even");
                intGenerator.cancel();
            }
        }
    }

    public static void main(String[] args) {
        EvenGenerator eg = new EvenGenerator();
        ExecutorService es = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            es.execute(new EvenChecker(eg, i));
        }
        es.shutdown();

    }
}
