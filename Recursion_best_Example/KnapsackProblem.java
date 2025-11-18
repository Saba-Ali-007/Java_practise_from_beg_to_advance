public class KnapsackProblem {
    public static int knapsack(int[]weight,int[]value,int capacity,int n){
        if(n==0|| capaacity==0){
            return 0;

        }
        
        int U=n;
        for(int i=1;i<=n;i++){
            if(weight[i]>capacity){
                break

            }
            else{
                int x[i]=1;
                U=U-weight[i];
            }
        }
        if(i<=n){
            xi=U/weight[i];
        }
    }
    
}
