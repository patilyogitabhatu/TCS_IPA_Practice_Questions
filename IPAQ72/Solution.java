import java.util.*;
class Player3{
    private int id, matchesPlayed, runsScored;
    private String name, country;

    public Player3(int id, String name, String country, int matchesPlayed, int runsScored){
        this.id=id;
        this.name=name;
        this.country=country;
        this.matchesPlayed=matchesPlayed;
        this.runsScored=runsScored;
    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public String getcountry(){
        return country;
    }
    public int getmatchesPlayed(){
        return matchesPlayed;
    }
    public int getrunsScored(){
        return runsScored;
    }
}
public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int no = s.nextInt(); s.nextLine();
        Player3 pl[] = new Player3[no];

        for(int i=0 ; i<no ; i++){
            int a = s.nextInt(); s.nextLine();
            String b = s.nextLine();
            String c = s.nextLine();
            int d = s.nextInt(); s.nextLine();
            int e = s.nextInt(); s.nextLine();

            pl[i] = new Player3(a, b, c, d, e);
        }
        String country = s.nextLine();
        int run = s.nextInt();

        Player3 ans[] = findPlayerName(pl,country, run);
        if(ans != null){

            for(int i=0 ; i<ans.length-1 ; i++){
                for(int j=i+1 ; j<ans.length ; j++){
                    if(ans[i].getname().compareTo(ans[j].getname())>0){
                        Player3 temp = ans[i];
                        ans[i] = ans[j];
                        ans[j] = temp;
                    }
                }
            }

            for(int i=0 ; i<ans.length ; i++){
                System.out.println(ans[i].getid()+":"+ans[i].getname());
            }
        }else{
            System.out.println("No Player Found");
        }
    }
    public static Player3[] findPlayerName(Player3 pl[],String country, int run){
        Player3 ans[] = new Player3[0];

        for(int i=0 ; i<pl.length ; i++){
            if(pl[i].getcountry().equalsIgnoreCase(country) && pl[i].getrunsScored()>run){
                ans = Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1] = pl[i];
            }
        }
        return ans;
    }
}
