public class BunchOfConstructorsExample {
    int number;
    boolean isEvenNumber;
    String nameOfObject;

    public BunchOfConstructorsExample(int number) {
        this(number, "Default name");
    }

    public BunchOfConstructorsExample(int number, String nameOfObject) {
        this(number, number % 2 == 0, nameOfObject);
    }

    public BunchOfConstructorsExample(int number, boolean isEvenNumber, String nameOfObject) {
        this.number = number;
        this.isEvenNumber = isEvenNumber;
        this.nameOfObject = nameOfObject;
    }

    @Override
    public String toString() {
        return "BunchOfConstructorsExample{" +
                "number=" + number +
                ", isEvenNumber=" + isEvenNumber +
                ", nameOfObject='" + nameOfObject + '\'' +
                '}';
    }

}