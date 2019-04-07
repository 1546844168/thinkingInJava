package chapter.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 潇潇暮雨
 * @create 2019-04-06   12:46
 */
class Num {
    private int num1;
    private int num2;

    public synchronized void setMessage(int num) {
        this.num1 = num;
        Thread.yield();
        this.num2 = num;
    }

    public void printNum() {
        if (num1 != num2) {
            System.out.println("false");
        }
        System.out.println(num1 + " ---- " + num2);
    }

}

class Hello implements Runnable {
    private Num num;

    public Hello(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            num.setMessage(i);
            num.printNum();
        }
    }
}


public class Ex11 {
    public static void main(String[] args) {
        Num num = new Num();
        ExecutorService es = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            es.execute(new Hello(num));
        }
        es.shutdown();
    }
}
