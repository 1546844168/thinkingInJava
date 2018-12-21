package chapter.nine.interfaceprocessor;

/**
 * @author 江峰
 * @create 2018-12-21 14:15
 */
public class Apply {
    public static String str = "My name is jiangfeng";

    public static void processor(Processor processor, Object input) {
        System.out.println(processor.processor(input));
    }

    public static void main(String[] args) {
        processor(new Upcase(), str);
        processor(new Splitter(), str);
    }
}