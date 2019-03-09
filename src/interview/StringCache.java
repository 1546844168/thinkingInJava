package interview;

/**
 * @author 潇潇暮雨
 * @create 2019-03-08   18:58
 * // 会创建两个对象，前提是String Pool中没有这个字面量。
 *
 * //        String a = "aaa";  // 会直接将字面量放入到常量池中。
 * //        String b = "aaa";
 * //        System.out.println(a == b);
 * //        String c = a.intern(); // 返回的是常量池的这个字符串的引用
 * //        System.out.println(a == c);
 */
public class StringCache {
    public static void main(String[] args) {

        String abc = new String("abc");

    }
}
