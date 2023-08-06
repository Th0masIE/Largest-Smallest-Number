import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome statement
        System.out.println("Welcome to the Largest and Smallest Number Finder!");

        // User input for array size
        System.out.print("To begin, how many numbers do you want in your list? Please enter the amount: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter your list of numbers below, and let's find the largest and smallest ones:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Find the largest and smallest numbers
        int largestNumber = findLargestNumber(numbers);
        int smallestNumber = findSmallestNumber(numbers);

        if (largestNumber != Integer.MIN_VALUE && smallestNumber != Integer.MAX_VALUE) {
            // Output the largest and smallest numbers
            System.out.println("Largest number: " + largestNumber);
            System.out.println("Smallest number: " + smallestNumber);

            // Sort the array and display sorted result
            sortArray(numbers);
            System.out.print("Your list in ascending order:");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        } else {
            System.out.println("The array is empty.");
        }

        // Thank-you message
        System.out.println("Thank you for using the Largest and Smallest Number Finder!");

        scanner.close();
    }

    // Method to find the largest number in an array
    public static int findLargestNumber(int[] numbers) {
        // Check for an empty array
        if (numbers.length == 0) {
            return Integer.MIN_VALUE; // Return a flag value to indicate an empty array
        }

        int largestNumber = numbers[0];

        for (int number : numbers) {
            if (number > largestNumber) {
                largestNumber = number;
            }
        }

        return largestNumber;
    }

    // Method to find the smallest number in an array
    public static int findSmallestNumber(int[] numbers) {
        // Check for an empty array
        if (numbers.length == 0) {
            return Integer.MAX_VALUE; // Return a flag value to indicate an empty array
        }

        int smallestNumber = numbers[0];

        for (int number : numbers) {
            if (number < smallestNumber) {
                smallestNumber = number;
            }
        }

        return smallestNumber;
    }

    // Method to sort the array in ascending order using Bubble Sort
    public static void sortArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
