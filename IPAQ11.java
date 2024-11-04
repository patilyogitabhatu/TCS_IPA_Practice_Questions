/*
 Example : two list is pass as input to program
            we have to check the number which is available in both list
            we have to consider that number one time.
            if no number found print("No Number Found")
Input: 
7
2 2 3 4 5 6 7
6
2 8 9 5 0 1

Output : 2 5
 */
import java.util.*;
public class IPAQ11 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int list1[] = new int[a];
        for(int i=0 ; i< a ;i++){
            list1[i] = s.nextInt();
        }

        int b = s.nextInt();
        int list2[] = new int[b];
        for(int i=0 ; i< b ;i++){
            list2[i] = s.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int num1: list1){
            for(int num2: list2){
                if(num1==num2 && !list.contains(num1)){
                    list.add(num1);
                }
            }
        }
        
        if(list.isEmpty()){
            System.out.println("No Number Found");
        }
        else{
            for(int temp: list){
                System.out.print(temp+" ");
            }
        }

    }
}
