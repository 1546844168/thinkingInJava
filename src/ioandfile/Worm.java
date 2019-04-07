package ioandfile;

import java.io.*;
import java.util.Random;

/**
 * @author 潇潇暮雨
 * @create 2018-09-11   9:25
 */

class Data implements Serializable{
    private int n;

    public Data(int n) {
        this.n = n;
    }

    public String toString() {
        return String.valueOf(n);
    }
}

public class Worm implements Serializable {
    private Random rand = new Random(47);
    private Data[] datas = {new Data(rand.nextInt(10)),
            new Data(rand.nextInt(10)),
            new Data(rand.nextInt(10))};
    private Worm next;
    private char c;

    // 每个蠕虫都指向下一个蠕虫，直到null。
    public Worm(int n, char x) {
        this.c = x;
        System.out.println("Worm constructor" + n);
        if (--n > 0)
            next = new Worm(n, (char) (c + 1));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(":");
        sb.append(c);
        sb.append("(");
        for (Data data : datas) {
            sb.append(data);
        }
        sb.append(")");
        if (next != null)
            sb.append(next);
        return sb.toString();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Worm w = new Worm(6, 'a');
        System.out.println("w = " + w);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\对象.txt"));
        oos.writeObject("Worm storage" + "\n");
        oos.writeObject(w);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\对象.txt"));
        String s = (String)ois.readObject();
        Worm  w2 = (Worm)ois.readObject();
        System.out.println("s:"+ s + " : w2 = " + w2);


    }


}
