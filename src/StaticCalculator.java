public class StaticCalculator {
    double firstValue = 1.0;
    double secondValue = 1.0;
    String operation = "+";

    public StaticCalculator() {
        System.out.println("You create StaticCalculator without params, set default values of fields:\n" +
                "firstValue = 1.0, secondValue = 1.0, operation = \"+\"\n");
    }

    public StaticCalculator(double firstValue, double secondValue, String operation) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.operation = operation;
    }

    public double calculate() {
        switch (operation) {
            case "+":
                return firstValue + secondValue;
            case "-":
                return firstValue - secondValue;
            case "*":
                return firstValue * secondValue;
            case "/":
                if (secondValue == 0) {
                    System.out.println("Can`t divide by zero!");
                    return 0;
                }
                return firstValue / secondValue;
        }

        System.out.println("Your operation is inappropriate! Please enter one of: +, -, *, /");
        return 0;
    }
}