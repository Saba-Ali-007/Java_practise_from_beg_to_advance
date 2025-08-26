import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("You entered: " + str);
        String str2 = sc.nextLine();
        System.out.println("You entered: " + str2);

        // Print each character of str
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        // Print str in reverse
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();

        // Print each character of str2
        for (int i = 0; i < str2.length(); i++) {
            System.out.println(str2.charAt(i));
        }

        // Compare str and str2
        if (str.compareTo(str2) > 0) {
            System.out.println("str is greater than str2");
        } else if (str.compareTo(str2) < 0) {
            System.out.println("str is less than str2");
        } else {
            System.out.println("str is equal to str2");
        }
    }
}