package chapterFive;

/**
 * @author 江峰
 * @create 2018-12-17 15:24
 */

class A{
    static {
        System.out.println("A 的静态代码块");
    }
    A(int i){
        System.out.println("A 进行了初始化 " + i);
    }
}

public class StaticInit {
    static A a = new A(1);
    A b = new A(2);
    public static void main(String[] args){
        new StaticInit();
    }
}
