import java.util.ArrayList;

public class Decord {
    public static String cord(int n, int num) {
        String str = "";
        int q = num / n;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(num % n);
        while (q != 0) {
            list.add(q % n);
            q = q / n;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 9) {
                str = (char)(list.get(i) - 9 + 64) + str;
            } else {
                str = list.get(i) + str;
            }
        }
        System.out.println(list);
        return str;
    }

    public static void main(String[] args) {
        int n = 21;
        int num = 5678;
        System.out.println(cord(n, num));
    }
}