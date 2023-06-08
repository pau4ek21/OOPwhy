import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HotWaterIterator implements Iterator<Product> {
    private int counter;
    private final LinkedList<Product> hot_water;

    public HotWaterIterator(LinkedList<Product> hotWater) {
        this.counter = 0;
        hot_water = hotWater;
    }

    @Override
    public boolean hasNext() {
        return counter < hot_water.size();
    }

    @Override
    public Product next() {
        if (!hasNext()) {
            throw new RuntimeException("Product");
        }
        return hot_water.get(counter++);
    }
}
