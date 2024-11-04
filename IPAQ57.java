/* Sort name by dictionary order
    Input
    -----------------
    Arijit
    Minaz
    Arnab

    Output
    -------------------
    Arijit
    Arnab
    Minaz
 */
import java.util.*;
public class IPAQ57 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int no = s.nextInt(); s.nextLine();
        String str[] = new String[no];

        for(int i=0 ; i<no ; i++){
            str[i] = s.nextLine();
        }

        for(int i=0 ; i<no-1 ; i++){
            for(int j=i+1 ; j<no ; j++){
                if(str[i].compareTo(str[j]) > 0){
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        for(String i:str){
            System.out.println(i);
        }

    }
    
}
