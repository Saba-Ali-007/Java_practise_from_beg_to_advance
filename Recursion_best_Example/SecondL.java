public class SecondL {
    public static int secondLargest(int arr[]){
int largest=Integer.MIN_VALUE;
int second=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++){
int num=arr[i];
if(num>largest){
second=largest;
largest=num;
}
else if(num>second && num!=largest){
second=num;
}
}
return second;
}
public static void main(String[] args){
int arr[]={8,45,5,6,74};
int result=secondLargest(arr);
System.out.println("second largest number is:=" + result);
}
}
