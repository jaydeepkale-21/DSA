
import java.lang.classfile.constantpool.IntegerEntry;

public class predfineFunction {
    public static  void find_largest_str(String str[]){
          String largest=str[0];
        for(int i=1;i<str.length;i++){
            if(largest.compareTo(str[i])<0){
                largest=str[i];
            }
        }
        System.out.println("Largest string are: "+largest);
    }

    // Covert Sentence into uppercase
    public static String uppercase_sentece(String str){
       StringBuilder sb=new StringBuilder("");
       char ch=Character.toUpperCase(str.charAt(0));
       sb.append(ch);
       for(int i=1;i<str.length();i++){
        if(str.charAt(i)== ' ' && i<str.length()-1){
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        }
        else{
            sb.append(str.charAt(i));
        }
       }
       return sb.toString();
    }
    public static String Compress_str(String str){
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);
            }
        }
    
        return sb.toString();
    }

    
    public static void main(String[] args) {
        String str="aaabbbccc";
        System.out.println(Compress_str(str));
    }
    
}
