/*
Example : Count number of time a given word repeated in the user input strings
Input : 
3
HELLO ANMOL
Hello friend
good morning
hello

Output
COUNT OF GIVEN WORD:2

NOTE 
ALL SEARCH ARE CASE INSENSITIVE
IF NO SEARCH FOUND PRINT 'NOT FOUND'
 */
import java.util.*;
public class IPAQ13 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        String[] words = new String[n];

        for(int i=0 ; i<n ; i++){
            words[i] = s.nextLine();
        }
        String matchword = s.nextLine().toLowerCase();

        int count = 0;
        for(int i = 0 ;i<n ; i++){
            String demo = words[i].toLowerCase();
            if(demo.contains(matchword)){
                count +=1;
            }
        }
        if(count>0){
            System.out.println("COUNT OF GIVEN WORD: "+count);
        }
        else{
            System.out.println("NOT FOUND");
        }
    }
}
