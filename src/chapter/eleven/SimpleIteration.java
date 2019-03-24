package chapter.eleven;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.ArrayList;

/**
 * @author 潇潇暮雨
 * @create 2019-03-09   21:15
 */
public class SimpleIteration {
    public static void main(String[] args) {
        ArrayList<Pet> pets = Pets.arrayList(12);
        System.out.println(pets);
    }
}
