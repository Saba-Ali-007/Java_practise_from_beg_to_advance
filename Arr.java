import java.util.*;
import java.util.Scanner;
class Arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int num[]=new int[size];
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        boolean isAsc=true;
        for(int i=0;i<size-1;i++){
            if(num[i]>num[i+1]){
                isAsc=false;
                break;
            }
        }
        if(isAsc){
            System.out.println("Array is sorted in ascending order");
        }else{
            System.out.println("Array is not sorted in ascending order");
        }
        // make it sorted
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(num[i]>num[j]){
                    int temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        System.out.println("Array after sorting:");
        for(int i=0;i<size;i++){
            System.out.print(num[i]+" ");
        }   
    }
}