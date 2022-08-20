public class GasStation {
    private final Fuel[] fuels = {
            new Fuel("Simple", 50),
            new Fuel("Simple+", 100),
            new Fuel("Sport", 150)
    };

    public void fillFuelToTheCar(Car car, String nameOfFuel, int countOfLitres) {
        for (Fuel fuel : fuels) {
            if (fuel.type.equalsIgnoreCase(nameOfFuel)) {
                car.fuelLiters = car.fuelLiters + countOfLitres;
                System.out.println("Filled fuel to your car it costs: "
                        + fuel.price * countOfLitres
                        + ", type of fues: " + fuel.type);
                return;
            }
        }

        System.out.println("Fuel not found in gas station!");
    }

}

