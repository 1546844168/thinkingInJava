package chapter.five;

/**
 * @author 江峰
 * @create 2018-12-14 9:46
 */
public class People {
    String name;
    int age;

    People(String name) {
        this.name = name;
        System.out.println("name :" + name);
    }

    People(int age) {
        this.age = age;
        System.out.println("age :" + age);
    }


    People(String name, int age) {
        this(name);
        this.age = age;
        System.out.println("name & age " + "name = " + name + " age = " + age);
    }

    People() {
        this("江峰", 23);
    }

    public static void main(String[] args) {
        People people = new People();
        System.out.println(people.age + " " + people.name);
    }



}
