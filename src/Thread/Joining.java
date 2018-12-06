package Thread;

/**
 * @author 潇潇暮雨
 * @create 2018-09-08   22:28
 */

class Sleeper extends  Thread{
    // 线程的睡眠时间
    private int duration;
    public Sleeper(String name, int duration){
        // 调用Thread的构造器
        super(name);
        this.duration = duration;
        // 开启一个线程
        start();
    }
    public void run(){

        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            System.out.println(getName() + "was interrupted? " + isInterrupted());
        }
        System.out.println(getName() + " has awakened" );
    }
}
class Joiner extends Thread{
    private Sleeper sleeper;
    public Joiner(String name, Sleeper sleeper){
        super(name);
        this.sleeper = sleeper;
        start();
    }
    public void run(){
        try {
//            sleeper.start();
//            sleeper.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(sleeper.getName() + " is alive?>>>> " + sleeper.isAlive() + ",   "+getName() + " join completed");
    }
}

public class Joining {
    public static void main(String[] args){
        Sleeper sleepy = new Sleeper("Sleepy", 1500);
        Sleeper Grumpy = new Sleeper("Grumpy", 1500);
        Joiner dopey = new Joiner("dopey", sleepy);
        Joiner doc = new Joiner("doc", Grumpy);
        // 中断线程
        sleepy.interrupt();

    }
}
