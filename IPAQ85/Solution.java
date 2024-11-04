import java.util.*;
class Player{
    private int playerId, points ;
    private String skill, level ;
    public Player(int playerId, String skill, String level, int points){
        this.playerId=playerId;
        this.skill=skill;
        this.level = level;
        this.points = points;
    }
    public int getid(){
        return playerId;
    }
    public String getskill(){
        return skill;
    }
    public String getlevel(){
        return level;
    }
    public int getpoints(){
        return points;
    }
}
public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        Player pl[] = new Player[4];

        for(int i = 0 ; i<4 ; i++){
            int a = s.nextInt();
            s.nextLine();
            String b = s.nextLine();
            String c = s.nextLine();
            int d = s.nextInt();
            s.nextLine();

            pl[i] = new Player(a, b, c, d);
        }

        String skills = s.nextLine();
        String level = s.nextLine();
        int ans1 = findPointsForGivenSkill(pl, skills);
        if(ans1 !=0 ){
            System.out.println(ans1);
        }else{
            System.out.println("The given Skill is not available");
        }

        Player ans2[] = getPlayerBasedOnLevel(skills , level , pl);
        if(ans2!=null){
            for(int i = 0 ; i<ans2.length ; i++){
                System.out.println(ans2[i].getid());
            }
        }else{
            System.out.println("No player is available with specified level, skill and eligibility points");
        }
    }
    public static Player[] getPlayerBasedOnLevel(String s , String lev, Player p[]){
        Player pp[] = new Player[0];
        for(int i = 0 ; i<p.length ; i++){
            if((p[i].getskill().equalsIgnoreCase(s))&&(p[i].getlevel().equalsIgnoreCase(lev))&&(p[i].getpoints() >= 20)){
                pp = Arrays.copyOf(pp,pp.length+1);
                pp[pp.length-1]=p[i];
            }
        }
        return pp;
    }
    public static int findPointsForGivenSkill(Player[] p, String skill){
        int sum = 0;
        for(int i=0 ; i<p.length ; i++){
            if(p[i].getskill().equalsIgnoreCase(skill)){
                sum += p[i].getpoints();
            }
        }
        return sum;
    }
}