//Count Characters in String
//Count the number of occurrences of each character in a string

import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
               Scanner sc=new Scanner(System.in);
        String str =new String();
        str = sc.nextLine();
        System.out.println("Enter a string:");
        int[] charCount = new int[256]; // Assuming ASCII character set
 
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        // Display character counts
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 0) {
                System.out.println((char) i + ": " + charCount[i]);
            }
            
        }
    }
}
