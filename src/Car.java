public class Car {

    String model;
    int fuelLiters = 0;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", fuelLiters=" + fuelLiters +
                '}';
    }
}

