package Recursion_best_Example;
// find the array the or check the is Strictly increasingim
import java.util.Scanner;

public class Strictly {
    public static boolean check(int arr[],int indx){
        if(indx==arr.length-1){
            return true;
        }
        if(arr[indx]>=arr[indx+1]){
            return false;
        }
        else{
            return arr[indx]<arr[indx+1] && check(arr, indx+1);
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 elements of array:");
        int n = 10;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        String result = check(arr, 0) ? "Yes Sorted" : "No Sorted";
        System.out.println(result);
    }
    
}
