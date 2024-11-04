/* Input : Home, Sweet Home
           Home
 * Output : Number of that word present in the sentence : 2
 * 
 * Process
 * ----------
 * The word Home present in the sentence 2 times
 */
import java.util.*;
public class IPAQ29{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String match = s.nextLine();

        int count = 0;
        String arr[] = str.split(" ");
        String ch = "";
        for(int i = 0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length() ; j++ ){
                if(Character.isLetter(arr[i].charAt(j))){
                    ch += arr[i].charAt(j);
                }
            }
            if(ch.equals(match)){
                count +=1;
            }
            ch="";
        }
        System.out.println("Number of that word present in the sentence : "+count);
    }
}