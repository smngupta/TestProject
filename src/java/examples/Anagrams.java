import java.util.Arrays;
import java.util.Scanner;
/**
  Anagram Example.
  @author Suman Gupta
*/
class Anagrams {
    public static boolean anagramExample(String str1,String str2){
        if (str1.length()!= str2.length()){
            return false;
        }
            else{
                char[] array1=str1.toLowerCase().toCharArray();
                char[] array2=str2.toLowerCase().toCharArray();
                Arrays.sort(array1);
                Arrays.sort(array2);
                return Arrays.equals(array1,array2);
            
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String l=sc.next();
        String l2=sc.next();
        System.out.println(Anagrams.anagramExample(l,l2));
    }
}
