/*
Write a Java program to implement a simple calculator. The program should prompt the user to enter two numbers
and and operator (+, -, *, or /) and then perform the corresponding operation and display the result.

For example, if the user enters 4, 5, and +, the program should display 9 as the result. Similarly, if the user
enters 10, 3, and *, the program should display 30 as the result.

Your program should handle invalid inputs gracefully, for example, if the user enters an operator that is not 
one of the four allowed operators or if the user enters non-numeric inputs. 
*/
import java.util.*;
public class IPAQ18{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        s.nextLine();
        int num2 = s.nextInt();
        s.nextLine();
        char op = s.next().charAt(0);

        if(op == '+'){
            System.out.println(num1+" "+op+" "+num2+" = "+(num1+num2));
        }else if(op == '*'){
            System.out.println(num1+" "+op+" "+num2+" = "+(num1*num2));
        }else if(op == '-'){
            System.out.println(num1+" "+op+" "+num2+" = "+(num1-num2));
        }else if(op == '/'){
            System.out.println(num1+" "+op+" "+num2+" = "+(num1/num2));
        }else{
            System.out.println("Invalid Input");
        }
    }
}