package chapter.five;

import java.io.IOException;

/**
 * @author 江峰
 * @create 2018-12-13 17:05
 */
public class Hello {
    boolean flag = false;
    static int count = 0;
    void change() {
        flag = true;
    }

    @Override
    protected void finalize() throws Throwable {
        if (flag)
            System.out.println("调用了finalize方法  " + count++);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
//        for (int i = 0; i < 10000; i++) {
            new Hello().change();
//        }
        System.gc();
        Thread.sleep(1000);
        System.out.println("结束");

    }

}

