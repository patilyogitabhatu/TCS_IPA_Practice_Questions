/* Marge two strings using comma

Input: 
Arijit,Ghosh
Pop:Mom

Output:
Arijit, Ghosh, Pop:Mom
*/
import java.util.*;
public class IPAQ38{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();

        String s3 = s1+" "+s2;
        String ans = "";
        for(int i=0 ; i<s3.length();i++){
            if(Character.isLetter((s3.charAt(i)))){
                ans += s3.charAt(i);
            }
            if(s3.charAt(i)==','){
                ans +=", ";
            }else if(s3.charAt(i) == ' '){
                ans+=","+s3.charAt(i);
            }
        }
        System.out.println(ans);
    }
}