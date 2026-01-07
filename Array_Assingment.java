
import java.util.Scanner;

public class Array_Assingment {
    // Q1-> count how many times lowercase vowels occurred in a String entered by the user.
    public static int  check_vowel(String str){
       int count=0;
       for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(ch=='a'||ch=='i'||ch=='o'||ch=='u'||ch=='e'){
            count++;
        }
       }
       return count;
    }
    public static boolean  check_anagram(String str1,String str2){
        if(str1.length()==str2.length()){
            return false;
        }
        for(int i=0;i<str1.length();i++){
            int count=0;
            for(int j=0;j<str1.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    count++;
                }
               
            }
             if(count!=1){
                    return false;
                }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1="race";
        String str2="cfare";
        System.out.println( check_anagram(str1, str2));

    }
    
}
