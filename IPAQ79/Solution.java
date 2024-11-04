import java.util.*;
class Sim2{
    int id, balance;
    String company, circle;
    double ratePerSecond;

    public Sim2(int id, String company, int balance,double ratePerSecond, String circle){
        this.id=id;
        this.company=company;
        this.balance=balance;
        this.ratePerSecond=ratePerSecond;
        this.circle=circle;
    }
    public int getid(){
        return id;
    }
    public String getcompany(){
        return company;
    }
    public int getbalance(){
        return balance;
    }
    public double getrate(){
        return ratePerSecond;
    }
    public String getcircle(){
        return circle;
    }
}
public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Sim2 si[] = new Sim2[4];
        for(int i=0 ; i<4 ; i++){
            int a = s.nextInt(); s.nextLine();
            String b = s.nextLine();
            int c = s.nextInt(); s.nextLine();
            double d = s.nextDouble(); s.nextLine();
            String e = s.nextLine();

            si[i] = new Sim2(a,b,c,d,e);
        }
        String search_circle = s.nextLine();
        double search_rate = s.nextDouble();

        Sim2 ans[] = matchAndSort(si, search_circle, search_rate);
        if(ans !=null){
            for(int i=0 ; i<ans.length ; i++){
                System.out.println(ans[i].getid());
            }
        }
    }
    public static Sim2[] matchAndSort(Sim2 si[], String search_circle, double search_rate){
        Sim2 ans[] = new Sim2[0];

        for(int i=0 ; i<si.length ; i++){
            if((si[i].getcircle().equalsIgnoreCase(search_circle))&&(si[i].getrate()<search_rate)){
                ans= Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1] = si[i];
            }
        }

        if(ans != null){
            Sim2 temp;
            for(int i=0 ; i<ans.length-1 ; i++){
                for(int j=i+1 ; j<ans.length ;j++){
                    if(ans[i].getbalance()<ans[j].getbalance()){
                        temp= ans[i];
                        ans[i]=ans[j];
                        ans[j]=temp;
                    }
                    
                }
            }
            return ans;
        }
        return null;
    }
}