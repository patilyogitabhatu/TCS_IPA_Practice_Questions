/*
 * You are given a string S consisting of lowercase letters. Your task is to remove all the consecutive duplicates from
 * the string and output the result. For example, if the input string is "abbcddeff", the output should be "abcdef".
 * 
 * Input: abbcddeff
 * Output: abcdef
 */
import java.util.*;
public class IPAQ47{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        String result = String.valueOf(str.charAt(0));
        for(int i=0 ; i<str.length() ; i++){
            if(result.charAt(result.length()-1) == str.charAt(i)){
                continue;
            }else{
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}