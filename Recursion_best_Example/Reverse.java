package Recursion_best_Example;

import java.util.Scanner;

public class Reverse {
    public String reverse(String str, int indx) {
        if (indx == 0) {
            return str.charAt(indx) + "";
        }
        return str.charAt(indx) + reverse(str, indx - 1);
    }

    public static void main(String[] args) {
        Reverse r = new Reverse();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        String result = r.reverse(input, input.length() - 1);
        System.out.println("Reversed string: " + result);
    }
}