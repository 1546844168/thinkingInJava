package test;

/**
 * @author 潇潇暮雨
 * @create 2018-09-09   16:44
 */
public class AutomicityTest implements Runnable {
    private int i = 0;

    public void change() {
        i++;
        System.out.println("i改变了");
    }

    public int get() {
        return i;
    }

    @Override
    public void run() {
        change();
    }

    public static void main(String[] args) {
        AutomicityTest au = new AutomicityTest();
        Thread t = new Thread(au);
        t.start();
        System.out.println(au.get());
        for (int i = 0; i < 1000; i++) {
            new Thread() {
                public void run() {
                    System.out.println(au.get());
                }
            }.start();
        }
    }
}
