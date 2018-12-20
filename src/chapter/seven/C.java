package chapter.seven;

/**
 * @author 江峰
 * @create 2018-12-19 10:32
 */
class A extends C {
    public A(int i) {
        super(i);
        System.out.println("A constructed");
    }
}

class B {
    public B(int i) {
        System.out.println("B constructed");
    }
}

public class C {
    // 在调用C的构造器之前会初始化B类的构造器并创建一个对象。
    private B b = new B(11);

    public C(int i) {
        System.out.println("c constructed");
    }

    public static void main(String[] args) {
//        new C(12);
        new A(13);
    }
}
