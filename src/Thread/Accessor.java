package Thread;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 潇潇暮雨
 * @create 2018-09-09   19:12
 */
public class Accessor implements Runnable{
    private int id;
    public Accessor(int id){
        this.id = id;
    }
    public void run(){
        while (!Thread.currentThread().isInterrupted()){
            ThreadLocalVariableHolder.increment();
            System.out.println("#: " + id + " value = " + ThreadLocalVariableHolder.get());
            Thread.yield();
        }
    }

}
class ThreadLocalVariableHolder{
    private static ThreadLocal<Integer> value = new ThreadLocal(){
        private Random rand = new Random(47);
        protected synchronized Integer initialValue(){
            return rand.nextInt(10000);
        }
    };

    public static void increment(){
        value.set(value.get() + 1);
    }
    public static int get(){
        return value.get();
    }
    public static void main(String[] args){
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 6; i++) {
            exec.execute(new Accessor(i));
        }
        exec.shutdown();
    }
}
