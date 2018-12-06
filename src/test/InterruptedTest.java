package test;

/**
 * @author 潇潇暮雨
 * @create 2018-09-10   12:53
 */
public class InterruptedTest implements Runnable {

    public  void f(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("中断");
        }
    }
    public void run(){
        f();
    }
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new InterruptedTest());
        t.start();
        Thread.sleep(10);
//        t.interrupt();
    }
}
