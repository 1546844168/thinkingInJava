package chapterSeven;

/**
 * @author 江峰
 * @create 2018-12-19 9:58
 */
class Art {
    public Art() {
        System.out.println("art");
    }
}

class Drawing extends Art {
    public Drawing() {
        System.out.println("Drawing");
    }
}

public class Cartoon extends Drawing {
    public static void main(String[] args) {
        new Cartoon();
    }
}
