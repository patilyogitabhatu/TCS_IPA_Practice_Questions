/* Reverse of a string
 * Arijit = tijirA
 */
 import java.util.*;
 class IPAQ54{
     public static void main(String args[]){
         Scanner s = new Scanner(System.in);
         String str = s.nextLine();
         String result ="";
         
         for(int i=0 ; i<str.length(); i++){
            result = str.charAt(i)+result;
         }
         System.out.println(result);
     }
 }