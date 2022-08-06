import java.util.Random;

public class MagicBox<T> {

    private final Random random = new Random();
    protected T[] items;
    private int itemCnt = 0;

    public MagicBox(int number) {
        items = (T[]) new Object[number];
    }

    public boolean add(T item) {
        if (items.length > itemCnt) {
            items[itemCnt++] = item;
            return true;
        }
        return false;
    }

    public T pick() throws RuntimeException {
        if (items.length > itemCnt) {
            throw new RuntimeException("Коробка не полна" + " " + "Свободно" + " " + (items.length - itemCnt));
        }
        return items[random.nextInt(items.length)];
    }
}