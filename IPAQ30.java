/*Given a sentence, Find words that start with a capital letter.

For example, in the sentence "The quick Brown Fox jumps over the lazy dog", there are three words that start with a 
capital letter: "The", "Brown", and "Fox". */
import java.util.*;
public class IPAQ30{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String arr[] = str.split(" ");

        for(int i = 0 ; i<arr.length ; i++){
            if(Character.isUpperCase(arr[i].charAt(0))){
                System.out.println(arr[i]);
            }
        }
    }
}