package chapter.ten;

/**
 * @author 江峰
 * @create 2018-12-22 9:34
 */
public class Outer {
    private int[] arr = {1, 2, 3, 4, 5, 6};

    public void printArr() {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    class Inner {
        private int count = 100;

        public void change() {
            arr = new int[]{1, 2, 3};
        }

        public void fun() {
            System.out.println("inner fun()");
        }
    }

    public Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.printArr();
        System.out.println("------------------------");
//        Inner inner = outer.getInner();
        Inner inner = outer.new Inner();
        inner.change();
        outer.printArr();
        inner.fun();
    }
}
