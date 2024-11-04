/*
 Example : Enter a String and print all vowel as it is which is available on the string in the 0 index.
 input : Hello I am a Student
 output : Iaa
 */
import java.util.*;
public class IPAQ07 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        String result ="";
        String[] temp = str.split(" ");
        for(String a :temp){
            char c = a.charAt(0);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||c == 'A' ||c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                    result +=c;
            } 
        }
        System.out.println(result);
                
    }
}
 
