public class HotWater {
    private String name;
    private double temperature;
    private double price;
    private double volume;

    public HotWater(String name, double temperature, double price, double volume) {
        this.name = name;
        this.temperature = temperature;
        this.price = price;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "HotWater{" +
                "name='" + name + '\'' +
                ", temperature=" + temperature +
                ", price=" + price +
                ", volume=" + volume +
                '}';
    }
}
