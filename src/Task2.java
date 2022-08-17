
public class Task2 {


    public static class Boxer {
        public int age;
        public int weight;
        public int strength;

        public Boxer(int age, int weight, int strength) {
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Boxer anotherBoxer) {
            //  int incStr = this.strength>anotherBoxer.strength ?1:0;
            //int incStr = this.strength>anotherBoxer.strength ?1:0;
            int incStr = this.strength > anotherBoxer.strength ? 1 : 0;
            return (incStr) > 0;

        }

        public static void main(String[] args) {

        }
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
