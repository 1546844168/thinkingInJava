package chapter.controllingExecution;

import java.util.Random;

/**
 * @author 江峰
 * @create 2018-12-13 14:46
 */
public class SwitchTest {
    public static void main(String[] args){
      fun();
    }
    
    public static void fun(){
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int num = random.nextInt(26);
            System.out.println(num);
        }
    }
}
