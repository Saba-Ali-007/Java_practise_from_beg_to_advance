import java.util.Scanner;

public class RemoveDuplicate {
    public static boolean[] arr = new boolean[26];
    public static void remove(String str, int indx, String newString) {
        if (indx == str.length()) {
            System.out.println(newString);
            return;
        }
        char CurrentChar = str.charAt(indx); 
        if (arr[CurrentChar - 'a']) {
            remove(str, indx + 1, newString);
        } else {
            newString += CurrentChar;
            arr[CurrentChar - 'a'] = true;
            remove(str, indx + 1, newString);
        }
    }
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        // Reset arr for each run
        arr = new boolean[26];
        remove(str, 0, "");
    }
}