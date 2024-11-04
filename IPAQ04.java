/*
 *Example : Write a program to compute the number of spaces and characters in string.
 Input : Hi I am a Student
 Output : 4 13
 */
import java.util.*;
public class IPAQ04{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        countSpaceWords(str);        
    }
    public static void countSpaceWords(String str){
        int countSpace = 0;
        int countWords = 0;

        for(int i = 0; i<str.length();i++){
            char c = str.charAt(i);
            if(Character.isWhitespace(c)){
                countSpace += 1;
            }
            else if(Character.isLetter(c)){
                countWords +=1;
            }
        }
        System.out.println(countSpace+" "+countWords);

    }
    // public static void countSpaceWords(String str){
    //     int countWords = 0;
    //     int countSpace = 0;

    //     for(int i = 0 ; i< str.length() ; i++){
    //         char c = str.charAt(i);
    //         if((c >='a' || c>= 'A') && (c<='z' || c<='Z')){
    //             countWords +=1;
    //         }
    //         else if(c==' '){
    //             countSpace +=1;
    //         }
    //     }
    //     System.out.println(countSpace+" "+countWords);
    // }
}