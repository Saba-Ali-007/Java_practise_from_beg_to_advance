import java.util.Scanner;


public class BubbleSort {
    int print(int [] arr, int n){
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    return 0;
}
    public static void main(String[] args) {
    int n;
    int [] arr=new int [10];
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    n = sc.nextInt();
    for(int i=0; i<n; i++) {
        System.out.print("Enter element " + (i+1) + ": ");
        arr[i] = sc.nextInt();
    }
    System.out.println("sorting the element using BBubble sort at time complexity (n^2)");
 for( int i=0;i<n-1;i++){
    for(int j=0;j<n-i-1;j++){
        if(arr[j]>arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
    }
}
    System.out.println("Sorted array elements are:");
    BubbleSort b=new BubbleSort();
    b.print(arr,n);
}
}


