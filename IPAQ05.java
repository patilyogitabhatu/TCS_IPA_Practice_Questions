/*
 Example : write a program to print the Last character of every word in a string

 Conditions : Ignore all the digits and whitespaces
 Input : Hey3 Java Learners
 Output: as
 */
import java.util.*;
public class IPAQ05 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        String result = "";
        for(int i=0 ; i<str.length(); i++){
            if(Character.isWhitespace(str.charAt(i))){
                if(Character.isLetter(str.charAt(i-1))){
                    result += str.charAt(i-1);
                }
            }    
            if(i == str.length()-1){
                if(Character.isLetter(str.charAt(i))){
                    result += str.charAt(i);
                }
            }
        }
        System.out.println(result);
    }
}
