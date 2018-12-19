package chapterSeven;

/**
 * @author 江峰
 * @create 2018-12-19 9:32
 */
public class Human {
    private Integer age;
    private String name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void introduceMySelf() {
        System.out.println("Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}');
    }


}
