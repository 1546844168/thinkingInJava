package chapterFive;

/**
 * @author 江峰
 * @create 2018-12-13 16:23
 */
public class Practice2 {
    String s1;
    String s2 = "hello";
    String s3 = s1;


    Practice2() {
        s1 = "world";
    }

    public static void main(String[] args) {
        Practice2 practice2 = new Practice2();
        System.out.println(practice2.s1);
        System.out.println(practice2.s2);
        System.out.println(practice2.s3);
    }
}
