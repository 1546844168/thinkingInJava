package chapter.eight;

/**
 * @author 江峰
 * @create 2018-12-20 15:54
 */

class G {


    public void g() {
        System.out.println("G g()");
    }
}

class F extends G {
    public void f() {
        System.out.println("F f()");
    }

    public void g() {
        System.out.println("F g()");
    }
}

public class RTTI {
    public static void main(String[] args) {
//        Object s = "hello world";
//        String s1 = (String) s;
//        System.out.println(s1);
        G g = new F();
        ((F) g).f();
        g.g();
    }
}
