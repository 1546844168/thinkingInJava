package test;


import chapter.ten.Outer;

/**
 * @author 江峰
 * @create 2018-12-11 14:41
 */
public class Fun {

    public void fun(){
        System.out.println("fun");
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.printArr();
        System.out.println("------------------------");
//        Outer.Inner inner = outer.new Inner();
    }
}
