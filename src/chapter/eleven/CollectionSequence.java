package chapter.eleven;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.AbstractCollection;
import java.util.Iterator;

/**
 * @author 潇潇暮雨
 * @create 2019-03-10   21:55
 */
public class CollectionSequence extends AbstractCollection {
    private Pet[] pets = Pets.createArray(8);

    @Override
    public Iterator iterator() {
        return new Iterator<Pet>() {
            private int index = 0;

            @Override
            public boolean hasNext() {

                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }
        };
    }

    @Override
    public int size() {
        return pets.length;
    }

    public static void main(String[] args) {
        CollectionSequence collectionSequence = new CollectionSequence();
        int size = collectionSequence.size();
        System.out.println(size);
        Iterator iterator = collectionSequence.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
