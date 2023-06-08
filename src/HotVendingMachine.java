import java.util.Iterator;
import java.util.LinkedList;


public class HotVendingMachine implements VendingMachine, Iterable<Product> {
    private LinkedList<Product> hotWater;

    @Override
    public void putProduct(LinkedList<Product> item) {

    }

    @Override
    public Product getProduct() {
        return null;
    }

    @Override
    public void getProduct(int name, int volume){
        System.out.println("Получен продукт " + name + " по имени и объему " + volume);
    }


    @Override
    public void getProduct(int name, int volume, int temperature) {
        System.out.println("Получен продукт по имени " + name + ", объему " + volume + " и температуре " + temperature);
    }


    public void getProduct(String name, int volume, int temperature) {
        System.out.println("Получен продукт по имени " + name + ", объему " + volume + " и температуре " + temperature);
    }

    @Override
    public Iterator<Product> iterator() {
        return new HotWaterIterator(hotWater);
    }
}
