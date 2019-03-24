package chapter.fourteen;

/**
 * @author 潇潇暮雨
 * @create 2019-03-20   19:13
 */
class Base {

}

class Derived extends Base {

}

public class FamilyVsExactType {

    public static void main(String[] args) {
        testInstanceOf(new Base());
        testInstanceOf(new Derived());
        testClass(new Base());
        testClass(new Derived());
    }

    static void testInstanceOf(Object o) {
        System.out.println(o instanceof Base);
    }

    static void testClass(Object o) {
        System.out.println(o.getClass() == Base.class);
    }

}
