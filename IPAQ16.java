/*
Example :   Write main method in Solution class.
            In the main method, read a String value and print the count of lower case characters
            present int the input string value. if no lowere case characters are present in the string
            value then it should print "No lower case Character present" as a String.

Sample input1: XpLore
output: 4

Sample input2: XPLORE
output : No lower case character present
 */
import java.util.*;
public class IPAQ16 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        findLowercase(str);
    }
    public static void findLowercase(String str){
        int low = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(Character.isLowerCase(c)){
                low +=1;
            }   
        }
        if(low>0){
            System.out.println(low);
        }else{
            System.out.println("No lower case character present");
        }
    }
    // public static void findLowercase(String str){
    //     int low = 0;
    //     for(int i =0 ;i<str.length();i++){
    //         char c = str.charAt(i);
    //         if(c >='a' && c <= 'z'){
    //             low +=1;
    //         }
    //     }
    //     if(low>0){
    //         System.out.println(low);
    //     }else{
    //         System.out.println("No lower case character present");
    //     }
    // }

}
