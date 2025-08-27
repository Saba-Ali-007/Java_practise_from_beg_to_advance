import java.util.Scanner;

public class Strbuilder {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    public void readInput() {
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sb.append(input);
    }

    public void displayOutput() {
        System.out.println("You entered: " + sb.toString());
        System.out.println("Length of the string: " + sb.length());
        System.out.println("Inserting '***' at position 5");
        sb.insert(5, "***");
        sb.setCharAt(0,'F');
        System.out.println("Modified string: " + sb.toString());
        System.out.println("First character: " );
         sb.charAt(0);
         
    }

    public static void main(String[] args) {
        Strbuilder strbuilder = new Strbuilder();
        strbuilder.readInput();
        strbuilder.displayOutput();
    }

}
