package Thread;

/**
 * @author 潇潇暮雨
 * @create 2018-09-08   16:25
 */
public class SimpleDaemons implements Runnable{

    @Override
    public void run(){
        try {
            // 将后台线程短暂睡眠
            Thread.sleep(1L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " : " + this);
    }
    public static void main(String[] args){
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new SimpleDaemons());
            thread.setDaemon(true);
            thread.start();
        }
        System.out.println("我是主线程，也是非后台线程");
        System.out.println("exit");
    }
}
