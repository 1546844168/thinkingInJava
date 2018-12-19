package chapterSeven;

/**
 * @author 江峰
 * @create 2018-12-19 9:32
 */
public class Man extends Human {
    @Override
    public void introduceMySelf() {
        System.out.println(super.getName() + " : " + super.getAge());
        //        super.introduceMySelf();
    }

    public void huge() {
        System.out.println("man is huge");
    }

    public static void main(String[] args) {
        Man man = new Man();
        man.setName("潇潇暮雨");
        System.out.println(man.getName());
        man.introduceMySelf();
        man.huge();
    }

}
