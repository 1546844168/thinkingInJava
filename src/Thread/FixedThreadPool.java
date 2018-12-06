package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 潇潇暮雨
 * @create 2018-09-08   10:54
 */
public class FixedThreadPool {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new LiftOff());
        }
        executorService.shutdown();
    }
}
