import java.util.Scanner;
//Write a program to find if a number is a power of 2 or not.

public class Problem {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number you want to  check power of 2 or not:");
       int n=sc.nextInt();
       if(n>0 &&(n &(n-1))==0){
        System.out.println(n + " is a power of 2");
       }
       else{
        System.out.println(n + " is not a power of 2");
       }
    
    }
}
