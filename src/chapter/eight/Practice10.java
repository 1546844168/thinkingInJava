package chapter.eight;

/**
 * @author 江峰
 * @create 2018-12-20 13:07
 */

class A {
    public void fun() {
        System.out.println("A fun()");
        hello();
    }

    public void hello() {
        System.out.println("A hello()");
    }

    public void f() {
        System.out.println(" A f()");
    }


}

class B extends A {
    @Override
    public void hello() {
        System.out.println(" B hello()");
    }

    public void f() {
        System.out.println("B f()");
    }

    public void g() {
        System.out.println("B g()");
    }

}

public class Practice10 {
    public static void act(A a) {
        a.f();
    }


    public static void main(String[] args) {
        // 因为B类 具有和 A类一样的接口，B类可以访问到A类中所有的（可访问到的）属性和方法，基类中的hello()方法被导出类覆盖掉了，所以会调用导出类的hello（）方法。
        act(new B());
        System.out.println("--------------------------------");
        act(new A());
        System.out.println("--------------------------------");

    }
}
