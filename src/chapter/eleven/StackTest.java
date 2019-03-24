package chapter.eleven;

import net.mindview.util.Stack;

/**
 * @author 潇潇暮雨
 * @create 2019-03-10   18:49
 */
public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();
        String[] s = "My dog has fleas".split(" ");
        for (String s1 : s) {
            stack.push(s1);
        }
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
