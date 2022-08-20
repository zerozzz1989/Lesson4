public class Rocket {
    static {
        System.out.println("Rocket class is init");
    }

    int speedOfFlight;
    int countOfStages;
    String name;

    {
        System.out.println("Default values of Rocket object is init");
        speedOfFlight = 15000;
        countOfStages = 3;
        name = "Unicorn A07";
    }

    public Rocket() {
        System.out.println("Empty constructor called");
    }

    public Rocket(int speedOfFlight, int countOfStages, String name) {
        System.out.println("Parameter constructor called");
        this.speedOfFlight = speedOfFlight;
        this.countOfStages = countOfStages;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "speedOfFlight=" + speedOfFlight +
                ", countOfStages=" + countOfStages +
                ", name='" + name + '\'' +
                '}';
    }
}
