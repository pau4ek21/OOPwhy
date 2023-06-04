import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

//        WaterVindingMaschine wvm = new WaterVindingMaschine();
//        Product bonAqua = new Water("bonAqua", 50);
//        Product redKey = new Water("redKey", 60);
//        LinkedList<Product> l = new LinkedList<>();
//        l.add(bonAqua);
//        l.add(redKey);
//        wvm.putProduct(l);
//
//        System.out.println(wvm.getProduct());
//        System.out.println(wvm.getProduct());
        HotWater hw1 = new HotWater(5);
        HotWater hw2 = new HotWater(10);

        System.out.println(hw1);
        System.out.println(hw2);

        HotVendingMachine hvm = new HotVendingMachine();
        hvm.getProduct(1, 200);
        hvm.getProduct(2, 300, 80);
    }
}