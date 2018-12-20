package chapter.four;

/**
 * @author 江峰
 * @create 2018-12-12 15:56
 */
public class WhileTest {

    public static void main(String[] args){
      while (Math.random() < 0.99){
          System.out.println("continue");
      }
        System.out.println("exit");
    }
}
