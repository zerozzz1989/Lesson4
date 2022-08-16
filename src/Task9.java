//OK

public class Task9 {
    public static void main(String[] args) {
        int val = calcSum(1, -1);           //дано а і б
        System.out.println(val);
    }

    static int calcSum(int a, int b) {
        //якщо а + б в сумі дають 0 (if (sum == 0)) то підставляються інщі значення а і б
        int sum = a + b;
        if (sum == 0) {
            sum = calcSum(1, 9);
        }
        return sum;
    }
}

/*
Write your own example of the recursive function. You can find a lot of examples on the Internet.

Напишіть власний приклад рекурсивної функції. В Інтернеті можна знайти багато прикладів.
 */

