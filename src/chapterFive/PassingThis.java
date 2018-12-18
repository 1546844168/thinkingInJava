package chapterFive;

/**
 * @author 江峰
 * @create 2018-12-13 21:22
 */

class Person {
    void eat(Apple apple) {
        Apple peeled = apple.getPeeled();
        System.out.println("真好吃");
    }
}

class Peel {

    static Apple getPeeled(Apple apple) {
        return apple;
    }
}

class Apple {
    Apple getPeeled() {
        return Peel.getPeeled(this);
    }
}

public class PassingThis {
    public static void main(String[] args){
      new Person().eat(new Apple());
    }
}
