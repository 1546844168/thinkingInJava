package chapter.thirteen;

/**
 * @author 潇潇暮雨
 * @create 2019-03-19   18:44
 */
class Candy {
    static {
        System.out.println("candy");
    }
}

class Gum {
    static {
        System.out.println("gum");
    }
}

public class SweetShop {
    public static void main(String[] args) {
        new Candy();
        try {
            Class.forName("chapter.thirteen.Gum");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
