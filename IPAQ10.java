/*
 Example : find the largest word from a sentence.
 if two string have same length then print the first one

 Input : TCS is the best Campany ever
 Output : Company
 */
import java.util.*;
public class IPAQ10 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        String[] temp = str.split(" ");
        int maxlength = 0;
        String maxWord = "";
        for(int i=0 ; i< temp.length ; i++){
            int len = temp[i].length();
            if(len > maxlength){
                maxlength = len;
                maxWord = temp[i];
            }
        }
        System.out.println(maxWord);
    }
}
