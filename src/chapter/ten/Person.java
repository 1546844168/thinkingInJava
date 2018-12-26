package chapter.ten;

/**
 * @author 江峰
 * @create 2018-12-22 9:07
 */
public class Person {
    class Leg {
        private int num = 4;

        public int getNUm() {
            return num;
        }

    }

    public static void main(String[] args) {
        int nUm = new Person().new Leg().getNUm();
        System.out.println(nUm);
    }
}
