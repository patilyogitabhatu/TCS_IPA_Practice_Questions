// aabbbcc = a2b3c2
// abbccc = a1b2c3
import java.util.*;
public class IPAQ19{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        StringBuilder result = new StringBuilder();

        char ch = str.charAt(0);
        int count = 1;
        for(int i = 1 ; i<str.length() ; i++){
            if(ch == str.charAt(i)){
                count +=1;
            }else{
                result.append(ch).append(count);
                count = 1;
                ch = str.charAt(i);
            }
        }
        result.append(ch).append(count);
        System.out.println(result.toString());
        
        
        
    }
}