package chapter.eleven;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.*;

/**
 * @author 潇潇暮雨
 * @create 2019-03-09   21:29
 */
public class Ex11 {
    public void fun(Collection<Pet> c) {
        Iterator<Pet> iterator = c.iterator();
        while (iterator.hasNext()) {
            Pet next = iterator.next();
            System.out.print(next + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Ex11 e = new Ex11();
        ArrayList<Pet> pets = Pets.arrayList(10);
//        LinkedList<Pet> pets1 = new LinkedList<>(pets);
        HashSet<Pet> pets2 = new HashSet<>(pets);
        TreeSet<Pet> pets3 = new TreeSet<>(pets);
        e.fun(pets);
//        e.fun(pets1);
        e.fun(pets2);
        e.fun(pets3);
    }
}
