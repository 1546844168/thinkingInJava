package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 潇潇暮雨
 * @create 2018-09-08   15:08
 */
public class SleepingTask extends LiftOff{

    // 复写父类中的run方法。
    @Override
    public void run(){
        while (countDown-- > 0){
            state();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 6; i++) {
            exec.execute(new SleepingTask());
        }
        exec.shutdown();
    }


}
