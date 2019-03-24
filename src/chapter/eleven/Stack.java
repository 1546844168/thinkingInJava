package chapter.eleven;

import java.util.LinkedList;

/**
 * @author 潇潇暮雨
 * @create 2019-03-10   11:29
 */
public class Stack<T> {
    LinkedList<T> linkedList = new LinkedList<T>();

    public void push(T t) {
        linkedList.addFirst(t);
    }

    public T peek() {
        return linkedList.getFirst();
    }

    public T pop() {
        return linkedList.removeFirst();
    }

    @Override
    public String toString() {
        return "Stack{" + linkedList +
                '}';
    }

    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        stringStack.push("bob");
        stringStack.push("jack");
        stringStack.push("tom");
        String s = stringStack.toString();
        System.out.println(s);
    }
}
