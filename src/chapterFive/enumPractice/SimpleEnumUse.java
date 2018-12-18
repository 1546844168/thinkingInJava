package chapterFive.enumPractice;

/**
 * @author 江峰
 * @create 2018-12-18 13:19
 */
public class SimpleEnumUse {
    public static void main(String[] args) {
        Season autumn = Season.AUTUMN;
        System.out.println(autumn);
        Season[] values = Season.values();
        for (Season value : values) {
            System.out.println(value + "   ordina " + value.ordinal());
        }
    }
}
