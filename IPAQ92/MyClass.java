import java.util.*;
class Antenna{
    private int antennaid;
    private String antennaName, projectLead ;
    double antennaVSWR;
    public Antenna(int antennaid, String antennaName, String projectLead, double antennaVSWR){
        this.antennaid=antennaid;
        this.antennaName=antennaName;
        this.projectLead=projectLead;
        this.antennaVSWR=antennaVSWR;

    }
    public int getantennaid(){
        return antennaid;
    }
    public String getantennaName(){
        return antennaName;
    }
    public String getprojectLead(){
        return projectLead;
    }
    public double getantennaVSWR(){
        return antennaVSWR;
    }
}
public class MyClass{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Antenna at[] = new Antenna[4];

        for(int i=0 ; i<4 ; i++){
            int a = s.nextInt(); s.nextLine();
            String b = s.nextLine();
            String c = s.nextLine();
            double d = s.nextDouble(); s.nextLine();

            at[i] = new Antenna(a,b,c,d);
        }
        String antName = s.nextLine();
        double antVSWR=s.nextDouble();
        
        int ans1 =  searchAntennaByName(at, antName);
        if(ans1 != 0){
            System.out.println(ans1);
        }else{
            System.out.println("There is no antenna with the given parameter");
        }

        
        Antenna ans2[] = sortAntennaByVSWR(at, antVSWR);
        if(ans2 != null){
            for(int i=0 ; i<ans2.length ;i++){
                System.out.println(ans2[i].getprojectLead());
            }
        }else{
            System.out.println("No Antenna found");
        }


    }
    public static Antenna[] sortAntennaByVSWR(Antenna at[], double antVSWR){
        Antenna ans[] = new Antenna[0];
        for(int i=0 ; i<at.length ; i++){
            if(at[i].getantennaVSWR()<antVSWR){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1]= at[i];
            }
        }
        Antenna temp;
        for(int i=0 ; i<ans.length-1 ; i++){
            for(int j=0 ; j<ans.length ; j++){
                if(ans[i].getantennaVSWR() > ans[j].getantennaVSWR()){
                    temp = ans[i];
                    ans[i] = ans[j];
                    ans[j] = temp;
                }
            }
        }
        return ans;
    }


    public static int searchAntennaByName( Antenna at[], String antName){
        int ans=0;
        for(int i = 0 ; i<at.length ; i++){
            if(at[i].getantennaName().equalsIgnoreCase(antName)){
                ans=at[i].getantennaid();
            }
        }
        return ans;
    }
}