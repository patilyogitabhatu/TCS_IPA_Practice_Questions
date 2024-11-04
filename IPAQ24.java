/* Count number of vowel, consonent and digit into a string 
Input : hello my name is yogita 1234 5hn
Output : Vowels: 8   consonent: 13  digits: 5
*/

import java.util.*;
public class IPAQ24{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int v =0 ,c = 0 , d = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                if(vowels.contains(String.valueOf(ch))){
                    v +=1;
                }else{
                    c +=1;
                }
            }else if(Character.isDigit(ch)){
                d +=1;
            }
        }
        System.out.printf("Vowels: %d   consonent: %d  digits: %d",v,c,d);
    }
}