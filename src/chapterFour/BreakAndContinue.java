package chapterFour;

/**
 * @author 江峰
 * @create 2018-12-13 14:11
 */
public class BreakAndContinue {
    public static void break1() {
        for (int i = 0; i < 100; i++) {
            if (i == 6) {
                break;
            }
            System.out.println(i);
        }
    }

    /**
     * 打印1 - 100 之间的偶数
     */
    public static void continue1() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0)
                continue;
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        continue1();
    }


}
