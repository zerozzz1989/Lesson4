


public class Boxer {

    public int age;
    public int weight;
    public int strength;

    public Boxer(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public static void main(String[] args) {
        Boxer ourBoxer = new Boxer(23, 90, 10);
        Boxer anotherBoxer = new Boxer(25, 75, 11);
        Boxer anotherBoxer2 = new Boxer(22, 100, 11);

        System.out.println("Is our boxer won anotherBoxer? -> " + ourBoxer.fight(anotherBoxer));
        System.out.println("Is our boxer won anotherBoxer2? -> " + ourBoxer.fight(anotherBoxer2));
    }

    public boolean fight(Boxer anotherBoxer) {
        byte scoreOurBoxer = 0;
        byte scoreAnotherBoxer = 0;

        if (this.age > anotherBoxer.age) {
            scoreAnotherBoxer++;
        } else {
            scoreOurBoxer++;
        }

        if (this.weight > anotherBoxer.weight) {
            scoreOurBoxer++;
        } else {
            scoreAnotherBoxer++;
        }

        if (this.strength > anotherBoxer.strength) {
            scoreOurBoxer++;
        } else {
            scoreAnotherBoxer++;
        }

        return scoreOurBoxer > scoreAnotherBoxer;
    }

}

/*
Implement the method fight() depending on weight, strength and age of the boxer:
реалізувати метод fight() залежно від ваги, сили та віку боксера:
You should write the dependency by yourself. The method should return true or false if our boxer won or lost.
Ви повинні самостійно написати залежність. Метод повинен повертати true або false, якщо наш боксер виграв або програв.

public class Boxer {
    public int age;
    public int weight;
    public int strength;

    public Boxer(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Boxer anotherBoxer) {
        // write your code here
    }

    public static void main(String[] args) {

    }
}
Requirements:
a) if ourBoxer.fight(anotherBoxer) returns true, then anotherBoxer.fight(outBoxer) should return false;
a) якщо ourBoxer.fight(anotherBoxer) повертає true, тоді anotherBoxer.fight(outBoxer) має повертати false;

    */
