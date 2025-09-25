package oops_concept;

public class FindCarries {
    public static int Carry(int n1, int n2) {
        int temp1 = n1;
        int temp2 = n2;
        int count = 0;
        int carry = 0;
        while (temp1 != 0 || temp2 != 0) {
            int d1 = temp1 % 10;
            int d2 = temp2 % 10;
            int sum = d1 + d2 + carry;
            if (sum > 9) {
                count++;
                carry = 1;
            } else {
                carry = 0;
            }
            temp1 = temp1 / 10;
            temp2 = temp2 / 10;
        }
        // Count the final carry if it exists
        if (carry == 1) {
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n1 = 123;
        int n2 = 889;
        System.out.println(Carry(n1, n2)); // Output: 4 (includes final carry)
    }
}