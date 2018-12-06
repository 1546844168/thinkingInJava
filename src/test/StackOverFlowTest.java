package test;

/**
 * @author 潇潇暮雨
 * @create 2018-09-10   10:43
 */
public class StackOverFlowTest {
    public void f(){
        g();
    }
    public void g(){
        f();
    }
    public static void main(String[] args){
      new StackOverFlowTest().f();
    }
}
