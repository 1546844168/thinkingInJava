package chapterFive;

/**
 * @author 江峰
 * @create 2018-12-17 14:00
 */
public class InitialValue {

    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;

    void printInitialValue() {
        System.out.println("boolean  " + t);
        System.out.println("char  " + c);
        System.out.println("byte  " + b);
        System.out.println("short  " + s);
        System.out.println("int  " + i);
        System.out.println("long  " + l);
        System.out.println("float  " + f);
        System.out.println("double  " + d);
    }

    public static void main(String[] args) {
        new InitialValue().printInitialValue();
    }
}
