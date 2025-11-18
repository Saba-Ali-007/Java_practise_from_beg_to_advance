public class Max_min{
    public static void  max_min(int arr[],int initindex,int max,int min){
        if(arr.length==initindex){
            System.out.println("max"+max);
            System.out.println("min"+min);
            return;
        }
       if(arr.length==2){
        if(arr[0]>arr[1]){
            max=arr[0];
            min=arr[1];
        }else{
            max=arr[1];
            min=arr[0];
        }
        System.out.println("max"+max);
        System.out.println("min"+min);
        return;
       }
       if(arr.length>2){
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
           if(arr[initindex]>max){
               max=arr[initindex];
           }
           if(arr[initindex]<min){
               min=arr[initindex];
           }
           max_min(arr,initindex+1,max,min);
       }
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8,9};
        max_min(arr,0,arr[0],arr[0]);
        
        return;


    }
}