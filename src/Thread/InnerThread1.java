package Thread;

/**
 * @author 潇潇暮雨
 * @create 2018-09-08   20:39
 */
public class InnerThread1 {
    private int countDown = 5;
    private Inner inner;
    public InnerThread1(String name){
        inner = new Inner(name);
    }
    private class Inner implements Runnable{
        Thread t = new Thread(this);
        public Inner(String name){
            t.setName(name);
            t.start();
        }
        @Override
        public void run(){
            while (true){
                System.out.println(Thread.currentThread().getName() + " : " + countDown);
                if (-- countDown == 0)
                    return;
            }
        }
    }
    public static void main(String[] args){
        for (int i = 0; i < 6; i++) {
            new InnerThread1("我是线程" + i);
        }
    }
}
