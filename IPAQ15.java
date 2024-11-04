/*
Example : remove all the vowels from the give string and print it and also 
            print the number of digits present int the string.
Input : hello wordaeiou 123
output : new word is hll wrd and count of the number 3.
 */
import java.util.*;
public class IPAQ15 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        int digitCount = 0 ;
        String result = "";
        for(int i=0 ; i<str.length() ; i++){
            char c = str.charAt(i);
            if(Character.isLetter(c)){
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                    continue;
                }
                else{
                    result +=c;
                }
            }
            else if(Character.isDigit(c)){
                digitCount +=1;
            }
            else{
                result +=c;
            }
            
        }
        System.out.println("new word is "+result+" and count of the number "+digitCount);
    }
}
