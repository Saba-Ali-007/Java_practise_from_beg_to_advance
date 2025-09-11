public class Powern {
    public static int pow(int x,int n){
        if(n==0) return 1;
        int xpown=pow(x,n-1);
        return x*xpown;
    }
    public static void main(String[] args) {
        System.out.println("enter value of x and n");
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(pow(x,n));
    }
    
}
