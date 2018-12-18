package chapterTwo;

import org.junit.Test;

import java.io.*;
import java.util.Date;
import java.util.Properties;

/**
 * @author 江峰
 * @create 2018-12-11 9:55
 */
public class MyTest {
    @Test
    public void testProperties() throws IOException {
        Properties properties = new Properties();
        properties.load(new InputStreamReader(new FileInputStream("D:\\java.txt")));

        System.out.println(properties.get("name"));
        properties.setProperty("name","江峰hello");
        properties.store(new FileWriter(new File("D:\\java.txt")),null);
    }
    public static void print(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
       print(new Date());
    }

    @Test
    public void test() {
        int[] arr = {1};
        System.out.println(arr[0]);

    }

    @Test
    public void test1() {
        Character ch = new Character('c');
        char x = ch;
        Character w = 'c';
        System.out.println(w == ch);
        System.out.println(x == ch);

    }

    @Test
    public void fun() {
        int a = 3;
        if (a == 3) {
            System.out.println("执行了return语句");
            return;
        }
        System.out.println("没有执行这个语句");
    }
}
