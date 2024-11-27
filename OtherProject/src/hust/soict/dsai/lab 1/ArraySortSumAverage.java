import java.util.Arrays;
import java.util.Scanner;

public class ArraySortSumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create the array
        double[] array = new double[size];

        // Prompt the user to enter array elements
        System.out.println("Enter " + size + " numeric values:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }

        // Sort the array
        Arrays.sort(array);

        // Calculate the sum and average
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        double average = sum / size;

        // Display results
        System.out.println("Sorted Array: " + Arrays.toString(array));
        System.out.printf("Sum: %.2f%n", sum);
        System.out.printf("Average: %.2f%n", average);

        scanner.close();
    }
}
