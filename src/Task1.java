public class Task1 {
    public static void main(String[] args) {
        Human den = new Human(); // создаэмо обьэкт
        // данні які ми присвоюємо
        den.weight = 50;
        den.age = 33;
        den.firstName = "Anna";
        den.lastName = "Ale";
        den.height = 150;
        den.displayInfo();

        den.weight = 75;
        den.age = 33;
        den.firstName = "Den";
        den.lastName = "Ale";
        den.height = 180;
        den.displayInfo();
    }
}
class Human{
    int weight; // вага
    int age;        // вік
    String firstName;    // ім'я
    String lastName;    // прізвище
    int height; //зріст
    void displayInfo(){
        System.out.printf("\tHumans: \n\tWeight: %s\n \tAge: %d \n \tFirst Name: %s \n \tLast Name: %s \n \tHeight: %s \n ", weight, age, firstName, lastName, height);
    }
}

/*
Create a class "Human". A human should have the following attributes: weight, age, first name, last name, height.
Створити клас «Людина». Людина повинна мати такі атрибути: вага, вік, ім'я, прізвище, зріст.

Requirements:
a) Create a class Human with all the required fields to store the information (variable types you could choose by yourself).
Створіть клас Human з усіма необхідними полями для зберігання інформації (типи змінних ви можете вибрати самостійно).
b) Add to the class a constructor with parameters which initialize all the fields.
Додайте до класу конструктор з параметрами, які ініціалізують усі поля.

 */