public class HotWater {
    private int temperature;

    public HotWater(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotWater{" +
                "temperature=" + temperature +
                '}';
    }
}
