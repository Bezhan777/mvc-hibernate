package web.model;


public class Car {
    private String model;
    private int vin;
    private String color;

    public Car(String model, int vin, String color) {
        this.model = model;
        this.vin = vin;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getVin() {
        return vin;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "web.model='" + model + '\'' +
                ", vin=" + vin +
                ", color='" + color + '\'' +
                '}';
    }
}