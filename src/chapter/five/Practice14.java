package chapter.five;

/**
 * @author 江峰
 * @create 2018-12-17 16:14
 */
public class Practice14 {
    static String name = "jiangfeng";
    static int age;
    static {
        age = 22;
    }

    static  void print(){
        System.out.println("name = " + name + "    age = " + age) ;
    }
    public static void main(String[] args){
      Practice14.print();
    }


}
