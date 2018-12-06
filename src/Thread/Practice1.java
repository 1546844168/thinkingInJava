package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 潇潇暮雨
 * @create 2018-09-08   8:57
 */
public class Practice1 implements Runnable{
    public Practice1(){
        System.out.println("开始");
    }

    public void run(){
        for (int i = 0; i < 3; i++) {
            System.out.println("正在运行");

        }
        System.out.println("结束");
    }

    public static void main(String[] args){
        // 不使用线程池
        /*
        for (int i = 0; i < 6; i++) {
            new Thread(new Practice1()).start();
        }
        */
        // 1. 使用CachedThreadPool
        /*
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 6; i++) {
            exec.execute(new LiftOff());
        }
        exec.shutdown();
        */
        // 2.使用FixedThreadPool
        /*
        ExecutorService exec = Executors.newFixedThreadPool(6);
        for (int i = 0; i < 6; i++) {
            exec.execute(new LiftOff());
        }
        exec.shutdown();
        */
        // 3.使用SingleThreadExecutor, 此时你会看到是有序的，不要奇怪。嘻嘻；
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 6; i++) {
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }

}
