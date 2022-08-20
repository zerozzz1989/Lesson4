public class Task5 {
    public static void main(String[] args) {
        BunchOfConstructorsExample example1 = new BunchOfConstructorsExample(11);
        BunchOfConstructorsExample example2 = new BunchOfConstructorsExample(10, "Example 2");
        BunchOfConstructorsExample example3 = new BunchOfConstructorsExample(11, false, "Example 3");

        System.out.println(example1);
        System.out.println(example2);
        System.out.println(example3);
    }
}

/*
Create a simple class with a bunch of constructors.
All these constructors should take different number of parameters.
Demonstrate in your class, how we can call one constructor from another.

Створіть простий клас із купою конструкторів.
Усі ці конструктори повинні приймати різну кількість параметрів.
Продемонструйте у своєму класі, як ми можемо викликати один конструктор з іншого.

 */