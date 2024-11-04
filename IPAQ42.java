/* Find the occurance of each character in a string
 * Input: Hello world
 * Output:
 *  H: 1
    e: 1
    l: 3
    o: 2
    w: 1
    r: 1
    d: 1
*/
import java.util.*;
public class IPAQ42 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        ArrayList<Character> arr = new ArrayList<>();

        for(int i=0 ; i<str.length() ; i++){
            int count = 0;
            if(Character.isLetter(str.charAt(i))){
                for(int j=i ; j<str.length() ; j++){
                    if(str.charAt(i) == str.charAt(j)){
                        count +=1;
                    }
                }
                if(!arr.contains(str.charAt(i))){
                    System.out.println(str.charAt(i)+":"+count);
                    arr.add(str.charAt(i));
                } 
            }
              
            
        }
    }
}
