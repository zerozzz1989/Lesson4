public class Task10 {
    public static void main(String[] args) {


        OverloadingExample overloadingExample = new OverloadingExample();

        System.out.println(overloadingExample.plus(1, 2));
        System.out.println(overloadingExample.plus(1.0, 2.5));
        System.out.println(overloadingExample.plus(1.98f, 2.5f));
        System.out.println(overloadingExample.plus("First", "second"));
    }

    }


/*
Create a simple class with overloaded methods. Write another class to demonstrate the concept of methods overloading.

Создайте простой класс с перегруженными методами. Напишите еще один класс, чтобы продемонстрировать концепцию перегрузки методов.
 */