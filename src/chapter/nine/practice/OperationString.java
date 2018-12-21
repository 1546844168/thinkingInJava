package chapter.nine.practice;

/**
 * @author 江峰
 * @create 2018-12-21 15:24
 */
public class OperationString {

    public String inverseString(String string) {
        if (string == null || string.length() == 0) return string;
        int length = string.length();
        char[] array = string.toCharArray();
        for (int i = 0; i < length / 2; i++) {
            array[i] = string.charAt(length - 1 - i);
            array[length - 1 - i] = string.charAt(i);
        }
        return new String(array);
    }
}
