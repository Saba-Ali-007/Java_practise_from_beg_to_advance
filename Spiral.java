import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {
        int n,m;
        int[][] arr=new int[20][20];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        n=sc.nextInt();
        System.out.println("Enter the number of columns:");
        m=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
                //System.out.print( arr[i][j] + " " );
            }
            System.out.println();
        }
        int startRow=0;
        int startcol=0;
        int endRow=n-1;
        int endcol=m-1;
        while(startRow<=endRow && startcol<=endcol){
            //top row
            for(int i=startcol;i<=endcol;i++){
                System.out.print(arr[startRow][i] + " ");
            }
            startRow++;
            //right column
            for(int i=startRow;i<=endRow;i++){
                System.out.print(arr[i][endcol] + " ");
            }
            endcol--;
            //bottom row
            if(startRow<=endRow){
                for(int i=endcol;i>=startcol;i--){
                    System.out.print(arr[endRow][i] + " ");
                }
                endRow--;
            }
            //left column
            if(startcol<=endcol){
                for(int i=endRow;i>=startRow;i--){
                    System.out.print(arr[i][startcol] + " ");
                }
                startcol++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print( arr[i][j] + " " );
            }
            System.out.println();
        }

    }
    
}
