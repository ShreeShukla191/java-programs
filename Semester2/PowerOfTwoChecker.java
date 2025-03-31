import java.util.Scanner;

public class PowerOfTwoChecker {
    public static boolean isPowerOfTwo(int n) {
        // A number is a power of 2 if it is greater than 0 and has only one bit set in its binary representation.
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a power of 2
        if (isPowerOfTwo(number)) {
            System.out.println(number + " is a power of 2.");
        } else {
            System.out.println(number + " is NOT a power of 2.");
        }

        scanner.close();
    }
}