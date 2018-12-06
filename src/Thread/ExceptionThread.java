package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 潇潇暮雨
 * @create 2018-09-08   23:34
 */
public class ExceptionThread implements Runnable {

    public void run(){
        throw new RuntimeException();
    }
    public static void main(String[] args){
        ExecutorService exec = null;
        try {
            exec = Executors.newCachedThreadPool();
            exec.execute(new ExceptionThread());
            exec.shutdown();
        } catch (Exception e) {
            System.out.println("EXception has been handled");
            e.printStackTrace();
        }
    }
}
