package chapterFive;


/**
 * @author 江峰
 * @create 2018-12-17 11:03
 */


public class GC {

    boolean flag = false;

    GC(boolean flag) {
        flag = false;
    }

    void cheakIn() {
        flag = true;
    }

    @Override
    protected void finalize() {

//        if (flag)
//            System.out.println("满的");
        System.out.println("空的");
    }

    public static void main(String[] args) throws InterruptedException {
        GC gc = new GC(false);
//        gc.cheakIn();
        System.gc();
        Thread.sleep(1000);

    }
}

