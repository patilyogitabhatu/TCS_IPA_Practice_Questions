import java.util.*;
class Music{
    private int playListNo, count;
    private String type;
    private double duration;

    public Music(int playListNo, String type, int count, double duration){
        this.playListNo=playListNo;
        this.type=type;
        this.count=count;
        this.duration=duration;
    }
    public int getlistno(){
        return playListNo;
    }
    public String gettype(){
        return type;
    }
    public int getcount(){
        return count;
    }
    public double getduration(){
        return duration;
    }
}
public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Music ms[] = new Music[4];
        for(int i=0 ; i<4 ; i++){
            int a = s.nextInt(); s.nextLine();
            String b = s.nextLine();
            int c = s.nextInt(); s.nextLine();
            double d = s.nextDouble(); s.nextLine();

            ms[i] = new Music(a, b, c, d);
        }
        int count = s.nextInt(); s.nextLine();
        double duration = s.nextDouble(); 

        int ans1= findAvgofCount(ms, count);
        if(ans1 !=0){
            System.out.println(ans1);
        }else{
            System.out.println("No playlist found");
        }

        Music ans2[] = sortTypeByDuration(ms,duration);
        if(ans2 != null){
            for(int i=0 ; i<ans2.length ;i++){
                System.out.println(ans2[i].gettype());
            }
        }else{
            System.out.println("No playlist found with mentioned attribute.");
        }

    }
    public static Music[] sortTypeByDuration(Music ms[], double duration){
        Music ans[] = new Music[0];
        for(int i=0 ;i<ms.length ;i++){
            if(ms[i].getduration()>duration){
                ans = Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1]=ms[i];
            }
        }    
        if(ans != null){
            for(int i=0 ; i<ans.length-1 ;i++){
                for(int j=i+1 ; j<ans.length ;j++){
                    if(ans[i].getduration() > ans[j].getduration()){
                        Music temp=ans[i];
                        ans[i] = ans[j];
                        ans[j] = temp;
                    }
                }
            }
            return ans;
        }
        return null;
    }
    public static int findAvgofCount(Music ms[], int count){
        int sum=0;
        int co=0;
        for(int i=0;i<ms.length;i++){
            if(ms[i].getcount()>count){
                sum += ms[i].getcount();
                co +=1;

            }
        }
        return sum/co;
    }

}