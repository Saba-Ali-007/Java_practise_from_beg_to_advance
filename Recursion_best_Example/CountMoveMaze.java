public class CountMoveMaze {
    public static int count(int i,int j , int n, int m) {
        int down=0;
        if(i==n-1 && j==m-1){
            return 1;
        }
        if(i<n-1){
            down=count(i+1,j,n,m);
        }
        int right=0;
        if(j<m-1){
            right=count(i,j+1,n,m);
        }
        return down+right;
    }
    public static void main(String[] args) {
        int n=4,m=4;
        System.out.println(count(0,0,n,m));
    }
}
