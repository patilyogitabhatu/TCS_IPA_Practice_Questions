
//a2b3c1 = aabbbc
import java.util.*;
public class IPAQ52 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String result="";
        for(int i=1 ; i< str.length() ;i = i+2){
            int n= Integer.parseInt(String.valueOf(str.charAt(i)));
            char c = str.charAt(i-1);

            for(int j=0 ; j<n ; j++){
                result +=c;
            }
        }
        System.out.println(result);
        
    }
}
