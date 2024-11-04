/* Find largest word from a given sentence
 * 
 Input: He is so funny boy
 Output: funny
 */
import java.util.*;
public class IPAQ35{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        String[] ch = str.split(" ");
        String max = "";
        for(int i=0 ; i<ch.length ; i++){
            if(max.length() < ch[i].length()){
                max = ch[i];
            }
        }
        System.out.println(max);
    }
}