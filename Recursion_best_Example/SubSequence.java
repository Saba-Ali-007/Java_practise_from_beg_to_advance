import java.util.Scanner;
class SubSequence{
public static void sub(String str,int indx, String newString){
if(indx==str.length()){
System.out.println(newString);
return;
}
char current=str.charAt(indx);,
sub(str,indx+1,newString+current);
sub(str,indx+1,newString);
}

public static void main(String []args){
System.out.println("enter the the string");
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
sub(str,0," ");
return;
}
}


