public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        
        // Post-increment
        System.out.println("Post-increment (a++): " + (a++)); // Prints 10, then a becomes 11
        System.out.println("Value of a after post-increment: " + a);
        
        // Pre-increment
        System.out.println("Pre-increment (++a): " + (++a)); // Increments first, then prints 12
        
        // Post-decrement
        System.out.println("Post-decrement (b--): " + (b--)); // Prints 10, then b becomes 9
        System.out.println("Value of b after post-decrement: " + b);
        
        // Pre-decrement
        System.out.println("Pre-decrement (--b): " + (--b)); // Decrements first, then prints 8
    }
}