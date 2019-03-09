package chapter.twelve.practice;

/**
 * @author 潇潇暮雨
 * @create 2019-03-06   10:29
 */
public class MyException extends Exception{
    private String message;

    public MyException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

class B {
    public static void main(String[] args){

        try {
            throw new MyException("我的异常");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
