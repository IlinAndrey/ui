public class Main {

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void printArray(int[] array) {
        System.out.print("Array elements: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        greet("World");

        int sum = add(5, 7);
        System.out.println("Sum of 5 and 7 is: " + sum);

        int[] numbers = {1, 2, 3, 4, 5};
        printArray(numbers);
    }
}
