package chapter.eleven;

import net.mindview.util.Stack;

/**
 * @author 潇潇暮雨
 * @create 2019-03-10   18:55
 */
public class Ex15 {


    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("U");
        stack.push("n");
        stack.push("c");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push("e");
        stack.push("r");
        stack.push("t");
    }
}
