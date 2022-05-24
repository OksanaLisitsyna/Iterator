import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    private Random random;
    private int[] array;

    public Randoms(int min, int max) {
        random = new Random();
        fillArray(min, max);
    }

    private int[] fillArray(int min, int max) {
        int arraySize = max - min + 1;
        array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = min++;
        }
        return array;
    }

    @Override
    public Iterator<Integer> iterator() {
        Iterator iterator = new Iterator() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return array[random.nextInt(array.length)];
            }
        };
        return iterator;
    }

}