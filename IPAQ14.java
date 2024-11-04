/*
Example : Input the different data from the user and display it in order.
Input :
3
1
anmol
181
24
2
james
236
34
3
peter
160
20

Output :
1   anmol   754.16
2   james   694.11
3   peter   800.00

note :
calculate its IQ by 
IQ = (condition/age)*100;
 */
import java.util.*;
class Information{
    int pId;
    String name;
    double condition;
    int age;
    
    Information(int id, String n , double con, int ag){
        pId = id;
        name = n;
        condition = con;
        age = ag;
    }
    void printData(){
        double iq = (condition / age) * 100;
        System.out.printf("%d   %s   %.2f%n", pId, name, iq);
    }
}
public class IPAQ14 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        s.nextLine();

        Information[] e = new Information[a];
        for(int i=0 ; i<a ; i++){
            int id = s.nextInt();
            s.nextLine();
            String name = s.nextLine();
            double con = s.nextDouble();
            int age = s.nextInt();
            
            e[i] = new Information(id , name , con, age);
        }
        for(int i = 0 ;i<a ; i++){
            e[i].printData();
        }
    }
}
