package Thread;

/**
 * @author 潇潇暮雨
 * @create 2018-09-08   21:50
 */
public class MyThread {
    private Inner inner;

    public MyThread(String name) {
        inner = new Inner(name);
    }

    private class Inner implements Runnable {
        Thread t = null;

        public Inner(String name) {
            t = new Thread(this);
            t.setName(name);
            t.start();
        }

        @Override
        public void run(){
            for (int i = 0; i < 6; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new MyThread("我是线程: " + i);
        }
    }
}
