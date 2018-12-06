package Thread;

/**
 * @author 潇潇暮雨
 * @create 2018-09-08   18:31
 */

class Daemon implements Runnable{
    private Thread[] threads = new Thread[10];
    public void run(){
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(new DaemonSpawn());
            threads[i].start();
            System.out.println("Threads[" + i + "] start");
        }
        for (int i = 0; i < 10; i++) {
            System.out.println( "threads[" + i +"] is " + threads[i].isDaemon());
        }
        while (true){
            Thread.yield();
        }
    }

}

class DaemonSpawn implements  Runnable{
    public void run(){
        while (true){
            Thread.yield();
        }
    }
}
public class Daemons {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Daemon());
        thread.setDaemon(true);
        thread.start();
        System.out.println( thread.getName() +": "+thread.isDaemon());
        System.out.println("开始了");
        Thread.sleep(1L);
    }
}
