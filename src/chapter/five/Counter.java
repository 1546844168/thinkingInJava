package chapter.five;

/**
 * @author 江峰
 * @create 2018-12-17 14:31
 */
public class Counter {
    int i;
    Counter(int i){
        this.i = i;
    }

    public static void main(String[] args){
        System.out.println(new Counter(1).i);
    }
}
