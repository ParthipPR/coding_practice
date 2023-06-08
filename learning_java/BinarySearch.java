import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[12];

        // Read 12 sorted integers from the user
        System.out.println("Enter 12 sorted integers:");
        for (int i = 0; i < 12; i++) {
            nums[i] = scanner.nextInt();
        }

        // Count the number of occurrences of each integer
        int[] counts = new int[12];
        Arrays.fill(counts, 0);
        for (int i = 0; i < 12; i++) {
            int count = 1;
            for (int j = i + 1; j < 12; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    counts[j] = -1; // Mark the duplicate element
                }
            }
            if (counts[i] != -1) {
                counts[i] = count;
            }
        }

        // Display the number of occurrences of each integer
        System.out.println("Number of occurrences of each integer:");
        for (int i = 0; i < 12; i++) {
            if (counts[i] > 0) {
                System.out.println(nums[i] + " occurs " + counts[i] + " times");
            }
        }

        // Search for a particular element using binary search
        System.out.print("Enter the element to search: ");
        int searchElement = scanner.nextInt();
        int index = Arrays.binarySearch(nums, searchElement);
        if (index >= 0) {
            System.out.println(searchElement + " found at index " + index);
        } else {
            System.out.println(searchElement + " not found");
        }
    }
}
