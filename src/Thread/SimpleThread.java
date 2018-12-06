package Thread;

/**
 * @author 潇潇暮雨
 * @create 2018-09-08   19:54
 */
public class SimpleThread extends Thread {
    private int countDown = 5;

    public SimpleThread(){
        super();
        start();
    }

    public void run() {
        while (true) {
            System.out.println(getName() + " : " + countDown);
            if (--countDown == 0)
                return;
        }
    }
    public static void main(String[] args){
        for (int i = 0; i < 6; i++) {
            new SimpleThread();
        }
    }
}
