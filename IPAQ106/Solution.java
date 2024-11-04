import java.util.*;
class BankAccount{
    int accountNumber;
    String accountHolderName;
    double balance;
    public BankAccount(int accountNumber, String accountHolderName, double balance){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }
    public int getaccno(){
        return accountNumber;
    }
    public String getaccholdname(){
        return accountHolderName;
    }
    public double getbalance(){
        return balance;
    }
    public void setaccno(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setaccholdname(String accountHolderName){
        this.accountHolderName=accountHolderName;
    }
    public void setbalance(double balance){
        this.balance=balance;
    }
}
public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        BankAccount acc[] = new BankAccount[3];
        for(int i=0 ; i<3 ; i++){
            int a = s.nextInt(); s.nextLine();
            String b = s.nextLine();
            double c = s.nextDouble(); s.nextLine();
            
            acc[i] = new BankAccount(a,b,c);
        }
        int acco = s.nextInt() ; s.nextLine();
        double bal = s.nextDouble() ; s.nextLine();
        
        int acco1 = s.nextInt(); s.nextLine();
        double bal1 = s.nextDouble() ; s.nextLine();
        
        double ans1 = withdraw(acc,acco,bal);
        if(ans1 >= 0){
            System.out.println(ans1);
        }else if(ans1 == -1){
            System.out.println("Sorry - Insufficient balance");
        }else if(ans1 == -2){
            System.out.println("Sorry - Account not found");
        }
        
        double ans2 = deposite(acc,acco1,bal1);
        if(ans2 >=0){
            System.out.println(ans2);
        }else{
            System.out.println("Sorry - Account not found");
        }
        
    }
    public static double deposite(BankAccount acc[], int acco, double bal){
        for(BankAccount a: acc){
            if(a.getaccno() == acco){
                a.setbalance(a.getbalance()+bal);
                return a.getbalance();
            }
        }
        return -1;
        
    }
    public static double withdraw(BankAccount acc[], int acco, double bal){
        for(BankAccount a: acc){
            if(a.getaccno() == acco){
                if(a.getbalance()>=bal){
                    a.setbalance(a.getbalance()-bal);
                    return a.getbalance();
                }else{
                    return -1;
                }
                
            }
        }
        return -2;
    }
}