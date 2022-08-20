
public class Task3 {
    public static void main(String[] args) {
        GasStation gasStation = new GasStation();
        Car car = new Car("Nissan X3");

        System.out.println("Car object before gas station -> " + car);
        gasStation.fillFuelToTheCar(car, "sport", 25);
        System.out.println("Car object after gas station -> " + car);
    }

}

        /*
Create 3 different classes to demonstrate the relationships "has-a" and "uses-a". They can be anything you want.
For example: Car - Engine - Wheels
Створіть 3 різні класи, щоб продемонструвати зв’язки «has-a» і «uses-a». Вони можуть бути як завгодно.
Наприклад: автомобіль – двигун – колеса

Dependency(uses-a)
Aggregation(has-a)
Inheritance


         */