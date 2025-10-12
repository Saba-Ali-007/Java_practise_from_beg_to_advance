public class SubstringMatcher {
   /*  public static void findSubstring(String str, String sub) {
        int strLength = str.length();
        int subLength = sub.length();

        for (int i = 0; i <= strLength - subLength; i++) {
            int j;
            for (j = 0; j < subLength; j++) {
                if (str.charAt(i + j) != sub.charAt(j)) {
                    break;
                }
            }
            if (j == subLength) {
                System.out.println("Substring found at index: " + i);
            }
        }
    }*/
public static void find(String s,String  pattern){
  int index = s.indexOf(pattern);
    if(index!=-1){
        System.out.println("pattern found at index"+index);
    }
    else{
        System.out.println("not found");
    }
}

    public static void main(String[] args) {
        String  s="sabaalikhan";
        String pattern="khan";
        find(s, pattern);
    }
    
}
