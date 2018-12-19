package chapterSeven;

/**
 * @author 江峰
 * @create 2018-12-19 14:29
 */

/*
 * Amphibian：两栖动物
 */
class Amphibian {
    public void swim(Amphibian amphibian) {
        System.out.println(amphibian + "    can swim");
    }
}

/*
 * Frog：青蛙
 *
 * */
public class Frog extends Amphibian {
    @java.lang.Override
    public void swim(Amphibian amphibian) {
        System.out.println(amphibian + " frog   can swim");

    }

    public static void main(String[] args) {
        new Frog().swim(new Frog());
    }
}
