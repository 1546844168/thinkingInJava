package interview;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 潇潇暮雨
 * @create 2019-03-14   12:24
 */
class Hash {
    private int i;

    Hash(int i) {
        this.i = i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hash hash = (Hash) o;
        return i == hash.i;
    }

    @Override
    public int hashCode() {
        return i % 2;
    }

    @Override
    public String toString() {
        return "" + i;
    }
}

public class MyMap {
    public static void main(String[] args) {
        Map<Hash, Integer> map = new HashMap<Hash, Integer>();
        for (int j = 1; j < 1000; j++) {
            map.put(new Hash(j), j);
        }

        System.out.println(map);

    }
}
