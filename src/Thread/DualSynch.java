package Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 潇潇暮雨
 * @create 2018-09-09   18:43
 */
public class DualSynch  {
    private Object obj = new Object();
    public synchronized void f(){
        for (int i = 0; i < 10; i++) {
            System.out.println("f()");
            Thread.yield();
        }
    }
    public void g(){
        synchronized (obj){
            for (int i = 0; i < 10; i++) {
                System.out.println("g()");
                Thread.yield();
            }
        }
    }
    public static void main(String[] args){
        Lock lock = new ReentrantLock();
        DualSynch ds = new DualSynch();
      new Thread(){
          public void run(){
              ds.f();
          }
      }.start();
        ds.g();
    }
}
