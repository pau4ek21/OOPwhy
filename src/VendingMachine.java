import java.util.LinkedList;

public interface VendingMachine {
    public void putProduct(LinkedList<Product> item);

    public Product getProduct();

    void getProduct(int name, int volume);
    void getProduct(int name, int volume, int temperature);

}
