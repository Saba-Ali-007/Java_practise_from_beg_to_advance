public class Problem2 {
    //Write a program to toggle a bit a position = “pos” in a number “n”.
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Enter the position:");
        int pos = sc.nextInt();
        
        // Toggle bit at position pos
        int toggleBit = 1 << pos;
        n ^= toggleBit; // XOR operation to toggle the bit
        
        System.out.println("Updated number after toggling bit: " + n);
    }
    
}
