import java.util.Scanner;

public class Bitmanipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Enter the position:");
        int pos = sc.nextInt();
// example of get bit
        int bit = 1 << pos;
        if ((n & bit) == 0) {
            System.out.println("Bit is OFF");
        } else {
            System.out.println("Bit is ON");
        }
        // example of set bit:-0->1 and 1->1
        int setBit = 1 << pos;
        n |= setBit;
        System.out.println("Updated number after setting bit: " + n);
        // clear bit 0->0 and 1->1
        int clearBit = 1 << pos;
        n &= ~clearBit;
        System.out.println("Updated number after clearing bit: " + n);
        //update bit
        // first for 0
        int updateBit0 = 1 << pos;
        n &= ~updateBit0;
        System.out.println("Updated number after setting bit to 0: " + n);
        // then for 1
        int updateBit1 = 1 << pos;
        n |= updateBit1;
        System.out.println("Updated number after setting bit to 1: " + n);
    }
}