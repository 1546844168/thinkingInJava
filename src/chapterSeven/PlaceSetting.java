package chapterSeven;

/**
 * @author 江峰
 * @create 2018-12-19 11:01
 */
class Fu {
    public Fu(int i) {
        System.out.println("fu constructed");
    }

    public void fun() {
        System.out.println("fu fun");
    }
}

// 子类与父类具有一样的接口
class Zi extends Fu {
    public Zi(int i) {
        super(i); // 调用构造器时super必须放在第一行。
        System.out.println("zi constructed");
    }

    public void fun() {
        System.out.println("zi fun");
        super.fun();// 可以在子类中通过super调用父类的方法。
    }

    public void hello() {
        System.out.println("zi hello");
    }

}

public class PlaceSetting {
    private Zi zi = null;

    public PlaceSetting(int i) {
        zi = new Zi(i);
        System.out.println("placesetting constructed");
    }

    public static void main(String[] args) {
        PlaceSetting placeSetting = new PlaceSetting(11);
        placeSetting.zi.fun();
        placeSetting.zi.hello();
    }
}
