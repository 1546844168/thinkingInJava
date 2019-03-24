package chapter.thirteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 潇潇暮雨
 * @create 2019-03-19   18:22
 */
class Circle extends Shape {

    @Override
    public String toString() {
        return "circle";
    }
}

class Triangle extends Shape {

    @Override
    public String toString() {
        return "triangle";
    }
}

class Square extends Shape {

    @Override
    public String toString() {
        return "square";
    }
}

class Rhomboid extends Shape {
    public String toString() {
        return "Rhomboid";
    }
}

abstract class Shape {
    public void draw() {
        System.out.println(this + "    draw()");
    }

    public abstract String toString();

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<Shape>(Arrays.asList(new Circle(), new Square(), new Triangle()));
        for (Shape shape : shapes) {
            shape.draw();
        }
        System.out.println("--------------");
        Rhomboid r = new Rhomboid();
        Shape s = (Shape) r;
        s.draw();
        if (s instanceof Rhomboid) {
            System.out.println(s.getClass().getName());
        } else if (s instanceof Shape) {
            System.out.println(" s is shape");
        }

    }

}
