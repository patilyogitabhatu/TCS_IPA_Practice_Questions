import java.util.*;
class Associate{
    int id, experienceInYears;
    String name, technology;

    public Associate(int id, String name, String technology, int experienceInYears){
        this.id=id;
        this.name=name;
        this.technology=technology;
        this.experienceInYears=experienceInYears;
    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public String gettechnology(){
        return technology;
    }
    public int getexpericence(){
        return experienceInYears;
    }
}
public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Associate ass[] = new Associate[5];

        for(int i=0 ; i<5 ; i++){
            int a = s.nextInt(); s.nextLine();
            String b = s.nextLine();
            String c = s.nextLine();
            int d = s.nextInt(); s.nextLine();

            ass[i]=new Associate(a,b,c,d);
        }
        String tech = s.nextLine();

        Associate ans[] = associatesForGivenTechnology(ass,tech);
        if(ans != null){
            for(int i=0 ; i<ans.length ; i++){
                System.out.println(ans[i].getid());
            }
        }else{
            System.out.println("Not Found");
        }
    }
    public static Associate[] associatesForGivenTechnology(Associate ass[], String tech){
        Associate ans[] = new Associate[0];

        for(int i=0 ; i<ass.length ; i++){
            if((ass[i].getexpericence() % 5==0)&&(ass[i].gettechnology().equalsIgnoreCase(tech))){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = ass[i];
            }
        }
        return ans;

    }
}