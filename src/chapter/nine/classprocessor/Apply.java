
//package chapter.nine.classprocessor;
//
//import java.util.Arrays;
//
///**
// * @author 江峰
// * @create 2018-12-21 10:16
// */
//
//class Processor {
//    public String name() {
//        return this.getClass().getSimpleName();
//    }
//
//    public Object processor(Object input) {
//        return input;
//    }
//}
//
//class Upcase extends Processor {
//    public String processor(Object input) {
//        return ((String) input).toUpperCase();
//    }
//}
//
//class Splitter extends Processor {
//    public String processor(Object input) {
//        String[] s = ((String) input).split(" ");
//        return Arrays.toString(s);
//    }
//}
//
//// 接受一个字符串，可以将这个字符串转变为大写或者分割字符串。
//public class Apply {
//    public static String str = "My name is jiangfeng";
//
//    public static void processor(Processor processor, String input) {
//        System.out.println(processor.processor(input));
//    }
//
//    public static void main(String[] args) {
//        processor(new Upcase(), str);
//        processor(new Splitter(), str);
//    }
//}
