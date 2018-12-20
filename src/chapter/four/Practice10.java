package chapter.four;

/**
 * @author 江峰
 * @create 2018-12-13 14:57
 */

/**
 * 找出四位数的所有的吸血鬼数字
 */
public class Practice10 {

    public static void main(String[] args) {
        method();
    }

    public static void method() { // 官方参考答案

        int[] startDigit = new int[4];
        int[] productDigit = new int[4];
        for (int num1 = 10; num1 <= 99; num1++)
            for (int num2 = num1; num2 <= 99; num2++) {
                // Pete Hartley's theoretical result:
                // If x·y is a vampire number then
                // x·y == x+y (mod 9)
                if ((num1 * num2) % 9 != (num1 + num2) % 9)
                    continue;
                int product = num1 * num2;
                startDigit[0] = num1 / 10;
                startDigit[1] = num1 % 10;
                startDigit[2] = num2 / 10;
                startDigit[3] = num2 % 10;
                productDigit[0] = product / 1000;
                productDigit[1] = (product % 1000) / 100;
                productDigit[2] = product % 1000 % 100 / 10;
                productDigit[3] = product % 1000 % 100 % 10;
                int count = 0;
                for (int x = 0; x < 4; x++)
                    for (int y = 0; y < 4; y++) {
                        if (productDigit[x] == startDigit[y]) {
                            count++;
                            productDigit[x] = -1;
                            startDigit[y] = -2;
                            if (count == 4)
                                System.out.println(num1 + " * " + num2 + " : "
                                        + product);
                        }
                    }

            }

    }
}