// MOve a user defined Character at thr end of string

public class Move {
    public static String moveCharToEnd(String str, char ch) {
        if (str.isEmpty()) {
            return "";
        }
        char first = str.charAt(0);
        String rest = str.substring(1);
        if (first == ch) {
            return moveCharToEnd(rest, ch) + first;
        } else {
            return first + moveCharToEnd(rest, ch);
        }
    }

    public static void main(String[] args) {
        String str = "abacadaeaf";
        char ch = 'a';
        String result = moveCharToEnd(str, ch);
        System.out.println(result);
    }
}
