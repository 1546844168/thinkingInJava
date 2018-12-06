package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 潇潇暮雨
 * @create 2018-09-09   13:52
 */
public class Practice11 implements Runnable{
    private int age = 0;
    private String name;

    private void set(){
        age = age + 10;
        Thread.yield();
        age = age - 10;
    }

    public void get(){
        System.out.println(name + " :" + age);
    }
    @Override
    public void run() {
        set();
        get();
    }
    public static void main(String[] args){
        ExecutorService exec = Executors.newCachedThreadPool();
        Practice11 p = new Practice11();
        for (int i = 0; i < 6; i++) {
            exec.execute(p);
        }
        exec.shutdown();
    }
}
