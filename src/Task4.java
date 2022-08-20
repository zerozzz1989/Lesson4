public class Task4 {
    public static void main(String[] args) {
        StaticCalculator staticCalculatorPlus = new StaticCalculator(25.5656, 10.0, "+");
        StaticCalculator staticCalculatorMinus = new StaticCalculator(100.455, 40.0, "-");
        StaticCalculator staticCalculatorMultiply = new StaticCalculator(5.55, 2.0, "*");
        StaticCalculator staticCalculatorDivide = new StaticCalculator(1004.0, 10.0, "/");
        StaticCalculator staticCalculatorDivideByZero = new StaticCalculator(1004.0, 0.0, "/");
        StaticCalculator defaultStaticCalculator = new StaticCalculator();

        System.out.println(staticCalculatorPlus.calculate());
        System.out.println(staticCalculatorMinus.calculate());
        System.out.println(staticCalculatorMultiply.calculate());
        System.out.println(staticCalculatorDivide.calculate());
        System.out.println(staticCalculatorDivideByZero.calculate());
        System.out.println(defaultStaticCalculator.calculate());
    }


}

/*
Create a class StaticCalculator. It should have three fields: double firstValue, double secondValue and String operation.
Create all required constructors to properly initialize your object.
Consider the case when user does not provide any parameters when creates a new object.
Write a method "calculate" that takes these two values and return the result of the calculation according to the operation.
Write the test class which contains the main method.
In this main method you should create your StaticCalculator object and do some calculation to test your code,
by calling your "calculate" method.
Print all results to the console.

Створіть клас StaticCalculator. Він повинен мати три поля: double firstValue, double secondValue і операцію String.
Створіть усі необхідні конструктори для належної ініціалізації вашого об’єкта.
Розглянемо випадок, коли користувач не надає жодних параметрів під час створення нового об’єкта.
Напишіть метод "calculate", який приймає ці два значення та повертає результат обчислення відповідно до операції.
Напишіть тестовий клас, який містить основний метод.
У цьому основному методі ви повинні створити свій об’єкт StaticCalculator і виконати деякі обчислення, щоб перевірити свій код,
за допомогою виклику вашого методу "calculate".
Вивести всі результати на консоль.
 */