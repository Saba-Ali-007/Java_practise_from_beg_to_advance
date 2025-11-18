import java.util.Scanner;
public class ROyal{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of Ingeridient");
    int n=sc.nextInt();
    double[] weight=new double[n];
    double totalWeight=0;
    double maxweight=Double.MIN_VALUE;
    for(int i=0;i<n;i++){
        weight[i]=sc.nextDouble();
        totalWeight+=weight[i];
        if(weight[i]>maxweight){
            maxweight=weight[i];
        }
    }
    System.out.println("Total Weight: "+totalWeight);
    System.out.println("Maximum Weight: "+maxweight);
}