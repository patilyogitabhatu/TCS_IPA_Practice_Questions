import java.util.*;
class Team{
    private int tId, tRun;
    private String tName, tCountry;

    public Team(int tId, String tName, String tCountry, int tRun){
        this.tId=tId;
        this.tName=tName;
        this.tCountry=tCountry;
        this.tRun=tRun;
    }
    public int getId(){
        return tId;
    }
    public String getName(){
        return tName;
    }
    public String getCountry(){
        return tCountry;
    }
    public int getRun(){
        return tRun;
    }
}
public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int no = s.nextInt(); s.nextLine();

        Team t[] = new Team[no];
        for(int i=0 ; i<no ; i++){
            int a = s.nextInt(); s.nextLine();
            String b = s.nextLine();
            String c = s.nextLine();
            int d = s.nextInt(); s.nextLine();

            t[i] = new Team(a,b,c,d);
        }
        int run = s.nextInt(); s.nextLine();
        String country = s.nextLine();

        Team ans[] = findPlayer(t, run, country);
        if(ans != null){
            for(int i=0 ; i<ans.length ; i++){
                System.out.println(ans[i].getId());
                System.out.println(ans[i].getName());
                System.out.println(ans[i].getCountry());
                System.out.println(ans[i].getRun());
            }
        }else{
            System.out.println("No team is found from the given country and run");
        }
    }
    public static Team[] findPlayer(Team t[], int run, String country){
        Team ans[] = new Team[0];
        for(int i=0 ; i<t.length ; i++){
            if(t[i].getCountry().equalsIgnoreCase(country) && t[i].getRun()>run){
                ans = Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1] = t[i];
            }
        }
        return ans;
    }
}