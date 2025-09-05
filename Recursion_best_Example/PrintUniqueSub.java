import java.util.Scanner;
import java.util.HashSet;

public class PrintUniqueSub {
    public static void sub(String str, int indx, String newString, HashSet<String> set) {
        if (indx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                set.add(newString);
                System.out.println(newString);
                return;
            }
        }
        char current = str.charAt(indx);
        sub(str, indx + 1, newString + current, set); // Include current character
        sub(str, indx + 1, newString, set);           // Exclude current character
    }

    public static void main(String[] args) {
        System.out.println("Enter the string:");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        HashSet<String> set = new HashSet<>();
        sub(str, 0, "", set); // Start with empty string
    }
}