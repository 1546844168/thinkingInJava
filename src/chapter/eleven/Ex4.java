package chapter.eleven;

import java.util.*;

/**
 * @author 潇潇暮雨
 * @create 2019-03-09   20:00
 * <p>
 * 练习4
 */

class Generator {
    private int k = 0;

    public String next() {
        switch (k) {
            default:
            case 0:
                k++;
                return "tom";
            case 1:
                k++;
                return "jack";
            case 2:
                k++;
                return "bob";
            case 3:
                k = 0;
                return "dell";
        }
    }

    public void fillArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = next();
        }
    }

    public Collection<String> fillContainers(Collection<String> c, int n) {
        for (int i = 0; i < n; i++) {
            c.add(next());
        }
        return c;
    }
}

public class Ex4 {
    public static void main(String[] args) {
        String[] strings = new String[8];
        Generator generator = new Generator();
        generator.fillArray(strings);
        System.out.println(Arrays.toString(strings));
        System.out.println("=====================");
        System.out.println(generator.fillContainers(new ArrayList<String>(), 8));
        System.out.println(generator.fillContainers(new LinkedList<String>(), 8));
        System.out.println(generator.fillContainers(new HashSet<String>(), 8));
        System.out.println(generator.fillContainers(new LinkedHashSet<String>(), 8));
        System.out.println(generator.fillContainers(new TreeSet<String>(), 8));
    }
}
