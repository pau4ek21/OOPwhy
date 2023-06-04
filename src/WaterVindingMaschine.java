import java.util.LinkedList;

public class WaterVindingMaschine implements VendingMachine {
    private LinkedList<Product> waters;
    @Override
    public void putProduct(LinkedList<Product> item) {
        this.waters = item;
    }

    @Override
    public Product getProduct() {
        return waters.pollLast();
    }

    @Override
    public void getProduct(int name, int volume) {

    }

    @Override
    public void getProduct(int name, int volume, int temperature) {

    }
}
