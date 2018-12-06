package Thread;

/**
 * @author 潇潇暮雨
 * @create 2018-09-10   15:20
 */

class A implements Runnable {
    public volatile boolean flag = false;
    public synchronized void hunxing(){
        notifyAll();
    }
    public synchronized void f() {
        while (!flag) {
            System.out.println(flag);
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("A异常");
            }
        }
        System.out.println("A结束wait()了");
    }

    @Override
    public void run() {
        f();
    }
}

class B implements Runnable {
    private A a;

    public B(A a) {
        this.a = a;
    }

    public synchronized void g() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("B异常");
        }
        System.out.println("准备唤醒A");
        a.hunxing();
        a.flag = true;
        System.out.println("唤醒完毕");
    }

    @Override
    public void run() {
        g();
    }
}

public class Practice21 {
    public static void main(String[] args) {
        A a = new A();
        Thread t1 = new Thread(a);
        t1.start();
        Thread t2 = new Thread(new B(a));
        t2.start();

    }
}
