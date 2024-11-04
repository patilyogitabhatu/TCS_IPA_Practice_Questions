import java.util.*;
class Player2{
    int id, iccRank, matchesPlayed, runsScored;
    String name;
    

    public Player2(int id, String name, int iccRank, int matchesPlayed, int runsScored){
        this.id=id;
        this.name=name;
        this.iccRank=iccRank;
        this.matchesPlayed=matchesPlayed;
        this.runsScored=runsScored;
    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public int getrank(){
        return iccRank;
    }
    public int getmatches(){
        return matchesPlayed;
    }
    public int getruns(){
        return runsScored;
    }
}
public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Player2 pl[] = new Player2[4];
        for(int i=0 ; i<4 ; i++){
            int a = s.nextInt(); s.nextLine();
            String b = s.nextLine();
            int c = s.nextInt(); s.nextLine();
            int d = s.nextInt(); s.nextLine();
            int e = s.nextInt(); s.nextLine();

            pl[i] = new Player2(a,b,c,d,e);
        }
        int target = s.nextInt();
        double ans[] =  findAverageOfRuns(pl,target);
        if(ans != null){
            for(int i=0 ; i<ans.length ;i++){
                if(ans[i]>80 && ans[i]<100){
                    System.out.println("Grade A");
                }else if(ans[i]>50 && ans[i]<79){
                    System.out.println("Grade B");
                }else{
                    System.out.println("Grade C");
                }
            }
        }


    }
    public static double[] findAverageOfRuns(Player2 pl[],int target){
        double ans[] = new double[0];
        for(int i=0 ; i<pl.length ; i++){
            if(pl[i].getmatches() >= target){
                ans = Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1] = (pl[i].getruns()/pl[i].getmatches());
            }
        }
        return ans;
    }
    
}