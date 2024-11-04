import java.util.*;
class NavalVessel{
    int vesselld, noOfVoyagesPlanned, noOfVoyagesCompleted;
    String vesselName, purpose, grade;
    public NavalVessel(int vesselld, String vesselName, int noOfVoyagesPlanned, int noOfVoyagesCompleted, String purpose ){
        this.vesselld=vesselld;
        this.vesselName=vesselName;
        this.noOfVoyagesCompleted=noOfVoyagesCompleted;
        this.noOfVoyagesPlanned=noOfVoyagesPlanned;
        this.purpose=purpose;
    }
    public int getVid(){
        return vesselld;
    }
    public String getVname(){
        return vesselName;
    }
    public int getVplanned(){
        return noOfVoyagesPlanned;
    }
    public int getVcompleted(){
        return noOfVoyagesCompleted;
    }
    public String getpurpose(){
        return purpose;
    }
    public int getpersentage(){
        int p = (noOfVoyagesCompleted * 100)/noOfVoyagesPlanned;
        return p;
    }
    public String getgrade(){
        return grade;
    }
    public void setgrade(String st){
        this.grade=st;
    }

}
public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        NavalVessel nv[] = new NavalVessel[4];

        for(int i=0 ; i<4 ; i++){
            int a = s.nextInt(); s.nextLine();
            String b = s.nextLine();
            int c = s.nextInt(); s.nextLine();
            int d = s.nextInt(); s.nextLine();
            String e = s.nextLine();

            nv[i]= new NavalVessel(a, b, c, d, e);
            
        }
        int percentage = s.nextInt();
        s.nextLine();
        int ans1 = findAvgVoyagesByPct(nv,percentage);
        if(ans1!=0){
            System.out.println(ans1);
        }

        String purpose = s.nextLine();
        NavalVessel ans2[] = findVesselByGrade(nv,purpose);
        if(ans2 != null){
            for(int i=0 ; i<ans2.length ; i++){
                System.out.println(ans2[i].vesselName+"%"+ans2[i].getgrade());
            }
        }else{
            System.out.println("No Naval Vessel is available with the specified purpose");
        }
     
    }
    public static NavalVessel[] findVesselByGrade(NavalVessel nv[], String purpose){
        NavalVessel ans[] = new NavalVessel[0];
        for(int i=0 ; i<nv.length ; i++){
            if(nv[i].getpurpose().equalsIgnoreCase(purpose)){
                
                if(nv[i].getpersentage() == 100){
                    nv[i].setgrade("Star");
                }
                else if((nv[i].getpersentage()>80) && (nv[i].getpersentage()<99)){
                    nv[i].setgrade("Leader");
                }
                else if((nv[i].getpersentage()>55) && (nv[i].getpersentage()<79)){
                    nv[i].setgrade("Inspirer");
                }
                else{
                    nv[i].setgrade("Striver");
                }
                ans = Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1] = nv[i];
            }
        }
        return ans;
    }
    public static int findAvgVoyagesByPct(NavalVessel nv[], int percentage){
        int ans = 0;
        for(int i=0 ; i< nv.length ; i++){
            if(nv[i].getpersentage() >= percentage){
                ans= nv[i].getVcompleted();
            }
        }
        return ans;
    }
}