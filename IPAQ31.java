// Find the first non repeated character substring
//Arijit = Arij
import java.util.*;
public class IPAQ31{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        String ans = "";
        for(int i=0 ; i<str.length() ; i++){
            boolean flag = true;
            for(int j=0 ; j<str.length() ; j++){
                if(i!=j && str.charAt(i)==str.charAt(j)){
                    flag = false;
                }
            }
            if(flag){
                ans +=str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}