package interview;

/**
 * @author 潇潇暮雨
 * @create 2019-03-08   17:16
 */
public class IntegerCache {
    public static void main(String[] args) {
        Integer a = new Integer(123);
        Integer b = new Integer(123);
        System.out.println(a == b);
        System.out.println("==========================");//false
        Integer c = Integer.valueOf(123);
        Integer d = Integer.valueOf(123);
        System.out.println(a == c);
        System.out.println(b == c);
        System.out.println(c == d);


    }
}
