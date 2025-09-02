package Recursion_best_Example;

import java.util.Scanner;

// find the first and the last occurance of element in a String

public class Occur {
    public static int first = -1;
    public static int last = -1;
    public static void find(String str,int indx,int element){
        if(indx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char current=str.charAt(indx);
        if(current==element){
            if(first==-1){
                first=indx;
            }
            else{
                last=indx;
            }
        }
        find(str, indx+1, element);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char element;
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        System.out.println("Enter the character to find:");
        element=sc.next().charAt(0);
        find(str,0,element);
    }
    
    
}
