import java.util.Scanner;

public class Permutation {
    public static void permute(String a[],int i,int n){
        int j;
        if(i==n){
            System.out.println(String.join(" ", a));
        }
        else{
            for(j=i;j<n;j++){
                String temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                permute(a,i+1,n);
                a[j]=a[i];
                a[i]=temp;                                              
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the string:");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();        
        String a[]=str.split("");
        int n=a.length;
        permute(a,0,n); 
    }
    
}
