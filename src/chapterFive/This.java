package chapterFive;

/**
 * @author 江峰
 * @create 2018-12-13 17:18
 */
public class This {
    void hello() {
        System.out.println("hello");
    }

    int num = 0;

    This increment() {
        num++;
        // 返回的是当前对象的引用
        return this;
    }

    void print() {
        System.out.println(num);
    }

    public static void main(String[] args) {
        new This().increment().increment().print();
    }

}
