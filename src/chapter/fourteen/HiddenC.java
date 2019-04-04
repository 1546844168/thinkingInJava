package chapter.fourteen;

/**
 * @author 潇潇暮雨
 * @create 2019-03-24   20:06
 */
class C implements A {

    @Override
    public void f() {
        System.out.println("public C.f()");
    }

    public void g() {
        System.out.println("public C.g()");
    }

    protected void h() {
        System.out.println("protected C.h()");
    }

    private void i() {
        System.out.println("private C.i()");
    }
}

public class HiddenC {
    public static A makeA() {
        return new C();
    }
}


