package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 潇潇暮雨
 * @create 2018-09-08   15:19
 *
 *
 * 创建一个任务，睡眠1至10秒，显示它的睡眠时并退出，创建并运行一定数量的这种任务。
 */
public class Practice6 implements Runnable{

    public void run(){
        int i = (int) (Math.random() * 10000);
        System.out.println("开始睡觉，睡眠时间为：" + i);
        try {
            Thread.sleep(i);
            System.out.println("睡醒了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 6; i++) {
            exec.execute(new Practice6());
        }
        exec.shutdown();
    }

}
