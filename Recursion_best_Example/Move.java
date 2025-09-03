// Move a user defined Character at the end of string

public class Move {
    public static void moveCharToEnd(String str, int indx, String newString, int count) {
        if (indx == str.length()) {
            // Append all 'x' at the end
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char current = str.charAt(indx);
        if (current == 'x') {
            count++;
        } else {
            newString += current;
        }
        moveCharToEnd(str, indx + 1, newString, count);
    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        moveCharToEnd(str, 0, "", 0);
    }
}