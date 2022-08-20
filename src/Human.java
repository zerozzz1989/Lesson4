public class Human {

    private final int weight;
    private final int age;
    private final int height;
    private final String firstname;
    private final String lastname;

    public Human(int weight, int age, int height, String firstname, String lastname) {
        this.weight = weight;
        this.age = age;
        this.height = height;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Human{" +
                "weight=" + weight +
                ", age=" + age +
                ", height=" + height +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}