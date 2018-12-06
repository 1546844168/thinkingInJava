package Thread;

/**
 * @author 潇潇暮雨
 * @create 2018-09-08   20:15
 */
public class SelfManaged implements Runnable {
    private int countDown = 5;
    private Thread t = new Thread(this);
    public SelfManaged(){
        t.start();
    }
    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName() + " : " + countDown);
            if (--countDown == 0)
                return;
        }
    }
    public static void main(String[] args){
        for (int i = 0; i < 6; i++) {
            new SelfManaged();
        }
    }
}
