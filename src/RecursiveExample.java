public class RecursiveExample {
    public void printNumsToZero(int number) {
        if (number >= 0) {
            System.out.print(number + " ");
            printNumsToZero(number - 1);
        }
    }

}
