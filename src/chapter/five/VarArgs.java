package chapter.five;

/**
 * @author 江峰
 * @create 2018-12-17 21:33
 */

class Args {

}

public class VarArgs {

    // 写一个方法接受一个参数数组，打印数组中的所有数。
    static void printArray(Object[] obj) {
        for (Object o : obj) {
            System.out.println(o);
        }
    }

    static void printStringArray(String... str) {
        for (String s : str) {
            System.out.println(s);
        }
    }

    static void printStringArray() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        printArray(new Object[]{new Integer(1), new Float(1.3), new Double(2.2)});
        System.out.println("-----------------------------------------------");
        printArray(new Object[]{"one", "two", "three"});
        System.out.println("-----------------------------------------------");
        printArray(new Object[]{new Args(), new Args(), new Args()});
        System.out.println("-----------------------------------------------");
        printStringArray("name", "password", "sex");
        System.out.println();
        printStringArray();
        System.out.println("-----------------------------------------------");
        printArray(new String[]{"one", "two", "three"});

    }

}
