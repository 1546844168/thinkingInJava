package Thread;

/**
 * @author 潇潇暮雨
 * @create 2018-09-08   19:18
 */
public class ADaemon implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(10);
            System.out.println(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally执行了");
        }


    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new ADaemon());
        t.setDaemon(true);
        t.start();
        System.out.println("start");

    }
}
