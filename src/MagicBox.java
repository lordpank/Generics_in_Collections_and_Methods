import java.util.Random;

public class MagicBox<T> {


    public T[] items = (T[]) new Object[4];
    private int itemCnt = 0;

    public boolean add(T item) {
        if (items.length > itemCnt) {
            items[itemCnt++] = item;
            return true;
        }
        return false;
    }

    public T pick() throws RuntimeException {
        int freeSlots = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                freeSlots += 1;
                throw new RuntimeException("Коробочка не полна" + freeSlots);
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        return items[randomInt];
    }
}